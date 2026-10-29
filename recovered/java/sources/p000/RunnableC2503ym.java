            package p000;

            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.datepicker.C0355l;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: renamed from: ym */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class RunnableC2503ym implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19687a;

                /* JADX INFO: renamed from: b */
                public final int f19688b;

                /* JADX INFO: renamed from: c */
                public final Object f19689c;

                public RunnableC2503ym(List list, int i, Throwable th) {
/* 2 */             this.f19687a = 1;
/* 9 */             de3.m3027i(list, "initCallbacks cannot be null");
/* 17 */            this.f19689c = new ArrayList(list);
/* 19 */            this.f19688b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19687a;
/* 3 */             int i2 = this.f19688b;
/* 5 */             Object obj = this.f19689c;
                    switch (i) {
                        case 0:
/* 79 */                    de3 de3Var = (de3) ((ts0) obj).f17248a;
/* 81 */                    if (de3Var != null) {
/* 83 */                        de3Var.mo1400A(i2);
                            }
                            break;
                        case 1:
/* 36 */                    ArrayList arrayList = (ArrayList) obj;
/* 38 */                    int size = arrayList.size();
/* 43 */                    int i3 = 0;
/* 44 */                    if (i2 == 1) {
/* 60 */                        while (i3 < size) {
/* 68 */                            ((qc0) arrayList.get(i3)).mo203b();
/* 71 */                            i3++;
                                }
                            } else {
/* 46 */                        while (i3 < size) {
/* 54 */                            ((qc0) arrayList.get(i3)).mo4175a();
/* 57 */                            i3++;
                                }
                            }
                            break;
                        case 2:
/* 32 */                    ((C0355l) obj).f4666w.m877e0(i2);
                            break;
                        case 3:
/* 24 */                    ((rl1) obj).m8204g(i2);
                            break;
                        case 4:
/* 18 */                    ((RecyclerView) obj).m877e0(i2);
                            break;
                        default:
/* 12 */                    ((cb3) obj).m1618i(i2);
                            break;
                    }
                }

/* 21 */        public RunnableC2503ym(int i, m43 m43Var) {
                    this.f19687a = 4;
/* 23 */            this.f19688b = i;
/* 24 */            this.f19689c = m43Var;
                }

/* 24 */        public /* synthetic */ RunnableC2503ym(Object obj, int i, int i2) {
/* 25 */            this.f19687a = i2;
                    this.f19689c = obj;
                    this.f19688b = i;
                }
            }
