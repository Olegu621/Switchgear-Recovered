            package com.google.android.gms.internal.auth;

            import android.content.ContentResolver;
            import android.database.ContentObserver;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.net.Uri;
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
            public final class zzcg implements zzcl {
                private final ContentResolver zzc;
                private final Uri zzd;
                private final Runnable zze;
                private final ContentObserver zzf;
                private final Object zzg;
                private volatile Map zzh;
                private final List zzi;
                private static final Map zzb = new C1024id();
                public static final String[] zza = {"key", FirebaseAnalytics.Param.VALUE};

                private zzcg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
/* 7 */             zzcf zzcfVar = new zzcf(this, null);
/* 10 */            this.zzf = zzcfVar;
/* 17 */            this.zzg = new Object();
/* 24 */            this.zzi = new ArrayList();
/* 26 */            contentResolver.getClass();
/* 29 */            uri.getClass();
/* 32 */            this.zzc = contentResolver;
/* 34 */            this.zzd = uri;
/* 36 */            this.zze = runnable;
/* 39 */            contentResolver.registerContentObserver(uri, false, zzcfVar);
                }

                public static zzcg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
                    zzcg zzcgVar;
                    synchronized (zzcg.class) {
/* 4 */                 Map map = zzb;
/* 10 */                zzcgVar = (zzcg) map.get(uri);
/* 12 */                if (zzcgVar == null) {
                            try {
/* 16 */                        zzcg zzcgVar2 = new zzcg(contentResolver, uri, runnable);
                                try {
/* 19 */                            map.put(uri, zzcgVar2);
                                } catch (SecurityException unused) {
                                }
/* 25 */                        zzcgVar = zzcgVar2;
                            } catch (SecurityException unused2) {
                            }
                        }
                    }
/* 27 */            return zzcgVar;
                }

                public static synchronized void zzd() {
                    try {
/* 18 */                for (zzcg zzcgVar : zzb.values()) {
/* 30 */                    zzcgVar.zzc.unregisterContentObserver(zzcgVar.zzf);
                        }
/* 38 */                zzb.clear();
                    } catch (Throwable th) {
/* 44 */                throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // com.google.android.gms.internal.auth.zzcl
                public final /* bridge */ /* synthetic */ Object zzb(String str) {
                    ?? r0;
                    Map map;
/* 1 */             Map map2 = this.zzh;
                    Map map3 = map2;
/* 3 */             if (map2 == null) {
                        synchronized (this.zzg) {
/* 8 */                     Map map4 = this.zzh;
                            r0 = map4;
/* 10 */                    if (map4 == null) {
/* 12 */                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    try {
/* 25 */                                map = (Map) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzce
                                            @Override // com.google.android.gms.internal.auth.zzck
                                            public final Object zza() {
/* 3 */                                         return this.zza.zzc();
                                            }
                                        });
/* 27 */                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
/* 39 */                                AbstractC1245n0.m4876d("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
/* 42 */                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 45 */                                map = null;
                                    }
/* 46 */                            this.zzh = map;
/* 48 */                            threadPolicyAllowThreadDiskReads = map;
                                    r0 = threadPolicyAllowThreadDiskReads;
                                } catch (Throwable th) {
/* 50 */                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 53 */                            throw th;
                                }
                            }
                        }
                        map3 = r0;
                    }
/* 58 */            if (map3 == 0) {
/* 60 */                map3 = Collections.EMPTY_MAP;
                    }
/* 66 */            return (String) map3.get(str);
                }

                public final Map zzc() {
/* 10 */            Cursor cursorQuery = this.zzc.query(this.zzd, zza, null, null, null);
/* 14 */            if (cursorQuery == null) {
/* 16 */                return Collections.EMPTY_MAP;
                    }
                    try {
/* 19 */                int count = cursorQuery.getCount();
/* 23 */                if (count == 0) {
/* 25 */                    return Collections.EMPTY_MAP;
                        }
/* 47 */                Map c1024id = count <= 256 ? new C1024id(count) : new HashMap(count, 1.0f);
/* 54 */                while (cursorQuery.moveToNext()) {
/* 66 */                    c1024id.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
/* 73 */                return c1024id;
                    } finally {
/* 74 */                cursorQuery.close();
                    }
                }

                public final void zze() {
                    synchronized (this.zzg) {
/* 5 */                 this.zzh = null;
/* 7 */                 zzdc.zzd();
                    }
                    synchronized (this) {
                        try {
/* 14 */                    Iterator it = this.zzi.iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((zzch) it.next()).zza();
                            }
                        } catch (Throwable th) {
/* 39 */                    throw th;
                        }
                    }
                }
            }
