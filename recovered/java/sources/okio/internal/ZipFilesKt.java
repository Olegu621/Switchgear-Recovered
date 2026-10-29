            package okio.internal;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Comparator;
            import java.util.GregorianCalendar;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.C1852e;
            import kotlin.text.CharsKt;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.BufferedSource;
            import okio.FileHandle;
            import okio.FileMetadata;
            import okio.FileSystem;
            import okio.Okio;
            import okio.Path;
            import okio.ZipFileSystem;
            import p000.C1772ix;
            import p000.b51;
            import p000.ds0;
            import p000.e22;
            import p000.f42;
            import p000.fm0;
            import p000.g22;
            import p000.h22;
            import p000.jb1;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, m6176d2 = {"BIT_FLAG_ENCRYPTED", HttpUrl.FRAGMENT_ENCODE_SET, "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", HttpUrl.FRAGMENT_ENCODE_SET, "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", HttpUrl.FRAGMENT_ENCODE_SET, "getHex", "(I)Ljava/lang/String;", "buildIndex", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", HttpUrl.FRAGMENT_ENCODE_SET, "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", HttpUrl.FRAGMENT_ENCODE_SET, "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 5 */     public final class ZipFilesKt {
                private static final int BIT_FLAG_ENCRYPTED = 1;
                private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
                private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
                public static final int COMPRESSION_METHOD_DEFLATED = 8;
                public static final int COMPRESSION_METHOD_STORED = 0;
                private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
                private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
                private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
                private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
                private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
                private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
                private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

                private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
/* 8 */             Path path = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
/* 43 */            LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
/* 66 */            for (ZipEntry zipEntry : CollectionsKt.m6186E(new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
/* 13 */                    return C1772ix.m5609a(((ZipEntry) t).getCanonicalPath(), ((ZipEntry) t2).getCanonicalPath());
                        }
                    }, list)) {
/* 84 */                if (((ZipEntry) linkedHashMapM7132f.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                            while (true) {
/* 90 */                        Path pathParent = zipEntry.getCanonicalPath().parent();
/* 94 */                        if (pathParent == null) {
                                    break;
                                }
/* 101 */                       ZipEntry zipEntry2 = (ZipEntry) linkedHashMapM7132f.get(pathParent);
/* 103 */                       if (zipEntry2 != null) {
/* 113 */                           zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                                    break;
                                }
/* 135 */                       ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
/* 138 */                       linkedHashMapM7132f.put(pathParent, zipEntry3);
/* 149 */                       zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
/* 152 */                       zipEntry = zipEntry3;
                            }
                        }
                    }
/* 154 */           return linkedHashMapM7132f;
                }

                private static final Long dosDateTimeToEpochMillis(int i, int i2) {
/* 2 */             if (i2 == -1) {
/* 4 */                 return null;
                    }
/* 8 */             GregorianCalendar gregorianCalendar = new GregorianCalendar();
/* 14 */            gregorianCalendar.set(14, 0);
/* 43 */            gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
/* 54 */            return Long.valueOf(gregorianCalendar.getTime().getTime());
                }

                private static final String getHex(int i) {
/* 5 */             StringBuilder sb = new StringBuilder("0x");
/* 14 */            String string = Integer.toString(i, CharsKt.checkRadix(16));
/* 18 */            string.getClass();
/* 21 */            sb.append(string);
/* 24 */            return sb.toString();
                }

                public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, Function1<? super ZipEntry, Boolean> function1) throws IOException {
/* 7 */             path.getClass();
/* 10 */            fileSystem.getClass();
/* 13 */            function1.getClass();
/* 16 */            FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(path);
                    try {
/* 20 */                long size = fileHandleOpenReadOnly.size();
/* 26 */                long j = size - 22;
/* 32 */                if (j < 0) {
/* 360 */                   throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
                        }
/* 38 */                long jMax = Math.max(size - 65558, 0L);
/* 323 */               do {
/* 46 */                    BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j));
                            try {
/* 57 */                        if (bufferedSourceBuffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
/* 59 */                            EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer);
/* 68 */                            String utf8 = bufferedSourceBuffer.readUtf8(eocdRecord.getCommentByteCount());
/* 72 */                            bufferedSourceBuffer.close();
/* 77 */                            long j2 = j - 20;
/* 81 */                            if (j2 > 0) {
/* 87 */                                BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(j2));
                                        try {
/* 98 */                                    if (bufferedSourceBuffer2.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
/* 100 */                                       int intLe = bufferedSourceBuffer2.readIntLe();
/* 104 */                                       long longLe = bufferedSourceBuffer2.readLongLe();
/* 113 */                                       if (bufferedSourceBuffer2.readIntLe() != 1 || intLe != 0) {
/* 200 */                                           throw new IOException("unsupported zip: spanned");
                                                }
/* 121 */                                       BufferedSource bufferedSourceBuffer3 = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                                try {
/* 125 */                                           int intLe2 = bufferedSourceBuffer3.readIntLe();
/* 132 */                                           if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
/* 186 */                                               throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                                    }
/* 134 */                                           eocdRecord = readZip64EocdRecord(bufferedSourceBuffer3, eocdRecord);
/* 138 */                                           jb1.m5754n(bufferedSourceBuffer3, null);
                                                } catch (Throwable th) {
                                                    try {
/* 187 */                                               throw th;
                                                    } catch (Throwable th2) {
/* 189 */                                               jb1.m5754n(bufferedSourceBuffer3, th);
/* 192 */                                               throw th2;
                                                    }
                                                }
                                                try {
/* 361 */                                           throw th;
                                                } catch (Throwable th3) {
/* 363 */                                           jb1.m5754n(fileHandleOpenReadOnly, th);
/* 366 */                                           throw th3;
                                                }
                                            }
/* 201 */                                   jb1.m5754n(bufferedSourceBuffer2, null);
                                        } catch (Throwable th4) {
                                            try {
/* 209 */                                       throw th4;
                                            } catch (Throwable th5) {
/* 211 */                                       jb1.m5754n(bufferedSourceBuffer2, th4);
/* 214 */                                       throw th5;
                                            }
                                        }
                                    }
