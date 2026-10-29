            package p000;

            import android.os.Build;
            import android.view.View;
            import java.nio.ByteBuffer;
            import java.util.ConcurrentModificationException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class rb1 {

                /* JADX INFO: renamed from: a */
                public int f15962a;

                /* JADX INFO: renamed from: b */
                public int f15963b;

                /* JADX INFO: renamed from: c */
                public int f15964c;

                /* JADX INFO: renamed from: d */
                public Object f15965d;

                public rb1() {
/* 6 */             if (p62.f14990b == null) {
/* 15 */                p62.f14990b = new p62(9);
                    }
                }

                /* JADX INFO: renamed from: a */
                public int m8126a(int i) {
/* 3 */             if (i < this.f15964c) {
/* 12 */                return ((ByteBuffer) this.f15965d).getShort(this.f15963b + i);
                    }
/* 17 */            return 0;
                }

                /* JADX INFO: renamed from: b */
                public void m8127b() {
/* 9 */             if (((sb1) this.f15965d).f16504v != this.f15964c) {
/* 17 */                throw new ConcurrentModificationException();
                    }
                }

                /* JADX INFO: renamed from: c */
                public abstract Object mo7090c(View view);

                /* JADX INFO: renamed from: d */
                public abstract void mo7091d(View view, Object obj);

                /* JADX INFO: renamed from: e */
                public void m8128e() {
                    while (true) {
/* 1 */                 int i = this.f15962a;
/* 5 */                 sb1 sb1Var = (sb1) this.f15965d;
/* 9 */                 if (i >= sb1Var.f16502f || sb1Var.f16499c[i] >= 0) {
/* 22 */                    return;
                        } else {
/* 19 */                    this.f15962a = i + 1;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m8129f(View view, Object obj) {
                    Object tag;
/* 5 */             if (Build.VERSION.SDK_INT >= this.f15963b) {
/* 7 */                 mo7091d(view, obj);
/* 10 */                return;
                    }
/* 15 */            C2201t0 c2201t0 = null;
/* 16 */            if (Build.VERSION.SDK_INT >= this.f15963b) {
/* 18 */                tag = mo7090c(view);
                    } else {
/* 25 */                tag = view.getTag(this.f15962a);
/* 37 */                if (!((Class) this.f15965d).isInstance(tag)) {
/* 40 */                    tag = null;
                        }
                    }
/* 45 */            if (mo7092g(tag, obj)) {
/* 47 */                View.AccessibilityDelegate accessibilityDelegateM3308d = e33.m3308d(view);
/* 51 */                if (accessibilityDelegateM3308d != null) {
/* 65 */                    c2201t0 = accessibilityDelegateM3308d instanceof C2164s0 ? ((C2164s0) accessibilityDelegateM3308d).f16369a : new C2201t0(accessibilityDelegateM3308d);
                        }
/* 68 */                if (c2201t0 == null) {
/* 72 */                    c2201t0 = new C2201t0();
                        }
/* 75 */                e33.m3318n(view, c2201t0);
/* 80 */                view.setTag(this.f15962a, obj);
/* 85 */                e33.m3311g(this.f15964c, view);
                    }
                }

                /* JADX INFO: renamed from: g */
                public abstract boolean mo7092g(Object obj, Object obj2);

                public boolean hasNext() {
                    return this.f15962a < ((sb1) this.f15965d).f16502f;
                }

                public void remove() {
/* 3 */             sb1 sb1Var = (sb1) this.f15965d;
/* 5 */             m8127b();
/* 11 */            if (this.f15963b == -1) {
/* 30 */                f42.m3656l("Call next() before removing element from the iterator.");
/* 33 */                return;
                    }
/* 13 */            sb1Var.m8462b();
/* 18 */            sb1Var.m8470j(this.f15963b);
/* 21 */            this.f15963b = -1;
/* 25 */            this.f15964c = sb1Var.f16504v;
                }
            }
