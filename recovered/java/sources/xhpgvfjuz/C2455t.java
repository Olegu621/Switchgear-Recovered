            package xhpgvfjuz;

            import android.content.Context;
            
            /* JADX INFO: renamed from: xhpgvfjuz.t */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2455t {

                /* JADX INFO: renamed from: a */
                public static InterfaceC2398aD f19164a;

                /* JADX INFO: renamed from: a */
                public static void m9961a() {
                    InterfaceC2398aD interfaceC2398aD = f19164a;
                    if (interfaceC2398aD != null) {
                        m9963a(interfaceC2398aD);
                        f19164a = null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static native void m9962a(Context context, InterfaceC2398aD interfaceC2398aD);

                /* JADX INFO: renamed from: a */
                public static native void m9963a(InterfaceC2398aD interfaceC2398aD);

                /* JADX INFO: renamed from: b */
                public static void m9964b(Context context, InterfaceC2398aD interfaceC2398aD) {
                    m9961a();
                    f19164a = interfaceC2398aD;
                    m9962a(context, interfaceC2398aD);
                }
            }
