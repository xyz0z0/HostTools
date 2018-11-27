package xyz.xyz0z0.hosttools.ui.add;

import android.util.Log;
import androidx.annotation.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import xyz.xyz0z0.hosttools.model.ServiceInfo;
import xyz.xyz0z0.hosttools.net.Network;

/**
 * Created by chengxg
 * on 2018/11/24
 */
public class AddPresenter implements AddContract.Presenter {

  @NonNull
  private final AddContract.View mAddServerView;

  @NonNull
  private CompositeDisposable mCompositeDisposable;


  public AddPresenter(@NonNull AddContract.View addServerView) {
    this.mAddServerView = addServerView;
    mCompositeDisposable = new CompositeDisposable();
    mAddServerView.setPresenter(this);

  }


  @Override public void submit(String veid, String apikey) {
    Disposable d = Network.getApiService()
        .getServiceInfo(veid, apikey)
        .subscribeOn(Schedulers.io())
        .subscribe(new Consumer<ServiceInfo>() {
          @Override public void accept(ServiceInfo serviceInfo) throws Exception {
            Log.d("cxg", "serviceInfo " + serviceInfo.getEmail());
          }
        }, new Consumer<Throwable>() {
          @Override public void accept(Throwable throwable) throws Exception {
            throwable.printStackTrace();
          }
        });
    mCompositeDisposable.add(d);
  }


  @Override public void subscribe() {

  }


  @Override public void unsubscribe() {
    mCompositeDisposable.clear();
  }
}
