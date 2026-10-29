            package p000;

            import android.os.Build;
            import android.util.SparseArray;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.measurement.internal.zzog;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final /* synthetic */ class pl3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15174a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15175b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15176c;

                public pl3(ac3 ac3Var, mp3 mp3Var, Runnable runnable) {
/* 2 */             this.f15174a = 3;
/* 7 */             this.f15175b = mp3Var;
/* 9 */             this.f15176c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f15174a) {
                        case 0:
/* 187 */                   sl3 sl3Var = (sl3) this.f15175b;
/* 189 */                   sl3Var.mo1375y();
/* 196 */                   if (Build.VERSION.SDK_INT < 30) {
/* 267 */                       return;
                            }
/* 201 */                   List<zzog> list = (List) this.f15176c;
/* 207 */                   ki3 ki3Var = ((ij3) sl3Var.f16749a).f9653e;
/* 209 */                   ij3.m4553j(ki3Var);
/* 212 */                   SparseArray sparseArrayM6115F = ki3Var.m6115F();
/* 224 */                   for (zzog zzogVar : list) {
/* 232 */                       int i = zzogVar.f4217c;
/* 238 */                       if (!sparseArrayM6115F.contains(i) || ((Long) sparseArrayM6115F.get(i)).longValue() < zzogVar.f4216b) {
/* 260 */                           sl3Var.m8572W().add(zzogVar);
                                }
                            }
/* 264 */                   sl3Var.m8573X();
/* 267 */                   return;
                        case 1:
/* 151 */                   ij3 ij3Var = (ij3) ((sl3) this.f15175b).f16749a;
/* 153 */                   ih3 ih3VarM4569q = ij3Var.m4569q();
/* 159 */                   String str = (String) this.f15176c;
/* 161 */                   String str2 = ih3VarM4569q.f9596b0;
/* 163 */                   boolean z = false;
/* 164 */                   if (str2 != null && !str2.equals(str)) {
/* 172 */                       z = true;
                            }
/* 173 */                   ih3VarM4569q.f9596b0 = str;
/* 175 */                   if (z) {
/* 181 */                       ij3Var.m4569q().m4533E();
/* 184 */                       return;
                            }
/* 184 */                   return;
                        case 2:
/* 81 */                    gp3 gp3Var = (gp3) this.f15175b;
/* 87 */                    int i2 = ((vq3) this.f15176c).f18318a;
                            synchronized (gp3Var) {
/* 98 */                        vq3 vq3Var = (vq3) gp3Var.f8773e.get(i2);
/* 100 */                       if (vq3Var != null) {
/* 116 */                           AbstractC1245n0.m4889q("MessengerIpcClient", "Timing out request: " + i2);
/* 121 */                           gp3Var.f8773e.remove(i2);
/* 132 */                           vq3Var.m9336b(new C1898lp("Timed out waiting for response", 7, null));
/* 135 */                           gp3Var.m3985c();
                                }
                                break;
                            }
/* 142 */                   return;
                        case 3:
/* 43 */                    mp3 mp3Var = (mp3) this.f15175b;
/* 45 */                    mp3Var.m6731A();
/* 50 */                    Runnable runnable = (Runnable) this.f15176c;
/* 56 */                    mp3Var.mo4558b().mo1375y();
/* 61 */                    if (mp3Var.f13910a0 == null) {
/* 68 */                        mp3Var.f13910a0 = new ArrayList();
                            }
/* 72 */                    mp3Var.f13910a0.add(runnable);
/* 75 */                    mp3Var.m6776q();
/* 78 */                    return;
                        default:
/* 9 */                     C0882ej c0882ej = (C0882ej) this.f15175b;
/* 13 */                    C1833kj c1833kj = (C1833kj) this.f15176c;
/* 19 */                    tz1 tz1Var = (tz1) c0882ej.f7709e.f17430c;
/* 21 */                    u93 u93Var = c0882ej.f7709e;
/* 23 */                    if (tz1Var != null) {
/* 29 */                        ((tz1) u93Var.f17430c).mo3210e(c1833kj, null);
/* 40 */                        return;
                            } else {
/* 37 */                        zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
/* 40 */                        return;
                            }
                    }
                }

/* 11 */        public /* synthetic */ pl3(int i, Object obj, Object obj2) {
/* 12 */            this.f15174a = i;
                    this.f15175b = obj;
                    this.f15176c = obj2;
                }
            }
