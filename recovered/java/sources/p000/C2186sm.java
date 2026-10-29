            package p000;

            import androidx.slidingpanelayout.widget.SlidingPaneLayout;
            import androidx.transition.ChangeBounds;
            import kotlin.Unit;
            
            /* JADX INFO: renamed from: sm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2186sm implements hk0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16697a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16698b;

                public /* synthetic */ C2186sm(Object obj, int i) {
/* 1 */             this.f16697a = i;
/* 3 */             this.f16698b = obj;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0077  */
                @Override // p000.hk0
                public final Object emit(Object obj, c10 c10Var) throws Throwable {
                    p40 p40Var;
/* 1 */             int i = this.f16697a;
/* 4 */             Unit unit = null;
/* 5 */             Object obj2 = this.f16698b;
                    switch (i) {
                        case 0:
/* 203 */                   ((c00) obj2).accept(obj);
/* 206 */                   return Unit.f12910a;
                        case 1:
/* 103 */                   if (c10Var instanceof p40) {
/* 106 */                       p40Var = (p40) c10Var;
/* 108 */                       int i2 = p40Var.f14962b;
/* 114 */                       if ((i2 & Integer.MIN_VALUE) != 0) {
/* 117 */                           p40Var.f14962b = i2 - Integer.MIN_VALUE;
                                } else {
/* 122 */                           p40Var = new p40(this, c10Var);
                                }
                            } else {
/* 122 */                       p40Var = new p40(this, c10Var);
                            }
/* 125 */                   Object obj3 = p40Var.f14961a;
/* 127 */                   z10 z10Var = z10.f19902a;
/* 129 */                   int i3 = p40Var.f14962b;
/* 131 */                   if (i3 == 0) {
/* 145 */                       pg3.m7417A(obj3);
/* 148 */                       hk0 hk0Var = (hk0) obj2;
/* 150 */                       og2 og2Var = (og2) obj;
/* 154 */                       if (og2Var instanceof v02) {
/* 200 */                           throw ((v02) og2Var).f17824b;
                                }
/* 158 */                       if (!(og2Var instanceof x30)) {
/* 184 */                           if (og2Var instanceof mi0 ? true : og2Var instanceof hx2) {
/* 188 */                               f42.m3656l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 4 */                                 return null;
                                    }
/* 192 */                           ds0.m3187b();
/* 4 */                             return null;
                                }
/* 162 */                       Object obj4 = ((x30) og2Var).f18924b;
/* 164 */                       p40Var.f14962b = 1;
/* 170 */                       if (hk0Var.emit(obj4, p40Var) == z10Var) {
/* 172 */                           return z10Var;
                                }
                            } else {
/* 133 */                       if (i3 != 1) {
/* 141 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 4 */                             return null;
                                }
/* 135 */                       pg3.m7417A(obj3);
                            }
/* 174 */                   return Unit.f12910a;
                        case 2:
/* 74 */                    b50 b50Var = (b50) obj2;
/* 84 */                    if (b50Var.f2223h.m4001r() instanceof mi0) {
/* 98 */                        return Unit.f12910a;
                            }
/* 86 */                    Object objM1283e = b50.m1283e(b50Var, true, c10Var);
                            return objM1283e == z10.f19902a ? objM1283e : Unit.f12910a;
                        case 3:
/* 64 */                    ((h22) obj2).f8873a = obj;
/* 71 */                    throw new C0000a(this);
                        default:
/* 10 */                    ot0 ot0Var = (ot0) obj;
/* 14 */                    ts0 ts0Var = ((il0) obj2).f9706d;
/* 16 */                    if (ts0Var != null) {
/* 21 */                        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) ts0Var.f17248a;
/* 23 */                        slidingPaneLayout.f1824i0 = ot0Var;
/* 27 */                        ChangeBounds changeBounds = new ChangeBounds();
/* 32 */                        changeBounds.f1897c = 300L;
/* 44 */                        changeBounds.f1899d = pr1.m7546b(0.2f, 0.0f, 0.0f, 1.0f);
/* 46 */                        lr2.m6525a(slidingPaneLayout, changeBounds);
/* 49 */                        slidingPaneLayout.requestLayout();
/* 52 */                        unit = Unit.f12910a;
                            }
                            return unit == z10.f19902a ? unit : Unit.f12910a;
                    }
                }
            }
