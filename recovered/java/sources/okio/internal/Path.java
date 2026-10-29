            package okio.internal;

            import java.io.EOFException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ByteString;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C2122qw;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u000eH\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001b\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0001*\u00020\u000eH\u0080\b\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u000eH\u0080\b\u001a\u000f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001c\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\u000f\u0010'\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)*\u00020\u000eH\u0080\b\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)*\u00020\u000eH\u0080\b\u001a\u0014\u0010+\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\r\u0010,\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\u0014\u0010-\u001a\u0004\u0018\u00010.*\u00020\u000eH\u0080\b¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0017*\u00020\u000eH\u0002\u001a\f\u00101\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u00102\u001a\u00020\u0017*\u00020&2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u000e*\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\f\u00104\u001a\u00020\u0001*\u000205H\u0002\u001a\f\u00104\u001a\u00020\u0001*\u00020\u001eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, m6176d2 = {"ANY_SLASH", "Lokio/ByteString;", "getANY_SLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "SLASH", "getSLASH$annotations", "indexOfLastSlash", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Path;", "getIndexOfLastSlash", "(Lokio/Path;)I", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "other", "commonEquals", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "commonHashCode", "commonIsAbsolute", "commonIsRelative", "commonIsRoot", "commonName", HttpUrl.FRAGMENT_ENCODE_SET, "commonNameBytes", "commonNormalized", "commonParent", "commonRelativeTo", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRoot", "commonSegments", HttpUrl.FRAGMENT_ENCODE_SET, "commonSegmentsBytes", "commonToPath", "commonToString", "commonVolumeLetter", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Path;)Ljava/lang/Character;", "lastSegmentIsDotDot", "rootLength", "startsWithVolumeLetterAndColon", "toPath", "toSlash", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 32 */    public final class Path {
                private static final ByteString ANY_SLASH;
                private static final ByteString BACKSLASH;
                private static final ByteString DOT;
                private static final ByteString DOT_DOT;
                private static final ByteString SLASH;

                static {
/* 1 */             ByteString.Companion companion = ByteString.INSTANCE;
/* 9 */             SLASH = companion.encodeUtf8("/");
/* 17 */            BACKSLASH = companion.encodeUtf8("\\");
/* 25 */            ANY_SLASH = companion.encodeUtf8("/\\");
/* 33 */            DOT = companion.encodeUtf8(".");
/* 41 */            DOT_DOT = companion.encodeUtf8("..");
                }

                public static final int commonCompareTo(okio.Path path, okio.Path path2) {
/* 1 */             path.getClass();
/* 4 */             path2.getClass();
/* 15 */            return path.getBytes().compareTo(path2.getBytes());
                }

                public static final boolean commonEquals(okio.Path path, Object obj) {
/* 1 */             path.getClass();
                    return (obj instanceof okio.Path) && Intrinsics.m6216a(((okio.Path) obj).getBytes(), path.getBytes());
                }

                public static final int commonHashCode(okio.Path path) {
/* 1 */             path.getClass();
/* 8 */             return path.getBytes().hashCode();
                }

                public static final boolean commonIsAbsolute(okio.Path path) {
/* 1 */             path.getClass();
                    return rootLength(path) != -1;
                }

                public static final boolean commonIsRelative(okio.Path path) {
/* 1 */             path.getClass();
                    return rootLength(path) == -1;
                }

                public static final boolean commonIsRoot(okio.Path path) {
/* 1 */             path.getClass();
                    return rootLength(path) == path.getBytes().size();
                }

                public static final String commonName(okio.Path path) {
/* 1 */             path.getClass();
/* 8 */             return path.nameBytes().utf8();
                }

                public static final ByteString commonNameBytes(okio.Path path) {
/* 1 */             path.getClass();
/* 1 */             int indexOfLastSlash = getIndexOfLastSlash(path);
/* 10 */            if (indexOfLastSlash != -1) {
/* 20 */                return ByteString.substring$default(path.getBytes(), indexOfLastSlash + 1, 0, 2, null);
                    }
                    return (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : ByteString.EMPTY;
                }

                public static final okio.Path commonNormalized(okio.Path path) {
/* 1 */             path.getClass();
/* 11 */            return okio.Path.INSTANCE.get(path.toString(), true);
                }

                public static final okio.Path commonParent(okio.Path path) {
/* 1 */             path.getClass();
/* 17 */            if (Intrinsics.m6216a(path.getBytes(), DOT) || Intrinsics.m6216a(path.getBytes(), SLASH) || Intrinsics.m6216a(path.getBytes(), BACKSLASH) || lastSegmentIsDotDot(path)) {
/* 16 */                return null;
                    }
/* 1 */             int indexOfLastSlash = getIndexOfLastSlash(path);
/* 62 */            if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
/* 79 */                if (path.getBytes().size() == 3) {
/* 16 */                    return null;
                        }
/* 92 */                return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
                    }
/* 96 */            if (indexOfLastSlash == 1 && path.getBytes().startsWith(BACKSLASH)) {
/* 16 */                return null;
                    }
/* 114 */           if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
/* 147 */               if (indexOfLastSlash == -1) {
/* 155 */                   return new okio.Path(DOT);
                        }
                        return indexOfLastSlash == 0 ? new okio.Path(ByteString.substring$default(path.getBytes(), 0, 1, 1, null)) : new okio.Path(ByteString.substring$default(path.getBytes(), 0, indexOfLastSlash, 1, null));
                    }
