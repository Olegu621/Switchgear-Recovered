            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            import android.text.TextUtils;
            import androidx.activity.result.ActivityResult;
            import com.android.billingclient.api.ProxyBillingActivityV2;
            import com.google.android.gms.internal.measurement.zzr;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import java.util.EnumMap;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class ac3 implements InterfaceC0217ci, tr1, InterfaceC0202c3, OnCompleteListener, zzr, jd3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f183a;

                /* JADX INFO: renamed from: b */
                public final Object f184b;

                public ac3(EnumMap enumMap) {
/* 2 */             this.f183a = 2;
/* 11 */            EnumMap enumMap2 = new EnumMap(nk3.class);
/* 14 */            this.f184b = enumMap2;
/* 16 */            enumMap2.putAll(enumMap);
                }

                @Override // p000.InterfaceC0217ci
                /* JADX INFO: renamed from: a */
                public void mo196a(int i) {
/* 5 */             ((InterfaceC2478xy) this.f184b).mo1610a(i);
                }

                @Override // p000.tr1
                /* JADX INFO: renamed from: b */
                public Object mo197b(p42 p42Var) {
/* 3 */             n20 n20Var = (n20) this.f184b;
/* 5 */             n20Var.f14103a = p42Var;
/* 7 */             return n20Var;
                }

                @Override // p000.InterfaceC0202c3
                /* JADX INFO: renamed from: c */
                public void mo198c(Object obj) {
/* 3 */             ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f184b;
/* 5 */             ActivityResult activityResult = (ActivityResult) obj;
/* 7 */             Intent intent = activityResult.f352b;
/* 15 */            int i = zze.zzf(intent, "ProxyBillingActivityV2").f12818a;
/* 17 */            ResultReceiver resultReceiver = proxyBillingActivityV2.f3034e;
/* 19 */            if (resultReceiver != null) {
/* 29 */                resultReceiver.send(i, intent == null ? null : intent.getExtras());
                    }
/* 32 */            int i2 = activityResult.f351a;
/* 35 */            if (i2 != -1 || i != 0) {
/* 61 */                zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
                    }
/* 64 */            proxyBillingActivityV2.finish();
                }

                @Override // p000.InterfaceC0217ci
                /* JADX INFO: renamed from: d */
                public void mo199d(Bundle bundle) {
/* 5 */             ((InterfaceC2478xy) this.f184b).onConnected();
                }

                /* JADX INFO: renamed from: e */
                public void m200e(String str, String str2, Bundle bundle) {
/* 1 */             int i = this.f183a;
/* 3 */             Object obj = this.f184b;
                    switch (i) {
                        case 7:
/* 59 */                    sl3 sl3Var = (sl3) obj;
/* 61 */                    if (!TextUtils.isEmpty(str)) {
/* 86 */                        sl3Var.getClass();
/* 91 */                        f42.m3656l("Unexpected call on client side");
                            } else {
/* 69 */                        ((ij3) sl3Var.f16749a).f9640V.getClass();
/* 82 */                        sl3Var.m8554E("auto", "_err", bundle, true, true, System.currentTimeMillis());
                            }
                            break;
                        default:
/* 12 */                    mp3 mp3Var = (mp3) obj;
/* 14 */                    if (!TextUtils.isEmpty(str)) {
/* 48 */                        mp3Var.mo4558b().m1370I(new RunnableC2265ur(this, str, str2, bundle, 10));
                            } else {
/* 16 */                        ij3 ij3Var = mp3Var.f13905W;
/* 18 */                        if (ij3Var != null) {
/* 20 */                            uh3 uh3Var = ij3Var.f9655f;
/* 22 */                            ij3.m4555l(uh3Var);
/* 29 */                            uh3Var.f17538f.m8511b(str2, "AppId not known when logging event");
                                }
                            }
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001b  */
                /* JADX INFO: renamed from: f */
                public void m201f(nk3 nk3Var, int i) {
                    rd3 rd3Var;
/* 3 */             if (i == -30) {
/* 31 */                rd3Var = rd3.TCF;
                    } else if (i == -20) {
/* 28 */                rd3Var = rd3.API;
                    } else if (i == -10) {
/* 25 */                rd3Var = rd3.MANIFEST;
                    } else if (i != 0) {
/* 22 */                rd3Var = i != 30 ? rd3.UNSET : rd3.INITIALIZATION;
                    } else {
/* 28 */                rd3Var = rd3.API;
                    }
/* 37 */            ((EnumMap) this.f184b).put(nk3Var, rd3Var);
                }

                /* JADX INFO: renamed from: g */
                public void m202g(nk3 nk3Var, rd3 rd3Var) {
/* 5 */             ((EnumMap) this.f184b).put(nk3Var, rd3Var);
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
/* 5 */             ((CountDownLatch) this.f184b).countDown();
                }

                public String toString() {
                    switch (this.f183a) {
                        case 2:
/* 15 */                    StringBuilder sb = new StringBuilder("1");
/* 24 */                    for (nk3 nk3Var : nk3.values()) {
/* 36 */                        rd3 rd3Var = (rd3) ((EnumMap) this.f184b).get(nk3Var);
/* 38 */                        if (rd3Var == null) {
/* 40 */                            rd3Var = rd3.UNSET;
                                }
/* 44 */                        sb.append(rd3Var.f16010a);
                            }
/* 50 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzr
                public void zza(int i, String str, List list, boolean z, boolean z2) {
                    sh3 sh3Var;
/* 3 */             vi3 vi3Var = (vi3) this.f184b;
/* 5 */             int i2 = i - 1;
/* 9 */             if (i2 == 0) {
/* 126 */               uh3 uh3Var = ((ij3) vi3Var.f16749a).f9655f;
/* 128 */               ij3.m4555l(uh3Var);
/* 131 */               sh3Var = uh3Var.f17533X;
                    } else if (i2 != 1) {
/* 13 */                if (i2 == 3) {
/* 74 */                    uh3 uh3Var2 = ((ij3) vi3Var.f16749a).f9655f;
/* 76 */                    ij3.m4555l(uh3Var2);
/* 79 */                    sh3Var = uh3Var2.f17534Y;
                        } else if (i2 != 4) {
/* 22 */                    uh3 uh3Var3 = ((ij3) vi3Var.f16749a).f9655f;
/* 24 */                    ij3.m4555l(uh3Var3);
/* 27 */                    sh3Var = uh3Var3.f17532W;
                        } else if (z) {
/* 36 */                    uh3 uh3Var4 = ((ij3) vi3Var.f16749a).f9655f;
/* 38 */                    ij3.m4555l(uh3Var4);
/* 41 */                    sh3Var = uh3Var4.f17530U;
                        } else if (z2) {
/* 62 */                    uh3 uh3Var5 = ((ij3) vi3Var.f16749a).f9655f;
/* 64 */                    ij3.m4555l(uh3Var5);
/* 67 */                    sh3Var = uh3Var5.f17541w;
                        } else {
/* 50 */                    uh3 uh3Var6 = ((ij3) vi3Var.f16749a).f9655f;
/* 52 */                    ij3.m4555l(uh3Var6);
/* 55 */                    sh3Var = uh3Var6.f17531V;
                        }
                    } else if (z) {
/* 88 */                uh3 uh3Var7 = ((ij3) vi3Var.f16749a).f9655f;
/* 90 */                ij3.m4555l(uh3Var7);
/* 93 */                sh3Var = uh3Var7.f17539i;
                    } else if (z2) {
/* 114 */               uh3 uh3Var8 = ((ij3) vi3Var.f16749a).f9655f;
/* 116 */               ij3.m4555l(uh3Var8);
/* 119 */               sh3Var = uh3Var8.f17538f;
                    } else {
/* 102 */               uh3 uh3Var9 = ((ij3) vi3Var.f16749a).f9655f;
/* 104 */               ij3.m4555l(uh3Var9);
/* 107 */               sh3Var = uh3Var9.f17540v;
                    }
/* 133 */           int size = list.size();
/* 138 */           if (size == 1) {
/* 181 */               sh3Var.m8511b(list.get(0), str);
/* 184 */               return;
                    }
/* 141 */           if (size == 2) {
/* 173 */               sh3Var.m8512c(list.get(0), str, list.get(1));
                    } else if (size != 3) {
/* 145 */               sh3Var.m8510a(str);
                    } else {
/* 161 */               sh3Var.m8513d(str, list.get(0), list.get(1), list.get(2));
                    }
                }

/* 19 */        public ac3() {
                    this.f183a = 2;
                    this.f184b = new EnumMap(nk3.class);
                }

/* 20 */        public /* synthetic */ ac3(Object obj, int i) {
/* 21 */            this.f183a = i;
                    this.f184b = obj;
                }

                @Override // p000.jd3
/* 184 */       public Object zza() {
                    int i = this.f183a;
                    Object obj = this.f184b;
                    switch (i) {
                        case 6:
/* 189 */                   yg3 yg3Var = (yg3) ((jd3) obj).zza();
                            if (yg3Var != null) {
                                return yg3Var;
                            }
/* 190 */                   C1951n4.m6868s("Cannot return null from a non-@Nullable @Provides method");
                            return null;
                        default:
/* 187 */                   return new lr3((Context) ((qf3) ((pi3) obj).f15137a).f15523a);
                    }
                }
            }
