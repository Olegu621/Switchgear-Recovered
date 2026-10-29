            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import com.google.android.gms.internal.measurement.zzbp;
            import com.google.android.gms.internal.measurement.zzbq;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mi3 implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final String f13796a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ oi3 f13797b;

                public mi3(oi3 oi3Var, String str) {
/* 4 */             Objects.requireNonNull(oi3Var);
/* 7 */             this.f13797b = oi3Var;
/* 9 */             this.f13796a = str;
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             oi3 oi3Var = this.f13797b;
/* 3 */             if (iBinder == null) {
/* 73 */                uh3 uh3Var = oi3Var.f14773b.f9655f;
/* 75 */                ij3.m4555l(uh3Var);
/* 82 */                uh3Var.f17541w.m8510a("Install Referrer connection returned with null binder");
/* 85 */                return;
                    }
                    try {
/* 5 */                 zzbq zzbqVarZzb = zzbp.zzb(iBinder);
/* 9 */                 if (zzbqVarZzb == null) {
/* 13 */                    uh3 uh3Var2 = oi3Var.f14773b.f9655f;
/* 15 */                    ij3.m4555l(uh3Var2);
/* 22 */                    uh3Var2.f17541w.m8510a("Install Referrer Service implementation was not found");
/* 25 */                    return;
                        }
/* 28 */                ij3 ij3Var = oi3Var.f14773b;
/* 30 */                uh3 uh3Var3 = ij3Var.f9655f;
/* 32 */                ij3.m4555l(uh3Var3);
/* 39 */                uh3Var3.f17534Y.m8510a("Install Referrer Service connected");
/* 42 */                bj3 bj3Var = ij3Var.f9659i;
/* 44 */                ij3.m4555l(bj3Var);
/* 52 */                bj3Var.m1370I(new cp0(this, zzbqVarZzb, this));
                    } catch (RuntimeException e) {
/* 58 */                uh3 uh3Var4 = oi3Var.f14773b.f9655f;
/* 60 */                ij3.m4555l(uh3Var4);
/* 67 */                uh3Var4.f17541w.m8511b(e, "Exception occurred while calling Install Referrer API");
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 5 */             uh3 uh3Var = this.f13797b.f14773b.f9655f;
/* 7 */             ij3.m4555l(uh3Var);
/* 14 */            uh3Var.f17534Y.m8510a("Install Referrer Service disconnected");
                }
            }
