            package io.flutter.plugin.common;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.ByteArrayOutputStream;
            import java.math.BigInteger;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class StandardMessageCodec implements MessageCodec<Object> {
                private static final byte BIGINT = 5;
                private static final byte BYTE_ARRAY = 8;
                private static final byte DOUBLE = 6;
                private static final byte DOUBLE_ARRAY = 11;
                private static final byte FALSE = 2;
                private static final byte FLOAT_ARRAY = 14;
                public static final StandardMessageCodec INSTANCE = new StandardMessageCodec();
                private static final byte INT = 3;
                private static final byte INT_ARRAY = 9;
                private static final byte LIST = 12;
                private static final boolean LITTLE_ENDIAN;
                private static final byte LONG = 4;
                private static final byte LONG_ARRAY = 10;
                private static final byte MAP = 13;
                private static final byte NULL = 0;
                private static final byte STRING = 7;
                private static final String TAG = "StandardMessageCodec#";
                private static final byte TRUE = 1;
                private static final Charset UTF8;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
                    public byte[] buffer() {
/* 1 */                 return ((ByteArrayOutputStream) this).buf;
                    }
                }

                static {
/* 19 */            LITTLE_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
/* 27 */            UTF8 = Charset.forName("UTF8");
                }

                public static final void readAlignment(ByteBuffer byteBuffer, int i) {
/* 5 */             int iPosition = byteBuffer.position() % i;
/* 6 */             if (iPosition != 0) {
/* 14 */                byteBuffer.position((byteBuffer.position() + i) - iPosition);
                    }
                }

                public static final byte[] readBytes(ByteBuffer byteBuffer) {
/* 5 */             byte[] bArr = new byte[readSize(byteBuffer)];
/* 7 */             byteBuffer.get(bArr);
/* 10 */            return bArr;
                }

                public static final int readSize(ByteBuffer byteBuffer) {
/* 5 */             if (!byteBuffer.hasRemaining()) {
/* 32 */                C1951n4.m6859j("Message corrupted");
/* 35 */                return 0;
                    }
/* 11 */            int i = byteBuffer.get() & 255;
/* 15 */            if (i < 254) {
/* 17 */                return i;
                    }
                    return i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
                }

                public static final void writeAlignment(ByteArrayOutputStream byteArrayOutputStream, int i) {
/* 5 */             int size = byteArrayOutputStream.size() % i;
/* 6 */             if (size != 0) {
/* 12 */                for (int i2 = 0; i2 < i - size; i2++) {
/* 14 */                    byteArrayOutputStream.write(0);
                        }
                    }
                }

                public static final void writeBytes(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
/* 2 */             writeSize(byteArrayOutputStream, bArr.length);
/* 7 */             byteArrayOutputStream.write(bArr, 0, bArr.length);
                }

                public static final void writeChar(ByteArrayOutputStream byteArrayOutputStream, int i) {
/* 3 */             if (LITTLE_ENDIAN) {
/* 5 */                 byteArrayOutputStream.write(i);
/* 10 */                byteArrayOutputStream.write(i >>> 8);
                    } else {
/* 16 */                byteArrayOutputStream.write(i >>> 8);
/* 19 */                byteArrayOutputStream.write(i);
                    }
                }

                public static final void writeDouble(ByteArrayOutputStream byteArrayOutputStream, double d) {
/* 5 */             writeLong(byteArrayOutputStream, Double.doubleToLongBits(d));
                }

                public static final void writeFloat(ByteArrayOutputStream byteArrayOutputStream, float f) {
/* 5 */             writeInt(byteArrayOutputStream, Float.floatToIntBits(f));
                }

                public static final void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i) {
/* 3 */             if (LITTLE_ENDIAN) {
/* 5 */                 byteArrayOutputStream.write(i);
/* 10 */                byteArrayOutputStream.write(i >>> 8);
/* 15 */                byteArrayOutputStream.write(i >>> 16);
/* 20 */                byteArrayOutputStream.write(i >>> 24);
/* 23 */                return;
                    }
/* 26 */            byteArrayOutputStream.write(i >>> 24);
/* 31 */            byteArrayOutputStream.write(i >>> 16);
/* 36 */            byteArrayOutputStream.write(i >>> 8);
/* 39 */            byteArrayOutputStream.write(i);
                }

                public static final void writeLong(ByteArrayOutputStream byteArrayOutputStream, long j) {
/* 17 */            if (LITTLE_ENDIAN) {
/* 21 */                byteArrayOutputStream.write((byte) j);
/* 28 */                byteArrayOutputStream.write((byte) (j >>> 8));
/* 35 */                byteArrayOutputStream.write((byte) (j >>> 16));
/* 42 */                byteArrayOutputStream.write((byte) (j >>> 24));
/* 49 */                byteArrayOutputStream.write((byte) (j >>> 32));
/* 56 */                byteArrayOutputStream.write((byte) (j >>> 40));
/* 63 */                byteArrayOutputStream.write((byte) (j >>> 48));
/* 69 */                byteArrayOutputStream.write((byte) (j >>> 56));
/* 72 */                return;
                    }
/* 77 */            byteArrayOutputStream.write((byte) (j >>> 56));
/* 84 */            byteArrayOutputStream.write((byte) (j >>> 48));
/* 91 */            byteArrayOutputStream.write((byte) (j >>> 40));
/* 98 */            byteArrayOutputStream.write((byte) (j >>> 32));
/* 105 */           byteArrayOutputStream.write((byte) (j >>> 24));
/* 112 */           byteArrayOutputStream.write((byte) (j >>> 16));
/* 119 */           byteArrayOutputStream.write((byte) (j >>> 8));
/* 124 */           byteArrayOutputStream.write((byte) j);
                }

                public static final void writeSize(ByteArrayOutputStream byteArrayOutputStream, int i) {
/* 3 */             if (i < 254) {
/* 5 */                 byteArrayOutputStream.write(i);
                    } else if (i <= 65535) {
/* 14 */                byteArrayOutputStream.write(254);
/* 17 */                writeChar(byteArrayOutputStream, i);
                    } else {
/* 23 */                byteArrayOutputStream.write(255);
/* 26 */                writeInt(byteArrayOutputStream, i);
                    }
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public Object decodeMessage(ByteBuffer byteBuffer) {
/* 2 */             if (byteBuffer == null) {
/* 1 */                 return null;
                    }
/* 9 */             byteBuffer.order(ByteOrder.nativeOrder());
/* 12 */            Object value = readValue(byteBuffer);
/* 20 */            if (!byteBuffer.hasRemaining()) {
/* 22 */                return value;
                    }
/* 25 */            C1951n4.m6859j("Message corrupted");
/* 1 */             return null;
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public ByteBuffer encodeMessage(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 7 */             ExposedByteArrayOutputStream exposedByteArrayOutputStream = new ExposedByteArrayOutputStream();
/* 10 */            writeValue(exposedByteArrayOutputStream, obj);
/* 17 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
/* 30 */            byteBufferAllocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
/* 33 */            return byteBufferAllocateDirect;
                }

                public final Object readValue(ByteBuffer byteBuffer) {
/* 5 */             if (byteBuffer.hasRemaining()) {
/* 11 */                return readValueOfType(byteBuffer.get(), byteBuffer);
                    }
/* 18 */            C1951n4.m6859j("Message corrupted");
/* 21 */            return null;
                }

                public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
/* 2 */             int i = 0;
                    switch (b) {
                        case 0:
/* 1 */                     return null;
                        case 1:
/* 236 */                   return Boolean.TRUE;
                        case 2:
/* 233 */                   return Boolean.FALSE;
                        case 3:
/* 228 */                   return Integer.valueOf(byteBuffer.getInt());
                        case 4:
/* 219 */                   return Long.valueOf(byteBuffer.getLong());
                        case 5:
/* 211 */                   return new BigInteger(new String(readBytes(byteBuffer), UTF8), 16);
                        case 6:
/* 184 */                   readAlignment(byteBuffer, 8);
/* 191 */                   return Double.valueOf(byteBuffer.getDouble());
                        case 7:
/* 180 */                   return new String(readBytes(byteBuffer), UTF8);
                        case 8:
/* 167 */                   return readBytes(byteBuffer);
                        case 9:
/* 141 */                   int size = readSize(byteBuffer);
/* 145 */                   int[] iArr = new int[size];
/* 147 */                   readAlignment(byteBuffer, 4);
/* 154 */                   byteBuffer.asIntBuffer().get(iArr);
/* 163 */                   byteBuffer.position((size * 4) + byteBuffer.position());
/* 166 */                   return iArr;
                        case 10:
/* 115 */                   int size2 = readSize(byteBuffer);
/* 119 */                   long[] jArr = new long[size2];
/* 121 */                   readAlignment(byteBuffer, 8);
/* 128 */                   byteBuffer.asLongBuffer().get(jArr);
/* 137 */                   byteBuffer.position((size2 * 8) + byteBuffer.position());
/* 140 */                   return jArr;
                        case 11:
/* 89 */                    int size3 = readSize(byteBuffer);
/* 93 */                    double[] dArr = new double[size3];
/* 95 */                    readAlignment(byteBuffer, 8);
/* 102 */                   byteBuffer.asDoubleBuffer().get(dArr);
/* 111 */                   byteBuffer.position((size3 * 8) + byteBuffer.position());
/* 114 */                   return dArr;
                        case 12:
/* 67 */                    int size4 = readSize(byteBuffer);
/* 73 */                    ArrayList arrayList = new ArrayList(size4);
/* 76 */                    while (i < size4) {
/* 82 */                        arrayList.add(readValue(byteBuffer));
/* 85 */                        i++;
                            }
/* 88 */                    return arrayList;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 41 */                    int size5 = readSize(byteBuffer);
/* 47 */                    HashMap map = new HashMap();
/* 50 */                    while (i < size5) {
/* 60 */                        map.put(readValue(byteBuffer), readValue(byteBuffer));
/* 63 */                        i++;
                            }
/* 66 */                    return map;
                        case 14:
/* 15 */                    int size6 = readSize(byteBuffer);
/* 19 */                    float[] fArr = new float[size6];
/* 21 */                    readAlignment(byteBuffer, 4);
/* 28 */                    byteBuffer.asFloatBuffer().get(fArr);
/* 37 */                    byteBuffer.position((size6 * 4) + byteBuffer.position());
/* 40 */                    return fArr;
                        default:
/* 11 */                    C1951n4.m6859j("Message corrupted");
/* 1 */                     return null;
                    }
                }

                public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
/* 1 */             int i = 0;
/* 2 */             if (obj == null || obj.equals(null)) {
/* 423 */               byteArrayOutputStream.write(0);
/* 426 */               return;
                    }
/* 15 */            if (obj instanceof Boolean) {
/* 28 */                byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
/* 31 */                return;
                    }
/* 37 */            if (obj instanceof Number) {
/* 41 */                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
/* 132 */                   byteArrayOutputStream.write(3);
/* 141 */                   writeInt(byteArrayOutputStream, ((Number) obj).intValue());
/* 144 */                   return;
                        }
/* 54 */                if (obj instanceof Long) {
/* 56 */                    byteArrayOutputStream.write(4);
/* 65 */                    writeLong(byteArrayOutputStream, ((Long) obj).longValue());
/* 68 */                    return;
                        }
/* 71 */                if ((obj instanceof Float) || (obj instanceof Double)) {
/* 115 */                   byteArrayOutputStream.write(6);
/* 118 */                   writeAlignment(byteArrayOutputStream, 8);
/* 127 */                   writeDouble(byteArrayOutputStream, ((Number) obj).doubleValue());
/* 130 */                   return;
                        } else if (!(obj instanceof BigInteger)) {
/* 110 */                   C1951n4.m6865p(obj.getClass(), "Unsupported Number type: ");
/* 113 */                   return;
                        } else {
/* 83 */                    byteArrayOutputStream.write(5);
/* 100 */                   writeBytes(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(UTF8));
/* 103 */                   return;
                        }
                    }
