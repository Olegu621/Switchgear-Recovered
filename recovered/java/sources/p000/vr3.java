            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.games.internal.zzap;
            import com.google.android.gms.internal.games_v2.zzaj;
            import com.google.android.gms.internal.games_v2.zzez;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vr3 extends zzaj {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ nd3 f18331a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public vr3(nd3 nd3Var) {
/* 13 */            super(nd3Var.getContext().getMainLooper(), 1000);
/* 1 */             this.f18331a = nd3Var;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaj
                public final void zza(String str, int i) {
/* 3 */             nd3 nd3Var = this.f18331a;
                    try {
/* 9 */                 if (nd3Var.isConnected()) {
/* 15 */                    zzap zzapVar = (zzap) nd3Var.getService();
/* 17 */                    Parcel parcelZza = zzapVar.zza();
/* 21 */                    parcelZza.writeString(str);
/* 24 */                    parcelZza.writeInt(i);
/* 29 */                    zzapVar.zzc(12017, parcelZza);
/* 32 */                    return;
                        }
/* 49 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 89);
/* 54 */                sb.append("Unable to increment event ");
/* 57 */                sb.append(str);
/* 62 */                sb.append(" by ");
/* 65 */                sb.append(i);
/* 70 */                sb.append(" because the games client is no longer connected");
/* 77 */                zzez.zzc("GamesGmsClientImpl", sb.toString());
                    } catch (RemoteException e) {
/* 89 */                zzez.zzh("GamesGmsClientImpl", "service died", e);
                    } catch (SecurityException e2) {
/* 83 */                zzez.zzd("GamesGmsClientImpl", "Is player signed out?", e2);
                    }
                }
            }
