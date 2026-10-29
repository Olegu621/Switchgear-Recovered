            package p000;

            import androidx.lifecycle.DefaultLifecycleObserver;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class l60 implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13122a = 0;

                /* JADX INFO: renamed from: b */
                public final Object f13123b;

                /* JADX INFO: renamed from: c */
                public final Object f13124c;

                public l60(f71 f71Var) {
/* 7 */             this.f13123b = f71Var;
/* 9 */             C1807jv c1807jv = C1807jv.f12502c;
/* 11 */            Class<?> cls = f71Var.getClass();
/* 21 */            C1005hv c1005hv = (C1005hv) c1807jv.f12503a.get(cls);
/* 31 */            this.f13124c = c1005hv == null ? c1807jv.m5899a(cls, null) : c1005hv;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */             int i = this.f13122a;
/* 3 */             Object obj = this.f13123b;
/* 5 */             Object obj2 = this.f13124c;
                    switch (i) {
                        case 0:
/* 50 */                    DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                            switch (k60.f12609a[t61Var.ordinal()]) {
                                case 1:
/* 90 */                            defaultLifecycleObserver.onCreate(g71Var);
                                    break;
                                case 2:
/* 86 */                            defaultLifecycleObserver.onStart(g71Var);
                                    break;
                                case 3:
/* 82 */                            defaultLifecycleObserver.onResume(g71Var);
                                    break;
                                case 4:
/* 78 */                            defaultLifecycleObserver.onPause(g71Var);
                                    break;
                                case 5:
/* 74 */                            defaultLifecycleObserver.onStop(g71Var);
                                    break;
                                case 6:
/* 70 */                            defaultLifecycleObserver.onDestroy(g71Var);
                                    break;
                                case 7:
/* 66 */                            C1951n4.m6859j("ON_ANY must not been send by anybody");
                                    break;
                            }
/* 93 */                    d71 d71Var = (d71) obj2;
/* 95 */                    if (d71Var != null) {
/* 97 */                        d71Var.onStateChanged(g71Var, t61Var);
                            }
                            break;
                        case 1:
/* 37 */                    if (t61Var == t61.ON_START) {
/* 41 */                        ((v61) obj).mo4484b(this);
/* 46 */                        ((x62) obj2).m9725d();
                            }
                            break;
                        default:
/* 12 */                    HashMap map = ((C1005hv) obj2).f9331a;
/* 20 */                    C1005hv.m4381a((List) map.get(t61Var), g71Var, t61Var, obj);
/* 31 */                    C1005hv.m4381a((List) map.get(t61.ON_ANY), g71Var, t61Var, obj);
                            break;
                    }
                }

/* 33 */        public l60(DefaultLifecycleObserver defaultLifecycleObserver, d71 d71Var) {
                    defaultLifecycleObserver.getClass();
/* 35 */            this.f13123b = defaultLifecycleObserver;
/* 36 */            this.f13124c = d71Var;
                }

/* 36 */        public l60(v61 v61Var, x62 x62Var) {
/* 38 */            this.f13123b = v61Var;
                    this.f13124c = x62Var;
                }
            }
