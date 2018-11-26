package xyz.xyz0z0.hosttools.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by chengxg
 * on 2018/11/26
 */
public class ServiceInfo {

  /**
   * vm_type : ovz
   * hostname : band9
   * node_ip : 98.142.136.14
   * node_alias : v1104
   * node_location : US, California
   * node_location_id : USCA_4
   * node_datacenter : US: Los Angeles, California (DC4 MCOM)
   * location_ipv6_ready : true
   * plan : wagon5promov2
   * plan_monthly_data : 536870912000
   * monthly_data_multiplier : 1
   * plan_disk : 5368709120
   * plan_ram : 536870912
   * plan_swap : 67108864
   * plan_max_ipv6s : 3
   * os : centos-7-x86_64-minimal
   * email : mail201302@gmail.com
   * data_counter : 299113954
   * data_next_reset : 1544245200
   * ip_addresses : ["172.93.44.90","2607:8700:112:ab2a::","2607:8700:112:ab2a:1:1:1:1"]
   * rdns_api_available : true
   * ptr : {"172.93.44.90":null,"2607:8700:112:ab2a::":"","2607:8700:112:ab2a:1:1:1:1":""}
   * suspended : false
   * error : 0
   */

  private String vm_type;
  private String hostname;
  private String node_ip;
  private String node_alias;
  private String node_location;
  private String node_location_id;
  private String node_datacenter;
  private boolean location_ipv6_ready;
  private String plan;
  private long plan_monthly_data;
  private int monthly_data_multiplier;
  private long plan_disk;
  private int plan_ram;
  private int plan_swap;
  private int plan_max_ipv6s;
  private String os;
  private String email;
  private int data_counter;
  private int data_next_reset;
  private boolean rdns_api_available;
  private PtrBean ptr;
  private boolean suspended;
  private int error;
  private List<String> ip_addresses;


  public String getVm_type() { return vm_type;}


  public void setVm_type(String vm_type) { this.vm_type = vm_type;}


  public String getHostname() { return hostname;}


  public void setHostname(String hostname) { this.hostname = hostname;}


  public String getNode_ip() { return node_ip;}


  public void setNode_ip(String node_ip) { this.node_ip = node_ip;}


  public String getNode_alias() { return node_alias;}


  public void setNode_alias(String node_alias) { this.node_alias = node_alias;}


  public String getNode_location() { return node_location;}


  public void setNode_location(String node_location) { this.node_location = node_location;}


  public String getNode_location_id() { return node_location_id;}


  public void setNode_location_id(String node_location_id) { this.node_location_id = node_location_id;}


  public String getNode_datacenter() { return node_datacenter;}


  public void setNode_datacenter(String node_datacenter) { this.node_datacenter = node_datacenter;}


  public boolean isLocation_ipv6_ready() { return location_ipv6_ready;}


  public void setLocation_ipv6_ready(boolean location_ipv6_ready) { this.location_ipv6_ready = location_ipv6_ready;}


  public String getPlan() { return plan;}


  public void setPlan(String plan) { this.plan = plan;}


  public long getPlan_monthly_data() { return plan_monthly_data;}


  public void setPlan_monthly_data(long plan_monthly_data) { this.plan_monthly_data = plan_monthly_data;}


  public int getMonthly_data_multiplier() { return monthly_data_multiplier;}


  public void setMonthly_data_multiplier(int monthly_data_multiplier) { this.monthly_data_multiplier = monthly_data_multiplier;}


  public long getPlan_disk() { return plan_disk;}


  public void setPlan_disk(long plan_disk) { this.plan_disk = plan_disk;}


  public int getPlan_ram() { return plan_ram;}


  public void setPlan_ram(int plan_ram) { this.plan_ram = plan_ram;}


  public int getPlan_swap() { return plan_swap;}


  public void setPlan_swap(int plan_swap) { this.plan_swap = plan_swap;}


  public int getPlan_max_ipv6s() { return plan_max_ipv6s;}


  public void setPlan_max_ipv6s(int plan_max_ipv6s) { this.plan_max_ipv6s = plan_max_ipv6s;}


  public String getOs() { return os;}


  public void setOs(String os) { this.os = os;}


  public String getEmail() { return email;}


  public void setEmail(String email) { this.email = email;}


  public int getData_counter() { return data_counter;}


  public void setData_counter(int data_counter) { this.data_counter = data_counter;}


  public int getData_next_reset() { return data_next_reset;}


  public void setData_next_reset(int data_next_reset) { this.data_next_reset = data_next_reset;}


  public boolean isRdns_api_available() { return rdns_api_available;}


  public void setRdns_api_available(boolean rdns_api_available) { this.rdns_api_available = rdns_api_available;}


  public PtrBean getPtr() { return ptr;}


  public void setPtr(PtrBean ptr) { this.ptr = ptr;}


  public boolean isSuspended() { return suspended;}


  public void setSuspended(boolean suspended) { this.suspended = suspended;}


  public int getError() { return error;}


  public void setError(int error) { this.error = error;}


  public List<String> getIp_addresses() { return ip_addresses;}


  public void setIp_addresses(List<String> ip_addresses) { this.ip_addresses = ip_addresses;}


  public static class PtrBean {
    @SerializedName("172.93.44.90") private Object _$_172934490100; // FIXME check this code
    @SerializedName("2607:8700:112:ab2a::") private String _$_26078700112Ab2a193; // FIXME check this code
    @SerializedName("2607:8700:112:ab2a:1:1:1:1") private String _$_26078700112Ab2a1111149; // FIXME check this code


    public Object get_$_172934490100() { return _$_172934490100;}


    public void set_$_172934490100(Object _$_172934490100) { this._$_172934490100 = _$_172934490100;}


    public String get_$_26078700112Ab2a193() { return _$_26078700112Ab2a193;}


    public void set_$_26078700112Ab2a193(String _$_26078700112Ab2a193) { this._$_26078700112Ab2a193 = _$_26078700112Ab2a193;}


    public String get_$_26078700112Ab2a1111149() { return _$_26078700112Ab2a1111149;}


    public void set_$_26078700112Ab2a1111149(String _$_26078700112Ab2a1111149) { this._$_26078700112Ab2a1111149 = _$_26078700112Ab2a1111149;}
  }
}
