            package p000;

            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class i22 extends AbstractC2048ow {

                /* JADX INFO: renamed from: b */
                public final C0857dv f9420b;

                /* JADX INFO: renamed from: c */
                public final C0015ad f9421c;

                public i22(C0857dv c0857dv, KSerializer kSerializer) {
/* 1 */             super(kSerializer);
/* 4 */             this.f9420b = c0857dv;
/* 8 */             SerialDescriptor descriptor = kSerializer.getDescriptor();
/* 12 */            descriptor.getClass();
/* 19 */            this.f9421c = new C0015ad(descriptor, 0);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: a */
                public final Object mo3274a() {
/* 3 */             return new ArrayList();
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: b */
                public final int mo3275b(Object obj) {
/* 1 */             ArrayList arrayList = (ArrayList) obj;
/* 3 */             arrayList.getClass();
/* 6 */             return arrayList.size();
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: c */
                public final Iterator mo3276c(Object obj) {
/* 1 */             Object[] objArr = (Object[]) obj;
/* 3 */             objArr.getClass();
/* 8 */             return new C2126r(objArr);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             Object[] objArr = (Object[]) obj;
/* 3 */             objArr.getClass();
/* 6 */             return objArr.length;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 2 */             throw null;
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return this.f9421c;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: h */
                public final Object mo3277h(Object obj) {
/* 1 */             ArrayList arrayList = (ArrayList) obj;
/* 3 */             arrayList.getClass();
/* 16 */            Object objNewInstance = Array.newInstance((Class<?>) yy1.m10224s(this.f9420b), arrayList.size());
/* 20 */            objNewInstance.getClass();
/* 25 */            Object[] array = arrayList.toArray((Object[]) objNewInstance);
/* 29 */            array.getClass();
/* 32 */            return array;
                }

                @Override // p000.AbstractC2048ow
                /* JADX INFO: renamed from: i */
                public final void mo3278i(int i, Object obj, Object obj2) {
/* 1 */             ArrayList arrayList = (ArrayList) obj;
/* 3 */             arrayList.getClass();
/* 6 */             arrayList.add(i, obj2);
                }
            }