/* 217 */                           ArrayList arrayList = new ArrayList();
/* 228 */                           BufferedSource bufferedSourceBuffer4 = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                                    try {
/* 232 */                               long entryCount = eocdRecord.getEntryCount();
/* 238 */                               for (long j3 = 0; j3 < entryCount; j3++) {
/* 240 */                                   ZipEntry entry = readEntry(bufferedSourceBuffer4);
/* 254 */                                   if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
/* 288 */                                       throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
/* 268 */                                   if (((Boolean) function1.invoke(entry)).booleanValue()) {
/* 270 */                                       arrayList.add(entry);
                                            }
/* 361 */                                   throw th;
                                        }
/* 289 */                               jb1.m5754n(bufferedSourceBuffer4, null);
/* 298 */                               ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList), utf8);
/* 301 */                               jb1.m5754n(fileHandleOpenReadOnly, null);
/* 304 */                               return zipFileSystem;
                                    } catch (Throwable th6) {
                                        try {
/* 305 */                                   throw th6;
                                        } catch (Throwable th7) {
/* 307 */                                   jb1.m5754n(bufferedSourceBuffer4, th6);
/* 310 */                                   throw th7;
                                        }
                                    }
                                }
/* 315 */                       bufferedSourceBuffer.close();
/* 320 */                       j--;
                            } catch (Throwable th8) {
/* 335 */                       bufferedSourceBuffer.close();
/* 338 */                       throw th8;
                            }
/* 323 */               } while (j >= jMax);
/* 334 */               throw new IOException("not a zip: end of central directory signature not found");
                    } catch (Throwable th9) {
/* 361 */               throw th9;
                    }
                }

                public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i, Object obj) throws IOException {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 function1 = C20341.INSTANCE;
                    }
/* 7 */             return openZip(path, fileSystem, function1);
                }

                public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
/* 3 */             bufferedSource.getClass();
/* 6 */             int intLe = bufferedSource.readIntLe();
/* 13 */            if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
/* 299 */               throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
                    }
