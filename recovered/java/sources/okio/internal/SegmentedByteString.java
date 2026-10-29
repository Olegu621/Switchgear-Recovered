            package okio.internal;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ByteString;
            import okio.C2570SegmentedByteString;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.C1960nd;
            import p000.ds0;
            import p000.fm0;
            import p000.lo0;
            
            /* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lokio/SegmentedByteString;", "pos", "segment", "(Lokio/SegmentedByteString;I)I", "Lkotlin/Function3;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "action", "forEachSegment", "(Lokio/SegmentedByteString;Llo0;)V", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "(Lokio/SegmentedByteString;IILlo0;)V", "Lokio/ByteString;", "commonSubstring", "(Lokio/SegmentedByteString;II)Lokio/ByteString;", HttpUrl.FRAGMENT_ENCODE_SET, "commonInternalGet", "(Lokio/SegmentedByteString;I)B", "commonGetSize", "(Lokio/SegmentedByteString;)I", "commonToByteArray", "(Lokio/SegmentedByteString;)[B", "Lokio/Buffer;", "buffer", "offset", "byteCount", "commonWrite", "(Lokio/SegmentedByteString;Lokio/Buffer;II)V", "other", "otherOffset", HttpUrl.FRAGMENT_ENCODE_SET, "commonRangeEquals", "(Lokio/SegmentedByteString;ILokio/ByteString;II)Z", "(Lokio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lokio/SegmentedByteString;I[BII)V", HttpUrl.FRAGMENT_ENCODE_SET, "commonEquals", "(Lokio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 67 */    public final class SegmentedByteString {
                public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
/* 1 */             iArr.getClass();
/* 4 */             int i4 = i3 - 1;
/* 6 */             while (i2 <= i4) {
/* 10 */                int i5 = (i2 + i4) >>> 1;
/* 12 */                int i6 = iArr[i5];
/* 14 */                if (i6 < i) {
/* 16 */                    i2 = i5 + 1;
                        } else {
/* 19 */                    if (i6 <= i) {
/* 24 */                        return i5;
                            }
/* 21 */                    i4 = i5 - 1;
                        }
                    }
/* 26 */            return (-i2) - 1;
                }

                public static final void commonCopyInto(C2570SegmentedByteString c2570SegmentedByteString, int i, byte[] bArr, int i2, int i3) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 4 */             bArr.getClass();
                    long j = i3;
/* 14 */            okio.SegmentedByteString.checkOffsetAndCount(c2570SegmentedByteString.size(), i, j);
/* 22 */            okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j);
/* 25 */            int i4 = i3 + i;
/* 26 */            int iSegment = segment(c2570SegmentedByteString, i);
/* 30 */            while (i < i4) {
/* 42 */                int i5 = iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1];
/* 50 */                int i6 = c2570SegmentedByteString.getDirectory()[iSegment] - i5;
/* 61 */                int i7 = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment];
/* 68 */                int iMin = Math.min(i4, i6 + i5) - i;
/* 71 */                int i8 = (i - i5) + i7;
/* 80 */                C1960nd.m6964b(c2570SegmentedByteString.getSegments()[iSegment], i2, bArr, i8, i8 + iMin);
/* 83 */                i2 += iMin;
/* 84 */                i += iMin;
/* 85 */                iSegment++;
                    }
                }

                public static final boolean commonEquals(C2570SegmentedByteString c2570SegmentedByteString, Object obj) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 5 */             if (obj == c2570SegmentedByteString) {
/* 4 */                 return true;
                    }
/* 11 */            if (obj instanceof ByteString) {
/* 13 */                ByteString byteString = (ByteString) obj;
/* 23 */                if (byteString.size() == c2570SegmentedByteString.size() && c2570SegmentedByteString.rangeEquals(0, byteString, 0, c2570SegmentedByteString.size())) {
/* 4 */                     return true;
                        }
                    }
/* 10 */            return false;
                }

                public static final int commonGetSize(C2570SegmentedByteString c2570SegmentedByteString) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 15 */            return c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length - 1];
                }

                public static final int commonHashCode(C2570SegmentedByteString c2570SegmentedByteString) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 4 */             int hashCode = c2570SegmentedByteString.getHashCode();
/* 8 */             if (hashCode != 0) {
/* 10 */                return hashCode;
                    }
/* 15 */            int length = c2570SegmentedByteString.getSegments().length;
/* 16 */            int i = 0;
/* 18 */            int i2 = 1;
/* 19 */            int i3 = 0;
/* 20 */            while (i < length) {
/* 28 */                int i4 = c2570SegmentedByteString.getDirectory()[length + i];
/* 34 */                int i5 = c2570SegmentedByteString.getDirectory()[i];
/* 40 */                byte[] bArr = c2570SegmentedByteString.getSegments()[i];
/* 44 */                int i6 = (i5 - i3) + i4;
/* 45 */                while (i4 < i6) {
/* 51 */                    i2 = (i2 * 31) + bArr[i4];
/* 52 */                    i4++;
                        }
/* 55 */                i++;
/* 57 */                i3 = i5;
                    }
