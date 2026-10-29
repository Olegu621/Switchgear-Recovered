            package p000;

            import java.util.List;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class y11 implements SerialDescriptor {

                /* JADX INFO: renamed from: b */
                public static final y11 f19434b = new y11();

                /* JADX INFO: renamed from: c */
                public static final String f19435c = "kotlinx.serialization.json.JsonObject";

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ qt0 f19436a;

                public y11() {
/* 6 */             j13.m5659u(rh2.f16075a);
/* 9 */             vh2 vh2Var = vh2.f18183a;
/* 11 */            n11 n11Var = n11.f14092a;
/* 15 */            SerialDescriptor descriptor = vh2Var.getDescriptor();
/* 19 */            SerialDescriptor descriptor2 = n11Var.getDescriptor();
/* 23 */            descriptor.getClass();
/* 26 */            descriptor2.getClass();
/* 34 */            this.f19436a = new qt0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: a */
                public final String mo130a() {
/* 1 */             return f19435c;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: c */
                public final boolean mo132c() {
/* 3 */             this.f19436a.getClass();
/* 6 */             return false;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: d */
                public final int mo133d(String str) {
/* 1 */             str.getClass();
/* 6 */             return this.f19436a.mo133d(str);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 3 */             this.f19436a.getClass();
/* 6 */             return ei2.f7700m;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: f */
                public final int mo135f() {
/* 3 */             this.f19436a.getClass();
/* 6 */             return 2;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: g */
                public final String mo136g(int i) {
/* 3 */             this.f19436a.getClass();
/* 6 */             return String.valueOf(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final List getAnnotations() {
/* 3 */             this.f19436a.getClass();
/* 6 */             return nd0.f14189a;
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: h */
                public final List mo137h(int i) {
/* 3 */             return this.f19436a.mo137h(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 3 */             return this.f19436a.mo138i(i);
                }

                @Override // kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 3 */             this.f19436a.getClass();
/* 6 */             return false;
                }
            }