/* 130 */           if (path.getBytes().size() == 2) {
/* 16 */                return null;
                    }
/* 143 */           return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
                }

                public static final okio.Path commonRelativeTo(okio.Path path, okio.Path path2) {
/* 1 */             path.getClass();
/* 4 */             path2.getClass();
/* 20 */            if (!Intrinsics.m6216a(path.getRoot(), path2.getRoot())) {
/* 189 */               ds0.m3194k(path, "Paths of different roots cannot be relative to each other: ", path2);
/* 19 */                return null;
                    }
/* 22 */            List<ByteString> segmentsBytes = path.getSegmentsBytes();
/* 26 */            List<ByteString> segmentsBytes2 = path2.getSegmentsBytes();
/* 38 */            int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
/* 43 */            int i = 0;
/* 44 */            while (i < iMin && Intrinsics.m6216a(segmentsBytes.get(i), segmentsBytes2.get(i))) {
/* 60 */                i++;
                    }
/* 63 */            if (i == iMin && path.getBytes().size() == path2.getBytes().size()) {
/* 88 */                return okio.Path.Companion.get$default(okio.Path.INSTANCE, ".", false, 1, (Object) null);
                    }
/* 110 */           if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
/* 183 */               ds0.m3194k(path, "Impossible relative path to resolve: ", path2);
/* 19 */                return null;
                    }
/* 114 */           Buffer buffer = new Buffer();
/* 1 */             ByteString slash = getSlash(path2);
/* 121 */           if (slash == null && (slash = getSlash(path)) == null) {
/* 1 */                 slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
                    }
/* 135 */           int size = segmentsBytes2.size();
/* 140 */           for (int i2 = i; i2 < size; i2++) {
/* 146 */               buffer.write(DOT_DOT);
/* 149 */               buffer.write(slash);
                    }
/* 155 */           int size2 = segmentsBytes.size();
/* 159 */           while (i < size2) {
/* 167 */               buffer.write(segmentsBytes.get(i));
/* 170 */               buffer.write(slash);
/* 173 */               i++;
                    }
/* 176 */           return toPath(buffer, false);
                }

                public static final okio.Path commonResolve(okio.Path path, okio.Path path2, boolean z) {
/* 1 */             path.getClass();
/* 4 */             path2.getClass();
/* 11 */            if (path2.isAbsolute() || path2.volumeLetter() != null) {
/* 75 */                return path2;
                    }
/* 20 */            ByteString slash = getSlash(path);
/* 24 */            if (slash == null && (slash = getSlash(path2)) == null) {
/* 34 */                slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
                    }
/* 40 */            Buffer buffer = new Buffer();
/* 47 */            buffer.write(path.getBytes());
/* 58 */            if (buffer.size() > 0) {
/* 60 */                buffer.write(slash);
                    }
/* 67 */            buffer.write(path2.getBytes());
/* 70 */            return toPath(buffer, z);
                }

                public static final okio.Path commonRoot(okio.Path path) {
/* 1 */             path.getClass();
/* 1 */             int iRootLength = rootLength(path);
/* 9 */             if (iRootLength == -1) {
/* 11 */                return null;
                    }
/* 24 */            return new okio.Path(path.getBytes().substring(0, iRootLength));
                }

                public static final List<String> commonSegments(okio.Path path) {
/* 1 */             path.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 1 */             int iRootLength = rootLength(path);
/* 16 */            if (iRootLength == -1) {
/* 18 */                iRootLength = 0;
                    } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
/* 40 */                iRootLength++;
                    }
/* 46 */            int size = path.getBytes().size();
/* 50 */            int i = iRootLength;
/* 51 */            while (iRootLength < size) {
/* 63 */                if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
/* 83 */                    arrayList.add(path.getBytes().substring(i, iRootLength));
/* 86 */                    i = iRootLength + 1;
                        }
/* 88 */                iRootLength++;
                    }
/* 99 */            if (i < path.getBytes().size()) {
/* 117 */               arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
                    }
