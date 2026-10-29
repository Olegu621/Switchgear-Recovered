            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: renamed from: gd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0950gd extends AbstractC2048ow {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f8546b;

                /* JADX INFO: renamed from: c */
                public final i81 f8547c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0950gd(KSerializer kSerializer, int i) {
/* 9 */             super(kSerializer);
/* 1 */             this.f8546b = i;
/* 3 */             kSerializer.getClass();
                    switch (i) {
                        case 1:
/* 47 */                    super(kSerializer);
/* 52 */                    SerialDescriptor descriptor = kSerializer.getDescriptor();
/* 56 */                    descriptor.getClass();
/* 63 */                    this.f8547c = new C0015ad(descriptor, 2);
                            break;
                        case 2:
/* 28 */                    super(kSerializer);
/* 33 */                    SerialDescriptor descriptor2 = kSerializer.getDescriptor();
/* 37 */                    descriptor2.getClass();
/* 44 */                    this.f8547c = new C0015ad(descriptor2, 3);
                            break;
                        default:
/* 14 */                    SerialDescriptor descriptor3 = kSerializer.getDescriptor();
/* 18 */                    descriptor3.getClass();
/* 25 */                    this.f8547c = new C0015ad(descriptor3, 1);
                            break;
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: a */
                public final Object mo3274a() {
                    switch (this.f8546b) {
                        case 0:
/* 20 */                    return new ArrayList();
                        case 1:
/* 14 */                    return new HashSet();
                        default:
/* 8 */                     return new LinkedHashSet();
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: b */
                public final int mo3275b(Object obj) {
                    switch (this.f8546b) {
                        case 0:
/* 26 */                    ArrayList arrayList = (ArrayList) obj;
/* 28 */                    arrayList.getClass();
/* 31 */                    return arrayList.size();
                        case 1:
/* 16 */                    HashSet hashSet = (HashSet) obj;
/* 18 */                    hashSet.getClass();
/* 21 */                    return hashSet.size();
                        default:
/* 6 */                     LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
/* 8 */                     linkedHashSet.getClass();
/* 11 */                    return linkedHashSet.size();
                    }
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: c */
                public final Iterator mo3276c(Object obj) {
/* 1 */             Collection collection = (Collection) obj;
/* 3 */             collection.getClass();
/* 6 */             return collection.iterator();
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             Collection collection = (Collection) obj;
/* 3 */             collection.getClass();
/* 6 */             return collection.size();
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
                    switch (this.f8546b) {
                        case 0:
/* 11 */                    throw null;
                        case 1:
/* 9 */                     throw null;
                        default:
/* 7 */                     throw null;
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
                    switch (this.f8546b) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 8 */             return (C0015ad) this.f8547c;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: h */
                public final Object mo3277h(Object obj) {
                    switch (this.f8546b) {
                        case 0:
/* 18 */                    ArrayList arrayList = (ArrayList) obj;
/* 20 */                    arrayList.getClass();
/* 23 */                    return arrayList;
                        case 1:
/* 12 */                    HashSet hashSet = (HashSet) obj;
/* 14 */                    hashSet.getClass();
/* 17 */                    return hashSet;
                        default:
/* 6 */                     LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
/* 8 */                     linkedHashSet.getClass();
/* 11 */                    return linkedHashSet;
                    }
                }

                @Override // p000.AbstractC2048ow
                /* JADX INFO: renamed from: i */
                public final void mo3278i(int i, Object obj, Object obj2) {
                    switch (this.f8546b) {
                        case 0:
/* 24 */                    ArrayList arrayList = (ArrayList) obj;
/* 26 */                    arrayList.getClass();
/* 29 */                    arrayList.add(i, obj2);
                            break;
                        case 1:
/* 15 */                    HashSet hashSet = (HashSet) obj;
/* 17 */                    hashSet.getClass();
/* 20 */                    hashSet.add(obj2);
                            break;
                        default:
/* 6 */                     LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
/* 8 */                     linkedHashSet.getClass();
/* 11 */                    linkedHashSet.add(obj2);
                            break;
                    }
                }
            }
