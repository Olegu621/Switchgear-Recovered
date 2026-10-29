            package p000;

            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class kp1 {
                private final CopyOnWriteArrayList<InterfaceC0817cr> cancellables = new CopyOnWriteArrayList<>();
                private Function0<Unit> enabledChangedCallback;
                private boolean isEnabled;

                public kp1(boolean z) {
/* 4 */             this.isEnabled = z;
                }

                public final void addCancellable(InterfaceC0817cr interfaceC0817cr) {
/* 1 */             interfaceC0817cr.getClass();
/* 6 */             this.cancellables.add(interfaceC0817cr);
                }

                public final Function0<Unit> getEnabledChangedCallback$activity_release() {
/* 1 */             return this.enabledChangedCallback;
                }

                public void handleOnBackCancelled() {
                }

                public abstract void handleOnBackPressed();

                public void handleOnBackProgressed(C0917fh c0917fh) {
/* 1 */             c0917fh.getClass();
                }

                public void handleOnBackStarted(C0917fh c0917fh) {
/* 1 */             c0917fh.getClass();
                }

                public final boolean isEnabled() {
/* 1 */             return this.isEnabled;
                }

                public final void remove() {
/* 3 */             Iterator<T> it = this.cancellables.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((InterfaceC0817cr) it.next()).cancel();
                    }
                }

                public final void removeCancellable(InterfaceC0817cr interfaceC0817cr) {
/* 1 */             interfaceC0817cr.getClass();
/* 6 */             this.cancellables.remove(interfaceC0817cr);
                }

                public final void setEnabled(boolean z) {
/* 1 */             this.isEnabled = z;
/* 3 */             Function0<Unit> function0 = this.enabledChangedCallback;
/* 5 */             if (function0 != null) {
/* 7 */                 function0.invoke();
                    }
                }

                public final void setEnabledChangedCallback$activity_release(Function0<Unit> function0) {
/* 1 */             this.enabledChangedCallback = function0;
                }
            }
