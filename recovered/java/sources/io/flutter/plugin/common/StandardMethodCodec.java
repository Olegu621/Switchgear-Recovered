            package io.flutter.plugin.common;

            import io.flutter.Log;
            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StandardMethodCodec implements MethodCodec {
                public static final StandardMethodCodec INSTANCE = new StandardMethodCodec(StandardMessageCodec.INSTANCE);
                private final StandardMessageCodec messageCodec;

                public StandardMethodCodec(StandardMessageCodec standardMessageCodec) {
/* 4 */             this.messageCodec = standardMessageCodec;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public Object decodeEnvelope(ByteBuffer byteBuffer) {
/* 5 */             byteBuffer.order(ByteOrder.nativeOrder());
/* 8 */             byte b = byteBuffer.get();
/* 12 */            if (b != 0) {
/* 15 */                if (b == 1) {
                        }
/* 78 */                C1951n4.m6859j("Envelope corrupted");
/* 81 */                return null;
                    }
/* 20 */            Object value = this.messageCodec.readValue(byteBuffer);
/* 28 */            if (!byteBuffer.hasRemaining()) {
/* 30 */                return value;
                    }
/* 33 */            Object value2 = this.messageCodec.readValue(byteBuffer);
/* 39 */            Object value3 = this.messageCodec.readValue(byteBuffer);
/* 45 */            Object value4 = this.messageCodec.readValue(byteBuffer);
/* 51 */            if ((value2 instanceof String) && ((value3 == null || (value3 instanceof String)) && !byteBuffer.hasRemaining())) {
/* 75 */                throw new FlutterException((String) value2, (String) value3, value4);
                    }
/* 78 */            C1951n4.m6859j("Envelope corrupted");
/* 81 */            return null;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
/* 5 */             byteBuffer.order(ByteOrder.nativeOrder());
/* 10 */            Object value = this.messageCodec.readValue(byteBuffer);
/* 16 */            Object value2 = this.messageCodec.readValue(byteBuffer);
/* 22 */            if ((value instanceof String) && !byteBuffer.hasRemaining()) {
/* 34 */                return new MethodCall((String) value, value2);
                    }
/* 40 */            C1951n4.m6859j("Method call corrupted");
/* 43 */            return null;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj) throws IOException {
/* 3 */             StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
/* 7 */             exposedByteArrayOutputStream.write(1);
/* 12 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
/* 17 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
/* 20 */            boolean z = obj instanceof Throwable;
/* 22 */            StandardMessageCodec standardMessageCodec = this.messageCodec;
/* 24 */            if (z) {
/* 32 */                standardMessageCodec.writeValue(exposedByteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
                    } else {
/* 36 */                standardMessageCodec.writeValue(exposedByteArrayOutputStream, obj);
                    }
/* 43 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
/* 56 */            byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
/* 59 */            return byteBufferAllocateDirect;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3) throws IOException {
/* 3 */             StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
/* 7 */             exposedByteArrayOutputStream.write(1);
/* 12 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
/* 17 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
/* 20 */            boolean z = obj instanceof Throwable;
/* 22 */            StandardMessageCodec standardMessageCodec = this.messageCodec;
/* 24 */            if (z) {
/* 32 */                standardMessageCodec.writeValue(exposedByteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
                    } else {
/* 36 */                standardMessageCodec.writeValue(exposedByteArrayOutputStream, obj);
                    }
/* 41 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, str3);
/* 48 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
/* 61 */            byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
/* 64 */            return byteBufferAllocateDirect;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeMethodCall(MethodCall methodCall) {
/* 3 */             StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
/* 10 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.method);
/* 17 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.arguments);
/* 24 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
/* 37 */            byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
/* 40 */            return byteBufferAllocateDirect;
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeSuccessEnvelope(Object obj) throws IOException {
/* 3 */             StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new StandardMessageCodec.ExposedByteArrayOutputStream();
/* 7 */             exposedByteArrayOutputStream.write(0);
/* 12 */            this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
/* 19 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
/* 31 */            byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
/* 34 */            return byteBufferAllocateDirect;
                }
            }