/* 128 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 131 */           Iterator it = arrayList.iterator();
/* 139 */           while (it.hasNext()) {
/* 151 */               arrayList2.add(((ByteString) it.next()).utf8());
                    }
/* 155 */           return arrayList2;
                }

                public static final List<ByteString> commonSegmentsBytes(okio.Path path) {
/* 1 */             path.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 1 */             int iRootLength = rootLength(path);
/* 16 */            if (iRootLength == -1) {
/* 18 */                iRootLength = 0;
                    } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
/* 40 */                iRootLength++;
                    }
/* 46 */            int size = path.getBytes().size();
/* 50 */            int i = iRootLength;
/* 51 */            while (iRootLength < size) {
/* 63 */                if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
/* 83 */                    arrayList.add(path.getBytes().substring(i, iRootLength));
/* 86 */                    i = iRootLength + 1;
                        }
/* 88 */                iRootLength++;
                    }
/* 99 */            if (i < path.getBytes().size()) {
/* 117 */               arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
                    }
/* 120 */           return arrayList;
                }

                public static final okio.Path commonToPath(String str, boolean z) {
/* 1 */             str.getClass();
/* 13 */            return toPath(new Buffer().writeUtf8(str), z);
                }

                public static final String commonToString(okio.Path path) {
/* 1 */             path.getClass();
/* 8 */             return path.getBytes().utf8();
                }

                public static final Character commonVolumeLetter(okio.Path path) {
/* 1 */             path.getClass();
/* 20 */            if (ByteString.indexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
/* 14 */                return null;
                    }
/* 56 */            char c = (char) path.getBytes().getByte(0);
/* 59 */            if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
/* 14 */                return null;
                    }
/* 74 */            return Character.valueOf(c);
                }

                private static /* synthetic */ void getANY_SLASH$annotations() {
                }

                private static /* synthetic */ void getBACKSLASH$annotations() {
                }

                private static /* synthetic */ void getDOT$annotations() {
                }

                private static /* synthetic */ void getDOT_DOT$annotations() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int getIndexOfLastSlash(okio.Path path) {
/* 10 */            int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null);
                    return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes(), BACKSLASH, 0, 2, (Object) null);
                }

                private static /* synthetic */ void getSLASH$annotations() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ByteString getSlash(okio.Path path) {
/* 1 */             ByteString bytes = path.getBytes();
/* 5 */             ByteString byteString = SLASH;
/* 15 */            if (ByteString.indexOf$default(bytes, byteString, 0, 2, (Object) null) != -1) {
/* 17 */                return byteString;
                    }
/* 18 */            ByteString bytes2 = path.getBytes();
/* 22 */            ByteString byteString2 = BACKSLASH;
/* 28 */            if (ByteString.indexOf$default(bytes2, byteString2, 0, 2, (Object) null) != -1) {
/* 30 */                return byteString2;
                    }
/* 9 */             return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean lastSegmentIsDotDot(okio.Path path) {
                    return path.getBytes().endsWith(DOT_DOT) && (path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), SLASH, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), BACKSLASH, 0, 1));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int rootLength(okio.Path path) {
/* 10 */            if (path.getBytes().size() == 0) {
/* 9 */                 return -1;
                    }
/* 25 */            if (path.getBytes().getByte(0) == 47) {
/* 24 */                return 1;
                    }
/* 39 */            if (path.getBytes().getByte(0) == 92) {
/* 49 */                if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 92) {
/* 24 */                    return 1;
                        }
/* 67 */                int iIndexOf = path.getBytes().indexOf(BACKSLASH, 2);
                        return iIndexOf == -1 ? path.getBytes().size() : iIndexOf;
                    }
/* 92 */            if (path.getBytes().size() > 2 && path.getBytes().getByte(1) == 58 && path.getBytes().getByte(2) == 92) {
/* 124 */               char c = (char) path.getBytes().getByte(0);
/* 127 */               if ('a' <= c && c < '{') {
/* 142 */                   return 3;
                        }
/* 136 */               if ('A' <= c && c < '[') {
/* 142 */                   return 3;
                        }
                    }
/* 9 */             return -1;
                }

                private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
