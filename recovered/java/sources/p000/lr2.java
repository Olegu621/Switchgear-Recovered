            package p000;

            import android.view.ViewGroup;
            import androidx.transition.AutoTransition;
            import androidx.transition.R$id;
            import androidx.transition.Transition;
            import io.sentry.C1697u2;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class lr2 {

                /* JADX INFO: renamed from: a */
                public static final AutoTransition f13462a = new AutoTransition();

                /* JADX INFO: renamed from: b */
                public static final ThreadLocal f13463b = new ThreadLocal();

                /* JADX INFO: renamed from: c */
                public static final ArrayList f13464c = new ArrayList();

                /* JADX INFO: renamed from: a */
                public static void m6525a(ViewGroup viewGroup, Transition transition) {
/* 1 */             ArrayList arrayList = f13464c;
/* 7 */             if (arrayList.contains(viewGroup)) {
/* 111 */               return;
                    }
/* 9 */             WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            if (viewGroup.isLaidOut()) {
/* 17 */                arrayList.add(viewGroup);
/* 20 */                if (transition == null) {
/* 22 */                    transition = f13462a;
                        }
/* 24 */                Transition transitionClone = transition.clone();
/* 37 */                ArrayList arrayList2 = (ArrayList) m6526b().getOrDefault(viewGroup, null);
/* 39 */                if (arrayList2 != null && arrayList2.size() > 0) {
/* 47 */                    Iterator it = arrayList2.iterator();
/* 55 */                    while (it.hasNext()) {
/* 63 */                        ((Transition) it.next()).mo1103u(viewGroup);
                            }
                        }
/* 67 */                if (transitionClone != null) {
/* 70 */                    transitionClone.m1094h(viewGroup, true);
                        }
/* 79 */                if (viewGroup.getTag(R$id.transition_current_scene) != null) {
/* 108 */                   C1697u2.m5431g();
/* 111 */                   return;
                        }
/* 83 */                viewGroup.setTag(R$id.transition_current_scene, null);
/* 86 */                if (transitionClone != null) {
/* 90 */                    kr2 kr2Var = new kr2();
/* 93 */                    kr2Var.f12991a = transitionClone;
/* 95 */                    kr2Var.f12992b = viewGroup;
/* 97 */                    viewGroup.addOnAttachStateChangeListener(kr2Var);
/* 104 */                   viewGroup.getViewTreeObserver().addOnPreDrawListener(kr2Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C1024id m6526b() {
                    C1024id c1024id;
/* 1 */             ThreadLocal threadLocal = f13463b;
/* 7 */             WeakReference weakReference = (WeakReference) threadLocal.get();
/* 9 */             if (weakReference != null && (c1024id = (C1024id) weakReference.get()) != null) {
/* 19 */                return c1024id;
                    }
/* 22 */            C1024id c1024id2 = new C1024id();
/* 30 */            threadLocal.set(new WeakReference(c1024id2));
/* 33 */            return c1024id2;
                }
            }