/* 17 */            bufferedSource.skip(4L);
/* 20 */            short shortLe = bufferedSource.readShortLe();
/* 27 */            int i = shortLe & 65535;
/* 32 */            if ((shortLe & 1) != 0) {
/* 260 */               f42.m3661q(getHex(i), "unsupported zip: general purpose bit flag=");
/* 31 */                return null;
                    }
/* 38 */            int shortLe2 = bufferedSource.readShortLe() & 65535;
/* 50 */            Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
/* 64 */            long intLe2 = ((long) bufferedSource.readIntLe()) & 4294967295L;
/* 69 */            g22 g22Var = new g22();
/* 78 */            g22Var.f8440a = ((long) bufferedSource.readIntLe()) & 4294967295L;
/* 82 */            g22 g22Var2 = new g22();
/* 91 */            g22Var2.f8440a = ((long) bufferedSource.readIntLe()) & 4294967295L;
/* 97 */            int shortLe3 = bufferedSource.readShortLe() & 65535;
/* 102 */           int shortLe4 = bufferedSource.readShortLe() & 65535;
/* 108 */           int shortLe5 = bufferedSource.readShortLe() & 65535;
/* 112 */           bufferedSource.skip(8L);
/* 117 */           g22 g22Var3 = new g22();
/* 129 */           g22Var3.f8440a = ((long) bufferedSource.readIntLe()) & 4294967295L;
/* 132 */           String utf8 = bufferedSource.readUtf8(shortLe3);
/* 141 */           if (StringsKt.m6225A(utf8, (char) 0)) {
/* 250 */               ds0.m3195l("bad zip: filename contains 0x00");
/* 31 */                return null;
                    }
/* 154 */           long j = g22Var2.f8440a == 4294967295L ? 8L : 0L;
/* 167 */           long j2 = g22Var.f8440a == 4294967295L ? j + 8 : j;
/* 174 */           if (g22Var3.f8440a == 4294967295L) {
/* 176 */               j2 += 8;
                    }
/* 180 */           e22 e22Var = new e22();
/* 190 */           readExtra(bufferedSource, shortLe4, new C20351(e22Var, j2, g22Var2, bufferedSource, g22Var, g22Var3));
/* 195 */           if (j2 <= 0 || e22Var.f7490a) {
/* 244 */               return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), C1852e.m6257g(utf8, "/", false), bufferedSource.readUtf8(shortLe5), intLe2, g22Var.f8440a, g22Var2.f8440a, shortLe2, lDosDateTimeToEpochMillis, g22Var3.f8440a);
                    }
/* 204 */           ds0.m3195l("bad zip: zip64 extra required but absent");
/* 31 */            return null;
                }

                private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
/* 8 */             int shortLe = bufferedSource.readShortLe() & 65535;
/* 13 */            int shortLe2 = bufferedSource.readShortLe() & 65535;
/* 18 */            long shortLe3 = bufferedSource.readShortLe() & 65535;
/* 28 */            if (shortLe3 == (bufferedSource.readShortLe() & 65535) && shortLe == 0 && shortLe2 == 0) {
/* 36 */                bufferedSource.skip(4L);
/* 58 */                return new EocdRecord(shortLe3, 4294967295L & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
                    }
/* 64 */            ds0.m3195l("unsupported zip: spanned");
/* 67 */            return null;
                }

                private static final void readExtra(BufferedSource bufferedSource, int i, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
                    long j = i;
/* 6 */             while (j != 0) {
/* 12 */                if (j < 4) {
/* 101 */                   ds0.m3195l("bad zip: truncated header in extra field");
/* 104 */                   return;
                        }
/* 21 */                int shortLe = bufferedSource.readShortLe() & 65535;
/* 30 */                long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
/* 31 */                long j2 = j - 4;
/* 34 */                if (j2 < shortLe2) {
/* 95 */                    ds0.m3195l("bad zip: truncated value in extra field");
/* 98 */                    return;
                        }
/* 36 */                bufferedSource.require(shortLe2);
/* 43 */                long size = bufferedSource.getBuffer().size();
/* 55 */                function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
/* 67 */                long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
/* 70 */                if (size2 < 0) {
/* 89 */                    ds0.m3195l(fm0.m3781g(shortLe, "unsupported zip: too many bytes processed for "));
/* 92 */                    return;
                        } else {
/* 72 */                    if (size2 > 0) {
/* 78 */                        bufferedSource.getBuffer().skip(size2);
                            }
/* 81 */                    j = j2 - shortLe2;
                        }
                    }
                }

                public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
