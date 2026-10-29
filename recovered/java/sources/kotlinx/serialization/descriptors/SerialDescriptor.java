            package kotlinx.serialization.descriptors;

            import java.util.List;
            import p000.py0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface SerialDescriptor {
                /* JADX INFO: renamed from: a */
                String mo130a();

                /* JADX INFO: renamed from: c */
                boolean mo132c();

                /* JADX INFO: renamed from: d */
                int mo133d(String str);

                /* JADX INFO: renamed from: e */
                py0 mo134e();

                /* JADX INFO: renamed from: f */
                int mo135f();

                /* JADX INFO: renamed from: g */
                String mo136g(int i);

                List getAnnotations();

                /* JADX INFO: renamed from: h */
                List mo137h(int i);

                /* JADX INFO: renamed from: i */
                SerialDescriptor mo138i(int i);

                boolean isInline();
            }