/* 147 */           if (obj instanceof CharSequence) {
/* 150 */               byteArrayOutputStream.write(7);
/* 163 */               writeBytes(byteArrayOutputStream, obj.toString().getBytes(UTF8));
/* 166 */               return;
                    }
/* 169 */           if (obj instanceof byte[]) {
/* 171 */               byteArrayOutputStream.write(8);
/* 176 */               writeBytes(byteArrayOutputStream, (byte[]) obj);
/* 179 */               return;
                    }
/* 182 */           if (obj instanceof int[]) {
/* 186 */               byteArrayOutputStream.write(9);
/* 189 */               int[] iArr = (int[]) obj;
/* 192 */               writeSize(byteArrayOutputStream, iArr.length);
/* 195 */               writeAlignment(byteArrayOutputStream, 4);
/* 198 */               int length = iArr.length;
/* 199 */               while (i < length) {
/* 203 */                   writeInt(byteArrayOutputStream, iArr[i]);
/* 206 */                   i++;
                        }
/* 385 */               return;
                    }
/* 211 */           if (obj instanceof long[]) {
/* 215 */               byteArrayOutputStream.write(10);
/* 218 */               long[] jArr = (long[]) obj;
/* 221 */               writeSize(byteArrayOutputStream, jArr.length);
/* 224 */               writeAlignment(byteArrayOutputStream, 8);
/* 227 */               int length2 = jArr.length;
/* 228 */               while (i < length2) {
/* 232 */                   writeLong(byteArrayOutputStream, jArr[i]);
/* 235 */                   i++;
                        }
/* 385 */               return;
                    }
