/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-9")
public class TEnvStatResult implements org.apache.thrift.TBase<TEnvStatResult, TEnvStatResult._Fields>, java.io.Serializable, Cloneable, Comparable<TEnvStatResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TEnvStatResult");

  private static final org.apache.thrift.protocol.TField CACHE_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheStat", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CACHE_FILE_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheFileStat", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField LOCK_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("lockStat", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField LOG_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("logStat", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField MUTEX_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("mutexStat", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField TXN_STAT_FIELD_DESC = new org.apache.thrift.protocol.TField("txnStat", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TEnvStatResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TEnvStatResultTupleSchemeFactory());
  }

  public TCacheStat cacheStat; // optional
  public List<TCacheFileStat> cacheFileStat; // optional
  public TLockStat lockStat; // optional
  public TLogStat logStat; // optional
  public TMutexStat mutexStat; // optional
  public TTransactionStat txnStat; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CACHE_STAT((short)1, "cacheStat"),
    CACHE_FILE_STAT((short)2, "cacheFileStat"),
    LOCK_STAT((short)3, "lockStat"),
    LOG_STAT((short)4, "logStat"),
    MUTEX_STAT((short)5, "mutexStat"),
    TXN_STAT((short)6, "txnStat");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CACHE_STAT
          return CACHE_STAT;
        case 2: // CACHE_FILE_STAT
          return CACHE_FILE_STAT;
        case 3: // LOCK_STAT
          return LOCK_STAT;
        case 4: // LOG_STAT
          return LOG_STAT;
        case 5: // MUTEX_STAT
          return MUTEX_STAT;
        case 6: // TXN_STAT
          return TXN_STAT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CACHE_STAT,_Fields.CACHE_FILE_STAT,_Fields.LOCK_STAT,_Fields.LOG_STAT,_Fields.MUTEX_STAT,_Fields.TXN_STAT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CACHE_STAT, new org.apache.thrift.meta_data.FieldMetaData("cacheStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCacheStat.class)));
    tmpMap.put(_Fields.CACHE_FILE_STAT, new org.apache.thrift.meta_data.FieldMetaData("cacheFileStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCacheFileStat.class))));
    tmpMap.put(_Fields.LOCK_STAT, new org.apache.thrift.meta_data.FieldMetaData("lockStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TLockStat.class)));
    tmpMap.put(_Fields.LOG_STAT, new org.apache.thrift.meta_data.FieldMetaData("logStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TLogStat.class)));
    tmpMap.put(_Fields.MUTEX_STAT, new org.apache.thrift.meta_data.FieldMetaData("mutexStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMutexStat.class)));
    tmpMap.put(_Fields.TXN_STAT, new org.apache.thrift.meta_data.FieldMetaData("txnStat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTransactionStat.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TEnvStatResult.class, metaDataMap);
  }

  public TEnvStatResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TEnvStatResult(TEnvStatResult other) {
    if (other.isSetCacheStat()) {
      this.cacheStat = new TCacheStat(other.cacheStat);
    }
    if (other.isSetCacheFileStat()) {
      List<TCacheFileStat> __this__cacheFileStat = new ArrayList<TCacheFileStat>(other.cacheFileStat.size());
      for (TCacheFileStat other_element : other.cacheFileStat) {
        __this__cacheFileStat.add(new TCacheFileStat(other_element));
      }
      this.cacheFileStat = __this__cacheFileStat;
    }
    if (other.isSetLockStat()) {
      this.lockStat = new TLockStat(other.lockStat);
    }
    if (other.isSetLogStat()) {
      this.logStat = new TLogStat(other.logStat);
    }
    if (other.isSetMutexStat()) {
      this.mutexStat = new TMutexStat(other.mutexStat);
    }
    if (other.isSetTxnStat()) {
      this.txnStat = new TTransactionStat(other.txnStat);
    }
  }

  public TEnvStatResult deepCopy() {
    return new TEnvStatResult(this);
  }

  @Override
  public void clear() {
    this.cacheStat = null;
    this.cacheFileStat = null;
    this.lockStat = null;
    this.logStat = null;
    this.mutexStat = null;
    this.txnStat = null;
  }

  public TCacheStat getCacheStat() {
    return this.cacheStat;
  }

  public TEnvStatResult setCacheStat(TCacheStat cacheStat) {
    this.cacheStat = cacheStat;
    return this;
  }

  public void unsetCacheStat() {
    this.cacheStat = null;
  }

  /** Returns true if field cacheStat is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheStat() {
    return this.cacheStat != null;
  }

  public void setCacheStatIsSet(boolean value) {
    if (!value) {
      this.cacheStat = null;
    }
  }

  public int getCacheFileStatSize() {
    return (this.cacheFileStat == null) ? 0 : this.cacheFileStat.size();
  }

  public java.util.Iterator<TCacheFileStat> getCacheFileStatIterator() {
    return (this.cacheFileStat == null) ? null : this.cacheFileStat.iterator();
  }

  public void addToCacheFileStat(TCacheFileStat elem) {
    if (this.cacheFileStat == null) {
      this.cacheFileStat = new ArrayList<TCacheFileStat>();
    }
    this.cacheFileStat.add(elem);
  }

  public List<TCacheFileStat> getCacheFileStat() {
    return this.cacheFileStat;
  }

  public TEnvStatResult setCacheFileStat(List<TCacheFileStat> cacheFileStat) {
    this.cacheFileStat = cacheFileStat;
    return this;
  }

  public void unsetCacheFileStat() {
    this.cacheFileStat = null;
  }

  /** Returns true if field cacheFileStat is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheFileStat() {
    return this.cacheFileStat != null;
  }

  public void setCacheFileStatIsSet(boolean value) {
    if (!value) {
      this.cacheFileStat = null;
    }
  }

  public TLockStat getLockStat() {
    return this.lockStat;
  }

  public TEnvStatResult setLockStat(TLockStat lockStat) {
    this.lockStat = lockStat;
    return this;
  }

  public void unsetLockStat() {
    this.lockStat = null;
  }

  /** Returns true if field lockStat is set (has been assigned a value) and false otherwise */
  public boolean isSetLockStat() {
    return this.lockStat != null;
  }

  public void setLockStatIsSet(boolean value) {
    if (!value) {
      this.lockStat = null;
    }
  }

  public TLogStat getLogStat() {
    return this.logStat;
  }

  public TEnvStatResult setLogStat(TLogStat logStat) {
    this.logStat = logStat;
    return this;
  }

  public void unsetLogStat() {
    this.logStat = null;
  }

  /** Returns true if field logStat is set (has been assigned a value) and false otherwise */
  public boolean isSetLogStat() {
    return this.logStat != null;
  }

  public void setLogStatIsSet(boolean value) {
    if (!value) {
      this.logStat = null;
    }
  }

  public TMutexStat getMutexStat() {
    return this.mutexStat;
  }

  public TEnvStatResult setMutexStat(TMutexStat mutexStat) {
    this.mutexStat = mutexStat;
    return this;
  }

  public void unsetMutexStat() {
    this.mutexStat = null;
  }

  /** Returns true if field mutexStat is set (has been assigned a value) and false otherwise */
  public boolean isSetMutexStat() {
    return this.mutexStat != null;
  }

  public void setMutexStatIsSet(boolean value) {
    if (!value) {
      this.mutexStat = null;
    }
  }

  public TTransactionStat getTxnStat() {
    return this.txnStat;
  }

  public TEnvStatResult setTxnStat(TTransactionStat txnStat) {
    this.txnStat = txnStat;
    return this;
  }

  public void unsetTxnStat() {
    this.txnStat = null;
  }

  /** Returns true if field txnStat is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnStat() {
    return this.txnStat != null;
  }

  public void setTxnStatIsSet(boolean value) {
    if (!value) {
      this.txnStat = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CACHE_STAT:
      if (value == null) {
        unsetCacheStat();
      } else {
        setCacheStat((TCacheStat)value);
      }
      break;

    case CACHE_FILE_STAT:
      if (value == null) {
        unsetCacheFileStat();
      } else {
        setCacheFileStat((List<TCacheFileStat>)value);
      }
      break;

    case LOCK_STAT:
      if (value == null) {
        unsetLockStat();
      } else {
        setLockStat((TLockStat)value);
      }
      break;

    case LOG_STAT:
      if (value == null) {
        unsetLogStat();
      } else {
        setLogStat((TLogStat)value);
      }
      break;

    case MUTEX_STAT:
      if (value == null) {
        unsetMutexStat();
      } else {
        setMutexStat((TMutexStat)value);
      }
      break;

    case TXN_STAT:
      if (value == null) {
        unsetTxnStat();
      } else {
        setTxnStat((TTransactionStat)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CACHE_STAT:
      return getCacheStat();

    case CACHE_FILE_STAT:
      return getCacheFileStat();

    case LOCK_STAT:
      return getLockStat();

    case LOG_STAT:
      return getLogStat();

    case MUTEX_STAT:
      return getMutexStat();

    case TXN_STAT:
      return getTxnStat();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CACHE_STAT:
      return isSetCacheStat();
    case CACHE_FILE_STAT:
      return isSetCacheFileStat();
    case LOCK_STAT:
      return isSetLockStat();
    case LOG_STAT:
      return isSetLogStat();
    case MUTEX_STAT:
      return isSetMutexStat();
    case TXN_STAT:
      return isSetTxnStat();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TEnvStatResult)
      return this.equals((TEnvStatResult)that);
    return false;
  }

  public boolean equals(TEnvStatResult that) {
    if (that == null)
      return false;

    boolean this_present_cacheStat = true && this.isSetCacheStat();
    boolean that_present_cacheStat = true && that.isSetCacheStat();
    if (this_present_cacheStat || that_present_cacheStat) {
      if (!(this_present_cacheStat && that_present_cacheStat))
        return false;
      if (!this.cacheStat.equals(that.cacheStat))
        return false;
    }

    boolean this_present_cacheFileStat = true && this.isSetCacheFileStat();
    boolean that_present_cacheFileStat = true && that.isSetCacheFileStat();
    if (this_present_cacheFileStat || that_present_cacheFileStat) {
      if (!(this_present_cacheFileStat && that_present_cacheFileStat))
        return false;
      if (!this.cacheFileStat.equals(that.cacheFileStat))
        return false;
    }

    boolean this_present_lockStat = true && this.isSetLockStat();
    boolean that_present_lockStat = true && that.isSetLockStat();
    if (this_present_lockStat || that_present_lockStat) {
      if (!(this_present_lockStat && that_present_lockStat))
        return false;
      if (!this.lockStat.equals(that.lockStat))
        return false;
    }

    boolean this_present_logStat = true && this.isSetLogStat();
    boolean that_present_logStat = true && that.isSetLogStat();
    if (this_present_logStat || that_present_logStat) {
      if (!(this_present_logStat && that_present_logStat))
        return false;
      if (!this.logStat.equals(that.logStat))
        return false;
    }

    boolean this_present_mutexStat = true && this.isSetMutexStat();
    boolean that_present_mutexStat = true && that.isSetMutexStat();
    if (this_present_mutexStat || that_present_mutexStat) {
      if (!(this_present_mutexStat && that_present_mutexStat))
        return false;
      if (!this.mutexStat.equals(that.mutexStat))
        return false;
    }

    boolean this_present_txnStat = true && this.isSetTxnStat();
    boolean that_present_txnStat = true && that.isSetTxnStat();
    if (this_present_txnStat || that_present_txnStat) {
      if (!(this_present_txnStat && that_present_txnStat))
        return false;
      if (!this.txnStat.equals(that.txnStat))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cacheStat = true && (isSetCacheStat());
    list.add(present_cacheStat);
    if (present_cacheStat)
      list.add(cacheStat);

    boolean present_cacheFileStat = true && (isSetCacheFileStat());
    list.add(present_cacheFileStat);
    if (present_cacheFileStat)
      list.add(cacheFileStat);

    boolean present_lockStat = true && (isSetLockStat());
    list.add(present_lockStat);
    if (present_lockStat)
      list.add(lockStat);

    boolean present_logStat = true && (isSetLogStat());
    list.add(present_logStat);
    if (present_logStat)
      list.add(logStat);

    boolean present_mutexStat = true && (isSetMutexStat());
    list.add(present_mutexStat);
    if (present_mutexStat)
      list.add(mutexStat);

    boolean present_txnStat = true && (isSetTxnStat());
    list.add(present_txnStat);
    if (present_txnStat)
      list.add(txnStat);

    return list.hashCode();
  }

  @Override
  public int compareTo(TEnvStatResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCacheStat()).compareTo(other.isSetCacheStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheStat, other.cacheStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCacheFileStat()).compareTo(other.isSetCacheFileStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheFileStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheFileStat, other.cacheFileStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLockStat()).compareTo(other.isSetLockStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lockStat, other.lockStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogStat()).compareTo(other.isSetLogStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logStat, other.logStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMutexStat()).compareTo(other.isSetMutexStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMutexStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mutexStat, other.mutexStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTxnStat()).compareTo(other.isSetTxnStat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnStat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnStat, other.txnStat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TEnvStatResult(");
    boolean first = true;

    if (isSetCacheStat()) {
      sb.append("cacheStat:");
      if (this.cacheStat == null) {
        sb.append("null");
      } else {
        sb.append(this.cacheStat);
      }
      first = false;
    }
    if (isSetCacheFileStat()) {
      if (!first) sb.append(", ");
      sb.append("cacheFileStat:");
      if (this.cacheFileStat == null) {
        sb.append("null");
      } else {
        sb.append(this.cacheFileStat);
      }
      first = false;
    }
    if (isSetLockStat()) {
      if (!first) sb.append(", ");
      sb.append("lockStat:");
      if (this.lockStat == null) {
        sb.append("null");
      } else {
        sb.append(this.lockStat);
      }
      first = false;
    }
    if (isSetLogStat()) {
      if (!first) sb.append(", ");
      sb.append("logStat:");
      if (this.logStat == null) {
        sb.append("null");
      } else {
        sb.append(this.logStat);
      }
      first = false;
    }
    if (isSetMutexStat()) {
      if (!first) sb.append(", ");
      sb.append("mutexStat:");
      if (this.mutexStat == null) {
        sb.append("null");
      } else {
        sb.append(this.mutexStat);
      }
      first = false;
    }
    if (isSetTxnStat()) {
      if (!first) sb.append(", ");
      sb.append("txnStat:");
      if (this.txnStat == null) {
        sb.append("null");
      } else {
        sb.append(this.txnStat);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (cacheStat != null) {
      cacheStat.validate();
    }
    if (lockStat != null) {
      lockStat.validate();
    }
    if (logStat != null) {
      logStat.validate();
    }
    if (mutexStat != null) {
      mutexStat.validate();
    }
    if (txnStat != null) {
      txnStat.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TEnvStatResultStandardSchemeFactory implements SchemeFactory {
    public TEnvStatResultStandardScheme getScheme() {
      return new TEnvStatResultStandardScheme();
    }
  }

  private static class TEnvStatResultStandardScheme extends StandardScheme<TEnvStatResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TEnvStatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CACHE_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cacheStat = new TCacheStat();
              struct.cacheStat.read(iprot);
              struct.setCacheStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CACHE_FILE_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.cacheFileStat = new ArrayList<TCacheFileStat>(_list34.size);
                TCacheFileStat _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new TCacheFileStat();
                  _elem35.read(iprot);
                  struct.cacheFileStat.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setCacheFileStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCK_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.lockStat = new TLockStat();
              struct.lockStat.read(iprot);
              struct.setLockStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOG_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.logStat = new TLogStat();
              struct.logStat.read(iprot);
              struct.setLogStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MUTEX_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mutexStat = new TMutexStat();
              struct.mutexStat.read(iprot);
              struct.setMutexStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TXN_STAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.txnStat = new TTransactionStat();
              struct.txnStat.read(iprot);
              struct.setTxnStatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TEnvStatResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cacheStat != null) {
        if (struct.isSetCacheStat()) {
          oprot.writeFieldBegin(CACHE_STAT_FIELD_DESC);
          struct.cacheStat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cacheFileStat != null) {
        if (struct.isSetCacheFileStat()) {
          oprot.writeFieldBegin(CACHE_FILE_STAT_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.cacheFileStat.size()));
            for (TCacheFileStat _iter37 : struct.cacheFileStat)
            {
              _iter37.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.lockStat != null) {
        if (struct.isSetLockStat()) {
          oprot.writeFieldBegin(LOCK_STAT_FIELD_DESC);
          struct.lockStat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.logStat != null) {
        if (struct.isSetLogStat()) {
          oprot.writeFieldBegin(LOG_STAT_FIELD_DESC);
          struct.logStat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mutexStat != null) {
        if (struct.isSetMutexStat()) {
          oprot.writeFieldBegin(MUTEX_STAT_FIELD_DESC);
          struct.mutexStat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.txnStat != null) {
        if (struct.isSetTxnStat()) {
          oprot.writeFieldBegin(TXN_STAT_FIELD_DESC);
          struct.txnStat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TEnvStatResultTupleSchemeFactory implements SchemeFactory {
    public TEnvStatResultTupleScheme getScheme() {
      return new TEnvStatResultTupleScheme();
    }
  }

  private static class TEnvStatResultTupleScheme extends TupleScheme<TEnvStatResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TEnvStatResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCacheStat()) {
        optionals.set(0);
      }
      if (struct.isSetCacheFileStat()) {
        optionals.set(1);
      }
      if (struct.isSetLockStat()) {
        optionals.set(2);
      }
      if (struct.isSetLogStat()) {
        optionals.set(3);
      }
      if (struct.isSetMutexStat()) {
        optionals.set(4);
      }
      if (struct.isSetTxnStat()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCacheStat()) {
        struct.cacheStat.write(oprot);
      }
      if (struct.isSetCacheFileStat()) {
        {
          oprot.writeI32(struct.cacheFileStat.size());
          for (TCacheFileStat _iter38 : struct.cacheFileStat)
          {
            _iter38.write(oprot);
          }
        }
      }
      if (struct.isSetLockStat()) {
        struct.lockStat.write(oprot);
      }
      if (struct.isSetLogStat()) {
        struct.logStat.write(oprot);
      }
      if (struct.isSetMutexStat()) {
        struct.mutexStat.write(oprot);
      }
      if (struct.isSetTxnStat()) {
        struct.txnStat.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TEnvStatResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.cacheStat = new TCacheStat();
        struct.cacheStat.read(iprot);
        struct.setCacheStatIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.cacheFileStat = new ArrayList<TCacheFileStat>(_list39.size);
          TCacheFileStat _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new TCacheFileStat();
            _elem40.read(iprot);
            struct.cacheFileStat.add(_elem40);
          }
        }
        struct.setCacheFileStatIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lockStat = new TLockStat();
        struct.lockStat.read(iprot);
        struct.setLockStatIsSet(true);
      }
      if (incoming.get(3)) {
        struct.logStat = new TLogStat();
        struct.logStat.read(iprot);
        struct.setLogStatIsSet(true);
      }
      if (incoming.get(4)) {
        struct.mutexStat = new TMutexStat();
        struct.mutexStat.read(iprot);
        struct.setMutexStatIsSet(true);
      }
      if (incoming.get(5)) {
        struct.txnStat = new TTransactionStat();
        struct.txnStat.read(iprot);
        struct.setTxnStatIsSet(true);
      }
    }
  }

}