/* 8 */             if (!Intrinsics.m6216a(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
/* 7 */                 return false;
                    }
/* 39 */            char c = (char) buffer.getByte(0L);
/* 42 */            if ('a' > c || c >= '{') {
                        return 'A' <= c && c < '[';
                    }
/* 57 */            return true;
                }

                public static final okio.Path toPath(Buffer buffer, boolean z) throws EOFException {
                    ByteString byteString;
                    ByteString byteString2;
/* 3 */             buffer.getClass();
/* 8 */             Buffer buffer2 = new Buffer();
/* 11 */            ByteString slash = null;
/* 13 */            int i = 0;
                    while (true) {
/* 22 */                if (!buffer.rangeEquals(0L, SLASH)) {
/* 24 */                    byteString = BACKSLASH;
/* 30 */                    if (!buffer.rangeEquals(0L, byteString)) {
                                break;
                            }
                        }
/* 293 */               byte b = buffer.readByte();
/* 297 */               if (slash == null) {
/* 299 */                   slash = toSlash(b);
                        }
/* 303 */               i++;
                    }
/* 46 */            boolean z2 = i >= 2 && Intrinsics.m6216a(slash, byteString);
/* 49 */            if (z2) {
/* 51 */                slash.getClass();
/* 54 */                buffer2.write(slash);
/* 57 */                buffer2.write(slash);
                    } else if (i > 0) {
/* 63 */                slash.getClass();
/* 66 */                buffer2.write(slash);
                    } else {
/* 72 */                long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
/* 76 */                if (slash == null) {
/* 93 */                    slash = jIndexOfElement == -1 ? toSlash(okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
                        }
/* 101 */               if (startsWithVolumeLetterAndColon(buffer, slash)) {
/* 107 */                   if (jIndexOfElement == 2) {
/* 111 */                       buffer2.write(buffer, 3L);
                            } else {
/* 115 */                       buffer2.write(buffer, 2L);
                            }
                        }
                    }
/* 128 */           boolean z3 = buffer2.size() > 0;
/* 131 */           ArrayList arrayList = new ArrayList();
/* 138 */           while (!buffer.exhausted()) {
/* 142 */               long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
/* 148 */               if (jIndexOfElement2 == -1) {
/* 150 */                   byteString2 = buffer.readByteString();
                        } else {
/* 155 */                   byteString2 = buffer.readByteString(jIndexOfElement2);
/* 159 */                   buffer.readByte();
                        }
/* 162 */               ByteString byteString3 = DOT_DOT;
/* 168 */               if (Intrinsics.m6216a(byteString2, byteString3)) {
/* 170 */                   if (!z3 || !arrayList.isEmpty()) {
/* 178 */                       if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.m6216a(CollectionsKt.m6204y(arrayList), byteString3)))) {
/* 223 */                           arrayList.add(byteString2);
                                } else if (!z2 || arrayList.size() != 1) {
/* 211 */                           if (!arrayList.isEmpty()) {
/* 219 */                               arrayList.remove(arrayList.size() - 1);
                                    }
                                }
                            }
                        } else if (!Intrinsics.m6216a(byteString2, DOT) && !Intrinsics.m6216a(byteString2, ByteString.EMPTY)) {
/* 243 */                   arrayList.add(byteString2);
                        }
                    }
/* 247 */           int size = arrayList.size();
/* 251 */           for (int i2 = 0; i2 < size; i2++) {
/* 253 */               if (i2 > 0) {
/* 255 */                   buffer2.write(slash);
                        }
/* 264 */               buffer2.write((ByteString) arrayList.get(i2));
                    }
/* 276 */           if (buffer2.size() == 0) {
/* 280 */               buffer2.write(DOT);
                    }
/* 289 */           return new okio.Path(buffer2.readByteString());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ByteString toSlash(String str) {
/* 7 */             if (Intrinsics.m6216a(str, "/")) {
/* 9 */                 return SLASH;
                    }
/* 18 */            if (Intrinsics.m6216a(str, "\\")) {
/* 20 */                return BACKSLASH;
                    }
/* 29 */            C1951n4.m6859j(AbstractC0886en.m3507k("not a directory separator: ", str));
/* 32 */            return null;
                }

/* 33 */        private static final ByteString toSlash(byte b) {
                    if (b == 47) {
/* 38 */                return SLASH;
                    }
                    if (b == 92) {
/* 34 */                return BACKSLASH;
                    }
/* 37 */            C1951n4.m6859j(fm0.m3781g(b, "not a directory separator: "));
                    return null;
                }

/* 75 */        public static final okio.Path commonResolve(okio.Path path, ByteString byteString, boolean z) {
                    path.getClass();
                    byteString.getClass();
/* 77 */            return commonResolve(path, toPath(new Buffer().write(byteString), false), z);
                }

/* 77 */        public static final okio.Path commonResolve(okio.Path path, Buffer buffer, boolean z) {
                    path.getClass();
                    buffer.getClass();
/* 78 */            return commonResolve(path, toPath(buffer, false), z);
                }

/* 78 */        public static final okio.Path commonResolve(okio.Path path, String str, boolean z) {
                    path.getClass();
                    str.getClass();
/* 80 */            return commonResolve(path, toPath(new Buffer().writeUtf8(str), false), z);
                }
            }