/* 59 */            c2570SegmentedByteString.setHashCode$okio(i2);
/* 62 */            return i2;
                }

                public static final byte commonInternalGet(C2570SegmentedByteString c2570SegmentedByteString, int i) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 21 */            okio.SegmentedByteString.checkOffsetAndCount(c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length - 1], i, 1L);
/* 24 */            int iSegment = segment(c2570SegmentedByteString, i);
/* 60 */            return c2570SegmentedByteString.getSegments()[iSegment][(i - (iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1])) + c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment]];
                }

                public static final boolean commonRangeEquals(C2570SegmentedByteString c2570SegmentedByteString, int i, byte[] bArr, int i2, int i3) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 4 */             bArr.getClass();
/* 8 */             if (i < 0 || i > c2570SegmentedByteString.size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
/* 7 */                 return false;
                    }
/* 24 */            int i4 = i3 + i;
/* 25 */            int iSegment = segment(c2570SegmentedByteString, i);
/* 29 */            while (i < i4) {
/* 41 */                int i5 = iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1];
/* 49 */                int i6 = c2570SegmentedByteString.getDirectory()[iSegment] - i5;
/* 60 */                int i7 = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment];
/* 67 */                int iMin = Math.min(i4, i6 + i5) - i;
/* 81 */                if (!okio.SegmentedByteString.arrayRangeEquals(c2570SegmentedByteString.getSegments()[iSegment], (i - i5) + i7, bArr, i2, iMin)) {
/* 7 */                     return false;
                        }
/* 84 */                i2 += iMin;
/* 85 */                i += iMin;
/* 86 */                iSegment++;
                    }
/* 89 */            return true;
                }

                public static final ByteString commonSubstring(C2570SegmentedByteString c2570SegmentedByteString, int i, int i2) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 4 */             int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c2570SegmentedByteString, i2);
/* 9 */             if (i < 0) {
/* 180 */               ds0.m3200q(AbstractC0886en.m3505i(i, "beginIndex=", " < 0"));
/* 8 */                 return null;
                    }
/* 17 */            if (iResolveDefaultParameter > c2570SegmentedByteString.size()) {
/* 142 */               StringBuilder sbM3793s = fm0.m3793s(iResolveDefaultParameter, "endIndex=", " > length(");
/* 150 */               sbM3793s.append(c2570SegmentedByteString.size());
/* 155 */               sbM3793s.append(')');
/* 171 */               throw new IllegalArgumentException(sbM3793s.toString().toString());
                    }
/* 19 */            int i3 = iResolveDefaultParameter - i;
/* 21 */            if (i3 < 0) {
/* 136 */               ds0.m3200q(AbstractC0886en.m3506j("endIndex=", iResolveDefaultParameter, i, " < beginIndex="));
/* 8 */                 return null;
                    }
/* 23 */            if (i == 0 && iResolveDefaultParameter == c2570SegmentedByteString.size()) {
/* 31 */                return c2570SegmentedByteString;
                    }
/* 32 */            if (i == iResolveDefaultParameter) {
/* 34 */                return ByteString.EMPTY;
                    }
/* 37 */            int iSegment = segment(c2570SegmentedByteString, i);
/* 43 */            int iSegment2 = segment(c2570SegmentedByteString, iResolveDefaultParameter - 1);
/* 57 */            byte[][] bArr = (byte[][]) C1960nd.m6967e(c2570SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
/* 62 */            int[] iArr = new int[bArr.length * 2];
/* 65 */            if (iSegment <= iSegment2) {
/* 67 */                int i4 = iSegment;
/* 68 */                int i5 = 0;
                        while (true) {
/* 80 */                    iArr[i5] = Math.min(c2570SegmentedByteString.getDirectory()[i4] - i, i3);
/* 82 */                    int i6 = i5 + 1;
/* 98 */                    iArr[i5 + bArr.length] = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + i4];
/* 100 */                   if (i4 == iSegment2) {
                                break;
                            }
/* 102 */                   i4++;
/* 104 */                   i5 = i6;
                        }
                    }
/* 115 */           int i7 = iSegment != 0 ? c2570SegmentedByteString.getDirectory()[iSegment - 1] : 0;
/* 117 */           int length = bArr.length;
/* 122 */           iArr[length] = (i - i7) + iArr[length];
/* 126 */           return new C2570SegmentedByteString(bArr, iArr);
                }

                public static final byte[] commonToByteArray(C2570SegmentedByteString c2570SegmentedByteString) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 8 */             byte[] bArr = new byte[c2570SegmentedByteString.size()];