/* 1 */             bufferedSource.getClass();
/* 4 */             fileMetadata.getClass();
/* 7 */             FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, fileMetadata);
/* 11 */            orSkipLocalHeader.getClass();
/* 14 */            return orSkipLocalHeader;
                }

                private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
/* 5 */             h22 h22Var = new h22();
/* 17 */            h22Var.f8873a = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
/* 21 */            h22 h22Var2 = new h22();
/* 26 */            h22 h22Var3 = new h22();
/* 29 */            int intLe = bufferedSource.readIntLe();
/* 36 */            if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
/* 177 */               throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
                    }
/* 40 */            bufferedSource.skip(2L);
/* 43 */            short shortLe = bufferedSource.readShortLe();
/* 50 */            int i = shortLe & 65535;
/* 54 */            if ((shortLe & 1) != 0) {
/* 138 */               f42.m3661q(getHex(i), "unsupported zip: general purpose bit flag=");
/* 8 */                 return null;
                    }
/* 58 */            bufferedSource.skip(18L);
/* 69 */            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
/* 74 */            int shortLe3 = bufferedSource.readShortLe() & 65535;
/* 75 */            bufferedSource.skip(shortLe2);
/* 78 */            if (fileMetadata == null) {
/* 81 */                bufferedSource.skip(shortLe3);
/* 8 */                 return null;
                    }
/* 90 */            readExtra(bufferedSource, shortLe3, new C20361(bufferedSource, h22Var, h22Var2, h22Var3));
/* 128 */           return new FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (Long) h22Var3.f8873a, (Long) h22Var.f8873a, (Long) h22Var2.f8873a, null, 128, null);
                }

                private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
/* 3 */             bufferedSource.skip(12L);
/* 6 */             int intLe = bufferedSource.readIntLe();
/* 10 */            int intLe2 = bufferedSource.readIntLe();
/* 14 */            long longLe = bufferedSource.readLongLe();
/* 24 */            if (longLe == bufferedSource.readLongLe() && intLe == 0 && intLe2 == 0) {
/* 32 */                bufferedSource.skip(8L);
/* 45 */                return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
                    }
/* 51 */            ds0.m3195l("unsupported zip: spanned");
/* 54 */            return null;
                }

                public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
