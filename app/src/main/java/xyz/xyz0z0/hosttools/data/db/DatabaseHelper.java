package xyz.xyz0z0.hosttools.data.db;

import io.reactivex.Maybe;
import xyz.xyz0z0.hosttools.data.db.base.RoomDb;
import xyz.xyz0z0.hosttools.data.db.base.ServiceInfo;
import xyz.xyz0z0.hosttools.data.db.base.ServiceInfoDao;

public class DatabaseHelper implements DatabaseSource {

  private RoomDb roomDb;
  private ServiceInfoDao serviceInfoDao;


  public DatabaseHelper(RoomDb roomDb) {
    this.roomDb = roomDb;
    serviceInfoDao = roomDb.serviceInfoDao();
  }


  @Override public Maybe<Long> addServer(ServiceInfo serviceInfos) {
    return serviceInfoDao.insert(serviceInfos);
  }
}
