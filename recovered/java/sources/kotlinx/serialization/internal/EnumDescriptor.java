            package kotlinx.serialization.internal;

            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import p000.C2126r;
            import p000.ca2;
            import p000.hk2;
            import p000.je0;
            import p000.mx0;
            import p000.py0;
            import p000.r51;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

                /* JADX INFO: renamed from: l */
                public final ca2 f12948l;

                /* JADX INFO: renamed from: m */
                public final hk2 f12949m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EnumDescriptor(String str, int i) {
/* 5 */             super(str, null, i);
/* 1 */             str.getClass();
/* 10 */            this.f12948l = ca2.f2798k;
/* 21 */            this.f12949m = r51.m8065b(new je0(i, str, this));
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: e */
                public final py0 mo134e() {
/* 1 */             return this.f12948l;
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof SerialDescriptor)) {
/* 50 */                return false;
                    }
/* 12 */            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                    return serialDescriptor.mo134e() == ca2.f2798k && Intrinsics.m6216a(this.f12950a, serialDescriptor.mo130a()) && Intrinsics.m6216a(xe2.m9766d(this), xe2.m9766d(serialDescriptor));
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
                public final int hashCode() {
/* 3 */             int iHashCode = this.f12950a.hashCode();
/* 9 */             C2126r c2126r = new C2126r(this);
/* 12 */            int iHashCode2 = 1;
/* 17 */            while (c2126r.hasNext()) {
/* 23 */                int i = iHashCode2 * 31;
/* 25 */                String str = (String) c2126r.next();
/* 35 */                iHashCode2 = i + (str != null ? str.hashCode() : 0);
                    }
/* 39 */            return (iHashCode * 31) + iHashCode2;
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
                /* JADX INFO: renamed from: i */
                public final SerialDescriptor mo138i(int i) {
/* 9 */             return ((SerialDescriptor[]) this.f12949m.getValue())[i];
                }

                @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
                public final String toString() {
/* 33 */            return CollectionsKt.m6203x(new mx0(this, 2), ", ", this.f12950a + '(', ")", null, 56);
                }
            }
