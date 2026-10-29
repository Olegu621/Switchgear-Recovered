            package com.google.android.gms.internal.measurement;

            import android.content.ContentProviderClient;
            import android.content.ContentResolver;
            import android.database.ContentObserver;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.net.Uri;
            import android.os.RemoteException;
            import android.os.StrictMode;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.C1024id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjq implements zzju {
                private final ContentResolver zzc;
                private final Uri zzd;
                private final Runnable zze;
                private final ContentObserver zzf;
                private volatile Map zzh;
                private static final Map zzb = new C1024id();
                public static final String[] zza = {"key", FirebaseAnalytics.Param.VALUE};
                private final Object zzg = new Object();
                private final List zzi = new ArrayList();

                private zzjq(ContentResolver contentResolver, Uri uri, Runnable runnable) {
/* 18 */            contentResolver.getClass();
/* 21 */            uri.getClass();
/* 24 */            this.zzc = contentResolver;
/* 26 */            this.zzd = uri;
/* 28 */            this.zze = runnable;
/* 36 */            this.zzf = new zzjo(this, null);
                }

                public static zzjq zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
                    zzjq zzjqVar;
                    synchronized (zzjq.class) {
/* 4 */                 Map map = zzb;
/* 10 */                zzjqVar = (zzjq) map.get(uri);
/* 12 */                if (zzjqVar == null) {
                            try {
/* 16 */                        zzjq zzjqVar2 = new zzjq(contentResolver, uri, runnable);
                                try {
/* 22 */                            contentResolver.registerContentObserver(uri, false, zzjqVar2.zzf);
/* 25 */                            map.put(uri, zzjqVar2);
                                } catch (SecurityException unused) {
                                }
/* 31 */                        zzjqVar = zzjqVar2;
                            } catch (SecurityException unused2) {
                            }
                        }
                    }
/* 33 */            return zzjqVar;
                }

                public static synchronized void zzd() {
                    try {
/* 4 */                 Map map = zzb;
/* 18 */                for (zzjq zzjqVar : map.values()) {
/* 30 */                    zzjqVar.zzc.unregisterContentObserver(zzjqVar.zzf);
                        }
/* 36 */                map.clear();
                    } catch (Throwable th) {
/* 42 */                throw th;
                    }
                }

                public final Map zzb() {
                    Map map;
/* 1 */             Map map2 = this.zzh;
/* 3 */             if (map2 == null) {
                        synchronized (this.zzg) {
/* 8 */                     map2 = this.zzh;
/* 10 */                    if (map2 == null) {
/* 12 */                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    try {
/* 25 */                                map = (Map) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjp
                                            @Override // com.google.android.gms.internal.measurement.zzjt
                                            public final /* synthetic */ Object zza() {
/* 3 */                                         return this.zza.zzf();
                                            }
                                        });
                                    } catch (Throwable th) {
/* 54 */                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 57 */                                throw th;
                                    }
                                } catch (SQLiteException | IllegalStateException | SecurityException e) {
/* 44 */                            AbstractC1245n0.m4891s("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
/* 47 */                            map = Collections.EMPTY_MAP;
                                }
/* 27 */                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 50 */                        this.zzh = map;
/* 52 */                        map2 = map;
                            }
                        }
                    }
                    return map2 != null ? map2 : Collections.EMPTY_MAP;
                }

                public final void zzc() {
                    synchronized (this.zzg) {
/* 5 */                 this.zzh = null;
/* 9 */                 this.zze.run();
                    }
                    synchronized (this) {
                        try {
/* 16 */                    Iterator it = this.zzi.iterator();
/* 24 */                    while (it.hasNext()) {
/* 32 */                        ((zzjr) it.next()).zza();
                            }
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzju
                public final /* bridge */ /* synthetic */ Object zze(String str) {
/* 9 */             return (String) zzb().get(str);
                }

                public final Map zzf() {
/* 1 */             ContentResolver contentResolver = this.zzc;
/* 3 */             Uri uri = this.zzd;
/* 5 */             ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
/* 11 */                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
/* 15 */                    AbstractC1245n0.m4889q("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
/* 18 */                    return Collections.EMPTY_MAP;
                        }
                        try {
/* 26 */                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                            try {
/* 30 */                        if (cursorQuery == null) {
/* 34 */                            AbstractC1245n0.m4889q("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
/* 37 */                            Map map = Collections.EMPTY_MAP;
/* 39 */                            contentProviderClientAcquireUnstableContentProviderClient.release();
/* 42 */                            return map;
                                }
/* 46 */                        int count = cursorQuery.getCount();
/* 50 */                        if (count == 0) {
/* 52 */                            Map map2 = Collections.EMPTY_MAP;
/* 54 */                            cursorQuery.close();
/* 57 */                            contentProviderClientAcquireUnstableContentProviderClient.release();
/* 60 */                            return map2;
                                }
/* 80 */                        Map c1024id = count <= 256 ? new C1024id(count) : new HashMap(count, 1.0f);
/* 87 */                        while (cursorQuery.moveToNext()) {
/* 99 */                            c1024id.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                }
/* 107 */                       if (cursorQuery.isAfterLast()) {
/* 123 */                           cursorQuery.close();
/* 126 */                           contentProviderClientAcquireUnstableContentProviderClient.release();
/* 129 */                           return c1024id;
                                }
/* 111 */                       AbstractC1245n0.m4889q("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
/* 114 */                       Map map3 = Collections.EMPTY_MAP;
/* 116 */                       cursorQuery.close();
/* 119 */                       contentProviderClientAcquireUnstableContentProviderClient.release();
/* 122 */                       return map3;
                            } catch (Throwable th) {
/* 130 */                       if (cursorQuery == null) {
/* 140 */                           throw th;
                                }
                                try {
/* 132 */                           cursorQuery.close();
/* 140 */                           throw th;
                                } catch (Throwable th2) {
/* 137 */                           th.addSuppressed(th2);
/* 140 */                           throw th;
                                }
                            }
                        } catch (RemoteException e) {
/* 143 */                   AbstractC1245n0.m4891s("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
/* 146 */                   Map map4 = Collections.EMPTY_MAP;
/* 148 */                   contentProviderClientAcquireUnstableContentProviderClient.release();
/* 151 */                   return map4;
                        }
                    } catch (Throwable th3) {
/* 152 */               contentProviderClientAcquireUnstableContentProviderClient.release();
/* 155 */               throw th3;
                    }
                }
            }