/* 1 */             bufferedSource.getClass();
/* 5 */             readOrSkipLocalHeader(bufferedSource, null);
                }

                /* JADX INFO: renamed from: okio.internal.ZipFilesKt$openZip$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 6 */         public static final class C20341 extends b51 implements Function1<ZipEntry, Boolean> {
                    public static final C20341 INSTANCE = new C20341();

                    public C20341() {
/* 2 */                 super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
/* 7 */             public final Boolean invoke(ZipEntry zipEntry) {
                        zipEntry.getClass();
/* 8 */                 return Boolean.TRUE;
                    }
                }

                /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readEntry$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "headerId", HttpUrl.FRAGMENT_ENCODE_SET, "dataSize", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 86 */        public static final class C20351 extends b51 implements Function2<Integer, Long, Unit> {
                    final /* synthetic */ g22 $compressedSize;
                    final /* synthetic */ e22 $hasZip64Extra;
                    final /* synthetic */ g22 $offset;
                    final /* synthetic */ long $requiredZip64ExtraSize;
                    final /* synthetic */ g22 $size;
                    final /* synthetic */ BufferedSource $this_readEntry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20351(e22 e22Var, long j, g22 g22Var, BufferedSource bufferedSource, g22 g22Var2, g22 g22Var3) {
/* 14 */                super(2);
/* 1 */                 this.$hasZip64Extra = e22Var;
/* 3 */                 this.$requiredZip64ExtraSize = j;
/* 5 */                 this.$size = g22Var;
/* 7 */                 this.$this_readEntry = bufferedSource;
/* 9 */                 this.$compressedSize = g22Var2;
/* 11 */                this.$offset = g22Var3;
                    }

                    public final void invoke(int i, long j) throws IOException {
/* 2 */                 if (i == 1) {
/* 4 */                     e22 e22Var = this.$hasZip64Extra;
/* 8 */                     if (e22Var.f7490a) {
/* 84 */                        ds0.m3195l("bad zip: zip64 extra repeated");
/* 87 */                        return;
                            }
/* 10 */                    e22Var.f7490a = true;
/* 16 */                    if (j < this.$requiredZip64ExtraSize) {
/* 78 */                        ds0.m3195l("bad zip: zip64 extra too short");
/* 81 */                        return;
                            }
/* 18 */                    g22 g22Var = this.$size;
/* 20 */                    long longLe = g22Var.f8440a;
/* 29 */                    if (longLe == 4294967295L) {
/* 33 */                        longLe = this.$this_readEntry.readLongLe();
                            }
/* 37 */                    g22Var.f8440a = longLe;
/* 39 */                    g22 g22Var2 = this.$compressedSize;
/* 57 */                    g22Var2.f8440a = g22Var2.f8440a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
/* 59 */                    g22 g22Var3 = this.$offset;
/* 73 */                    g22Var3.f8440a = g22Var3.f8440a == 4294967295L ? this.$this_readEntry.readLongLe() : 0L;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
/* 87 */            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
/* 88 */                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                        return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "headerId", HttpUrl.FRAGMENT_ENCODE_SET, "dataSize", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 120 */       public static final class C20361 extends b51 implements Function2<Integer, Long, Unit> {
                    final /* synthetic */ h22 $createdAtMillis;
                    final /* synthetic */ h22 $lastAccessedAtMillis;
                    final /* synthetic */ h22 $lastModifiedAtMillis;
                    final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20361(BufferedSource bufferedSource, h22 h22Var, h22 h22Var2, h22 h22Var3) {
/* 10 */                super(2);
/* 1 */                 this.$this_readOrSkipLocalHeader = bufferedSource;
/* 3 */                 this.$lastModifiedAtMillis = h22Var;
/* 5 */                 this.$lastAccessedAtMillis = h22Var2;
/* 7 */                 this.$createdAtMillis = h22Var3;
                    }

                    public final void invoke(int i, long j) throws IOException {
/* 3 */                 if (i == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
/* 11 */                    if (j < 1) {
/* 118 */                       ds0.m3195l("bad zip: extended timestamp extra too short");
/* 121 */                       return;
                            }
/* 15 */                    byte b = this.$this_readOrSkipLocalHeader.readByte();
/* 27 */                    boolean z = (b & 1) == 1;
/* 35 */                    boolean z2 = (b & 2) == 2;
/* 38 */                    boolean z3 = (b & 4) == 4;
/* 41 */                    BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
/* 43 */                    long j2 = z ? 5L : 1L;
/* 49 */                    if (z2) {
/* 51 */                        j2 += 4;
                            }
/* 52 */                    if (z3) {
/* 54 */                        j2 += 4;
                            }
/* 57 */                    if (j < j2) {
/* 114 */                       ds0.m3195l("bad zip: extended timestamp extra too short");
/* 117 */                       return;
                            }
/* 61 */                    if (z) {
/* 75 */                        this.$lastModifiedAtMillis.f8873a = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                            }
/* 77 */                    if (z2) {
/* 93 */                        this.$lastAccessedAtMillis.f8873a = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                            }
/* 95 */                    if (z3) {
/* 111 */                       this.$createdAtMillis.f8873a = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
/* 121 */           public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
/* 122 */               invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                        return Unit.f12910a;
                    }
                }
            }
