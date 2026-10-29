            package kotlinx.serialization.json;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import p000.C2498yh;
            import p000.da2;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            import p000.x11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m6176d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, m6177k = 1, m6178mv = {1, 7, 1}, m6180xi = 48)
            @da2(with = x11.class)
            public final class JsonNull extends AbstractC1860d {

                /* JADX INFO: renamed from: a */
                public static final JsonNull f12961a = new JsonNull();

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ p51 f12962b = r51.m8064a(v51.f17865a, C2498yh.f19608U);

                @Override // kotlinx.serialization.json.AbstractC1860d
                /* JADX INFO: renamed from: a */
                public final String mo6271a() {
/* 1 */             return "null";
                }

                public final KSerializer serializer() {
/* 7 */             return (KSerializer) f12962b.getValue();
                }
            }
