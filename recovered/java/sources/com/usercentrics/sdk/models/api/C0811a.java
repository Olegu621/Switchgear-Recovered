            package com.usercentrics.sdk.models.api;

            import kotlin.jvm.functions.Function0;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.EnumDescriptor;
            import p000.b51;
            import p000.de3;
            import p000.uq0;
            
            /* JADX INFO: renamed from: com.usercentrics.sdk.models.api.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0811a extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public static final C0811a f6090a = new C0811a(0);

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             return new uq0() { // from class: com.usercentrics.sdk.models.api.ApiSettingsVersion$$serializer
                        private static final /* synthetic */ EnumDescriptor descriptor;

                        static {
/* 13 */                    EnumDescriptor enumDescriptor = new EnumDescriptor("com.usercentrics.sdk.models.api.ApiSettingsVersion", 3);
/* 19 */                    enumDescriptor.m6270j("major", false);
/* 24 */                    enumDescriptor.m6270j("minor", false);
/* 29 */                    enumDescriptor.m6270j("patch", false);
/* 32 */                    descriptor = enumDescriptor;
                        }

                        @Override // p000.uq0
                        public KSerializer[] childSerializers() {
/* 2 */                     return new KSerializer[0];
                        }

                        @Override // kotlinx.serialization.KSerializer
                        public ApiSettingsVersion deserialize(Decoder decoder) {
/* 1 */                     decoder.getClass();
/* 16 */                    return ApiSettingsVersion.values()[decoder.mo4362h(getDescriptor())];
                        }

                        @Override // kotlinx.serialization.KSerializer
                        public SerialDescriptor getDescriptor() {
/* 1 */                     return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer
                        public void serialize(Encoder encoder, ApiSettingsVersion value) {
/* 1 */                     encoder.getClass();
/* 4 */                     value.getClass();
/* 15 */                    encoder.mo1518v(getDescriptor(), value.ordinal());
                        }

                        @Override // p000.uq0
                        public KSerializer[] typeParametersSerializers() {
/* 1 */                     return de3.f7144d;
                        }
                    };
                }
            }
