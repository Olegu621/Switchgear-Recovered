            package p000;

            import android.text.TextUtils;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: nn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1970nn implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14384a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2467xn f14385b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ArrayList f14386c;

                public /* synthetic */ RunnableC1970nn(C2467xn c2467xn, ArrayList arrayList, int i) {
/* 1 */             this.f14384a = i;
/* 3 */             this.f14385b = c2467xn;
/* 5 */             this.f14386c = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0875ec c0875ec;
                    switch (this.f14384a) {
                        case 0:
/* 24 */                    C2467xn c2467xn = this.f14385b;
/* 26 */                    ArrayList<C0842df> arrayList = this.f14386c;
/* 30 */                    ArrayList arrayList2 = new ArrayList();
/* 37 */                    boolean z = false;
/* 38 */                    boolean z2 = false;
/* 44 */                    for (C0842df c0842df : arrayList) {
/* 60 */                        if (c2467xn.f19259a.m3823t(c0842df.f7149a)) {
/* 70 */                            ((LinkedHashMap) c2467xn.f19259a.f8339b).remove(c0842df.f7149a);
/* 75 */                            arrayList2.add(c0842df.f7149a);
/* 82 */                            if (c0842df.f7150b == vw1.class) {
/* 84 */                                z2 = true;
                                    }
                                }
                            }
/* 90 */                    if (arrayList2.isEmpty()) {
/* 304 */                       return;
                            }
/* 119 */                   c2467xn.m10000s("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera");
/* 122 */                   if (z2) {
/* 128 */                       c2467xn.f19273i.f12390h.getClass();
                            }
/* 131 */                   c2467xn.m9996o();
/* 144 */                   if (c2467xn.f19259a.m3818o().isEmpty()) {
/* 150 */                       c2467xn.f19273i.f12394l.f20296a = false;
                            } else {
/* 153 */                       c2467xn.m9991K();
                            }
/* 166 */                   if (!c2467xn.f19259a.m3817n().isEmpty()) {
/* 289 */                       c2467xn.m9990J();
/* 292 */                       c2467xn.m9983C();
/* 299 */                       if (c2467xn.f19284s0 == 9) {
/* 301 */                           c2467xn.m9981A();
/* 304 */                           return;
                                }
/* 304 */                       return;
                            }
/* 170 */                   c2467xn.f19273i.m5856i();
/* 173 */                   c2467xn.m9983C();
/* 178 */                   c2467xn.f19273i.m5858m(false);
/* 185 */                   c2467xn.f19255W = c2467xn.m10003y();
/* 189 */                   c2467xn.m10000s("Closing camera.");
                            switch (AbstractC0886en.m3520y(c2467xn.f19284s0)) {
                                case 3:
/* 281 */                           de3.m3028j(null, c2467xn.f19253U == null);
/* 285 */                           c2467xn.m9985E(3);
/* 304 */                           return;
                                case 4:
                                default:
/* 215 */                           c2467xn.m10000s("close() ignored due to being in state: ".concat(AbstractC0886en.m3492A(c2467xn.f19284s0)));
/* 304 */                           return;
                                case 5:
                                case 6:
                                case 7:
/* 232 */                           if (c2467xn.f19285v.m9586a() || ((c0875ec = (C0875ec) c2467xn.f19283r0.f2804b) != null && !((AtomicBoolean) c0875ec.f7614c).get())) {
/* 252 */                               z = true;
                                    }
/* 255 */                           c2467xn.f19283r0.m1590l();
/* 258 */                           c2467xn.m9985E(5);
/* 261 */                           if (z) {
/* 269 */                               de3.m3028j(null, c2467xn.f19256X.isEmpty());
/* 272 */                               c2467xn.m9998q();
/* 304 */                               return;
                                    }
/* 304 */                           return;
                                case 8:
                                case 9:
/* 219 */                           c2467xn.m9985E(5);
/* 222 */                           c2467xn.m9997p();
/* 304 */                           return;
                            }
                        default:
/* 6 */                     C2467xn c2467xn2 = this.f14385b;
/* 8 */                     ArrayList arrayList3 = this.f14386c;
/* 10 */                    C1799jn c1799jn = c2467xn2.f19273i;
                            try {
/* 12 */                        c2467xn2.m9987G(arrayList3);
/* 18 */                        return;
                            } finally {
/* 20 */                        c1799jn.m5856i();
                            }
                    }
                }
            }
