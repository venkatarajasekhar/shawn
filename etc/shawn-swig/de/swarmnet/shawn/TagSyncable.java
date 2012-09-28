/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.swarmnet.shawn;

public class TagSyncable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TagSyncable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TagSyncable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      ShawnJNI.delete_TagSyncable(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void sync_to_tags(TagContainer arg0) {
    ShawnJNI.TagSyncable_sync_to_tags(swigCPtr, TagContainer.getCPtr(arg0));
  }

  public void sync_from_tags(TagContainer arg0) {
    ShawnJNI.TagSyncable_sync_from_tags(swigCPtr, TagContainer.getCPtr(arg0));
  }

}