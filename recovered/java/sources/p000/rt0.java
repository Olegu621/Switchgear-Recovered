            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 65 */    public final class rt0 extends AbstractC0973h {

                /* JADX INFO: renamed from: a */
                public final KSerializer f16288a;

                /* JADX INFO: renamed from: b */
                public final KSerializer f16289b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f16290c;

                /* JADX INFO: renamed from: d */
                public final qt0 f16291d;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public rt0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
/* 13 */            this(kSerializer, kSerializer2, (byte) 0);
/* 1 */             this.f16290c = i;
/* 4 */             kSerializer.getClass();
/* 7 */             kSerializer2.getClass();
                    switch (i) {
                        case 1:
/* 40 */                    this(kSerializer, kSerializer2, (byte) 0);
/* 45 */                    SerialDescriptor descriptor = kSerializer.getDescriptor();
/* 49 */                    SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
/* 53 */                    descriptor.getClass();
/* 56 */                    descriptor2.getClass();
/* 64 */                    this.f16291d = new qt0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                            break;
                        default:
/* 18 */                    SerialDescriptor descriptor3 = kSerializer.getDescriptor();
/* 22 */                    SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
/* 26 */                    descriptor3.getClass();
/* 29 */                    descriptor4.getClass();
/* 37 */                    this.f16291d = new qt0("kotlin.collections.HashMap", descriptor3, descriptor4);
                            break;
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: a */
                public final Object mo3274a() {
                    switch (this.f16290c) {
                        case 0:
/* 14 */                    return new HashMap();
                        default:
/* 8 */                     return new LinkedHashMap();
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: b */
                public final int mo3275b(Object obj) {
                    int size;
                    switch (this.f16290c) {
                        case 0:
/* 18 */                    HashMap map = (HashMap) obj;
/* 20 */                    map.getClass();
/* 23 */                    size = map.size();
                            break;
                        default:
/* 6 */                     LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
/* 8 */                     linkedHashMap.getClass();
/* 11 */                    size = linkedHashMap.size();
                            break;
                    }
/* 15 */            return size * 2;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: c */
                public final Iterator mo3276c(Object obj) {
                    switch (this.f16290c) {
                        case 0:
/* 20 */                    Map map = (Map) obj;
/* 22 */                    map.getClass();
/* 29 */                    return map.entrySet().iterator();
                        default:
/* 6 */                     Map map2 = (Map) obj;
/* 8 */                     map2.getClass();
/* 15 */                    return map2.entrySet().iterator();
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
                    switch (this.f16290c) {
                        case 0:
/* 16 */                    Map map = (Map) obj;
/* 18 */                    map.getClass();
/* 21 */                    return map.size();
                        default:
/* 6 */                     Map map2 = (Map) obj;
/* 8 */                     map2.getClass();
/* 11 */                    return map2.size();
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             Map map = (Map) obj;
/* 3 */             map.getClass();
/* 13 */            Object objMo4350A = interfaceC1870ky.mo4350A(getDescriptor(), i, this.f16288a, null);
/* 21 */            int iMo3299x = interfaceC1870ky.mo3299x(getDescriptor());
/* 27 */            if (iMo3299x != i + 1) {
/* 82 */                ds0.m3200q(AbstractC0886en.m3506j("Value must follow key in a map, index for key: ", i, iMo3299x, ", returned index for value: "));
/* 85 */                return;
                    }
/* 29 */            boolean zContainsKey = map.containsKey(objMo4350A);
/* 33 */            KSerializer kSerializer = this.f16289b;
/* 70 */            map.put(objMo4350A, (!zContainsKey || (kSerializer.getDescriptor().mo134e() instanceof gx1)) ? interfaceC1870ky.mo4350A(getDescriptor(), iMo3299x, kSerializer, null) : interfaceC1870ky.mo4350A(getDescriptor(), iMo3299x, kSerializer, mc1.m6638a(map, objMo4350A)));
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
                    switch (this.f16290c) {
                        case 0:
/* 9 */                     throw null;
                        default:
/* 7 */                     throw null;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
                    switch (this.f16290c) {
                        case 0:
                            break;
                    }
/* 6 */             return this.f16291d;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: h */
                public final Object mo3277h(Object obj) {
                    switch (this.f16290c) {
                        case 0:
/* 12 */                    HashMap map = (HashMap) obj;
/* 14 */                    map.getClass();
/* 17 */                    return map;
                        default:
/* 6 */                     LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
/* 8 */                     linkedHashMap.getClass();
/* 11 */                    return linkedHashMap;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             int iMo1376d = mo1376d(obj);
/* 5 */             SerialDescriptor descriptor = getDescriptor();
/* 9 */             InterfaceC1907ly interfaceC1907lyMo1517u = encoder.mo1517u(descriptor, iMo1376d);
/* 13 */            Iterator itMo3276c = mo3276c(obj);
/* 17 */            int i = 0;
/* 22 */            while (itMo3276c.hasNext()) {
/* 28 */                Map.Entry entry = (Map.Entry) itMo3276c.next();
/* 30 */                Object key = entry.getKey();
/* 34 */                Object value = entry.getValue();
/* 42 */                int i2 = i + 1;
/* 46 */                interfaceC1907lyMo1517u.mo1505i(getDescriptor(), i, this.f16288a, key);
/* 53 */                i += 2;
/* 57 */                interfaceC1907lyMo1517u.mo1505i(getDescriptor(), i2, this.f16289b, value);
                    }
/* 61 */            interfaceC1907lyMo1517u.mo1498b(descriptor);
                }

/* 66 */        public rt0(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
/* 68 */            this.f16288a = kSerializer;
/* 69 */            this.f16289b = kSerializer2;
                }
            }