/* 240 */           if (obj instanceof double[]) {
/* 244 */               byteArrayOutputStream.write(11);
/* 247 */               double[] dArr = (double[]) obj;
/* 250 */               writeSize(byteArrayOutputStream, dArr.length);
/* 253 */               writeAlignment(byteArrayOutputStream, 8);
/* 256 */               int length3 = dArr.length;
/* 257 */               while (i < length3) {
/* 261 */                   writeDouble(byteArrayOutputStream, dArr[i]);
/* 264 */                   i++;
                        }
/* 385 */               return;
                    }
/* 269 */           if (obj instanceof List) {
/* 273 */               byteArrayOutputStream.write(12);
/* 276 */               List list = (List) obj;
/* 282 */               writeSize(byteArrayOutputStream, list.size());
/* 285 */               Iterator it = list.iterator();
/* 293 */               while (it.hasNext()) {
/* 299 */                   writeValue(byteArrayOutputStream, it.next());
                        }
/* 385 */               return;
                    }
/* 305 */           if (obj instanceof Map) {
/* 309 */               byteArrayOutputStream.write(13);
/* 312 */               Map map = (Map) obj;
/* 318 */               writeSize(byteArrayOutputStream, map.size());
/* 333 */               for (Map.Entry entry : map.entrySet()) {
/* 345 */                   writeValue(byteArrayOutputStream, entry.getKey());
/* 352 */                   writeValue(byteArrayOutputStream, entry.getValue());
                        }
/* 385 */               return;
                    }
/* 358 */           if (!(obj instanceof float[])) {
/* 392 */               StringBuilder sb = new StringBuilder("Unsupported value: '");
/* 395 */               sb.append(obj);
/* 398 */               Class<?> cls = obj.getClass();
/* 404 */               sb.append("' of type '");
/* 407 */               sb.append(cls);
/* 412 */               sb.append("'");
/* 422 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 362 */           byteArrayOutputStream.write(14);
/* 365 */           float[] fArr = (float[]) obj;
/* 368 */           writeSize(byteArrayOutputStream, fArr.length);
/* 371 */           writeAlignment(byteArrayOutputStream, 4);
/* 374 */           int length4 = fArr.length;
/* 375 */           while (i < length4) {
/* 379 */               writeFloat(byteArrayOutputStream, fArr[i]);
/* 382 */               i++;
                    }
                }
            }
