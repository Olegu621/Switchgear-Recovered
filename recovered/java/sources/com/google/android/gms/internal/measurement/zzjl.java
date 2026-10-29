            package com.google.android.gms.internal.measurement;

            import android.content.ContentProviderClient;
            import android.content.ContentResolver;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.RemoteException;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjl implements zzjh {
                private final AtomicBoolean zza = new AtomicBoolean();
                private HashMap zzb = null;
                private final HashMap zzc = new HashMap(16, 1.0f);
                private final HashMap zzd = new HashMap(16, 1.0f);
                private final HashMap zze = new HashMap(16, 1.0f);
                private final HashMap zzf = new HashMap(16, 1.0f);
                private Object zzg = null;
                private boolean zzh = false;
                private final String[] zzi = new String[0];

                @Override // com.google.android.gms.internal.measurement.zzjh
                public final String zza(ContentResolver contentResolver, String str, String str2) {
                    String string;
/* 1 */             String str3 = null;
/* 2 */             if (contentResolver == null) {
/* 243 */               f42.m3656l("ContentResolver needed with GservicesDelegateSupplier.init()");
/* 1 */                 return null;
                    }
                    synchronized (this) {
                        try {
/* 5 */                     HashMap map = this.zzb;
/* 7 */                     AtomicBoolean atomicBoolean = this.zza;
/* 11 */                    if (map == null) {
/* 13 */                        atomicBoolean.set(false);
/* 25 */                        this.zzb = new HashMap(16, 1.0f);
/* 32 */                        this.zzg = new Object();
/* 41 */                        contentResolver.registerContentObserver(zzjg.zza, true, new zzjj(this, null));
                            } else if (atomicBoolean.getAndSet(false)) {
/* 57 */                        this.zzb.clear();
/* 62 */                        this.zzc.clear();
/* 67 */                        this.zzd.clear();
/* 72 */                        this.zze.clear();
/* 77 */                        this.zzf.clear();
/* 85 */                        this.zzg = new Object();
/* 87 */                        this.zzh = false;
                            }
/* 89 */                    Object obj = this.zzg;
/* 97 */                    if (this.zzb.containsKey(str)) {
/* 105 */                       String str4 = (String) this.zzb.get(str);
/* 107 */                       if (str4 != null) {
/* 110 */                           str3 = str4;
                                }
/* 112 */                       return str3;
                            }
                            try {
/* 114 */                       Uri uri = zzjg.zza;
/* 116 */                       ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                try {
/* 120 */                           if (contentProviderClientAcquireUnstableContentProviderClient == null) {
/* 237 */                               throw new zzjk("Unable to acquire ContentProviderClient");
                                    }
                                    try {
/* 129 */                               Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                                        try {
/* 133 */                                   if (cursorQuery == null) {
/* 205 */                                       throw new zzjk("ContentProvider query returned null cursor");
                                            }
/* 139 */                                   if (cursorQuery.moveToFirst()) {
/* 141 */                                       string = cursorQuery.getString(1);
/* 145 */                                       cursorQuery.close();
/* 148 */                                       contentProviderClientAcquireUnstableContentProviderClient.release();
                                            } else {
/* 161 */                                       cursorQuery.close();
/* 164 */                                       contentProviderClientAcquireUnstableContentProviderClient.release();
/* 167 */                                       string = null;
                                            }
/* 168 */                                   if (string != null && string.equals(null)) {
/* 176 */                                       string = null;
                                            }
                                            synchronized (this) {
                                                try {
/* 180 */                                           if (obj == this.zzg) {
/* 184 */                                               this.zzb.put(str, string);
                                                    }
                                                } catch (Throwable th) {
/* 197 */                                           throw th;
                                                }
                                            }
/* 192 */                                   if (string != null) {
/* 194 */                                       return string;
                                            }
/* 1 */                                     return null;
                                        } catch (Throwable th2) {
/* 206 */                                   if (cursorQuery == null) {
/* 217 */                                       throw th2;
                                            }
                                            try {
/* 208 */                                       cursorQuery.close();
/* 217 */                                       throw th2;
                                            } catch (Throwable th3) {
/* 214 */                                       th2.addSuppressed(th3);
/* 217 */                                       throw th2;
                                            }
                                        }
                                    } catch (RemoteException e) {
/* 225 */                               throw new zzjk("ContentProvider query failed", e);
                                    }
                                } catch (Throwable th4) {
/* 226 */                           contentProviderClientAcquireUnstableContentProviderClient.release();
/* 229 */                           throw th4;
                                }
                            } catch (zzjk unused) {
/* 1 */                         return null;
                            }
                        } catch (Throwable th5) {
/* 240 */                   throw th5;
                        }
                    }
                }

                public final /* synthetic */ AtomicBoolean zzb() {
/* 1 */             return this.zza;
                }
            }