/* 14 */            int length = c2570SegmentedByteString.getSegments().length;
/* 15 */            int i = 0;
/* 16 */            int i2 = 0;
/* 17 */            int i3 = 0;
/* 18 */            while (i < length) {
/* 26 */                int i4 = c2570SegmentedByteString.getDirectory()[length + i];
/* 32 */                int i5 = c2570SegmentedByteString.getDirectory()[i];
/* 40 */                int i6 = i5 - i2;
/* 44 */                C1960nd.m6964b(c2570SegmentedByteString.getSegments()[i], i3, bArr, i4, i4 + i6);
/* 47 */                i3 += i6;
/* 48 */                i++;
/* 50 */                i2 = i5;
                    }
/* 52 */            return bArr;
                }

                public static final void commonWrite(C2570SegmentedByteString c2570SegmentedByteString, Buffer buffer, int i, int i2) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 4 */             buffer.getClass();
/* 7 */             int i3 = i + i2;
/* 9 */             int iSegment = segment(c2570SegmentedByteString, i);
/* 13 */            while (i < i3) {
/* 25 */                int i4 = iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1];
/* 33 */                int i5 = c2570SegmentedByteString.getDirectory()[iSegment] - i4;
/* 44 */                int i6 = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment];
/* 51 */                int iMin = Math.min(i3, i5 + i4) - i;
/* 54 */                int i7 = (i - i4) + i6;
/* 68 */                Segment segment = new Segment(c2570SegmentedByteString.getSegments()[iSegment], i7, i7 + iMin, true, false);
/* 71 */                Segment segment2 = buffer.head;
/* 73 */                if (segment2 == null) {
/* 75 */                    segment.prev = segment;
/* 77 */                    segment.next = segment;
/* 79 */                    buffer.head = segment;
                        } else {
/* 82 */                    segment2.getClass();
/* 85 */                    Segment segment3 = segment2.prev;
/* 87 */                    segment3.getClass();
/* 90 */                    segment3.push(segment);
                        }
/* 93 */                i += iMin;
/* 94 */                iSegment++;
                    }
/* 103 */           buffer.setSize$okio(buffer.size() + ((long) i2));
                }

                private static final void forEachSegment(C2570SegmentedByteString c2570SegmentedByteString, int i, int i2, lo0 lo0Var) {
/* 1 */             int iSegment = segment(c2570SegmentedByteString, i);
/* 5 */             while (i < i2) {
/* 17 */                int i3 = iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1];
/* 25 */                int i4 = c2570SegmentedByteString.getDirectory()[iSegment] - i3;
/* 36 */                int i5 = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment];
/* 43 */                int iMin = Math.min(i2, i4 + i3) - i;
/* 61 */                lo0Var.mo4450a(c2570SegmentedByteString.getSegments()[iSegment], Integer.valueOf((i - i3) + i5), Integer.valueOf(iMin));
/* 64 */                i += iMin;
/* 65 */                iSegment++;
                    }
                }

                public static final int segment(C2570SegmentedByteString c2570SegmentedByteString, int i) {
/* 1 */             c2570SegmentedByteString.getClass();
/* 16 */            int iBinarySearch = binarySearch(c2570SegmentedByteString.getDirectory(), i + 1, 0, c2570SegmentedByteString.getSegments().length);
                    return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
                }

/* 68 */        public static final void forEachSegment(C2570SegmentedByteString c2570SegmentedByteString, lo0 lo0Var) {
                    c2570SegmentedByteString.getClass();
                    lo0Var.getClass();
/* 69 */            int length = c2570SegmentedByteString.getSegments().length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
/* 70 */                int i3 = c2570SegmentedByteString.getDirectory()[length + i];
/* 71 */                int i4 = c2570SegmentedByteString.getDirectory()[i];
/* 72 */                lo0Var.mo4450a(c2570SegmentedByteString.getSegments()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
                        i++;
                        i2 = i4;
                    }
                }

/* 91 */        public static final boolean commonRangeEquals(C2570SegmentedByteString c2570SegmentedByteString, int i, ByteString byteString, int i2, int i3) {
                    c2570SegmentedByteString.getClass();
                    byteString.getClass();
/* 92 */            if (i < 0 || i > c2570SegmentedByteString.size() - i3) {
                        return false;
                    }
                    int i4 = i3 + i;
/* 93 */            int iSegment = segment(c2570SegmentedByteString, i);
                    while (i < i4) {
/* 94 */                int i5 = iSegment == 0 ? 0 : c2570SegmentedByteString.getDirectory()[iSegment - 1];
/* 95 */                int i6 = c2570SegmentedByteString.getDirectory()[iSegment] - i5;
/* 96 */                int i7 = c2570SegmentedByteString.getDirectory()[c2570SegmentedByteString.getSegments().length + iSegment];
/* 97 */                int iMin = Math.min(i4, i6 + i5) - i;
/* 99 */                if (!byteString.rangeEquals(i2, c2570SegmentedByteString.getSegments()[iSegment], (i - i5) + i7, iMin)) {
                            return false;
                        }
                        i2 += iMin;
                        i += iMin;
                        iSegment++;
                    }
                    return true;
                }
            }
