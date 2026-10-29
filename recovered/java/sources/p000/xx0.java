            package p000;

            import java.util.Arrays;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class xx0 extends PluginGeneratedSerialDescriptor {

                /* JADX INFO: renamed from: l */
                public final boolean f19389l;

                public xx0(String str, yx0 yx0Var) {
/* 2 */             super(str, yx0Var, 1);
/* 5 */             this.f19389l = true;
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 117 */               return true;
                    }
/* 8 */             if (obj instanceof xx0) {
/* 13 */                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
/* 25 */                if (Intrinsics.m6216a(this.f12950a, serialDescriptor.mo130a())) {
/* 28 */                    xx0 xx0Var = (xx0) obj;
/* 32 */                    if (xx0Var.f19389l && Arrays.equals((SerialDescriptor[]) this.f12959j.getValue(), (SerialDescriptor[]) xx0Var.f12959j.getValue())) {
/* 56 */                        int iMo135f = serialDescriptor.mo135f();
/* 60 */                        int i = this.f12952c;
/* 62 */                        if (i == iMo135f) {
/* 66 */                            for (int i2 = 0; i2 < i; i2++) {
/* 88 */                                if (Intrinsics.m6216a(mo138i(i2).mo130a(), serialDescriptor.mo138i(i2).mo130a()) && Intrinsics.m6216a(mo138i(i2).mo134e(), serialDescriptor.mo138i(i2).mo134e())) {
                                        }
                                    }
/* 117 */                           return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
                public final int hashCode() {
/* 5 */             return super.hashCode() * 31;
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
                public final boolean isInline() {
/* 1 */             return this.f19389l;
                }
            }
