            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import com.google.android.gms.location.GeofencingRequest;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.eb3;
            import p000.kb1;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class zzaf {
                @Deprecated
                public final sr1 addGeofences(tr0 tr0Var, List<zzbe> list, PendingIntent pendingIntent) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             if (list != null && !list.isEmpty()) {
/* 23 */                for (zzbe zzbeVar : list) {
/* 31 */                    if (zzbeVar != null) {
/* 33 */                        arrayList.add(zzbeVar);
                            }
                        }
                    }
/* 45 */            kb1.m6053f("No geofence has been added to this request.", !arrayList.isEmpty());
/* 66 */            return ((eb3) tr0Var).f7609b.doWrite(new zzac(this, tr0Var, new GeofencingRequest(arrayList, 5, HttpUrl.FRAGMENT_ENCODE_SET, null), pendingIntent));
                }

                public final sr1 removeGeofences(tr0 tr0Var, List<String> list) {
/* 3 */             kb1.m6062o(list, "geofence can't be null.");
/* 14 */            kb1.m6053f("Geofences must contains at least one id.", !list.isEmpty());
/* 25 */            return zza(tr0Var, new com.google.android.gms.location.zzbq(list, null, HttpUrl.FRAGMENT_ENCODE_SET));
                }

                public final sr1 zza(tr0 tr0Var, com.google.android.gms.location.zzbq zzbqVar) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzad(this, tr0Var, zzbqVar));
                }

/* 29 */        public final sr1 removeGeofences(tr0 tr0Var, PendingIntent pendingIntent) {
/* 31 */            kb1.m6062o(pendingIntent, "PendingIntent can not be null.");
/* 33 */            return zza(tr0Var, new com.google.android.gms.location.zzbq(null, pendingIntent, HttpUrl.FRAGMENT_ENCODE_SET));
                }

/* 70 */        public final sr1 addGeofences(tr0 tr0Var, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
/* 73 */            return ((eb3) tr0Var).f7609b.doWrite(new zzac(this, tr0Var, geofencingRequest, pendingIntent));
                }
            }
