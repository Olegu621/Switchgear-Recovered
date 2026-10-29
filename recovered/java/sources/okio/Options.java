            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.RandomAccess;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.AbstractC2237u;
            import p000.C1772ix;
            import p000.C1951n4;
            import p000.C2233tw;
            import p000.C2546zc;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m6176d2 = {"Lokio/Options;", "Lu;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", HttpUrl.FRAGMENT_ENCODE_SET, "byteStrings", HttpUrl.FRAGMENT_ENCODE_SET, "trie", "<init>", "([Lokio/ByteString;[I)V", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.INDEX, "get", "(I)Lokio/ByteString;", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class Options extends AbstractC2237u implements RandomAccess {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final ByteString[] byteStrings;
                private final int[] trie;

                private Options(ByteString[] byteStringArr, int[] iArr) {
/* 4 */             this.byteStrings = byteStringArr;
/* 6 */             this.trie = iArr;
                }

                /* JADX INFO: renamed from: of */
                public static final Options m7204of(ByteString... byteStringArr) {
/* 3 */             return INSTANCE.m7205of(byteStringArr);
                }

                @Override // p000.AbstractC0936g, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
/* 3 */             if (obj instanceof ByteString) {
/* 9 */                 return contains((ByteString) obj);
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
                public final ByteString[] getByteStrings() {
/* 1 */             return this.byteStrings;
                }

                @Override // p000.AbstractC0936g
                public int getSize() {
/* 3 */             return this.byteStrings.length;
                }

                /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
                public final int[] getTrie() {
/* 1 */             return this.trie;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
/* 3 */             if (obj instanceof ByteString) {
/* 9 */                 return indexOf((ByteString) obj);
                    }
/* 5 */             return -1;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
/* 3 */             if (obj instanceof ByteString) {
/* 9 */                 return lastIndexOf((ByteString) obj);
                    }
/* 5 */             return -1;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m6176d2 = {"Lokio/Options$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "intCount", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", HttpUrl.FRAGMENT_ENCODE_SET, "nodeOffset", "node", "byteStringOffset", HttpUrl.FRAGMENT_ENCODE_SET, "byteStrings", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", HttpUrl.FRAGMENT_ENCODE_SET, "([Lokio/ByteString;)Lokio/Options;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
                        int i;
                        int i2;
                        long j;
                        int i3;
                        long j2;
                        int i4 = byteStringOffset;
                        if (fromIndex >= toIndex) {
/* 37 */                    C1951n4.m6859j("Failed requirement.");
                            return;
                        }
                        for (int i5 = fromIndex; i5 < toIndex; i5++) {
/* 2 */                     if (byteStrings.get(i5).size() < i4) {
/* 1 */                         C1951n4.m6859j("Failed requirement.");
                                return;
                            }
                        }
/* 3 */                 ByteString byteString = byteStrings.get(fromIndex);
/* 4 */                 ByteString byteString2 = byteStrings.get(toIndex - 1);
                        byte b = -1;
/* 5 */                 if (i4 == byteString.size()) {
/* 6 */                     int iIntValue = indexes.get(fromIndex).intValue();
                            int i6 = fromIndex + 1;
/* 7 */                     ByteString byteString3 = byteStrings.get(i6);
                            i = i6;
                            i2 = iIntValue;
                            byteString = byteString3;
                        } else {
                            i = fromIndex;
                            i2 = -1;
                        }
                        long j3 = 2;
/* 8 */                 if (byteString.getByte(i4) == byteString2.getByte(i4)) {
/* 24 */                    int iMin = Math.min(byteString.size(), byteString2.size());
                            int i7 = 0;
                            int i8 = i4;
                            while (true) {
                                byte b2 = b;
                                if (i8 >= iMin) {
                                    j = j3;
                                    break;
                                }
                                j = j3;
/* 25 */                        if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                                    break;
                                }
                                i7++;
                                i8++;
                                b = b2;
                                j3 = j;
                            }
/* 26 */                    long intCount = nodeOffset + getIntCount(node) + j + ((long) i7) + 1;
/* 27 */                    node.writeInt(-i7);
/* 28 */                    node.writeInt(i2);
                            int i9 = i4 + i7;
                            while (i4 < i9) {
/* 29 */                        node.writeInt(byteString.getByte(i4) & 255);
                                i4++;
                            }
                            if (i + 1 == toIndex) {
/* 30 */                        if (i9 == byteStrings.get(i).size()) {
/* 31 */                            node.writeInt(indexes.get(i).intValue());
                                    return;
                                } else {
/* 32 */                            f42.m3656l("Check failed.");
                                    return;
                                }
                            }
/* 33 */                    Buffer buffer = new Buffer();
/* 34 */                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
/* 35 */                    buildTrieRecursive(intCount, buffer, i9, byteStrings, i, toIndex, indexes);
/* 36 */                    node.writeAll(buffer);
                            return;
                        }
                        int i10 = 1;
                        for (int i11 = i + 1; i11 < toIndex; i11++) {
/* 9 */                     if (byteStrings.get(i11 - 1).getByte(i4) != byteStrings.get(i11).getByte(i4)) {
                                i10++;
                            }
                        }
/* 10 */                long intCount2 = nodeOffset + getIntCount(node) + 2 + ((long) (i10 * 2));
/* 11 */                node.writeInt(i10);
/* 12 */                node.writeInt(i2);
                        for (int i12 = i; i12 < toIndex; i12++) {
/* 13 */                    byte b3 = byteStrings.get(i12).getByte(i4);
/* 14 */                    if (i12 == i || b3 != byteStrings.get(i12 - 1).getByte(i4)) {
/* 15 */                        node.writeInt(b3 & 255);
                            }
                        }
/* 16 */                Buffer buffer2 = new Buffer();
                        while (i < toIndex) {
/* 17 */                    byte b4 = byteStrings.get(i).getByte(i4);
                            int i13 = i + 1;
                            int i14 = i13;
                            while (true) {
                                if (i14 >= toIndex) {
                                    i3 = toIndex;
                                    break;
                                } else {
/* 18 */                            if (b4 != byteStrings.get(i14).getByte(i4)) {
                                        i3 = i14;
                                        break;
                                    }
                                    i14++;
                                }
                            }
/* 19 */                    if (i13 == i3 && i4 + 1 == byteStrings.get(i).size()) {
/* 20 */                        node.writeInt(indexes.get(i).intValue());
                                j2 = intCount2;
                            } else {
/* 21 */                        node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                                j2 = intCount2;
/* 22 */                        buildTrieRecursive(j2, buffer2, i4 + 1, byteStrings, i, i3, indexes);
                            }
                            intCount2 = j2;
                            i = i3;
                        }
/* 23 */                node.writeAll(buffer2);
                    }

                    public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
                        if ((i4 & 1) != 0) {
                            j = 0;
                        }
/* 2 */                 companion.buildTrieRecursive(j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
                    }

                    private final long getIntCount(Buffer buffer) {
/* 7 */                 return buffer.size() / 4;
                    }

                    /* JADX INFO: renamed from: of */
                    public final Options m7205of(ByteString... byteStrings) throws IOException {
                        int i;
/* 3 */                 byteStrings.getClass();
/* 7 */                 DefaultConstructorMarker defaultConstructorMarker = null;
/* 9 */                 int i2 = 0;
/* 10 */                if (byteStrings.length == 0) {
/* 20 */                    return new Options(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
                        }
/* 31 */                ArrayList arrayList = new ArrayList(new C2546zc(byteStrings, false));
/* 34 */                C2233tw.m8919j(arrayList);
/* 40 */                ArrayList arrayList2 = new ArrayList(byteStrings.length);
/* 45 */                for (ByteString byteString : byteStrings) {
/* 53 */                    arrayList2.add(-1);
                        }
/* 65 */                Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
/* 68 */                Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
/* 90 */                ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new C2546zc(objArrCopyOf, true));
/* 94 */                int length = byteStrings.length;
/* 95 */                int i3 = 0;
/* 96 */                int i4 = 0;
/* 97 */                while (i3 < length) {
/* 99 */                    ByteString byteString2 = byteStrings[i3];
/* 101 */                   int i5 = i4 + 1;
/* 103 */                   int size = arrayList.size();
/* 107 */                   int size2 = arrayList.size();
/* 113 */                   if (size < 0) {
/* 196 */                       C1951n4.m6859j(AbstractC0886en.m3505i(size, "fromIndex (0) is greater than toIndex (", ")."));
/* 7 */                         return null;
                            }
/* 115 */                   if (size > size2) {
/* 189 */                       throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                            }
/* 117 */                   int i6 = size - 1;
/* 119 */                   int i7 = 0;
                            while (true) {
/* 120 */                       if (i7 > i6) {
/* 147 */                           i = -(i7 + 1);
                                    break;
                                }
/* 124 */                       i = (i7 + i6) >>> 1;
/* 131 */                       int iM5609a = C1772ix.m5609a((Comparable) arrayList.get(i), byteString2);
/* 135 */                       if (iM5609a >= 0) {
/* 140 */                           if (iM5609a <= 0) {
                                        break;
                                    }
/* 142 */                           i6 = i - 1;
                                } else {
/* 137 */                           i7 = i + 1;
                                }
                            }
/* 152 */                   arrayList3.set(i, Integer.valueOf(i4));
/* 155 */                   i3++;
/* 157 */                   i4 = i5;
                        }
/* 210 */               if (((ByteString) arrayList.get(0)).size() <= 0) {
/* 352 */                   C1951n4.m6859j("the empty byte string is not a supported option");
/* 7 */                     return null;
                        }
/* 212 */               int i8 = 0;
/* 217 */               while (i8 < arrayList.size()) {
/* 223 */                   ByteString byteString3 = (ByteString) arrayList.get(i8);
/* 225 */                   int i9 = i8 + 1;
/* 227 */                   int i10 = i9;
/* 232 */                   while (i10 < arrayList.size()) {
/* 238 */                       ByteString byteString4 = (ByteString) arrayList.get(i10);
/* 244 */                       if (!byteString4.startsWith(byteString3)) {
                                    break;
                                }
/* 254 */                       if (byteString4.size() == byteString3.size()) {
/* 290 */                           C1951n4.m6867r(byteString4, "duplicate option: ");
/* 7 */                             return null;
                                }
/* 276 */                       if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
/* 278 */                           arrayList.remove(i10);
/* 281 */                           arrayList3.remove(i10);
                                } else {
/* 285 */                           i10++;
                                }
                            }
/* 294 */                   i8 = i9;
                        }
/* 298 */               Buffer buffer = new Buffer();
/* 311 */               buildTrieRecursive$default(this, 0L, buffer, 0, arrayList, 0, 0, arrayList3, 53, null);
/* 319 */               int[] iArr = new int[(int) getIntCount(buffer)];
/* 325 */               while (!buffer.exhausted()) {
/* 333 */                   iArr[i2] = buffer.readInt();
/* 327 */                   i2++;
                        }
/* 346 */               return new Options((ByteString[]) Arrays.copyOf(byteStrings, byteStrings.length), iArr, defaultConstructorMarker);
                    }

/* 4 */             private Companion() {
                    }
                }

                @Override // java.util.List
/* 5 */         public ByteString get(int index) {
/* 6 */             return this.byteStrings[index];
                }

/* 8 */         public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this(byteStringArr, iArr);
                }

/* 13 */        public /* bridge */ boolean contains(ByteString byteString) {
/* 14 */            return super.contains((Object) byteString);
                }

/* 13 */        public /* bridge */ int indexOf(ByteString byteString) {
/* 14 */            return super.indexOf((Object) byteString);
                }

/* 13 */        public /* bridge */ int lastIndexOf(ByteString byteString) {
/* 14 */            return super.lastIndexOf((Object) byteString);
                }
            }
