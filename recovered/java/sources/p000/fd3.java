            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.util.Log;
            import com.google.android.gms.internal.measurement.zzfe;
            import com.google.android.gms.internal.measurement.zzff;
            import com.google.android.gms.internal.measurement.zzfm;
            import com.google.android.gms.internal.measurement.zzfn;
            import com.google.android.gms.internal.measurement.zzhg;
            import com.google.android.gms.internal.measurement.zzhq;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzih;
            import com.google.android.gms.internal.measurement.zzii;
            import com.google.android.gms.internal.measurement.zzik;
            import com.google.android.gms.internal.measurement.zziu;
            import com.google.android.gms.internal.measurement.zzpq;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fd3 extends wo3 {

                /* JADX INFO: renamed from: d */
                public String f8169d;

                /* JADX INFO: renamed from: e */
                public HashSet f8170e;

                /* JADX INFO: renamed from: f */
                public C1024id f8171f;

                /* JADX INFO: renamed from: i */
                public Long f8172i;

                /* JADX INFO: renamed from: v */
                public Long f8173v;

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:117:0x0274  */
                /* JADX WARN: Code duplicated, block: B:121:0x027e  */
                /* JADX WARN: Code duplicated, block: B:123:0x0289  */
                /* JADX WARN: Code duplicated, block: B:125:0x0294  */
                /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #6 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
                /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #6 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
                /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
                /* JADX WARN: Code duplicated, block: B:159:0x0335  */
                /* JADX WARN: Code duplicated, block: B:162:0x0343  */
                /* JADX WARN: Code duplicated, block: B:164:0x035a  */
                /* JADX WARN: Code duplicated, block: B:190:0x0433  */
                /* JADX WARN: Code duplicated, block: B:194:0x0444  */
                /* JADX WARN: Code duplicated, block: B:196:0x0464  */
                /* JADX WARN: Code duplicated, block: B:202:0x047b  */
                /* JADX WARN: Code duplicated, block: B:206:0x0497  */
                /* JADX WARN: Code duplicated, block: B:207:0x04a0  */
                /* JADX WARN: Code duplicated, block: B:211:0x04ae  */
                /* JADX WARN: Code duplicated, block: B:217:0x04c5  */
                /* JADX WARN: Code duplicated, block: B:223:0x04fb  */
                /* JADX WARN: Code duplicated, block: B:226:0x0504  */
                /* JADX WARN: Code duplicated, block: B:228:0x050e  */
                /* JADX WARN: Code duplicated, block: B:230:0x052e  */
                /* JADX WARN: Code duplicated, block: B:231:0x0532  */
                /* JADX WARN: Code duplicated, block: B:236:0x054b A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:247:0x056a  */
                /* JADX WARN: Code duplicated, block: B:249:0x0586  */
                /* JADX WARN: Code duplicated, block: B:252:0x0598  */
                /* JADX WARN: Code duplicated, block: B:255:0x05a5  */
                /* JADX WARN: Code duplicated, block: B:262:0x05ed  */
                /* JADX WARN: Code duplicated, block: B:265:0x0601  */
                /* JADX WARN: Code duplicated, block: B:271:0x0634  */
                /* JADX WARN: Code duplicated, block: B:275:0x0675  */
                /* JADX WARN: Code duplicated, block: B:282:0x069d  */
                /* JADX WARN: Code duplicated, block: B:288:0x06ac  */
                /* JADX WARN: Code duplicated, block: B:299:0x06d9 A[LOOP:3: B:276:0x0677->B:299:0x06d9, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:300:0x06dc  */
                /* JADX WARN: Code duplicated, block: B:315:0x070c  */
                /* JADX WARN: Code duplicated, block: B:320:0x0717  */
                /* JADX WARN: Code duplicated, block: B:322:0x071b  */
                /* JADX WARN: Code duplicated, block: B:326:0x072d  */
                /* JADX WARN: Code duplicated, block: B:332:0x075c  */
                /* JADX WARN: Code duplicated, block: B:334:0x078a  */
                /* JADX WARN: Code duplicated, block: B:336:0x078f  */
                /* JADX WARN: Code duplicated, block: B:339:0x07a0 A[LOOP:5: B:330:0x0756->B:339:0x07a0, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:343:0x07ba  */
                /* JADX WARN: Code duplicated, block: B:346:0x07c7  */
                /* JADX WARN: Code duplicated, block: B:349:0x07cf  */
                /* JADX WARN: Code duplicated, block: B:352:0x07de  */
                /* JADX WARN: Code duplicated, block: B:354:0x07f1  */
                /* JADX WARN: Code duplicated, block: B:358:0x082c  */
                /* JADX WARN: Code duplicated, block: B:365:0x0854  */
                /* JADX WARN: Code duplicated, block: B:371:0x0865  */
                /* JADX WARN: Code duplicated, block: B:382:0x0894 A[LOOP:7: B:359:0x082e->B:382:0x0894, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:385:0x089b  */
                /* JADX WARN: Code duplicated, block: B:400:0x08cf  */
                /* JADX WARN: Code duplicated, block: B:404:0x08d9  */
                /* JADX WARN: Code duplicated, block: B:406:0x08dd  */
                /* JADX WARN: Code duplicated, block: B:410:0x08ed  */
                /* JADX WARN: Code duplicated, block: B:414:0x090e  */
                /* JADX WARN: Code duplicated, block: B:417:0x091f  */
                /* JADX WARN: Code duplicated, block: B:419:0x0936  */
                /* JADX WARN: Code duplicated, block: B:421:0x0944  */
                /* JADX WARN: Code duplicated, block: B:423:0x094f  */
                /* JADX WARN: Code duplicated, block: B:425:0x097a  */
                /* JADX WARN: Code duplicated, block: B:428:0x0984  */
                /* JADX WARN: Code duplicated, block: B:441:0x09f6  */
                /* JADX WARN: Code duplicated, block: B:442:0x09ff  */
                /* JADX WARN: Code duplicated, block: B:446:0x0a14 A[PHI: r16 r20 r21 r41
  0x0a14: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a12, B:443:0x0a00] A[DONT_GENERATE, DONT_INLINE]
  0x0a14: PHI (r20v9 le2) = (r20v10 le2), (r2v41 le2) binds: [B:445:0x0a12, B:443:0x0a00] A[DONT_GENERATE, DONT_INLINE]
  0x0a14: PHI (r21v10 java.util.Iterator) = (r21v11 java.util.Iterator), (r3v53 java.util.Iterator) binds: [B:445:0x0a12, B:443:0x0a00] A[DONT_GENERATE, DONT_INLINE]
  0x0a14: PHI (r41v5 java.lang.String) = (r41v6 java.lang.String), (r41v7 java.lang.String) binds: [B:445:0x0a12, B:443:0x0a00] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:451:0x0a3f  */
                /* JADX WARN: Code duplicated, block: B:464:0x0ac5  */
                /* JADX WARN: Code duplicated, block: B:467:0x0acd  */
                /* JADX WARN: Code duplicated, block: B:536:0x060f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:537:0x0626 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:539:0x05fb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:540:0x05fb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:542:0x06d4 A[EDGE_INSN: B:542:0x06d4->B:298:0x06d4 BREAK  A[LOOP:3: B:276:0x0677->B:299:0x06d9], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:543:0x074b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:544:0x073f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:548:0x07ad A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:549:0x07b3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:553:0x088f A[EDGE_INSN: B:553:0x088f->B:381:0x088f BREAK  A[LOOP:7: B:359:0x082e->B:382:0x0894], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:554:0x08ff A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:556:0x0a19 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:557:0x0a0a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:558:0x098c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:562:0x0a9b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:564:0x0a39 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:571:0x0487 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:573:0x0475 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:576:0x04d1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:579:0x04bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:587:0x05ac A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:64:0x018e  */
                /* JADX WARN: Code duplicated, block: B:67:0x0195  */
                /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:478:0x01cb }] */
                /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:478:0x01cb }] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v202 */
                /* JADX WARN: Type inference failed for: r0v203 */
                /* JADX WARN: Type inference failed for: r0v31, types: [id, le2] */
                /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r0v38 */
                /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r0v40 */
                /* JADX WARN: Type inference failed for: r0v41 */
                /* JADX WARN: Type inference failed for: r0v50 */
                /* JADX WARN: Type inference failed for: r0v51 */
                /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r12v17, types: [id, le2] */
                /* JADX WARN: Type inference failed for: r17v1 */
                /* JADX WARN: Type inference failed for: r17v2, types: [ij3] */
                /* JADX WARN: Type inference failed for: r17v21 */
                /* JADX WARN: Type inference failed for: r17v22 */
                /* JADX WARN: Type inference failed for: r17v23 */
                /* JADX WARN: Type inference failed for: r17v24, types: [ij3] */
                /* JADX WARN: Type inference failed for: r17v30 */
                /* JADX WARN: Type inference failed for: r17v31 */
                /* JADX WARN: Type inference failed for: r17v5 */
                /* JADX WARN: Type inference failed for: r17v6 */
                /* JADX WARN: Type inference failed for: r17v8 */
                /* JADX WARN: Type inference failed for: r18v27 */
                /* JADX WARN: Type inference failed for: r18v28 */
                /* JADX WARN: Type inference failed for: r18v29 */
                /* JADX WARN: Type inference failed for: r18v30 */
                /* JADX WARN: Type inference failed for: r18v32 */
                /* JADX WARN: Type inference failed for: r18v33 */
                /* JADX WARN: Type inference failed for: r18v34 */
                /* JADX WARN: Type inference failed for: r18v35 */
                /* JADX WARN: Type inference failed for: r18v36, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r18v40 */
                /* JADX WARN: Type inference failed for: r18v41 */
                /* JADX WARN: Type inference failed for: r18v42 */
                /* JADX WARN: Type inference failed for: r18v43 */
                /* JADX WARN: Type inference failed for: r18v44 */
                /* JADX WARN: Type inference failed for: r21v0 */
                /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r21v20 */
                /* JADX WARN: Type inference failed for: r2v70 */
                /* JADX WARN: Type inference failed for: r2v71, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r2v72 */
                /* JADX WARN: Type inference failed for: r3v66, types: [sh3] */
                /* JADX WARN: Type inference failed for: r3v80, types: [sh3] */
                /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r42v10 */
                /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r42v12 */
                /* JADX WARN: Type inference failed for: r42v13 */
                /* JADX WARN: Type inference failed for: r42v14 */
                /* JADX WARN: Type inference failed for: r42v15 */
                /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r42v17 */
                /* JADX WARN: Type inference failed for: r42v18 */
                /* JADX WARN: Type inference failed for: r42v19 */
                /* JADX WARN: Type inference failed for: r42v2 */
                /* JADX WARN: Type inference failed for: r42v20 */
                /* JADX WARN: Type inference failed for: r42v21 */
                /* JADX WARN: Type inference failed for: r42v22 */
                /* JADX WARN: Type inference failed for: r42v23 */
                /* JADX WARN: Type inference failed for: r42v24 */
                /* JADX WARN: Type inference failed for: r42v25 */
                /* JADX WARN: Type inference failed for: r42v26 */
                /* JADX WARN: Type inference failed for: r42v27 */
                /* JADX WARN: Type inference failed for: r42v28 */
                /* JADX WARN: Type inference failed for: r42v29 */
                /* JADX WARN: Type inference failed for: r42v3 */
                /* JADX WARN: Type inference failed for: r42v30 */
                /* JADX WARN: Type inference failed for: r42v31 */
                /* JADX WARN: Type inference failed for: r42v32 */
                /* JADX WARN: Type inference failed for: r42v33 */
                /* JADX WARN: Type inference failed for: r42v4 */
                /* JADX WARN: Type inference failed for: r42v5 */
                /* JADX WARN: Type inference failed for: r42v6 */
                /* JADX WARN: Type inference failed for: r42v7 */
                /* JADX WARN: Type inference failed for: r42v8 */
                /* JADX WARN: Type inference failed for: r42v9 */
                /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r4v32 */
                /* JADX WARN: Type inference failed for: r4v33 */
                /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r4v36 */
                /* JADX WARN: Type inference failed for: r4v49 */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v31 */
                /* JADX WARN: Type inference failed for: r5v32 */
                /* JADX WARN: Type inference failed for: r5v33 */
                /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v36 */
                /* JADX WARN: Type inference failed for: r5v37 */
                /* JADX WARN: Type inference failed for: r5v38 */
                /* JADX WARN: Type inference failed for: r5v50 */
                /* JADX WARN: Type inference failed for: r5v51 */
                /* JADX WARN: Type inference failed for: r5v52 */
                /* JADX WARN: Type inference failed for: r5v53 */
                /* JADX WARN: Type inference failed for: r5v54 */
                /* JADX WARN: Type inference failed for: r5v55 */
                /* JADX WARN: Type inference failed for: r5v56 */
                /* JADX WARN: Type inference failed for: r7v13 */
                /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v15 */
                /* JADX WARN: Type inference failed for: r7v57 */
                /* JADX WARN: Type inference failed for: r7v58, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v59 */
                /* JADX WARN: Type inference failed for: r7v60 */
                /* JADX WARN: Type inference failed for: r7v63 */
                /* JADX WARN: Type inference failed for: r7v64 */
                /* JADX WARN: Type inference failed for: r7v65, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v68 */
                /* JADX WARN: Type inference failed for: r7v69 */
                /* JADX WARN: Type inference failed for: r7v70 */
                /* JADX WARN: Type inference failed for: r7v71 */
                /* JADX WARN: Type inference failed for: r7v72, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v74 */
                /* JADX WARN: Type inference failed for: r7v79 */
                /* JADX WARN: Type inference failed for: r7v80 */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                /* JADX INFO: renamed from: D */
                public final ArrayList m3751D(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
                    boolean z2;
                    boolean z3;
                    String str2;
                    Map map;
                    Object obj;
                    ?? r5;
                    Cursor cursorQuery;
                    ?? r17;
                    String str3;
                    Object obj2;
                    ?? r21;
                    Map map2;
                    String str4;
                    ij3 ij3Var;
                    Map map3;
                    Map map4;
                    Map map5;
                    String str5;
                    zzii zziiVar;
                    BitSet bitSet;
                    BitSet bitSet2;
                    C1024id c1024id;
                    zzii zziiVar2;
                    C1024id c1024id2;
                    List<zzff> list3;
                    long jLongValue;
                    Integer numValueOf;
                    int i;
                    boolean z4;
                    Iterator it;
                    zzik zzikVar;
                    Long lValueOf;
                    ae3 ae3VarM6755f0;
                    String str6;
                    ?? c1024id3;
                    ?? r7;
                    Cursor cursorRawQuery;
                    ?? r0;
                    C1024id c1024id4;
                    Iterator it2;
                    Integer num;
                    zzii zziiVar3;
                    List list4;
                    ?? r18;
                    Iterator it3;
                    ij3 ij3Var2;
                    Integer numValueOf2;
                    List arrayList;
                    String str7;
                    String str8;
                    ArrayList arrayList2;
                    ae3 ae3VarM6755f1;
                    ij3 ij3Var3;
                    String str9;
                    ContentValues contentValues;
                    Iterator it4;
                    le2 le2Var;
                    String strZzc;
                    Map map6;
                    Iterator it5;
                    Iterator it6;
                    le2 le2Var2;
                    Integer num2;
                    int iIntValue;
                    Iterator it7;
                    boolean zM1640b;
                    le2 le2Var3;
                    Map map7;
                    String str10;
                    zzfn zzfnVar;
                    Integer numValueOf3;
                    cd3 cd3Var;
                    int i2;
                    Integer numValueOf4;
                    ij3 ij3Var4;
                    String str11;
                    C1024id c1024id5;
                    Cursor cursor;
                    ij3 ij3Var5;
                    String str12;
                    Cursor cursorQuery2;
                    Integer numValueOf5;
                    List list5;
                    List arrayList3;
                    wh3 wh3Var;
                    ?? c1024id6;
                    zzhs zzhsVarM9579a;
                    pe3 pe3VarM255j0;
                    long j;
                    String strZzd;
                    Map map8;
                    int iIntValue2;
                    Iterator it8;
                    boolean zM1639a;
                    Map map9;
                    wh3 wh3Var2;
                    Integer num3;
                    cd3 cd3Var2;
                    int iZzb;
                    as3 as3Var;
                    boolean z5;
                    String str13;
                    C1024id c1024id7;
                    ?? r8;
                    String str14;
                    ?? r2;
                    ?? r42;
                    ?? r43;
                    ?? Query;
                    ?? r44;
                    ?? r45;
                    ?? r46;
                    ?? r47;
                    Integer numValueOf6;
                    List list6;
                    ?? r48;
                    List arrayList4;
                    C1024id c1024id8;
                    int i3;
                    ?? r6;
                    Object obj3;
                    ?? r9;
                    ?? r19;
                    ?? r110;
                    List arrayList5;
                    ij3 ij3Var6 = (ij3) this.f16749a;
                    kb1.m6058k(str);
/* 2 */             kb1.m6061n(list);
/* 3 */             kb1.m6061n(list2);
                    this.f8169d = str;
/* 4 */             this.f8170e = new HashSet();
/* 5 */             this.f8171f = new C1024id();
                    this.f8172i = l;
                    this.f8173v = l2;
/* 6 */             Iterator it9 = list.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            z2 = false;
                            break;
                        }
/* 7 */                 if ("_s".equals(((zzhs) it9.next()).zzd())) {
                            z2 = true;
                            break;
                        }
                    }
/* 8 */             zzpq.zza();
/* 12 */            boolean zM7406J = ij3Var6.f9651d.m7406J(this.f8169d, vg3.f18074F0);
/* 13 */            zzpq.zza();
/* 16 */            boolean zM7406J2 = ij3Var6.f9651d.m7406J(this.f8169d, vg3.f18072E0);
                    mp3 mp3Var = this.f15676b;
                    if (z2) {
/* 17 */                ae3 ae3VarM6755f2 = mp3Var.m6755f0();
                        String str15 = this.f8169d;
/* 18 */                ae3VarM6755f2.m9593A();
/* 19 */                ae3VarM6755f2.mo1375y();
/* 20 */                kb1.m6058k(str15);
/* 21 */                ContentValues contentValues2 = new ContentValues();
/* 22 */                contentValues2.put("current_session_count", (Integer) 0);
                        try {
/* 24 */                    ae3VarM6755f2.m261q0().update("events", contentValues2, "app_id = ?", new String[]{str15});
                        } catch (SQLiteException e) {
/* 28 */                    ((ij3) ae3VarM6755f2.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(str15), "Error resetting session-scoped event counts. appId", e);
                        }
                    }
/* 29 */            Map map10 = Collections.EMPTY_MAP;
                    String str16 = "Failed to merge filter. appId";
                    Object objM9013H = "Database error querying filters. appId";
                    String str17 = "audience_id";
                    try {
                        try {
                            try {
                                if (zM7406J2 && zM7406J) {
/* 30 */                            ae3 ae3VarM6755f3 = mp3Var.m6755f0();
                                    ij3 ij3Var7 = (ij3) ae3VarM6755f3.f16749a;
                                    String str18 = this.f8169d;
/* 31 */                            kb1.m6058k(str18);
                                    z3 = z2;
/* 32 */                            C1024id c1024id9 = new C1024id();
                                    try {
/* 34 */                                ?? Query2 = ae3VarM6755f3.m261q0().query("event_filters", new String[]{"audience_id", SharedDataContentProvider.BASE_PATH}, "app_id=?", new String[]{str18}, null, null, null);
                                        try {
                                            try {
/* 35 */                                        if (Query2.moveToFirst()) {
                                                    str2 = SharedDataContentProvider.BASE_PATH;
                                                    Query2 = Query2;
                                                    ?? r111 = "event_filters";
                                                    while (true) {
                                                        try {
                                                            try {
/* 37 */                                                        zzff zzffVar = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query2.getBlob(1))).zzbc();
/* 38 */                                                        if (zzffVar.zzg()) {
/* 40 */                                                            Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                                    List list7 = (List) c1024id9.get(numValueOf7);
                                                                    if (list7 == null) {
/* 41 */                                                                arrayList5 = new ArrayList();
/* 42 */                                                                c1024id9.put(numValueOf7, arrayList5);
                                                                    } else {
                                                                        arrayList5 = list7;
                                                                    }
/* 43 */                                                            arrayList5.add(zzffVar);
                                                                    r111 = Query2;
                                                                } else {
                                                                    r111 = Query2;
                                                                }
                                                            } catch (IOException e2) {
                                                                r111 = Query2;
/* 46 */                                                        ij3Var7.mo4557a().m9016D().m8512c(uh3.m9013H(str18), "Failed to merge filter. appId", e2);
                                                            }
                                                            try {
/* 47 */                                                        if (!r111.moveToNext()) {
                                                                    break;
                                                                }
                                                                Query2 = r111;
                                                                r111 = r111;
                                                            } catch (SQLiteException e3) {
                                                                e = e3;
                                                                r110 = r111;
                                                                r9 = r110;
                                                                try {
/* 51 */                                                            ij3Var7.mo4557a().m9016D().m8512c(uh3.m9013H(str18), "Database error querying filters. appId", e);
/* 52 */                                                            map10 = Collections.EMPTY_MAP;
                                                                    if (r9 != 0) {
/* 53 */                                                                r9.close();
                                                                    }
                                                                    map = map10;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (r9 != 0) {
                                                                        r9.close();
                                                                    }
/* 54 */                                                            throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                r19 = r111;
                                                                r9 = r19;
                                                                if (r9 != 0) {
                                                                    r9.close();
                                                                }
/* 54 */                                                        throw th;
                                                            }
                                                        } catch (SQLiteException e4) {
                                                            e = e4;
                                                            r110 = Query2;
                                                            r9 = r110;
/* 51 */                                                    ij3Var7.mo4557a().m9016D().m8512c(uh3.m9013H(str18), "Database error querying filters. appId", e);
/* 52 */                                                    map10 = Collections.EMPTY_MAP;
                                                            if (r9 != 0) {
/* 53 */                                                        r9.close();
                                                            }
                                                            map = map10;
/* 55 */                                                    ae3 ae3VarM6755f4 = mp3Var.m6755f0();
                                                            obj = (ij3) ae3VarM6755f4.f16749a;
                                                            r5 = this.f8169d;
/* 56 */                                                    ae3VarM6755f4.m9593A();
/* 57 */                                                    ae3VarM6755f4.mo1375y();
/* 58 */                                                    kb1.m6058k(r5);
/* 60 */                                                    cursorQuery = ae3VarM6755f4.m261q0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
/* 61 */                                                    if (cursorQuery.moveToFirst()) {
/* 65 */                                                        c1024id8 = new C1024id();
                                                                r17 = obj;
                                                                r21 = r5;
                                                                while (true) {
                                                                    try {
/* 66 */                                                                i3 = cursorQuery.getInt(0);
                                                                        try {
/* 68 */                                                                    zzii zziiVar4 = (zzii) ((zzih) ci3.m1677m0(zzii.zzi(), cursorQuery.getBlob(1))).zzbc();
/* 69 */                                                                    Object objValueOf = Integer.valueOf(i3);
                                                                            c1024id8.put(objValueOf, zziiVar4);
                                                                            str3 = str16;
                                                                            obj2 = objM9013H;
                                                                            obj3 = objValueOf;
                                                                            r6 = r21;
                                                                        } catch (IOException e5) {
/* 71 */                                                                    sh3 sh3VarM9016D = r17.mo4557a().m9016D();
                                                                            str3 = str16;
                                                                            str16 = "Failed to merge filter results. appId, audienceId, error";
                                                                            obj2 = objM9013H;
                                                                            try {
                                                                                objM9013H = uh3.m9013H(r21);
/* 72 */                                                                        Integer numValueOf8 = Integer.valueOf(i3);
/* 73 */                                                                        sh3VarM9016D.m8513d("Failed to merge filter results. appId, audienceId, error", objM9013H, numValueOf8, e5);
                                                                                obj3 = sh3VarM9016D;
                                                                                r6 = numValueOf8;
                                                                            } catch (SQLiteException e6) {
                                                                                e = e6;
                                                                                r21 = r21;
/* 78 */                                                                        r17.mo4557a().m9016D().m8512c(uh3.m9013H(r21), "Database error querying filter results. appId", e);
/* 79 */                                                                        Map map11 = Collections.EMPTY_MAP;
                                                                                if (cursorQuery != null) {
/* 80 */                                                                            cursorQuery.close();
                                                                                }
                                                                                map2 = map11;
/* 81 */                                                                        if (map2.isEmpty()) {
                                                                                    str5 = "audience_id";
                                                                                    ij3Var = ij3Var6;
                                                                                } else {
/* 82 */                                                                            HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                                    if (z3) {
                                                                                        String str19 = this.f8169d;
/* 84 */                                                                                ae3VarM6755f0 = mp3Var.m6755f0();
                                                                                        str6 = this.f8169d;
/* 85 */                                                                                ae3VarM6755f0.m9593A();
/* 86 */                                                                                ae3VarM6755f0.mo1375y();
/* 87 */                                                                                kb1.m6058k(str6);
/* 88 */                                                                                c1024id3 = new C1024id();
                                                                                        try {
                                                                                            try {
/* 90 */                                                                                        cursorRawQuery = ae3VarM6755f0.m261q0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                                try {
/* 91 */                                                                                            if (cursorRawQuery.moveToFirst()) {
/* 98 */                                                                                                do {
/* 93 */                                                                                                    numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                            arrayList = (List) c1024id3.get(numValueOf2);
                                                                                                            if (arrayList == null) {
/* 94 */                                                                                                        arrayList = new ArrayList();
/* 95 */                                                                                                        c1024id3.put(numValueOf2, arrayList);
                                                                                                            }
/* 97 */                                                                                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
/* 98 */                                                                                                } while (cursorRawQuery.moveToNext());
                                                                                                    } else {
/* 100 */                                                                                               c1024id3 = Collections.EMPTY_MAP;
                                                                                                    }
                                                                                                } catch (SQLiteException e7) {
                                                                                                    e = e7;
/* 104 */                                                                                           ((ij3) ae3VarM6755f0.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Database error querying scoped filters. appId", e);
/* 105 */                                                                                           c1024id3 = Collections.EMPTY_MAP;
                                                                                                    r0 = c1024id3;
                                                                                                    if (cursorRawQuery != null) {
                                                                                                    }
/* 106 */                                                                                           kb1.m6058k(str19);
/* 108 */                                                                                           c1024id4 = new C1024id();
/* 109 */                                                                                           if (!map2.isEmpty()) {
/* 110 */                                                                                               it2 = map2.keySet().iterator();
                                                                                                        while (it2.hasNext()) {
                                                                                                            num = (Integer) it2.next();
                                                                                                            num.getClass();
/* 111 */                                                                                                   zziiVar3 = (zzii) map2.get(num);
/* 112 */                                                                                                   list4 = (List) r0.get(num);
                                                                                                            if (list4 != null) {
                                                                                                            }
                                                                                                            r18 = r0;
                                                                                                            it3 = it2;
                                                                                                            ij3Var2 = ij3Var6;
/* 134 */                                                                                                   c1024id4.put(num, zziiVar3);
                                                                                                            r0 = r18;
                                                                                                            it2 = it3;
                                                                                                            str17 = str17;
                                                                                                            ij3Var6 = ij3Var2;
                                                                                                        }
                                                                                                    }
                                                                                                    str4 = str17;
                                                                                                    ij3Var = ij3Var6;
                                                                                                    map3 = c1024id4;
                                                                                                    map5 = map3;
                                                                                                    map4 = map2;
                                                                                                    for (Integer num4 : hashSet) {
                                                                                                        num4.getClass();
/* 138 */                                                                                               zziiVar = (zzii) map5.get(num4);
/* 139 */                                                                                               bitSet = new BitSet();
/* 140 */                                                                                               bitSet2 = new BitSet();
/* 141 */                                                                                               c1024id = new C1024id();
                                                                                                        if (zziiVar != null) {
                                                                                                            for (zzhq zzhqVar : zziiVar.zze()) {
/* 145 */                                                                                                       if (zzhqVar.zza()) {
                                                                                                                    zzii zziiVar5 = zziiVar;
/* 146 */                                                                                                           Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                                                                                                           if (zzhqVar.zzc()) {
/* 148 */                                                                                                               lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                                                    } else {
                                                                                                                        lValueOf = null;
                                                                                                                    }
/* 149 */                                                                                                           c1024id.put(numValueOf9, lValueOf);
                                                                                                                    zziiVar = zziiVar5;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        zziiVar2 = zziiVar;
/* 151 */                                                                                               c1024id2 = new C1024id();
                                                                                                        if (zziiVar2 != null) {
/* 154 */                                                                                                   it = zziiVar2.zzg().iterator();
                                                                                                            while (it.hasNext()) {
                                                                                                                zzikVar = (zzik) it.next();
/* 155 */                                                                                                       if (!zzikVar.zza()) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        Map map12 = map5;
                                                                                                        if (zziiVar2 != null) {
                                                                                                            i = 0;
/* 159 */                                                                                                   while (i < zziiVar2.zzb() * 64) {
/* 160 */                                                                                                       if (ci3.m1675g0(i, zziiVar2.zza())) {
                                                                                                                    z4 = zM7406J;
/* 163 */                                                                                                           ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                                                                                                           bitSet2.set(i);
/* 165 */                                                                                                           if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                                                                                               bitSet.set(i);
                                                                                                                    }
                                                                                                                    i++;
                                                                                                                    zM7406J = z4;
                                                                                                                } else {
                                                                                                                    z4 = zM7406J;
                                                                                                                }
/* 167 */                                                                                                       c1024id.remove(Integer.valueOf(i));
                                                                                                                i++;
                                                                                                                zM7406J = z4;
                                                                                                            }
                                                                                                        }
                                                                                                        boolean z6 = zM7406J;
/* 168 */                                                                                               zzii zziiVar6 = (zzii) map4.get(num4);
                                                                                                        if (zM7406J2) {
                                                                                                            for (zzff zzffVar2 : list3) {
/* 171 */                                                                                                       int iZzb2 = zzffVar2.zzb();
                                                                                                                Integer num5 = num4;
/* 172 */                                                                                                       jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                                                                                                       if (zzffVar2.zzj()) {
/* 174 */                                                                                                           jLongValue = this.f8172i.longValue() / 1000;
                                                                                                                }
/* 175 */                                                                                                       numValueOf = Integer.valueOf(iZzb2);
                                                                                                                if (c1024id.containsKey(numValueOf)) {
/* 176 */                                                                                                           c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                                }
/* 177 */                                                                                                       if (c1024id2.containsKey(numValueOf)) {
/* 178 */                                                                                                           c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                                }
                                                                                                                num4 = num5;
                                                                                                            }
                                                                                                        }
/* 181 */                                                                                               this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar6, bitSet, bitSet2, c1024id, c1024id2));
                                                                                                        obj2 = obj2;
                                                                                                        map = map;
                                                                                                        str2 = str2;
                                                                                                        zM7406J = z6;
                                                                                                        map5 = map12;
                                                                                                        map4 = map4;
                                                                                                        zM7406J2 = zM7406J2;
                                                                                                    }
                                                                                                    str5 = str4;
                                                                                                    str7 = str2;
                                                                                                    String str20 = str3;
                                                                                                    ?? r10 = obj2;
                                                                                                    str8 = "Skipping failed audience ID";
/* 182 */                                                                                           if (!list.isEmpty()) {
/* 184 */                                                                                               wh3Var = new wh3(this);
/* 185 */                                                                                               c1024id6 = new C1024id();
                                                                                                        for (zzhs zzhsVar : list) {
/* 187 */                                                                                                   zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                                                                                                            if (zzhsVarM9579a != null) {
/* 189 */                                                                                                       pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                                                                                                       mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                                                                                                if (z) {
                                                                                                                    continue;
                                                                                                                } else {
/* 192 */                                                                                                           j = pe3VarM255j0.f15082c;
                                                                                                                    strZzd = zzhsVarM9579a.zzd();
/* 193 */                                                                                                           map8 = (Map) c1024id6.get(strZzd);
                                                                                                                    if (map8 == null) {
/* 194 */                                                                                                               ae3 ae3VarM6755f5 = mp3Var.m6755f0();
                                                                                                                        ij3 ij3Var8 = (ij3) ae3VarM6755f5.f16749a;
                                                                                                                        str13 = this.f8169d;
/* 195 */                                                                                                               ae3VarM6755f5.m9593A();
/* 196 */                                                                                                               ae3VarM6755f5.mo1375y();
/* 197 */                                                                                                               kb1.m6058k(str13);
/* 198 */                                                                                                               kb1.m6058k(strZzd);
/* 199 */                                                                                                               c1024id7 = new C1024id();
                                                                                                                        try {
/* 201 */                                                                                                                   Query = ae3VarM6755f5.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
                                                                                                                            try {
                                                                                                                                try {
/* 202 */                                                                                                                           if (Query.moveToFirst()) {
                                                                                                                                        str14 = str13;
                                                                                                                                        Query = Query;
                                                                                                                                        r46 = list;
                                                                                                                                        while (true) {
                                                                                                                                            try {
                                                                                                                                                try {
/* 204 */                                                                                                                                           zzff zzffVar3 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                                                                                                                           numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                                    list6 = (List) c1024id7.get(numValueOf6);
                                                                                                                                                    if (list6 == null) {
                                                                                                                                                        r46 = Query;
                                                                                                                                                        try {
/* 207 */                                                                                                                                                   arrayList4 = new ArrayList();
/* 208 */                                                                                                                                                   c1024id7.put(numValueOf6, arrayList4);
                                                                                                                                                            r48 = r46;
                                                                                                                                                        } catch (SQLiteException e8) {
                                                                                                                                                            e = e8;
                                                                                                                                                            r45 = r46;
                                                                                                                                                            r2 = r45;
                                                                                                                                                            r42 = r45;
                                                                                                                                                            try {
/* 219 */                                                                                                                                                       ij3Var8.mo4557a().m9016D().m8512c(uh3.m9013H(str14), r10, e);
/* 220 */                                                                                                                                                       map8 = Collections.EMPTY_MAP;
                                                                                                                                                                r43 = r42;
                                                                                                                                                                if (r2 != 0) {
/* 221 */                                                                                                                                                           r2.close();
                                                                                                                                                                    r43 = r42;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th3) {
                                                                                                                                                                th = th3;
                                                                                                                                                                r8 = r2;
                                                                                                                                                                if (r8 != 0) {
/* 223 */                                                                                                                                                           r8.close();
                                                                                                                                                                }
/* 224 */                                                                                                                                                       throw th;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th4) {
                                                                                                                                                            th = th4;
                                                                                                                                                            r44 = r46;
                                                                                                                                                            r8 = r44;
                                                                                                                                                            if (r8 != 0) {
/* 223 */                                                                                                                                                       r8.close();
                                                                                                                                                            }
/* 224 */                                                                                                                                                   throw th;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        r48 = Query;
                                                                                                                                                        arrayList4 = list6;
                                                                                                                                                    }
/* 209 */                                                                                                                                           arrayList4.add(zzffVar3);
                                                                                                                                                    r47 = r48;
                                                                                                                                                } catch (IOException e9) {
                                                                                                                                                    r47 = Query;
/* 212 */                                                                                                                                           ij3Var8.mo4557a().m9016D().m8512c(uh3.m9013H(str14), str20, e9);
                                                                                                                                                }
/* 213 */                                                                                                                                       if (!r47.moveToNext()) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                Query = r47;
                                                                                                                                                r46 = r47;
                                                                                                                                            } catch (SQLiteException e10) {
                                                                                                                                                e = e10;
                                                                                                                                                r45 = Query;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
/* 219 */                                                                                                                                       ij3Var8.mo4557a().m9016D().m8512c(uh3.m9013H(str14), r10, e);
/* 220 */                                                                                                                                       map8 = Collections.EMPTY_MAP;
                                                                                                                                                r43 = r42;
                                                                                                                                                if (r2 != 0) {
/* 221 */                                                                                                                                           r2.close();
                                                                                                                                                    r43 = r42;
                                                                                                                                                }
/* 222 */                                                                                                                                       c1024id6.put(strZzd, map8);
                                                                                                                                                list = r43;
                                                                                                                                                for (Integer num6 : map8.keySet()) {
                                                                                                                                                    iIntValue2 = num6.intValue();
/* 226 */                                                                                                                                           if (this.f8170e.contains(num6)) {
/* 228 */                                                                                                                                               ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                                                                                                                    } else {
/* 230 */                                                                                                                                               it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                                        zM1639a = true;
                                                                                                                                                        while (true) {
                                                                                                                                                            if (!it8.hasNext()) {
                                                                                                                                                                map9 = map8;
                                                                                                                                                                wh3Var2 = wh3Var;
                                                                                                                                                                num3 = num6;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            zzff zzffVar4 = (zzff) it8.next();
                                                                                                                                                            wh3Var2 = wh3Var;
                                                                                                                                                            num3 = num6;
                                                                                                                                                            map9 = map8;
/* 231 */                                                                                                                                                   cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar4, 0);
                                                                                                                                                            Long l3 = this.f8172i;
                                                                                                                                                            Long l4 = this.f8173v;
/* 232 */                                                                                                                                                   iZzb = zzffVar4.zzb();
/* 235 */                                                                                                                                                   as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                                                                                                            if (as3Var == null) {
                                                                                                                                                                z5 = false;
                                                                                                                                                            } else {
/* 237 */                                                                                                                                                       z5 = as3Var.f2081d.get(iZzb);
                                                                                                                                                            }
/* 238 */                                                                                                                                                   zM1639a = cd3Var2.m1639a(l3, l4, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                                                                                                            if (!zM1639a) {
/* 241 */                                                                                                                                                       this.f8170e.add(num3);
                                                                                                                                                                break;
                                                                                                                                                            }
/* 240 */                                                                                                                                                   m3752E(num3).m1160a(cd3Var2);
                                                                                                                                                            num6 = num3;
                                                                                                                                                            map8 = map9;
                                                                                                                                                            wh3Var = wh3Var2;
                                                                                                                                                        }
                                                                                                                                                        if (!zM1639a) {
/* 242 */                                                                                                                                                   this.f8170e.add(num3);
                                                                                                                                                        }
                                                                                                                                                        wh3Var = wh3Var2;
                                                                                                                                                        map8 = map9;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
/* 214 */                                                                                                                               r47.close();
                                                                                                                                        map8 = c1024id7;
                                                                                                                                        r43 = r47;
                                                                                                                                    } else {
                                                                                                                                        ?? r49 = Query;
/* 215 */                                                                                                                               map8 = Collections.EMPTY_MAP;
/* 216 */                                                                                                                               r49.close();
                                                                                                                                        r43 = r49;
                                                                                                                                    }
                                                                                                                                } catch (SQLiteException e11) {
                                                                                                                                    e = e11;
                                                                                                                                    str14 = str13;
                                                                                                                                }
                                                                                                                            } catch (Throwable th5) {
                                                                                                                                th = th5;
                                                                                                                                r44 = Query;
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e12) {
                                                                                                                            e = e12;
                                                                                                                            str14 = str13;
                                                                                                                            r2 = 0;
                                                                                                                            r42 = list;
                                                                                                                        } catch (Throwable th6) {
                                                                                                                            th = th6;
                                                                                                                            r8 = 0;
                                                                                                                        }
/* 222 */                                                                                                               c1024id6.put(strZzd, map8);
                                                                                                                        list = r43;
                                                                                                                    } else {
                                                                                                                        list = list;
                                                                                                                    }
                                                                                                                    while (r18.hasNext()) {
                                                                                                                        iIntValue2 = num6.intValue();
/* 226 */                                                                                                               if (this.f8170e.contains(num6)) {
/* 228 */                                                                                                                   ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                                                                                        } else {
/* 230 */                                                                                                                   it8 = ((List) map8.get(num6)).iterator();
                                                                                                                            zM1639a = true;
                                                                                                                            while (true) {
                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                    map9 = map8;
                                                                                                                                    wh3Var2 = wh3Var;
                                                                                                                                    num3 = num6;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                zzff zzffVar5 = (zzff) it8.next();
                                                                                                                                wh3Var2 = wh3Var;
                                                                                                                                num3 = num6;
                                                                                                                                map9 = map8;
/* 231 */                                                                                                                       cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar5, 0);
                                                                                                                                Long l5 = this.f8172i;
                                                                                                                                Long l6 = this.f8173v;
/* 232 */                                                                                                                       iZzb = zzffVar5.zzb();
/* 235 */                                                                                                                       as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                                                                                if (as3Var == null) {
                                                                                                                                    z5 = false;
                                                                                                                                } else {
/* 237 */                                                                                                                           z5 = as3Var.f2081d.get(iZzb);
                                                                                                                                }
/* 238 */                                                                                                                       zM1639a = cd3Var2.m1639a(l5, l6, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                                                                                if (!zM1639a) {
/* 241 */                                                                                                                           this.f8170e.add(num3);
                                                                                                                                    break;
                                                                                                                                }
/* 240 */                                                                                                                       m3752E(num3).m1160a(cd3Var2);
                                                                                                                                num6 = num3;
                                                                                                                                map8 = map9;
                                                                                                                                wh3Var = wh3Var2;
                                                                                                                            }
                                                                                                                            if (!zM1639a) {
/* 242 */                                                                                                                       this.f8170e.add(num3);
                                                                                                                            }
                                                                                                                            wh3Var = wh3Var2;
                                                                                                                            map8 = map9;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (!z) {
/* 344 */                                                                                               return new ArrayList();
                                                                                                    }
/* 243 */                                                                                           if (!list2.isEmpty()) {
/* 245 */                                                                                               C1024id c1024id10 = new C1024id();
/* 246 */                                                                                               it4 = list2.iterator();
                                                                                                        le2Var = c1024id10;
                                                                                                        while (it4.hasNext()) {
                                                                                                            zziu zziuVar = (zziu) it4.next();
/* 247 */                                                                                                   strZzc = zziuVar.zzc();
/* 248 */                                                                                                   map6 = (Map) le2Var.get(strZzc);
                                                                                                            if (map6 == null) {
/* 249 */                                                                                                       ae3 ae3VarM6755f6 = mp3Var.m6755f0();
                                                                                                                ij3Var4 = (ij3) ae3VarM6755f6.f16749a;
                                                                                                                str11 = this.f8169d;
/* 250 */                                                                                                       ae3VarM6755f6.m9593A();
/* 251 */                                                                                                       ae3VarM6755f6.mo1375y();
/* 252 */                                                                                                       kb1.m6058k(str11);
/* 253 */                                                                                                       kb1.m6058k(strZzc);
/* 254 */                                                                                                       c1024id5 = new C1024id();
                                                                                                                try {
/* 256 */                                                                                                           cursorQuery2 = ae3VarM6755f6.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
                                                                                                                    try {
                                                                                                                        try {
/* 257 */                                                                                                                   if (cursorQuery2.moveToFirst()) {
                                                                                                                                it5 = it4;
                                                                                                                                while (true) {
                                                                                                                                    try {
                                                                                                                                        try {
/* 259 */                                                                                                                                   zzfn zzfnVar2 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                                                                                                                                   numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                            list5 = (List) c1024id5.get(numValueOf5);
                                                                                                                                            if (list5 == null) {
                                                                                                                                                ij3Var5 = ij3Var4;
                                                                                                                                                try {
/* 262 */                                                                                                                                           arrayList3 = new ArrayList();
/* 263 */                                                                                                                                           c1024id5.put(numValueOf5, arrayList3);
                                                                                                                                                } catch (SQLiteException e13) {
                                                                                                                                                    e = e13;
                                                                                                                                                    str12 = str11;
                                                                                                                                                    cursor = cursorQuery2;
                                                                                                                                                    try {
/* 273 */                                                                                                                                               ij3Var5.mo4557a().m9016D().m8512c(uh3.m9013H(str12), r10, e);
/* 274 */                                                                                                                                               map6 = Collections.EMPTY_MAP;
                                                                                                                                                        if (cursor != null) {
/* 275 */                                                                                                                                                   cursor.close();
                                                                                                                                                        }
/* 276 */                                                                                                                                               le2Var.put(strZzc, map6);
/* 279 */                                                                                                                                               it6 = map6.keySet().iterator();
                                                                                                                                                        le2Var2 = le2Var;
                                                                                                                                                        while (it6.hasNext()) {
                                                                                                                                                            num2 = (Integer) it6.next();
                                                                                                                                                            iIntValue = num2.intValue();
/* 280 */                                                                                                                                                   if (this.f8170e.contains(num2)) {
/* 282 */                                                                                                                                                       ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                                                                                                                break;
                                                                                                                                                            }
/* 284 */                                                                                                                                                   it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                            zM1640b = true;
                                                                                                                                                            le2Var3 = le2Var2;
                                                                                                                                                            while (true) {
                                                                                                                                                                if (it7.hasNext()) {
                                                                                                                                                                    zzfnVar = (zzfn) it7.next();
                                                                                                                                                                    map7 = map6;
/* 286 */                                                                                                                                                           if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                                                                                                               sh3 sh3VarM9019G = ij3Var.mo4557a().m9019G();
/* 289 */                                                                                                                                                               if (zzfnVar.zza()) {
                                                                                                                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                                                        } else {
                                                                                                                                                                            numValueOf4 = null;
                                                                                                                                                                        }
/* 292 */                                                                                                                                                               sh3VarM9019G.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                                                                                                               ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                                                                                                    }
/* 297 */                                                                                                                                                           if (zzfnVar.zza()) {
                                                                                                                                                                    }
                                                                                                                                                                    str10 = str8;
/* 311 */                                                                                                                                                           sh3 sh3VarM9017E = ij3Var.mo4557a().m9017E();
                                                                                                                                                                    th3 th3VarM9013H = uh3.m9013H(this.f8169d);
/* 312 */                                                                                                                                                           if (zzfnVar.zza()) {
                                                                                                                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                                                    } else {
                                                                                                                                                                        numValueOf3 = null;
                                                                                                                                                                    }
/* 313 */                                                                                                                                                           sh3VarM9017E.m8512c(th3VarM9013H, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                                                                                                           this.f8170e.add(num2);
                                                                                                                                                                    str8 = str10;
                                                                                                                                                                    map6 = map7;
                                                                                                                                                                    le2Var2 = le2Var3;
                                                                                                                                                                    it6 = it6;
                                                                                                                                                                } else {
                                                                                                                                                                    map7 = map6;
                                                                                                                                                                    le2Var3 = le2Var3;
                                                                                                                                                                    it6 = it6;
                                                                                                                                                                    str10 = str8;
                                                                                                                                                                }
                                                                                                                                                                if (!zM1640b) {
/* 314 */                                                                                                                                                           this.f8170e.add(num2);
                                                                                                                                                                }
                                                                                                                                                                str8 = str10;
                                                                                                                                                                map6 = map7;
                                                                                                                                                                le2Var2 = le2Var3;
                                                                                                                                                                it6 = it6;
/* 308 */                                                                                                                                                       m3752E(num2).m1160a(cd3Var);
                                                                                                                                                                str8 = str10;
                                                                                                                                                                iIntValue = i2;
                                                                                                                                                                map6 = map7;
                                                                                                                                                                le2Var3 = le2Var3;
                                                                                                                                                                it6 = it6;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        it4 = it5;
                                                                                                                                                        le2Var = le2Var2;
                                                                                                                                                    } catch (Throwable th7) {
                                                                                                                                                        th = th7;
                                                                                                                                                        if (cursor != null) {
/* 277 */                                                                                                                                                   cursor.close();
                                                                                                                                                        }
/* 278 */                                                                                                                                               throw th;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                ij3Var5 = ij3Var4;
                                                                                                                                                arrayList3 = list5;
                                                                                                                                            }
/* 264 */                                                                                                                                   arrayList3.add(zzfnVar2);
                                                                                                                                            str12 = str11;
                                                                                                                                        } catch (IOException e14) {
                                                                                                                                            ij3Var5 = ij3Var4;
                                                                                                                                            str12 = str11;
/* 266 */                                                                                                                                   ij3Var5.mo4557a().m9016D().m8512c(uh3.m9013H(str12), "Failed to merge filter", e14);
                                                                                                                                        }
                                                                                                                                        try {
/* 267 */                                                                                                                                   if (!cursorQuery2.moveToNext()) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            ij3Var4 = ij3Var5;
                                                                                                                                            str11 = str12;
                                                                                                                                        } catch (SQLiteException e15) {
                                                                                                                                            e = e15;
                                                                                                                                            cursor = cursorQuery2;
/* 273 */                                                                                                                                   ij3Var5.mo4557a().m9016D().m8512c(uh3.m9013H(str12), r10, e);
/* 274 */                                                                                                                                   map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
/* 275 */                                                                                                                                       cursor.close();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (SQLiteException e16) {
                                                                                                                                        e = e16;
                                                                                                                                        ij3Var5 = ij3Var4;
                                                                                                                                        str12 = str11;
                                                                                                                                        cursor = cursorQuery2;
/* 273 */                                                                                                                               ij3Var5.mo4557a().m9016D().m8512c(uh3.m9013H(str12), r10, e);
/* 274 */                                                                                                                               map6 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor != null) {
/* 275 */                                                                                                                                   cursor.close();
                                                                                                                                        }
/* 276 */                                                                                                                               le2Var.put(strZzc, map6);
/* 279 */                                                                                                                               it6 = map6.keySet().iterator();
                                                                                                                                        le2Var2 = le2Var;
                                                                                                                                        while (it6.hasNext()) {
                                                                                                                                            num2 = (Integer) it6.next();
                                                                                                                                            iIntValue = num2.intValue();
/* 280 */                                                                                                                                   if (this.f8170e.contains(num2)) {
/* 282 */                                                                                                                                       ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                                                                                                break;
                                                                                                                                                break;
                                                                                                                                            }
/* 284 */                                                                                                                                   it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                            zM1640b = true;
                                                                                                                                            le2Var3 = le2Var2;
                                                                                                                                            while (true) {
                                                                                                                                                if (it7.hasNext()) {
                                                                                                                                                    zzfnVar = (zzfn) it7.next();
                                                                                                                                                    map7 = map6;
/* 286 */                                                                                                                                           if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                                                                                               sh3 sh3VarM9019G2 = ij3Var.mo4557a().m9019G();
/* 289 */                                                                                                                                               if (zzfnVar.zza()) {
                                                                                                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf4 = null;
                                                                                                                                                        }
/* 292 */                                                                                                                                               sh3VarM9019G2.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                                                                                               ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                                                                                    }
/* 297 */                                                                                                                                           if (zzfnVar.zza()) {
                                                                                                                                                    }
                                                                                                                                                    str10 = str8;
/* 311 */                                                                                                                                           sh3 sh3VarM9017E2 = ij3Var.mo4557a().m9017E();
                                                                                                                                                    th3 th3VarM9013H2 = uh3.m9013H(this.f8169d);
/* 312 */                                                                                                                                           if (zzfnVar.zza()) {
                                                                                                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                                    } else {
                                                                                                                                                        numValueOf3 = null;
                                                                                                                                                    }
/* 313 */                                                                                                                                           sh3VarM9017E2.m8512c(th3VarM9013H2, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                                                                                           this.f8170e.add(num2);
                                                                                                                                                    str8 = str10;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    le2Var2 = le2Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                } else {
                                                                                                                                                    map7 = map6;
                                                                                                                                                    le2Var3 = le2Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    str10 = str8;
                                                                                                                                                }
                                                                                                                                                if (!zM1640b) {
/* 314 */                                                                                                                                           this.f8170e.add(num2);
                                                                                                                                                }
                                                                                                                                                str8 = str10;
                                                                                                                                                map6 = map7;
                                                                                                                                                le2Var2 = le2Var3;
                                                                                                                                                it6 = it6;
/* 308 */                                                                                                                                       m3752E(num2).m1160a(cd3Var);
                                                                                                                                                str8 = str10;
                                                                                                                                                iIntValue = i2;
                                                                                                                                                map6 = map7;
                                                                                                                                                le2Var3 = le2Var3;
                                                                                                                                                it6 = it6;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        it4 = it5;
                                                                                                                                        le2Var = le2Var2;
                                                                                                                                    }
                                                                                                                                }
/* 268 */                                                                                                                       cursorQuery2.close();
                                                                                                                                map6 = c1024id5;
                                                                                                                            } else {
                                                                                                                                it5 = it4;
/* 269 */                                                                                                                       map6 = Collections.EMPTY_MAP;
/* 270 */                                                                                                                       cursorQuery2.close();
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e17) {
                                                                                                                            e = e17;
                                                                                                                            it5 = it4;
                                                                                                                        }
                                                                                                                    } catch (Throwable th8) {
                                                                                                                        th = th8;
                                                                                                                        cursor = cursorQuery2;
                                                                                                                        if (cursor != null) {
/* 277 */                                                                                                                   cursor.close();
                                                                                                                        }
/* 278 */                                                                                                               throw th;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e18) {
                                                                                                                    e = e18;
                                                                                                                    it5 = it4;
                                                                                                                    ij3Var5 = ij3Var4;
                                                                                                                    str12 = str11;
                                                                                                                    cursor = null;
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    cursor = null;
                                                                                                                }
/* 276 */                                                                                                       le2Var.put(strZzc, map6);
                                                                                                            } else {
                                                                                                                it5 = it4;
                                                                                                            }
/* 279 */                                                                                                   it6 = map6.keySet().iterator();
                                                                                                            le2Var2 = le2Var;
                                                                                                            while (it6.hasNext()) {
                                                                                                                num2 = (Integer) it6.next();
                                                                                                                iIntValue = num2.intValue();
/* 280 */                                                                                                       if (this.f8170e.contains(num2)) {
/* 282 */                                                                                                           ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                                                                    break;
                                                                                                                    break;
                                                                                                                }
/* 284 */                                                                                                       it7 = ((List) map6.get(num2)).iterator();
                                                                                                                zM1640b = true;
                                                                                                                le2Var3 = le2Var2;
                                                                                                                while (true) {
                                                                                                                    if (it7.hasNext()) {
                                                                                                                        zzfnVar = (zzfn) it7.next();
                                                                                                                        map7 = map6;
/* 286 */                                                                                                               if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                                                                   sh3 sh3VarM9019G3 = ij3Var.mo4557a().m9019G();
/* 289 */                                                                                                                   if (zzfnVar.zza()) {
                                                                                                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                            } else {
                                                                                                                                numValueOf4 = null;
                                                                                                                            }
/* 292 */                                                                                                                   sh3VarM9019G3.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                                                                   ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                                                        }
/* 297 */                                                                                                               if (zzfnVar.zza()) {
                                                                                                                        }
                                                                                                                        str10 = str8;
/* 311 */                                                                                                               sh3 sh3VarM9017E3 = ij3Var.mo4557a().m9017E();
                                                                                                                        th3 th3VarM9013H3 = uh3.m9013H(this.f8169d);
/* 312 */                                                                                                               if (zzfnVar.zza()) {
                                                                                                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                        } else {
                                                                                                                            numValueOf3 = null;
                                                                                                                        }
/* 313 */                                                                                                               sh3VarM9017E3.m8512c(th3VarM9013H3, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                                                               this.f8170e.add(num2);
                                                                                                                        str8 = str10;
                                                                                                                        map6 = map7;
                                                                                                                        le2Var2 = le2Var3;
                                                                                                                        it6 = it6;
                                                                                                                    } else {
                                                                                                                        map7 = map6;
                                                                                                                        le2Var3 = le2Var3;
                                                                                                                        it6 = it6;
                                                                                                                        str10 = str8;
                                                                                                                    }
                                                                                                                    if (!zM1640b) {
/* 314 */                                                                                                               this.f8170e.add(num2);
                                                                                                                    }
                                                                                                                    str8 = str10;
                                                                                                                    map6 = map7;
                                                                                                                    le2Var2 = le2Var3;
                                                                                                                    it6 = it6;
/* 308 */                                                                                                           m3752E(num2).m1160a(cd3Var);
                                                                                                                    str8 = str10;
                                                                                                                    iIntValue = i2;
                                                                                                                    map6 = map7;
                                                                                                                    le2Var3 = le2Var3;
                                                                                                                    it6 = it6;
                                                                                                                }
                                                                                                            }
                                                                                                            it4 = it5;
                                                                                                            le2Var = le2Var2;
                                                                                                        }
                                                                                                    }
/* 316 */                                                                                           arrayList2 = new ArrayList();
/* 318 */                                                                                           xb1<Integer> xb1Var = (xb1) this.f8171f.keySet();
                                                                                                    xb1Var.removeAll(this.f8170e);
                                                                                                    for (Integer num7 : xb1Var) {
                                                                                                        int iIntValue3 = num7.intValue();
/* 320 */                                                                                               as3 as3Var2 = (as3) this.f8171f.get(num7);
/* 321 */                                                                                               kb1.m6061n(as3Var2);
/* 322 */                                                                                               zzhg zzhgVarM1161b = as3Var2.m1161b(iIntValue3);
/* 323 */                                                                                               arrayList2.add(zzhgVarM1161b);
/* 324 */                                                                                               ae3VarM6755f1 = mp3Var.m6755f0();
                                                                                                        ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                                                                                                        str9 = this.f8169d;
/* 325 */                                                                                               zzii zziiVarZzc = zzhgVarM1161b.zzc();
/* 326 */                                                                                               ae3VarM6755f1.m9593A();
/* 327 */                                                                                               ae3VarM6755f1.mo1375y();
/* 328 */                                                                                               kb1.m6058k(str9);
/* 329 */                                                                                               kb1.m6061n(zziiVarZzc);
/* 330 */                                                                                               byte[] bArrZzcc = zziiVarZzc.zzcc();
/* 331 */                                                                                               contentValues = new ContentValues();
/* 332 */                                                                                               contentValues.put("app_id", str9);
/* 333 */                                                                                               contentValues.put(str5, num7);
/* 334 */                                                                                               contentValues.put("current_results", bArrZzcc);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                                                                                                           ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                                                                                                                }
                                                                                                            } catch (SQLiteException e19) {
                                                                                                                e = e19;
/* 342 */                                                                                                       ij3Var3.mo4557a().m9016D().m8512c(uh3.m9013H(str9), "Error storing filter results. appId", e);
                                                                                                            }
                                                                                                        } catch (SQLiteException e20) {
                                                                                                            e = e20;
                                                                                                        }
                                                                                                    }
                                                                                                    return arrayList2;
                                                                                                }
                                                                                            } catch (SQLiteException e21) {
                                                                                                e = e21;
                                                                                                cursorRawQuery = null;
                                                                                            } catch (Throwable th10) {
                                                                                                th = th10;
                                                                                                r7 = 0;
                                                                                                if (r7 != 0) {
/* 135 */                                                                                           r7.close();
                                                                                                }
/* 136 */                                                                                       throw th;
                                                                                            }
/* 99 */                                                                                    cursorRawQuery.close();
                                                                                            r0 = c1024id3;
/* 106 */                                                                                   kb1.m6058k(str19);
/* 108 */                                                                                   c1024id4 = new C1024id();
/* 109 */                                                                                   if (!map2.isEmpty()) {
/* 110 */                                                                                       it2 = map2.keySet().iterator();
                                                                                                while (it2.hasNext()) {
                                                                                                    num = (Integer) it2.next();
                                                                                                    num.getClass();
/* 111 */                                                                                           zziiVar3 = (zzii) map2.get(num);
/* 112 */                                                                                           list4 = (List) r0.get(num);
                                                                                                    if (list4 != null) {
                                                                                                    }
                                                                                                    r18 = r0;
                                                                                                    it3 = it2;
                                                                                                    ij3Var2 = ij3Var6;
/* 134 */                                                                                           c1024id4.put(num, zziiVar3);
                                                                                                    r0 = r18;
                                                                                                    it2 = it3;
                                                                                                    str17 = str17;
                                                                                                    ij3Var6 = ij3Var2;
                                                                                                }
                                                                                            }
                                                                                            str4 = str17;
                                                                                            ij3Var = ij3Var6;
                                                                                            map3 = c1024id4;
                                                                                        } catch (Throwable th11) {
                                                                                            th = th11;
                                                                                            r7 = hashSet;
                                                                                        }
                                                                                    } else {
                                                                                        str4 = "audience_id";
                                                                                        ij3Var = ij3Var6;
                                                                                        map3 = map2;
                                                                                    }
                                                                                    map5 = map3;
                                                                                    map4 = map2;
                                                                                    while (r17.hasNext()) {
                                                                                        num4.getClass();
/* 138 */                                                                               zziiVar = (zzii) map5.get(num4);
/* 139 */                                                                               bitSet = new BitSet();
/* 140 */                                                                               bitSet2 = new BitSet();
/* 141 */                                                                               c1024id = new C1024id();
                                                                                        if (zziiVar != null) {
                                                                                            while (r3.hasNext()) {
/* 145 */                                                                                       if (zzhqVar.zza()) {
                                                                                                    zzii zziiVar7 = zziiVar;
/* 146 */                                                                                           Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                                                                                           if (zzhqVar.zzc()) {
/* 148 */                                                                                               lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                                    } else {
                                                                                                        lValueOf = null;
                                                                                                    }
/* 149 */                                                                                           c1024id.put(numValueOf10, lValueOf);
                                                                                                    zziiVar = zziiVar7;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        zziiVar2 = zziiVar;
/* 151 */                                                                               c1024id2 = new C1024id();
                                                                                        if (zziiVar2 != null) {
/* 154 */                                                                                   it = zziiVar2.zzg().iterator();
                                                                                            while (it.hasNext()) {
                                                                                                zzikVar = (zzik) it.next();
/* 155 */                                                                                       if (!zzikVar.zza()) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        Map map13 = map5;
                                                                                        if (zziiVar2 != null) {
                                                                                            i = 0;
/* 159 */                                                                                   while (i < zziiVar2.zzb() * 64) {
/* 160 */                                                                                       if (ci3.m1675g0(i, zziiVar2.zza())) {
                                                                                                    z4 = zM7406J;
/* 163 */                                                                                           ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                                                                                           bitSet2.set(i);
/* 165 */                                                                                           if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                                                                               bitSet.set(i);
                                                                                                    }
                                                                                                    i++;
                                                                                                    zM7406J = z4;
                                                                                                } else {
                                                                                                    z4 = zM7406J;
                                                                                                }
/* 167 */                                                                                       c1024id.remove(Integer.valueOf(i));
                                                                                                i++;
                                                                                                zM7406J = z4;
                                                                                            }
                                                                                        }
                                                                                        boolean z7 = zM7406J;
/* 168 */                                                                               zzii zziiVar8 = (zzii) map4.get(num4);
                                                                                        if (zM7406J2) {
                                                                                            while (r2.hasNext()) {
/* 171 */                                                                                       int iZzb3 = zzffVar2.zzb();
                                                                                                Integer num8 = num4;
/* 172 */                                                                                       jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                                                                                       if (zzffVar2.zzj()) {
/* 174 */                                                                                           jLongValue = this.f8172i.longValue() / 1000;
                                                                                                }
/* 175 */                                                                                       numValueOf = Integer.valueOf(iZzb3);
                                                                                                if (c1024id.containsKey(numValueOf)) {
/* 176 */                                                                                           c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                }
/* 177 */                                                                                       if (c1024id2.containsKey(numValueOf)) {
/* 178 */                                                                                           c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                }
                                                                                                num4 = num8;
                                                                                            }
                                                                                        }
/* 181 */                                                                               this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar8, bitSet, bitSet2, c1024id, c1024id2));
                                                                                        obj2 = obj2;
                                                                                        map = map;
                                                                                        str2 = str2;
                                                                                        zM7406J = z7;
                                                                                        map5 = map13;
                                                                                        map4 = map4;
                                                                                        zM7406J2 = zM7406J2;
                                                                                    }
                                                                                    str5 = str4;
                                                                                }
                                                                                str7 = str2;
                                                                                String str21 = str3;
                                                                                ?? r11 = obj2;
                                                                                str8 = "Skipping failed audience ID";
/* 182 */                                                                       if (!list.isEmpty()) {
/* 184 */                                                                           wh3Var = new wh3(this);
/* 185 */                                                                           c1024id6 = new C1024id();
                                                                                    while (r17.hasNext()) {
/* 187 */                                                                               zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                                                                                        if (zzhsVarM9579a != null) {
/* 189 */                                                                                   pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                                                                                   mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                                                                            if (z) {
/* 192 */                                                                                       j = pe3VarM255j0.f15082c;
                                                                                                strZzd = zzhsVarM9579a.zzd();
/* 193 */                                                                                       map8 = (Map) c1024id6.get(strZzd);
                                                                                                if (map8 == null) {
/* 194 */                                                                                           ae3 ae3VarM6755f7 = mp3Var.m6755f0();
                                                                                                    ij3 ij3Var9 = (ij3) ae3VarM6755f7.f16749a;
                                                                                                    str13 = this.f8169d;
/* 195 */                                                                                           ae3VarM6755f7.m9593A();
/* 196 */                                                                                           ae3VarM6755f7.mo1375y();
/* 197 */                                                                                           kb1.m6058k(str13);
/* 198 */                                                                                           kb1.m6058k(strZzd);
/* 199 */                                                                                           c1024id7 = new C1024id();
/* 201 */                                                                                           Query = ae3VarM6755f7.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
/* 202 */                                                                                           if (Query.moveToFirst()) {
                                                                                                        str14 = str13;
                                                                                                        Query = Query;
                                                                                                        r46 = list;
                                                                                                        while (true) {
/* 204 */                                                                                                   zzff zzffVar6 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                                                                                   numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                            list6 = (List) c1024id7.get(numValueOf6);
                                                                                                            if (list6 == null) {
                                                                                                                r46 = Query;
/* 207 */                                                                                                       arrayList4 = new ArrayList();
/* 208 */                                                                                                       c1024id7.put(numValueOf6, arrayList4);
                                                                                                                r48 = r46;
                                                                                                            } else {
                                                                                                                r48 = Query;
                                                                                                                arrayList4 = list6;
                                                                                                            }
/* 209 */                                                                                                   arrayList4.add(zzffVar6);
                                                                                                            r47 = r48;
/* 213 */                                                                                                   if (!r47.moveToNext()) {
                                                                                                                break;
                                                                                                                break;
                                                                                                            }
                                                                                                            Query = r47;
                                                                                                            r46 = r47;
                                                                                                        }
/* 214 */                                                                                               r47.close();
                                                                                                        map8 = c1024id7;
                                                                                                        r43 = r47;
                                                                                                    } else {
                                                                                                        ?? r410 = Query;
/* 215 */                                                                                               map8 = Collections.EMPTY_MAP;
/* 216 */                                                                                               r410.close();
                                                                                                        r43 = r410;
                                                                                                    }
/* 222 */                                                                                           c1024id6.put(strZzd, map8);
                                                                                                    list = r43;
                                                                                                } else {
                                                                                                    list = list;
                                                                                                }
                                                                                                while (r18.hasNext()) {
                                                                                                    iIntValue2 = num6.intValue();
/* 226 */                                                                                           if (this.f8170e.contains(num6)) {
/* 228 */                                                                                               ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                                                                    } else {
/* 230 */                                                                                               it8 = ((List) map8.get(num6)).iterator();
                                                                                                        zM1639a = true;
                                                                                                        while (true) {
                                                                                                            if (!it8.hasNext()) {
                                                                                                                map9 = map8;
                                                                                                                wh3Var2 = wh3Var;
                                                                                                                num3 = num6;
                                                                                                                break;
                                                                                                            }
                                                                                                            zzff zzffVar7 = (zzff) it8.next();
                                                                                                            wh3Var2 = wh3Var;
                                                                                                            num3 = num6;
                                                                                                            map9 = map8;
/* 231 */                                                                                                   cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar7, 0);
                                                                                                            Long l7 = this.f8172i;
                                                                                                            Long l8 = this.f8173v;
/* 232 */                                                                                                   iZzb = zzffVar7.zzb();
/* 235 */                                                                                                   as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                                                            if (as3Var == null) {
                                                                                                                z5 = false;
                                                                                                            } else {
/* 237 */                                                                                                       z5 = as3Var.f2081d.get(iZzb);
                                                                                                            }
/* 238 */                                                                                                   zM1639a = cd3Var2.m1639a(l7, l8, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                                                            if (!zM1639a) {
/* 241 */                                                                                                       this.f8170e.add(num3);
                                                                                                                break;
                                                                                                            }
/* 240 */                                                                                                   m3752E(num3).m1160a(cd3Var2);
                                                                                                            num6 = num3;
                                                                                                            map8 = map9;
                                                                                                            wh3Var = wh3Var2;
                                                                                                        }
                                                                                                        if (!zM1639a) {
/* 242 */                                                                                                   this.f8170e.add(num3);
                                                                                                        }
                                                                                                        wh3Var = wh3Var2;
                                                                                                        map8 = map9;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (!z) {
/* 344 */                                                                           return new ArrayList();
                                                                                }
/* 243 */                                                                       if (!list2.isEmpty()) {
/* 245 */                                                                           C1024id c1024id11 = new C1024id();
/* 246 */                                                                           it4 = list2.iterator();
                                                                                    le2Var = c1024id11;
                                                                                    while (it4.hasNext()) {
                                                                                        zziu zziuVar2 = (zziu) it4.next();
/* 247 */                                                                               strZzc = zziuVar2.zzc();
/* 248 */                                                                               map6 = (Map) le2Var.get(strZzc);
                                                                                        if (map6 == null) {
/* 249 */                                                                                   ae3 ae3VarM6755f8 = mp3Var.m6755f0();
                                                                                            ij3Var4 = (ij3) ae3VarM6755f8.f16749a;
                                                                                            str11 = this.f8169d;
/* 250 */                                                                                   ae3VarM6755f8.m9593A();
/* 251 */                                                                                   ae3VarM6755f8.mo1375y();
/* 252 */                                                                                   kb1.m6058k(str11);
/* 253 */                                                                                   kb1.m6058k(strZzc);
/* 254 */                                                                                   c1024id5 = new C1024id();
/* 256 */                                                                                   cursorQuery2 = ae3VarM6755f8.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
/* 257 */                                                                                   if (cursorQuery2.moveToFirst()) {
                                                                                                it5 = it4;
                                                                                                while (true) {
/* 259 */                                                                                           zzfn zzfnVar3 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                                                                                           numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                    list5 = (List) c1024id5.get(numValueOf5);
                                                                                                    if (list5 == null) {
                                                                                                        ij3Var5 = ij3Var4;
/* 262 */                                                                                               arrayList3 = new ArrayList();
/* 263 */                                                                                               c1024id5.put(numValueOf5, arrayList3);
                                                                                                    } else {
                                                                                                        ij3Var5 = ij3Var4;
                                                                                                        arrayList3 = list5;
                                                                                                    }
/* 264 */                                                                                           arrayList3.add(zzfnVar3);
                                                                                                    str12 = str11;
/* 267 */                                                                                           if (!cursorQuery2.moveToNext()) {
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    ij3Var4 = ij3Var5;
                                                                                                    str11 = str12;
                                                                                                }
/* 268 */                                                                                       cursorQuery2.close();
                                                                                                map6 = c1024id5;
                                                                                            } else {
                                                                                                it5 = it4;
/* 269 */                                                                                       map6 = Collections.EMPTY_MAP;
/* 270 */                                                                                       cursorQuery2.close();
                                                                                            }
/* 276 */                                                                                   le2Var.put(strZzc, map6);
                                                                                        } else {
                                                                                            it5 = it4;
                                                                                        }
/* 279 */                                                                               it6 = map6.keySet().iterator();
                                                                                        le2Var2 = le2Var;
                                                                                        while (it6.hasNext()) {
                                                                                            num2 = (Integer) it6.next();
                                                                                            iIntValue = num2.intValue();
/* 280 */                                                                                   if (this.f8170e.contains(num2)) {
/* 282 */                                                                                       ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                                                break;
                                                                                                break;
                                                                                            }
/* 284 */                                                                                   it7 = ((List) map6.get(num2)).iterator();
                                                                                            zM1640b = true;
                                                                                            le2Var3 = le2Var2;
                                                                                            while (true) {
                                                                                                if (it7.hasNext()) {
                                                                                                    zzfnVar = (zzfn) it7.next();
                                                                                                    map7 = map6;
/* 286 */                                                                                           if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                                               sh3 sh3VarM9019G4 = ij3Var.mo4557a().m9019G();
/* 289 */                                                                                               if (zzfnVar.zza()) {
                                                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                        } else {
                                                                                                            numValueOf4 = null;
                                                                                                        }
/* 292 */                                                                                               sh3VarM9019G4.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                                               ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                                    }
/* 297 */                                                                                           if (zzfnVar.zza()) {
                                                                                                    }
                                                                                                    str10 = str8;
/* 311 */                                                                                           sh3 sh3VarM9017E4 = ij3Var.mo4557a().m9017E();
                                                                                                    th3 th3VarM9013H4 = uh3.m9013H(this.f8169d);
/* 312 */                                                                                           if (zzfnVar.zza()) {
                                                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                    } else {
                                                                                                        numValueOf3 = null;
                                                                                                    }
/* 313 */                                                                                           sh3VarM9017E4.m8512c(th3VarM9013H4, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                                           this.f8170e.add(num2);
                                                                                                    str8 = str10;
                                                                                                    map6 = map7;
                                                                                                    le2Var2 = le2Var3;
                                                                                                    it6 = it6;
                                                                                                } else {
                                                                                                    map7 = map6;
                                                                                                    le2Var3 = le2Var3;
                                                                                                    it6 = it6;
                                                                                                    str10 = str8;
                                                                                                }
                                                                                                if (!zM1640b) {
/* 314 */                                                                                           this.f8170e.add(num2);
                                                                                                }
                                                                                                str8 = str10;
                                                                                                map6 = map7;
                                                                                                le2Var2 = le2Var3;
                                                                                                it6 = it6;
/* 308 */                                                                                       m3752E(num2).m1160a(cd3Var);
                                                                                                str8 = str10;
                                                                                                iIntValue = i2;
                                                                                                map6 = map7;
                                                                                                le2Var3 = le2Var3;
                                                                                                it6 = it6;
                                                                                            }
                                                                                        }
                                                                                        it4 = it5;
                                                                                        le2Var = le2Var2;
                                                                                    }
                                                                                }
/* 316 */                                                                       arrayList2 = new ArrayList();
/* 318 */                                                                       xb1<Integer> xb1Var2 = (xb1) this.f8171f.keySet();
                                                                                xb1Var2.removeAll(this.f8170e);
                                                                                while (r3.hasNext()) {
                                                                                    int iIntValue4 = num7.intValue();
/* 320 */                                                                           as3 as3Var3 = (as3) this.f8171f.get(num7);
/* 321 */                                                                           kb1.m6061n(as3Var3);
/* 322 */                                                                           zzhg zzhgVarM1161b2 = as3Var3.m1161b(iIntValue4);
/* 323 */                                                                           arrayList2.add(zzhgVarM1161b2);
/* 324 */                                                                           ae3VarM6755f1 = mp3Var.m6755f0();
                                                                                    ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                                                                                    str9 = this.f8169d;
/* 325 */                                                                           zzii zziiVarZzc2 = zzhgVarM1161b2.zzc();
/* 326 */                                                                           ae3VarM6755f1.m9593A();
/* 327 */                                                                           ae3VarM6755f1.mo1375y();
/* 328 */                                                                           kb1.m6058k(str9);
/* 329 */                                                                           kb1.m6061n(zziiVarZzc2);
/* 330 */                                                                           byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
/* 331 */                                                                           contentValues = new ContentValues();
/* 332 */                                                                           contentValues.put("app_id", str9);
/* 333 */                                                                           contentValues.put(str5, num7);
/* 334 */                                                                           contentValues.put("current_results", bArrZzcc2);
                                                                                    if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                                                                               ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                                                                                    }
                                                                                }
                                                                                return arrayList2;
                                                                            }
                                                                        }
                                                                        try {
/* 74 */                                                                    if (!cursorQuery.moveToNext()) {
                                                                                break;
                                                                            }
                                                                            str16 = str3;
                                                                            objM9013H = obj2;
                                                                            r21 = r21;
                                                                        } catch (SQLiteException e22) {
                                                                            e = e22;
/* 78 */                                                                    r17.mo4557a().m9016D().m8512c(uh3.m9013H(r21), "Database error querying filter results. appId", e);
/* 79 */                                                                    Map map14 = Collections.EMPTY_MAP;
                                                                            if (cursorQuery != null) {
/* 80 */                                                                        cursorQuery.close();
                                                                            }
                                                                            map2 = map14;
                                                                        }
                                                                    } catch (SQLiteException e23) {
                                                                        e = e23;
                                                                        r21 = r21;
                                                                        r17 = r17;
                                                                        str3 = str16;
                                                                        obj2 = objM9013H;
                                                                        r21 = r21;
/* 78 */                                                                r17.mo4557a().m9016D().m8512c(uh3.m9013H(r21), "Database error querying filter results. appId", e);
/* 79 */                                                                Map map15 = Collections.EMPTY_MAP;
                                                                        if (cursorQuery != null) {
/* 80 */                                                                    cursorQuery.close();
                                                                        }
                                                                        map2 = map15;
/* 81 */                                                                if (map2.isEmpty()) {
                                                                            str5 = "audience_id";
                                                                            ij3Var = ij3Var6;
                                                                        } else {
/* 82 */                                                                    HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                            if (z3) {
                                                                                String str110 = this.f8169d;
/* 84 */                                                                        ae3VarM6755f0 = mp3Var.m6755f0();
                                                                                str6 = this.f8169d;
/* 85 */                                                                        ae3VarM6755f0.m9593A();
/* 86 */                                                                        ae3VarM6755f0.mo1375y();
/* 87 */                                                                        kb1.m6058k(str6);
/* 88 */                                                                        c1024id3 = new C1024id();
/* 90 */                                                                        cursorRawQuery = ae3VarM6755f0.m261q0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
/* 91 */                                                                        if (cursorRawQuery.moveToFirst()) {
/* 98 */                                                                            do {
/* 93 */                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                        arrayList = (List) c1024id3.get(numValueOf2);
                                                                                        if (arrayList == null) {
/* 94 */                                                                                    arrayList = new ArrayList();
/* 95 */                                                                                    c1024id3.put(numValueOf2, arrayList);
                                                                                        }
/* 97 */                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
/* 98 */                                                                            } while (cursorRawQuery.moveToNext());
                                                                                } else {
/* 100 */                                                                           c1024id3 = Collections.EMPTY_MAP;
                                                                                }
/* 99 */                                                                        cursorRawQuery.close();
                                                                                r0 = c1024id3;
/* 106 */                                                                       kb1.m6058k(str110);
/* 108 */                                                                       c1024id4 = new C1024id();
/* 109 */                                                                       if (!map2.isEmpty()) {
/* 110 */                                                                           it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
/* 111 */                                                                               zziiVar3 = (zzii) map2.get(num);
/* 112 */                                                                               list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        ij3Var2 = ij3Var6;
/* 134 */                                                                               c1024id4.put(num, zziiVar3);
                                                                                        r0 = r18;
                                                                                        it2 = it3;
                                                                                        str17 = str17;
                                                                                        ij3Var6 = ij3Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str17;
                                                                                ij3Var = ij3Var6;
                                                                                map3 = c1024id4;
                                                                            } else {
                                                                                str4 = "audience_id";
                                                                                ij3Var = ij3Var6;
                                                                                map3 = map2;
                                                                            }
                                                                            map5 = map3;
                                                                            map4 = map2;
                                                                            while (r17.hasNext()) {
                                                                                num4.getClass();
/* 138 */                                                                       zziiVar = (zzii) map5.get(num4);
/* 139 */                                                                       bitSet = new BitSet();
/* 140 */                                                                       bitSet2 = new BitSet();
/* 141 */                                                                       c1024id = new C1024id();
                                                                                if (zziiVar != null) {
                                                                                    while (r3.hasNext()) {
/* 145 */                                                                               if (zzhqVar.zza()) {
                                                                                            zzii zziiVar9 = zziiVar;
/* 146 */                                                                                   Integer numValueOf11 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                                                                                   if (zzhqVar.zzc()) {
/* 148 */                                                                                       lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                            } else {
                                                                                                lValueOf = null;
                                                                                            }
/* 149 */                                                                                   c1024id.put(numValueOf11, lValueOf);
                                                                                            zziiVar = zziiVar9;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zziiVar2 = zziiVar;
/* 151 */                                                                       c1024id2 = new C1024id();
                                                                                if (zziiVar2 != null) {
/* 154 */                                                                           it = zziiVar2.zzg().iterator();
                                                                                    while (it.hasNext()) {
                                                                                        zzikVar = (zzik) it.next();
/* 155 */                                                                               if (!zzikVar.zza()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                Map map16 = map5;
                                                                                if (zziiVar2 != null) {
                                                                                    i = 0;
/* 159 */                                                                           while (i < zziiVar2.zzb() * 64) {
/* 160 */                                                                               if (ci3.m1675g0(i, zziiVar2.zza())) {
                                                                                            z4 = zM7406J;
/* 163 */                                                                                   ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                                                                                   bitSet2.set(i);
/* 165 */                                                                                   if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                                                                       bitSet.set(i);
                                                                                            }
                                                                                            i++;
                                                                                            zM7406J = z4;
                                                                                        } else {
                                                                                            z4 = zM7406J;
                                                                                        }
/* 167 */                                                                               c1024id.remove(Integer.valueOf(i));
                                                                                        i++;
                                                                                        zM7406J = z4;
                                                                                    }
                                                                                }
                                                                                boolean z8 = zM7406J;
/* 168 */                                                                       zzii zziiVar10 = (zzii) map4.get(num4);
                                                                                if (zM7406J2) {
                                                                                    while (r2.hasNext()) {
/* 171 */                                                                               int iZzb4 = zzffVar2.zzb();
                                                                                        Integer num9 = num4;
/* 172 */                                                                               jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                                                                               if (zzffVar2.zzj()) {
/* 174 */                                                                                   jLongValue = this.f8172i.longValue() / 1000;
                                                                                        }
/* 175 */                                                                               numValueOf = Integer.valueOf(iZzb4);
                                                                                        if (c1024id.containsKey(numValueOf)) {
/* 176 */                                                                                   c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                                                                        }
/* 177 */                                                                               if (c1024id2.containsKey(numValueOf)) {
/* 178 */                                                                                   c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                        }
                                                                                        num4 = num9;
                                                                                    }
                                                                                }
/* 181 */                                                                       this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar10, bitSet, bitSet2, c1024id, c1024id2));
                                                                                obj2 = obj2;
                                                                                map = map;
                                                                                str2 = str2;
                                                                                zM7406J = z8;
                                                                                map5 = map16;
                                                                                map4 = map4;
                                                                                zM7406J2 = zM7406J2;
                                                                            }
                                                                            str5 = str4;
                                                                        }
                                                                        str7 = str2;
                                                                        String str22 = str3;
                                                                        ?? r12 = obj2;
                                                                        str8 = "Skipping failed audience ID";
/* 182 */                                                               if (!list.isEmpty()) {
/* 184 */                                                                   wh3Var = new wh3(this);
/* 185 */                                                                   c1024id6 = new C1024id();
                                                                            while (r17.hasNext()) {
/* 187 */                                                                       zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                                                                                if (zzhsVarM9579a != null) {
/* 189 */                                                                           pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                                                                           mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                                                                    if (z) {
/* 192 */                                                                               j = pe3VarM255j0.f15082c;
                                                                                        strZzd = zzhsVarM9579a.zzd();
/* 193 */                                                                               map8 = (Map) c1024id6.get(strZzd);
                                                                                        if (map8 == null) {
/* 194 */                                                                                   ae3 ae3VarM6755f9 = mp3Var.m6755f0();
                                                                                            ij3 ij3Var10 = (ij3) ae3VarM6755f9.f16749a;
                                                                                            str13 = this.f8169d;
/* 195 */                                                                                   ae3VarM6755f9.m9593A();
/* 196 */                                                                                   ae3VarM6755f9.mo1375y();
/* 197 */                                                                                   kb1.m6058k(str13);
/* 198 */                                                                                   kb1.m6058k(strZzd);
/* 199 */                                                                                   c1024id7 = new C1024id();
/* 201 */                                                                                   Query = ae3VarM6755f9.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
/* 202 */                                                                                   if (Query.moveToFirst()) {
                                                                                                str14 = str13;
                                                                                                Query = Query;
                                                                                                r46 = list;
                                                                                                while (true) {
/* 204 */                                                                                           zzff zzffVar8 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                                                                           numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                    list6 = (List) c1024id7.get(numValueOf6);
                                                                                                    if (list6 == null) {
                                                                                                        r46 = Query;
/* 207 */                                                                                               arrayList4 = new ArrayList();
/* 208 */                                                                                               c1024id7.put(numValueOf6, arrayList4);
                                                                                                        r48 = r46;
                                                                                                    } else {
                                                                                                        r48 = Query;
                                                                                                        arrayList4 = list6;
                                                                                                    }
/* 209 */                                                                                           arrayList4.add(zzffVar8);
                                                                                                    r47 = r48;
/* 213 */                                                                                           if (!r47.moveToNext()) {
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    Query = r47;
                                                                                                    r46 = r47;
                                                                                                }
/* 214 */                                                                                       r47.close();
                                                                                                map8 = c1024id7;
                                                                                                r43 = r47;
                                                                                            } else {
                                                                                                ?? r411 = Query;
/* 215 */                                                                                       map8 = Collections.EMPTY_MAP;
/* 216 */                                                                                       r411.close();
                                                                                                r43 = r411;
                                                                                            }
/* 222 */                                                                                   c1024id6.put(strZzd, map8);
                                                                                            list = r43;
                                                                                        } else {
                                                                                            list = list;
                                                                                        }
                                                                                        while (r18.hasNext()) {
                                                                                            iIntValue2 = num6.intValue();
/* 226 */                                                                                   if (this.f8170e.contains(num6)) {
/* 228 */                                                                                       ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                                                            } else {
/* 230 */                                                                                       it8 = ((List) map8.get(num6)).iterator();
                                                                                                zM1639a = true;
                                                                                                while (true) {
                                                                                                    if (!it8.hasNext()) {
                                                                                                        map9 = map8;
                                                                                                        wh3Var2 = wh3Var;
                                                                                                        num3 = num6;
                                                                                                        break;
                                                                                                    }
                                                                                                    zzff zzffVar9 = (zzff) it8.next();
                                                                                                    wh3Var2 = wh3Var;
                                                                                                    num3 = num6;
                                                                                                    map9 = map8;
/* 231 */                                                                                           cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar9, 0);
                                                                                                    Long l9 = this.f8172i;
                                                                                                    Long l10 = this.f8173v;
/* 232 */                                                                                           iZzb = zzffVar9.zzb();
/* 235 */                                                                                           as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                                                    if (as3Var == null) {
                                                                                                        z5 = false;
                                                                                                    } else {
/* 237 */                                                                                               z5 = as3Var.f2081d.get(iZzb);
                                                                                                    }
/* 238 */                                                                                           zM1639a = cd3Var2.m1639a(l9, l10, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                                                    if (!zM1639a) {
/* 241 */                                                                                               this.f8170e.add(num3);
                                                                                                        break;
                                                                                                    }
/* 240 */                                                                                           m3752E(num3).m1160a(cd3Var2);
                                                                                                    num6 = num3;
                                                                                                    map8 = map9;
                                                                                                    wh3Var = wh3Var2;
                                                                                                }
                                                                                                if (!zM1639a) {
/* 242 */                                                                                           this.f8170e.add(num3);
                                                                                                }
                                                                                                wh3Var = wh3Var2;
                                                                                                map8 = map9;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (!z) {
/* 344 */                                                                   return new ArrayList();
                                                                        }
/* 243 */                                                               if (!list2.isEmpty()) {
/* 245 */                                                                   C1024id c1024id12 = new C1024id();
/* 246 */                                                                   it4 = list2.iterator();
                                                                            le2Var = c1024id12;
                                                                            while (it4.hasNext()) {
                                                                                zziu zziuVar3 = (zziu) it4.next();
/* 247 */                                                                       strZzc = zziuVar3.zzc();
/* 248 */                                                                       map6 = (Map) le2Var.get(strZzc);
                                                                                if (map6 == null) {
/* 249 */                                                                           ae3 ae3VarM6755f10 = mp3Var.m6755f0();
                                                                                    ij3Var4 = (ij3) ae3VarM6755f10.f16749a;
                                                                                    str11 = this.f8169d;
/* 250 */                                                                           ae3VarM6755f10.m9593A();
/* 251 */                                                                           ae3VarM6755f10.mo1375y();
/* 252 */                                                                           kb1.m6058k(str11);
/* 253 */                                                                           kb1.m6058k(strZzc);
/* 254 */                                                                           c1024id5 = new C1024id();
/* 256 */                                                                           cursorQuery2 = ae3VarM6755f10.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
/* 257 */                                                                           if (cursorQuery2.moveToFirst()) {
                                                                                        it5 = it4;
                                                                                        while (true) {
/* 259 */                                                                                   zzfn zzfnVar4 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                                                                                   numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                            list5 = (List) c1024id5.get(numValueOf5);
                                                                                            if (list5 == null) {
                                                                                                ij3Var5 = ij3Var4;
/* 262 */                                                                                       arrayList3 = new ArrayList();
/* 263 */                                                                                       c1024id5.put(numValueOf5, arrayList3);
                                                                                            } else {
                                                                                                ij3Var5 = ij3Var4;
                                                                                                arrayList3 = list5;
                                                                                            }
/* 264 */                                                                                   arrayList3.add(zzfnVar4);
                                                                                            str12 = str11;
/* 267 */                                                                                   if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            ij3Var4 = ij3Var5;
                                                                                            str11 = str12;
                                                                                        }
/* 268 */                                                                               cursorQuery2.close();
                                                                                        map6 = c1024id5;
                                                                                    } else {
                                                                                        it5 = it4;
/* 269 */                                                                               map6 = Collections.EMPTY_MAP;
/* 270 */                                                                               cursorQuery2.close();
                                                                                    }
/* 276 */                                                                           le2Var.put(strZzc, map6);
                                                                                } else {
                                                                                    it5 = it4;
                                                                                }
/* 279 */                                                                       it6 = map6.keySet().iterator();
                                                                                le2Var2 = le2Var;
                                                                                while (it6.hasNext()) {
                                                                                    num2 = (Integer) it6.next();
                                                                                    iIntValue = num2.intValue();
/* 280 */                                                                           if (this.f8170e.contains(num2)) {
/* 282 */                                                                               ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                                        break;
                                                                                        break;
                                                                                    }
/* 284 */                                                                           it7 = ((List) map6.get(num2)).iterator();
                                                                                    zM1640b = true;
                                                                                    le2Var3 = le2Var2;
                                                                                    while (true) {
                                                                                        if (it7.hasNext()) {
                                                                                            zzfnVar = (zzfn) it7.next();
                                                                                            map7 = map6;
/* 286 */                                                                                   if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                                       sh3 sh3VarM9019G5 = ij3Var.mo4557a().m9019G();
/* 289 */                                                                                       if (zzfnVar.zza()) {
                                                                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                } else {
                                                                                                    numValueOf4 = null;
                                                                                                }
/* 292 */                                                                                       sh3VarM9019G5.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                                       ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                            }
/* 297 */                                                                                   if (zzfnVar.zza()) {
                                                                                            }
                                                                                            str10 = str8;
/* 311 */                                                                                   sh3 sh3VarM9017E5 = ij3Var.mo4557a().m9017E();
                                                                                            th3 th3VarM9013H5 = uh3.m9013H(this.f8169d);
/* 312 */                                                                                   if (zzfnVar.zza()) {
                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
/* 313 */                                                                                   sh3VarM9017E5.m8512c(th3VarM9013H5, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                                   this.f8170e.add(num2);
                                                                                            str8 = str10;
                                                                                            map6 = map7;
                                                                                            le2Var2 = le2Var3;
                                                                                            it6 = it6;
                                                                                        } else {
                                                                                            map7 = map6;
                                                                                            le2Var3 = le2Var3;
                                                                                            it6 = it6;
                                                                                            str10 = str8;
                                                                                        }
                                                                                        if (!zM1640b) {
/* 314 */                                                                                   this.f8170e.add(num2);
                                                                                        }
                                                                                        str8 = str10;
                                                                                        map6 = map7;
                                                                                        le2Var2 = le2Var3;
                                                                                        it6 = it6;
/* 308 */                                                                               m3752E(num2).m1160a(cd3Var);
                                                                                        str8 = str10;
                                                                                        iIntValue = i2;
                                                                                        map6 = map7;
                                                                                        le2Var3 = le2Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                }
                                                                                it4 = it5;
                                                                                le2Var = le2Var2;
                                                                            }
                                                                        }
/* 316 */                                                               arrayList2 = new ArrayList();
/* 318 */                                                               xb1<Integer> xb1Var3 = (xb1) this.f8171f.keySet();
                                                                        xb1Var3.removeAll(this.f8170e);
                                                                        while (r3.hasNext()) {
                                                                            int iIntValue5 = num7.intValue();
/* 320 */                                                                   as3 as3Var4 = (as3) this.f8171f.get(num7);
/* 321 */                                                                   kb1.m6061n(as3Var4);
/* 322 */                                                                   zzhg zzhgVarM1161b3 = as3Var4.m1161b(iIntValue5);
/* 323 */                                                                   arrayList2.add(zzhgVarM1161b3);
/* 324 */                                                                   ae3VarM6755f1 = mp3Var.m6755f0();
                                                                            ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                                                                            str9 = this.f8169d;
/* 325 */                                                                   zzii zziiVarZzc3 = zzhgVarM1161b3.zzc();
/* 326 */                                                                   ae3VarM6755f1.m9593A();
/* 327 */                                                                   ae3VarM6755f1.mo1375y();
/* 328 */                                                                   kb1.m6058k(str9);
/* 329 */                                                                   kb1.m6061n(zziiVarZzc3);
/* 330 */                                                                   byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
/* 331 */                                                                   contentValues = new ContentValues();
/* 332 */                                                                   contentValues.put("app_id", str9);
/* 333 */                                                                   contentValues.put(str5, num7);
/* 334 */                                                                   contentValues.put("current_results", bArrZzcc3);
                                                                            if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                                                                       ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                                                                            }
                                                                        }
                                                                        return arrayList2;
                                                                    }
                                                                }
/* 75 */                                                        cursorQuery.close();
                                                                obj = obj3;
                                                                r5 = r6;
                                                                map2 = c1024id8;
                                                            } else {
/* 62 */                                                        Map map17 = Collections.EMPTY_MAP;
/* 63 */                                                        cursorQuery.close();
                                                                map2 = map17;
                                                                str3 = "Failed to merge filter. appId";
                                                                obj2 = "Database error querying filters. appId";
                                                                obj = obj;
                                                                r5 = r5;
                                                            }
/* 81 */                                                    if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                ij3Var = ij3Var6;
                                                            } else {
/* 82 */                                                        HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str111 = this.f8169d;
/* 84 */                                                            ae3VarM6755f0 = mp3Var.m6755f0();
                                                                    str6 = this.f8169d;
/* 85 */                                                            ae3VarM6755f0.m9593A();
/* 86 */                                                            ae3VarM6755f0.mo1375y();
/* 87 */                                                            kb1.m6058k(str6);
/* 88 */                                                            c1024id3 = new C1024id();
/* 90 */                                                            cursorRawQuery = ae3VarM6755f0.m261q0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
/* 91 */                                                            if (cursorRawQuery.moveToFirst()) {
/* 98 */                                                                do {
/* 93 */                                                                    numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c1024id3.get(numValueOf2);
                                                                            if (arrayList == null) {
/* 94 */                                                                        arrayList = new ArrayList();
/* 95 */                                                                        c1024id3.put(numValueOf2, arrayList);
                                                                            }
/* 97 */                                                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
/* 98 */                                                                } while (cursorRawQuery.moveToNext());
                                                                    } else {
/* 100 */                                                               c1024id3 = Collections.EMPTY_MAP;
                                                                    }
/* 99 */                                                            cursorRawQuery.close();
                                                                    r0 = c1024id3;
/* 106 */                                                           kb1.m6058k(str111);
/* 108 */                                                           c1024id4 = new C1024id();
/* 109 */                                                           if (!map2.isEmpty()) {
/* 110 */                                                               it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
/* 111 */                                                                   zziiVar3 = (zzii) map2.get(num);
/* 112 */                                                                   list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            ij3Var2 = ij3Var6;
/* 134 */                                                                   c1024id4.put(num, zziiVar3);
                                                                            r0 = r18;
                                                                            it2 = it3;
                                                                            str17 = str17;
                                                                            ij3Var6 = ij3Var2;
                                                                        }
                                                                    }
                                                                    str4 = str17;
                                                                    ij3Var = ij3Var6;
                                                                    map3 = c1024id4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    ij3Var = ij3Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
/* 138 */                                                           zziiVar = (zzii) map5.get(num4);
/* 139 */                                                           bitSet = new BitSet();
/* 140 */                                                           bitSet2 = new BitSet();
/* 141 */                                                           c1024id = new C1024id();
                                                                    if (zziiVar != null) {
                                                                        while (r3.hasNext()) {
/* 145 */                                                                   if (zzhqVar.zza()) {
                                                                                zzii zziiVar11 = zziiVar;
/* 146 */                                                                       Integer numValueOf12 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                                                                       if (zzhqVar.zzc()) {
/* 148 */                                                                           lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
/* 149 */                                                                       c1024id.put(numValueOf12, lValueOf);
                                                                                zziiVar = zziiVar11;
                                                                            }
                                                                        }
                                                                    }
                                                                    zziiVar2 = zziiVar;
/* 151 */                                                           c1024id2 = new C1024id();
                                                                    if (zziiVar2 != null) {
/* 154 */                                                               it = zziiVar2.zzg().iterator();
                                                                        while (it.hasNext()) {
                                                                            zzikVar = (zzik) it.next();
/* 155 */                                                                   if (!zzikVar.zza()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map18 = map5;
                                                                    if (zziiVar2 != null) {
                                                                        i = 0;
/* 159 */                                                               while (i < zziiVar2.zzb() * 64) {
/* 160 */                                                                   if (ci3.m1675g0(i, zziiVar2.zza())) {
                                                                                z4 = zM7406J;
/* 163 */                                                                       ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                                                                       bitSet2.set(i);
/* 165 */                                                                       if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                                                           bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM7406J = z4;
                                                                            } else {
                                                                                z4 = zM7406J;
                                                                            }
/* 167 */                                                                   c1024id.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM7406J = z4;
                                                                        }
                                                                    }
                                                                    boolean z9 = zM7406J;
/* 168 */                                                           zzii zziiVar12 = (zzii) map4.get(num4);
                                                                    if (zM7406J2) {
                                                                        while (r2.hasNext()) {
/* 171 */                                                                   int iZzb5 = zzffVar2.zzb();
                                                                            Integer num10 = num4;
/* 172 */                                                                   jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                                                                   if (zzffVar2.zzj()) {
/* 174 */                                                                       jLongValue = this.f8172i.longValue() / 1000;
                                                                            }
/* 175 */                                                                   numValueOf = Integer.valueOf(iZzb5);
                                                                            if (c1024id.containsKey(numValueOf)) {
/* 176 */                                                                       c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
/* 177 */                                                                   if (c1024id2.containsKey(numValueOf)) {
/* 178 */                                                                       c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num10;
                                                                        }
                                                                    }
/* 181 */                                                           this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar12, bitSet, bitSet2, c1024id, c1024id2));
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str2 = str2;
                                                                    zM7406J = z9;
                                                                    map5 = map18;
                                                                    map4 = map4;
                                                                    zM7406J2 = zM7406J2;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str23 = str3;
                                                            ?? r13 = obj2;
                                                            str8 = "Skipping failed audience ID";
/* 182 */                                                   if (!list.isEmpty()) {
/* 184 */                                                       wh3Var = new wh3(this);
/* 185 */                                                       c1024id6 = new C1024id();
                                                                while (r17.hasNext()) {
/* 187 */                                                           zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                                                                    if (zzhsVarM9579a != null) {
/* 189 */                                                               pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                                                               mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                                                        if (z) {
/* 192 */                                                                   j = pe3VarM255j0.f15082c;
                                                                            strZzd = zzhsVarM9579a.zzd();
/* 193 */                                                                   map8 = (Map) c1024id6.get(strZzd);
                                                                            if (map8 == null) {
/* 194 */                                                                       ae3 ae3VarM6755f11 = mp3Var.m6755f0();
                                                                                ij3 ij3Var11 = (ij3) ae3VarM6755f11.f16749a;
                                                                                str13 = this.f8169d;
/* 195 */                                                                       ae3VarM6755f11.m9593A();
/* 196 */                                                                       ae3VarM6755f11.mo1375y();
/* 197 */                                                                       kb1.m6058k(str13);
/* 198 */                                                                       kb1.m6058k(strZzd);
/* 199 */                                                                       c1024id7 = new C1024id();
/* 201 */                                                                       Query = ae3VarM6755f11.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
/* 202 */                                                                       if (Query.moveToFirst()) {
                                                                                    str14 = str13;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
/* 204 */                                                                               zzff zzffVar10 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                                                               numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c1024id7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
/* 207 */                                                                                   arrayList4 = new ArrayList();
/* 208 */                                                                                   c1024id7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
/* 209 */                                                                               arrayList4.add(zzffVar10);
                                                                                        r47 = r48;
/* 213 */                                                                               if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
/* 214 */                                                                           r47.close();
                                                                                    map8 = c1024id7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r412 = Query;
/* 215 */                                                                           map8 = Collections.EMPTY_MAP;
/* 216 */                                                                           r412.close();
                                                                                    r43 = r412;
                                                                                }
/* 222 */                                                                       c1024id6.put(strZzd, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r18.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
/* 226 */                                                                       if (this.f8170e.contains(num6)) {
/* 228 */                                                                           ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                                                } else {
/* 230 */                                                                           it8 = ((List) map8.get(num6)).iterator();
                                                                                    zM1639a = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            wh3Var2 = wh3Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        zzff zzffVar11 = (zzff) it8.next();
                                                                                        wh3Var2 = wh3Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
/* 231 */                                                                               cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar11, 0);
                                                                                        Long l11 = this.f8172i;
                                                                                        Long l12 = this.f8173v;
/* 232 */                                                                               iZzb = zzffVar11.zzb();
/* 235 */                                                                               as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                                        if (as3Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
/* 237 */                                                                                   z5 = as3Var.f2081d.get(iZzb);
                                                                                        }
/* 238 */                                                                               zM1639a = cd3Var2.m1639a(l11, l12, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                                        if (!zM1639a) {
/* 241 */                                                                                   this.f8170e.add(num3);
                                                                                            break;
                                                                                        }
/* 240 */                                                                               m3752E(num3).m1160a(cd3Var2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        wh3Var = wh3Var2;
                                                                                    }
                                                                                    if (!zM1639a) {
/* 242 */                                                                               this.f8170e.add(num3);
                                                                                    }
                                                                                    wh3Var = wh3Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
/* 344 */                                                       return new ArrayList();
                                                            }
/* 243 */                                                   if (!list2.isEmpty()) {
/* 245 */                                                       C1024id c1024id13 = new C1024id();
/* 246 */                                                       it4 = list2.iterator();
                                                                le2Var = c1024id13;
                                                                while (it4.hasNext()) {
                                                                    zziu zziuVar4 = (zziu) it4.next();
/* 247 */                                                           strZzc = zziuVar4.zzc();
/* 248 */                                                           map6 = (Map) le2Var.get(strZzc);
                                                                    if (map6 == null) {
/* 249 */                                                               ae3 ae3VarM6755f12 = mp3Var.m6755f0();
                                                                        ij3Var4 = (ij3) ae3VarM6755f12.f16749a;
                                                                        str11 = this.f8169d;
/* 250 */                                                               ae3VarM6755f12.m9593A();
/* 251 */                                                               ae3VarM6755f12.mo1375y();
/* 252 */                                                               kb1.m6058k(str11);
/* 253 */                                                               kb1.m6058k(strZzc);
/* 254 */                                                               c1024id5 = new C1024id();
/* 256 */                                                               cursorQuery2 = ae3VarM6755f12.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
/* 257 */                                                               if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
/* 259 */                                                                       zzfn zzfnVar5 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                                                                       numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c1024id5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    ij3Var5 = ij3Var4;
/* 262 */                                                                           arrayList3 = new ArrayList();
/* 263 */                                                                           c1024id5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    ij3Var5 = ij3Var4;
                                                                                    arrayList3 = list5;
                                                                                }
/* 264 */                                                                       arrayList3.add(zzfnVar5);
                                                                                str12 = str11;
/* 267 */                                                                       if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                ij3Var4 = ij3Var5;
                                                                                str11 = str12;
                                                                            }
/* 268 */                                                                   cursorQuery2.close();
                                                                            map6 = c1024id5;
                                                                        } else {
                                                                            it5 = it4;
/* 269 */                                                                   map6 = Collections.EMPTY_MAP;
/* 270 */                                                                   cursorQuery2.close();
                                                                        }
/* 276 */                                                               le2Var.put(strZzc, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
/* 279 */                                                           it6 = map6.keySet().iterator();
                                                                    le2Var2 = le2Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
/* 280 */                                                               if (this.f8170e.contains(num2)) {
/* 282 */                                                                   ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                                            break;
                                                                            break;
                                                                        }
/* 284 */                                                               it7 = ((List) map6.get(num2)).iterator();
                                                                        zM1640b = true;
                                                                        le2Var3 = le2Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                zzfnVar = (zzfn) it7.next();
                                                                                map7 = map6;
/* 286 */                                                                       if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                                           sh3 sh3VarM9019G6 = ij3Var.mo4557a().m9019G();
/* 289 */                                                                           if (zzfnVar.zza()) {
                                                                                        numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
/* 292 */                                                                           sh3VarM9019G6.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                                           ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                                                }
/* 297 */                                                                       if (zzfnVar.zza()) {
                                                                                }
                                                                                str10 = str8;
/* 311 */                                                                       sh3 sh3VarM9017E6 = ij3Var.mo4557a().m9017E();
                                                                                th3 th3VarM9013H6 = uh3.m9013H(this.f8169d);
/* 312 */                                                                       if (zzfnVar.zza()) {
                                                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
/* 313 */                                                                       sh3VarM9017E6.m8512c(th3VarM9013H6, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                                       this.f8170e.add(num2);
                                                                                str8 = str10;
                                                                                map6 = map7;
                                                                                le2Var2 = le2Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                le2Var3 = le2Var3;
                                                                                it6 = it6;
                                                                                str10 = str8;
                                                                            }
                                                                            if (!zM1640b) {
/* 314 */                                                                       this.f8170e.add(num2);
                                                                            }
                                                                            str8 = str10;
                                                                            map6 = map7;
                                                                            le2Var2 = le2Var3;
                                                                            it6 = it6;
/* 308 */                                                                   m3752E(num2).m1160a(cd3Var);
                                                                            str8 = str10;
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            le2Var3 = le2Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    le2Var = le2Var2;
                                                                }
                                                            }
/* 316 */                                                   arrayList2 = new ArrayList();
/* 318 */                                                   xb1<Integer> xb1Var4 = (xb1) this.f8171f.keySet();
                                                            xb1Var4.removeAll(this.f8170e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue6 = num7.intValue();
/* 320 */                                                       as3 as3Var5 = (as3) this.f8171f.get(num7);
/* 321 */                                                       kb1.m6061n(as3Var5);
/* 322 */                                                       zzhg zzhgVarM1161b4 = as3Var5.m1161b(iIntValue6);
/* 323 */                                                       arrayList2.add(zzhgVarM1161b4);
/* 324 */                                                       ae3VarM6755f1 = mp3Var.m6755f0();
                                                                ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                                                                str9 = this.f8169d;
/* 325 */                                                       zzii zziiVarZzc4 = zzhgVarM1161b4.zzc();
/* 326 */                                                       ae3VarM6755f1.m9593A();
/* 327 */                                                       ae3VarM6755f1.mo1375y();
/* 328 */                                                       kb1.m6058k(str9);
/* 329 */                                                       kb1.m6061n(zziiVarZzc4);
/* 330 */                                                       byte[] bArrZzcc4 = zziiVarZzc4.zzcc();
/* 331 */                                                       contentValues = new ContentValues();
/* 332 */                                                       contentValues.put("app_id", str9);
/* 333 */                                                       contentValues.put(str5, num7);
/* 334 */                                                       contentValues.put("current_results", bArrZzcc4);
                                                                if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                                                           ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
/* 48 */                                            r111.close();
                                                    map = c1024id9;
                                                } else {
                                                    str2 = SharedDataContentProvider.BASE_PATH;
                                                    Query2.close();
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                r19 = Query2;
                                            }
                                        } catch (SQLiteException e24) {
                                            e = e24;
                                            str2 = SharedDataContentProvider.BASE_PATH;
                                        }
                                    } catch (SQLiteException e25) {
                                        e = e25;
                                        str2 = SharedDataContentProvider.BASE_PATH;
                                        r9 = 0;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        r9 = 0;
                                    }
/* 55 */                            ae3 ae3VarM6755f13 = mp3Var.m6755f0();
                                    obj = (ij3) ae3VarM6755f13.f16749a;
                                    r5 = this.f8169d;
/* 56 */                            ae3VarM6755f13.m9593A();
/* 57 */                            ae3VarM6755f13.mo1375y();
/* 58 */                            kb1.m6058k(r5);
/* 60 */                            cursorQuery = ae3VarM6755f13.m261q0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
/* 61 */                            if (cursorQuery.moveToFirst()) {
/* 62 */                                Map map19 = Collections.EMPTY_MAP;
/* 63 */                                cursorQuery.close();
                                        map2 = map19;
                                        str3 = "Failed to merge filter. appId";
                                        obj2 = "Database error querying filters. appId";
                                        obj = obj;
                                        r5 = r5;
                                    } else {
/* 65 */                                c1024id8 = new C1024id();
                                        r17 = obj;
                                        r21 = r5;
                                        while (true) {
/* 66 */                                    i3 = cursorQuery.getInt(0);
/* 68 */                                    zzii zziiVar13 = (zzii) ((zzih) ci3.m1677m0(zzii.zzi(), cursorQuery.getBlob(1))).zzbc();
/* 69 */                                    Object objValueOf2 = Integer.valueOf(i3);
                                            c1024id8.put(objValueOf2, zziiVar13);
                                            str3 = str16;
                                            obj2 = objM9013H;
                                            obj3 = objValueOf2;
                                            r6 = r21;
/* 74 */                                    if (!cursorQuery.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            str16 = str3;
                                            objM9013H = obj2;
                                            r21 = r21;
                                        }
/* 75 */                                cursorQuery.close();
                                        obj = obj3;
                                        r5 = r6;
                                        map2 = c1024id8;
                                    }
/* 81 */                            if (map2.isEmpty()) {
                                        str5 = "audience_id";
                                        ij3Var = ij3Var6;
                                    } else {
/* 82 */                                HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                                        if (z3) {
                                            String str112 = this.f8169d;
/* 84 */                                    ae3VarM6755f0 = mp3Var.m6755f0();
                                            str6 = this.f8169d;
/* 85 */                                    ae3VarM6755f0.m9593A();
/* 86 */                                    ae3VarM6755f0.mo1375y();
/* 87 */                                    kb1.m6058k(str6);
/* 88 */                                    c1024id3 = new C1024id();
/* 90 */                                    cursorRawQuery = ae3VarM6755f0.m261q0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
/* 91 */                                    if (cursorRawQuery.moveToFirst()) {
/* 98 */                                        do {
/* 93 */                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                    arrayList = (List) c1024id3.get(numValueOf2);
                                                    if (arrayList == null) {
/* 94 */                                                arrayList = new ArrayList();
/* 95 */                                                c1024id3.put(numValueOf2, arrayList);
                                                    }
/* 97 */                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
/* 98 */                                        } while (cursorRawQuery.moveToNext());
                                            } else {
/* 100 */                                       c1024id3 = Collections.EMPTY_MAP;
                                            }
/* 99 */                                    cursorRawQuery.close();
                                            r0 = c1024id3;
/* 106 */                                   kb1.m6058k(str112);
/* 108 */                                   c1024id4 = new C1024id();
/* 109 */                                   if (!map2.isEmpty()) {
/* 110 */                                       it2 = map2.keySet().iterator();
                                                while (it2.hasNext()) {
                                                    num = (Integer) it2.next();
                                                    num.getClass();
/* 111 */                                           zziiVar3 = (zzii) map2.get(num);
/* 112 */                                           list4 = (List) r0.get(num);
/* 113 */                                           if (list4 != null || list4.isEmpty()) {
                                                        r18 = r0;
                                                        it3 = it2;
                                                        ij3Var2 = ij3Var6;
/* 134 */                                               c1024id4.put(num, zziiVar3);
                                                        r0 = r18;
                                                        it2 = it3;
                                                        str17 = str17;
                                                        ij3Var6 = ij3Var2;
                                                    } else {
                                                        ?? r112 = r0;
                                                        it3 = it2;
/* 115 */                                               List listM1692i0 = mp3Var.m6761i0().m1692i0(zziiVar3.zzc(), list4);
/* 116 */                                               if (listM1692i0.isEmpty()) {
                                                            r0 = r112;
                                                            it2 = it3;
                                                        } else {
/* 117 */                                                   zzih zzihVar = (zzih) zziiVar3.zzcl();
                                                            zzihVar.zzd();
                                                            zzihVar.zzc(listM1692i0);
/* 119 */                                                   List listM1692i1 = mp3Var.m6761i0().m1692i0(zziiVar3.zza(), list4);
/* 120 */                                                   zzihVar.zzb();
                                                            zzihVar.zza(listM1692i1);
/* 121 */                                                   ArrayList arrayList6 = new ArrayList();
/* 122 */                                                   Iterator it10 = zziiVar3.zze().iterator();
                                                            while (it10.hasNext()) {
                                                                Iterator it11 = it10;
                                                                zzhq zzhqVar2 = (zzhq) it10.next();
                                                                ij3 ij3Var12 = ij3Var6;
/* 123 */                                                       if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
/* 124 */                                                           arrayList6.add(zzhqVar2);
                                                                }
                                                                it10 = it11;
                                                                ij3Var6 = ij3Var12;
                                                            }
                                                            ij3Var2 = ij3Var6;
/* 125 */                                                   zzihVar.zzf();
/* 126 */                                                   zzihVar.zze(arrayList6);
/* 127 */                                                   ArrayList arrayList7 = new ArrayList();
                                                            for (zzik zzikVar2 : zziiVar3.zzg()) {
/* 129 */                                                       if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
/* 130 */                                                           arrayList7.add(zzikVar2);
                                                                }
                                                            }
/* 131 */                                                   zzihVar.zzh();
/* 132 */                                                   zzihVar.zzg(arrayList7);
/* 133 */                                                   c1024id4.put(num, (zzii) zzihVar.zzbc());
                                                            r18 = r112;
                                                            r0 = r18;
                                                            it2 = it3;
                                                            str17 = str17;
                                                            ij3Var6 = ij3Var2;
                                                        }
                                                    }
                                                }
                                            }
                                            str4 = str17;
                                            ij3Var = ij3Var6;
                                            map3 = c1024id4;
                                        } else {
                                            str4 = "audience_id";
                                            ij3Var = ij3Var6;
                                            map3 = map2;
                                        }
                                        map5 = map3;
                                        map4 = map2;
                                        while (r17.hasNext()) {
                                            num4.getClass();
/* 138 */                                   zziiVar = (zzii) map5.get(num4);
/* 139 */                                   bitSet = new BitSet();
/* 140 */                                   bitSet2 = new BitSet();
/* 141 */                                   c1024id = new C1024id();
/* 142 */                                   if (zziiVar != null && zziiVar.zzf() != 0) {
                                                while (r3.hasNext()) {
/* 145 */                                           if (zzhqVar.zza()) {
                                                        zzii zziiVar14 = zziiVar;
/* 146 */                                               Integer numValueOf13 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                                               if (zzhqVar.zzc()) {
/* 148 */                                                   lValueOf = Long.valueOf(zzhqVar.zzd());
                                                        } else {
                                                            lValueOf = null;
                                                        }
/* 149 */                                               c1024id.put(numValueOf13, lValueOf);
                                                        zziiVar = zziiVar14;
                                                    }
                                                }
                                            }
                                            zziiVar2 = zziiVar;
/* 151 */                                   c1024id2 = new C1024id();
/* 152 */                                   if (zziiVar2 != null && zziiVar2.zzh() != 0) {
/* 154 */                                       it = zziiVar2.zzg().iterator();
                                                while (it.hasNext()) {
                                                    zzikVar = (zzik) it.next();
/* 155 */                                           if (!zzikVar.zza() && zzikVar.zzd() > 0) {
/* 158 */                                               c1024id2.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                                                        it = it;
                                                        map5 = map5;
                                                    }
                                                }
                                            }
                                            Map map110 = map5;
                                            if (zziiVar2 != null) {
                                                i = 0;
/* 159 */                                       while (i < zziiVar2.zzb() * 64) {
/* 160 */                                           if (ci3.m1675g0(i, zziiVar2.zza())) {
                                                        z4 = zM7406J;
/* 163 */                                               ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                                               bitSet2.set(i);
/* 165 */                                               if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                                   bitSet.set(i);
                                                        }
                                                        i++;
                                                        zM7406J = z4;
                                                    } else {
                                                        z4 = zM7406J;
                                                    }
/* 167 */                                           c1024id.remove(Integer.valueOf(i));
                                                    i++;
                                                    zM7406J = z4;
                                                }
                                            }
                                            boolean z10 = zM7406J;
/* 168 */                                   zzii zziiVar15 = (zzii) map4.get(num4);
                                            if (zM7406J2 && z10 && (list3 = (List) map.get(num4)) != null && this.f8173v != null && this.f8172i != null) {
                                                while (r2.hasNext()) {
/* 171 */                                           int iZzb6 = zzffVar2.zzb();
                                                    Integer num11 = num4;
/* 172 */                                           jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                                           if (zzffVar2.zzj()) {
/* 174 */                                               jLongValue = this.f8172i.longValue() / 1000;
                                                    }
/* 175 */                                           numValueOf = Integer.valueOf(iZzb6);
                                                    if (c1024id.containsKey(numValueOf)) {
/* 176 */                                               c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                                    }
/* 177 */                                           if (c1024id2.containsKey(numValueOf)) {
/* 178 */                                               c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                                    }
                                                    num4 = num11;
                                                }
                                            }
/* 181 */                                   this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar15, bitSet, bitSet2, c1024id, c1024id2));
                                            obj2 = obj2;
                                            map = map;
                                            str2 = str2;
                                            zM7406J = z10;
                                            map5 = map110;
                                            map4 = map4;
                                            zM7406J2 = zM7406J2;
                                        }
                                        str5 = str4;
                                    }
                                    str7 = str2;
                                    String str24 = str3;
                                    ?? r14 = obj2;
                                    str8 = "Skipping failed audience ID";
/* 182 */                           if (!list.isEmpty()) {
/* 184 */                               wh3Var = new wh3(this);
/* 185 */                               c1024id6 = new C1024id();
                                        while (r17.hasNext()) {
/* 187 */                                   zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                                            if (zzhsVarM9579a != null) {
/* 189 */                                       pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                                       mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                                if (z) {
/* 192 */                                           j = pe3VarM255j0.f15082c;
                                                    strZzd = zzhsVarM9579a.zzd();
/* 193 */                                           map8 = (Map) c1024id6.get(strZzd);
                                                    if (map8 == null) {
/* 194 */                                               ae3 ae3VarM6755f14 = mp3Var.m6755f0();
                                                        ij3 ij3Var13 = (ij3) ae3VarM6755f14.f16749a;
                                                        str13 = this.f8169d;
/* 195 */                                               ae3VarM6755f14.m9593A();
/* 196 */                                               ae3VarM6755f14.mo1375y();
/* 197 */                                               kb1.m6058k(str13);
/* 198 */                                               kb1.m6058k(strZzd);
/* 199 */                                               c1024id7 = new C1024id();
/* 201 */                                               Query = ae3VarM6755f14.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
/* 202 */                                               if (Query.moveToFirst()) {
                                                            str14 = str13;
                                                            Query = Query;
                                                            r46 = list;
                                                            while (true) {
/* 204 */                                                       zzff zzffVar12 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                                       numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                list6 = (List) c1024id7.get(numValueOf6);
                                                                if (list6 == null) {
                                                                    r46 = Query;
/* 207 */                                                           arrayList4 = new ArrayList();
/* 208 */                                                           c1024id7.put(numValueOf6, arrayList4);
                                                                    r48 = r46;
                                                                } else {
                                                                    r48 = Query;
                                                                    arrayList4 = list6;
                                                                }
/* 209 */                                                       arrayList4.add(zzffVar12);
                                                                r47 = r48;
/* 213 */                                                       if (!r47.moveToNext()) {
                                                                    break;
                                                                    break;
                                                                }
                                                                Query = r47;
                                                                r46 = r47;
                                                            }
/* 214 */                                                   r47.close();
                                                            map8 = c1024id7;
                                                            r43 = r47;
                                                        } else {
                                                            ?? r413 = Query;
/* 215 */                                                   map8 = Collections.EMPTY_MAP;
/* 216 */                                                   r413.close();
                                                            r43 = r413;
                                                        }
/* 222 */                                               c1024id6.put(strZzd, map8);
                                                        list = r43;
                                                    } else {
                                                        list = list;
                                                    }
                                                    while (r18.hasNext()) {
                                                        iIntValue2 = num6.intValue();
/* 226 */                                               if (this.f8170e.contains(num6)) {
/* 228 */                                                   ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                                        } else {
/* 230 */                                                   it8 = ((List) map8.get(num6)).iterator();
                                                            zM1639a = true;
                                                            while (true) {
                                                                if (!it8.hasNext()) {
                                                                    map9 = map8;
                                                                    wh3Var2 = wh3Var;
                                                                    num3 = num6;
                                                                    break;
                                                                }
                                                                zzff zzffVar13 = (zzff) it8.next();
                                                                wh3Var2 = wh3Var;
                                                                num3 = num6;
                                                                map9 = map8;
/* 231 */                                                       cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar13, 0);
                                                                Long l13 = this.f8172i;
                                                                Long l14 = this.f8173v;
/* 232 */                                                       iZzb = zzffVar13.zzb();
/* 235 */                                                       as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                                if (as3Var == null) {
                                                                    z5 = false;
                                                                } else {
/* 237 */                                                           z5 = as3Var.f2081d.get(iZzb);
                                                                }
/* 238 */                                                       zM1639a = cd3Var2.m1639a(l13, l14, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                                if (!zM1639a) {
/* 241 */                                                           this.f8170e.add(num3);
                                                                    break;
                                                                }
/* 240 */                                                       m3752E(num3).m1160a(cd3Var2);
                                                                num6 = num3;
                                                                map8 = map9;
                                                                wh3Var = wh3Var2;
                                                            }
                                                            if (!zM1639a) {
/* 242 */                                                       this.f8170e.add(num3);
                                                            }
                                                            wh3Var = wh3Var2;
                                                            map8 = map9;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    if (!z) {
/* 344 */                               return new ArrayList();
                                    }
/* 243 */                           if (!list2.isEmpty()) {
/* 245 */                               C1024id c1024id14 = new C1024id();
/* 246 */                               it4 = list2.iterator();
                                        le2Var = c1024id14;
                                        while (it4.hasNext()) {
                                            zziu zziuVar5 = (zziu) it4.next();
/* 247 */                                   strZzc = zziuVar5.zzc();
/* 248 */                                   map6 = (Map) le2Var.get(strZzc);
                                            if (map6 == null) {
/* 249 */                                       ae3 ae3VarM6755f15 = mp3Var.m6755f0();
                                                ij3Var4 = (ij3) ae3VarM6755f15.f16749a;
                                                str11 = this.f8169d;
/* 250 */                                       ae3VarM6755f15.m9593A();
/* 251 */                                       ae3VarM6755f15.mo1375y();
/* 252 */                                       kb1.m6058k(str11);
/* 253 */                                       kb1.m6058k(strZzc);
/* 254 */                                       c1024id5 = new C1024id();
/* 256 */                                       cursorQuery2 = ae3VarM6755f15.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
/* 257 */                                       if (cursorQuery2.moveToFirst()) {
                                                    it5 = it4;
                                                    while (true) {
/* 259 */                                               zzfn zzfnVar6 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                                               numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                        list5 = (List) c1024id5.get(numValueOf5);
                                                        if (list5 == null) {
                                                            ij3Var5 = ij3Var4;
/* 262 */                                                   arrayList3 = new ArrayList();
/* 263 */                                                   c1024id5.put(numValueOf5, arrayList3);
                                                        } else {
                                                            ij3Var5 = ij3Var4;
                                                            arrayList3 = list5;
                                                        }
/* 264 */                                               arrayList3.add(zzfnVar6);
                                                        str12 = str11;
/* 267 */                                               if (!cursorQuery2.moveToNext()) {
                                                            break;
                                                            break;
                                                        }
                                                        ij3Var4 = ij3Var5;
                                                        str11 = str12;
                                                    }
/* 268 */                                           cursorQuery2.close();
                                                    map6 = c1024id5;
                                                } else {
                                                    it5 = it4;
/* 269 */                                           map6 = Collections.EMPTY_MAP;
/* 270 */                                           cursorQuery2.close();
                                                }
/* 276 */                                       le2Var.put(strZzc, map6);
                                            } else {
                                                it5 = it4;
                                            }
/* 279 */                                   it6 = map6.keySet().iterator();
                                            le2Var2 = le2Var;
                                            while (it6.hasNext()) {
                                                num2 = (Integer) it6.next();
                                                iIntValue = num2.intValue();
/* 280 */                                       if (this.f8170e.contains(num2)) {
/* 282 */                                           ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                                    break;
                                                    break;
                                                }
/* 284 */                                       it7 = ((List) map6.get(num2)).iterator();
                                                zM1640b = true;
                                                le2Var3 = le2Var2;
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        zzfnVar = (zzfn) it7.next();
                                                        map7 = map6;
/* 286 */                                               if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                                   sh3 sh3VarM9019G7 = ij3Var.mo4557a().m9019G();
/* 289 */                                                   if (zzfnVar.zza()) {
                                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                            } else {
                                                                numValueOf4 = null;
                                                            }
/* 292 */                                                   sh3VarM9019G7.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                                   ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                                        }
/* 297 */                                               if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                                            str10 = str8;
/* 311 */                                                   sh3 sh3VarM9017E7 = ij3Var.mo4557a().m9017E();
                                                            th3 th3VarM9013H7 = uh3.m9013H(this.f8169d);
/* 312 */                                                   if (zzfnVar.zza()) {
                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                            } else {
                                                                numValueOf3 = null;
                                                            }
/* 313 */                                                   sh3VarM9017E7.m8512c(th3VarM9013H7, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                                                   this.f8170e.add(num2);
                                                            str8 = str10;
                                                            map6 = map7;
                                                            le2Var2 = le2Var3;
                                                            it6 = it6;
                                                        } else {
                                                            i2 = iIntValue;
/* 299 */                                                   cd3Var = new cd3(this, this.f8169d, i2, zzfnVar, 1);
                                                            Long l15 = this.f8172i;
                                                            Long l16 = this.f8173v;
/* 300 */                                                   int iZzb7 = zzfnVar.zzb();
                                                            str10 = str8;
/* 303 */                                                   as3 as3Var6 = (as3) this.f8171f.getOrDefault(num2, null);
/* 306 */                                                   zM1640b = cd3Var.m1640b(l15, l16, zziuVar5, as3Var6 == null ? false : as3Var6.f2081d.get(iZzb7));
                                                            if (zM1640b) {
/* 308 */                                                       m3752E(num2).m1160a(cd3Var);
                                                                str8 = str10;
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                le2Var3 = le2Var3;
                                                                it6 = it6;
                                                            } else {
/* 309 */                                                       this.f8170e.add(num2);
                                                                le2Var3 = le2Var3;
                                                            }
                                                        }
                                                    } else {
                                                        map7 = map6;
                                                        le2Var3 = le2Var3;
                                                        it6 = it6;
                                                        str10 = str8;
                                                    }
                                                    if (!zM1640b) {
/* 314 */                                               this.f8170e.add(num2);
                                                    }
                                                    str8 = str10;
                                                    map6 = map7;
                                                    le2Var2 = le2Var3;
                                                    it6 = it6;
                                                }
                                            }
                                            it4 = it5;
                                            le2Var = le2Var2;
                                        }
                                    }
/* 316 */                           arrayList2 = new ArrayList();
/* 318 */                           xb1<Integer> xb1Var5 = (xb1) this.f8171f.keySet();
                                    xb1Var5.removeAll(this.f8170e);
                                    while (r3.hasNext()) {
                                        int iIntValue7 = num7.intValue();
/* 320 */                               as3 as3Var7 = (as3) this.f8171f.get(num7);
/* 321 */                               kb1.m6061n(as3Var7);
/* 322 */                               zzhg zzhgVarM1161b5 = as3Var7.m1161b(iIntValue7);
/* 323 */                               arrayList2.add(zzhgVarM1161b5);
/* 324 */                               ae3VarM6755f1 = mp3Var.m6755f0();
                                        ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                                        str9 = this.f8169d;
/* 325 */                               zzii zziiVarZzc5 = zzhgVarM1161b5.zzc();
/* 326 */                               ae3VarM6755f1.m9593A();
/* 327 */                               ae3VarM6755f1.mo1375y();
/* 328 */                               kb1.m6058k(str9);
/* 329 */                               kb1.m6061n(zziiVarZzc5);
/* 330 */                               byte[] bArrZzcc5 = zziiVarZzc5.zzcc();
/* 331 */                               contentValues = new ContentValues();
/* 332 */                               contentValues.put("app_id", str9);
/* 333 */                               contentValues.put(str5, num7);
/* 334 */                               contentValues.put("current_results", bArrZzcc5);
                                        if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                                   ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                                        }
                                    }
                                    return arrayList2;
                                }
                                z3 = z2;
                                str2 = SharedDataContentProvider.BASE_PATH;
/* 61 */                        if (cursorQuery.moveToFirst()) {
/* 62 */                            Map map111 = Collections.EMPTY_MAP;
/* 63 */                            cursorQuery.close();
                                    map2 = map111;
                                    str3 = "Failed to merge filter. appId";
                                    obj2 = "Database error querying filters. appId";
                                    obj = obj;
                                    r5 = r5;
                                } else {
/* 65 */                            c1024id8 = new C1024id();
                                    r17 = obj;
                                    r21 = r5;
                                    while (true) {
/* 66 */                                i3 = cursorQuery.getInt(0);
/* 68 */                                zzii zziiVar16 = (zzii) ((zzih) ci3.m1677m0(zzii.zzi(), cursorQuery.getBlob(1))).zzbc();
/* 69 */                                Object objValueOf3 = Integer.valueOf(i3);
                                        c1024id8.put(objValueOf3, zziiVar16);
                                        str3 = str16;
                                        obj2 = objM9013H;
                                        obj3 = objValueOf3;
                                        r6 = r21;
/* 74 */                                if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        str16 = str3;
                                        objM9013H = obj2;
                                        r21 = r21;
                                    }
/* 75 */                            cursorQuery.close();
                                    obj = obj3;
                                    r5 = r6;
                                    map2 = c1024id8;
                                }
                            } catch (SQLiteException e26) {
                                e = e26;
                                r17 = obj;
                                r21 = r5;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            if (cursorQuery != null) {
/* 345 */                       cursorQuery.close();
                            }
/* 346 */                   throw th;
                        }
/* 60 */                cursorQuery = ae3VarM6755f13.m261q0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                    } catch (SQLiteException e27) {
                        e = e27;
                        r17 = obj;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        r21 = r5;
                        cursorQuery = null;
                    } catch (Throwable th15) {
                        th = th15;
                        cursorQuery = null;
                        if (cursorQuery != null) {
/* 345 */                   cursorQuery.close();
                        }
/* 346 */               throw th;
                    }
                    map = map10;
/* 55 */            ae3 ae3VarM6755f16 = mp3Var.m6755f0();
                    obj = (ij3) ae3VarM6755f16.f16749a;
                    r5 = this.f8169d;
/* 56 */            ae3VarM6755f16.m9593A();
/* 57 */            ae3VarM6755f16.mo1375y();
/* 58 */            kb1.m6058k(r5);
/* 81 */            if (map2.isEmpty()) {
                        str5 = "audience_id";
                        ij3Var = ij3Var6;
                    } else {
/* 82 */                HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
                        if (z3) {
                            String str113 = this.f8169d;
/* 84 */                    ae3VarM6755f0 = mp3Var.m6755f0();
                            str6 = this.f8169d;
/* 85 */                    ae3VarM6755f0.m9593A();
/* 86 */                    ae3VarM6755f0.mo1375y();
/* 87 */                    kb1.m6058k(str6);
/* 88 */                    c1024id3 = new C1024id();
/* 90 */                    cursorRawQuery = ae3VarM6755f0.m261q0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
/* 91 */                    if (cursorRawQuery.moveToFirst()) {
/* 98 */                        do {
/* 93 */                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                    arrayList = (List) c1024id3.get(numValueOf2);
                                    if (arrayList == null) {
/* 94 */                                arrayList = new ArrayList();
/* 95 */                                c1024id3.put(numValueOf2, arrayList);
                                    }
/* 97 */                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
/* 98 */                        } while (cursorRawQuery.moveToNext());
                            } else {
/* 100 */                       c1024id3 = Collections.EMPTY_MAP;
                            }
/* 99 */                    cursorRawQuery.close();
                            r0 = c1024id3;
/* 106 */                   kb1.m6058k(str113);
/* 108 */                   c1024id4 = new C1024id();
/* 109 */                   if (!map2.isEmpty()) {
/* 110 */                       it2 = map2.keySet().iterator();
                                while (it2.hasNext()) {
                                    num = (Integer) it2.next();
                                    num.getClass();
/* 111 */                           zziiVar3 = (zzii) map2.get(num);
/* 112 */                           list4 = (List) r0.get(num);
                                    if (list4 != null) {
                                    }
                                    r18 = r0;
                                    it3 = it2;
                                    ij3Var2 = ij3Var6;
/* 134 */                           c1024id4.put(num, zziiVar3);
                                    r0 = r18;
                                    it2 = it3;
                                    str17 = str17;
                                    ij3Var6 = ij3Var2;
                                }
                            }
                            str4 = str17;
                            ij3Var = ij3Var6;
                            map3 = c1024id4;
                        } else {
                            str4 = "audience_id";
                            ij3Var = ij3Var6;
                            map3 = map2;
                        }
                        map5 = map3;
                        map4 = map2;
                        while (r17.hasNext()) {
                            num4.getClass();
/* 138 */                   zziiVar = (zzii) map5.get(num4);
/* 139 */                   bitSet = new BitSet();
/* 140 */                   bitSet2 = new BitSet();
/* 141 */                   c1024id = new C1024id();
                            if (zziiVar != null) {
                                while (r3.hasNext()) {
/* 145 */                           if (zzhqVar.zza()) {
                                        zzii zziiVar17 = zziiVar;
/* 146 */                               Integer numValueOf14 = Integer.valueOf(zzhqVar.zzb());
/* 147 */                               if (zzhqVar.zzc()) {
/* 148 */                                   lValueOf = Long.valueOf(zzhqVar.zzd());
                                        } else {
                                            lValueOf = null;
                                        }
/* 149 */                               c1024id.put(numValueOf14, lValueOf);
                                        zziiVar = zziiVar17;
                                    }
                                }
                            }
                            zziiVar2 = zziiVar;
/* 151 */                   c1024id2 = new C1024id();
                            if (zziiVar2 != null) {
/* 154 */                       it = zziiVar2.zzg().iterator();
                                while (it.hasNext()) {
                                    zzikVar = (zzik) it.next();
/* 155 */                           if (!zzikVar.zza()) {
                                    }
                                }
                            }
                            Map map112 = map5;
                            if (zziiVar2 != null) {
                                i = 0;
/* 159 */                       while (i < zziiVar2.zzb() * 64) {
/* 160 */                           if (ci3.m1675g0(i, zziiVar2.zza())) {
                                        z4 = zM7406J;
/* 163 */                               ij3Var.mo4557a().m9019G().m8512c(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
/* 164 */                               bitSet2.set(i);
/* 165 */                               if (ci3.m1675g0(i, zziiVar2.zzc())) {
/* 166 */                                   bitSet.set(i);
                                        }
                                        i++;
                                        zM7406J = z4;
                                    } else {
                                        z4 = zM7406J;
                                    }
/* 167 */                           c1024id.remove(Integer.valueOf(i));
                                    i++;
                                    zM7406J = z4;
                                }
                            }
                            boolean z11 = zM7406J;
/* 168 */                   zzii zziiVar18 = (zzii) map4.get(num4);
                            if (zM7406J2) {
                                while (r2.hasNext()) {
/* 171 */                           int iZzb8 = zzffVar2.zzb();
                                    Integer num12 = num4;
/* 172 */                           jLongValue = this.f8173v.longValue() / 1000;
/* 173 */                           if (zzffVar2.zzj()) {
/* 174 */                               jLongValue = this.f8172i.longValue() / 1000;
                                    }
/* 175 */                           numValueOf = Integer.valueOf(iZzb8);
                                    if (c1024id.containsKey(numValueOf)) {
/* 176 */                               c1024id.put(numValueOf, Long.valueOf(jLongValue));
                                    }
/* 177 */                           if (c1024id2.containsKey(numValueOf)) {
/* 178 */                               c1024id2.put(numValueOf, Long.valueOf(jLongValue));
                                    }
                                    num4 = num12;
                                }
                            }
/* 181 */                   this.f8171f.put(num4, new as3(this, this.f8169d, zziiVar18, bitSet, bitSet2, c1024id, c1024id2));
                            obj2 = obj2;
                            map = map;
                            str2 = str2;
                            zM7406J = z11;
                            map5 = map112;
                            map4 = map4;
                            zM7406J2 = zM7406J2;
                        }
                        str5 = str4;
                    }
                    str7 = str2;
                    String str25 = str3;
                    ?? r15 = obj2;
                    str8 = "Skipping failed audience ID";
/* 182 */           if (!list.isEmpty()) {
/* 184 */               wh3Var = new wh3(this);
/* 185 */               c1024id6 = new C1024id();
                        while (r17.hasNext()) {
/* 187 */                   zzhsVarM9579a = wh3Var.m9579a(zzhsVar, this.f8169d);
                            if (zzhsVarM9579a != null) {
/* 189 */                       pe3VarM255j0 = mp3Var.m6755f0().m255j0(this.f8169d, zzhsVar, zzhsVarM9579a.zzd());
/* 191 */                       mp3Var.m6755f0().m247a0("events", pe3VarM255j0);
                                if (z) {
/* 192 */                           j = pe3VarM255j0.f15082c;
                                    strZzd = zzhsVarM9579a.zzd();
/* 193 */                           map8 = (Map) c1024id6.get(strZzd);
                                    if (map8 == null) {
/* 194 */                               ae3 ae3VarM6755f17 = mp3Var.m6755f0();
                                        ij3 ij3Var14 = (ij3) ae3VarM6755f17.f16749a;
                                        str13 = this.f8169d;
/* 195 */                               ae3VarM6755f17.m9593A();
/* 196 */                               ae3VarM6755f17.mo1375y();
/* 197 */                               kb1.m6058k(str13);
/* 198 */                               kb1.m6058k(strZzd);
/* 199 */                               c1024id7 = new C1024id();
/* 201 */                               Query = ae3VarM6755f17.m261q0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str13, strZzd}, null, null, null);
/* 202 */                               if (Query.moveToFirst()) {
                                            str14 = str13;
                                            Query = Query;
                                            r46 = list;
                                            while (true) {
/* 204 */                                       zzff zzffVar14 = (zzff) ((zzfe) ci3.m1677m0(zzff.zzn(), Query.getBlob(1))).zzbc();
/* 206 */                                       numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                list6 = (List) c1024id7.get(numValueOf6);
                                                if (list6 == null) {
                                                    r46 = Query;
/* 207 */                                           arrayList4 = new ArrayList();
/* 208 */                                           c1024id7.put(numValueOf6, arrayList4);
                                                    r48 = r46;
                                                } else {
                                                    r48 = Query;
                                                    arrayList4 = list6;
                                                }
/* 209 */                                       arrayList4.add(zzffVar14);
                                                r47 = r48;
/* 213 */                                       if (!r47.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                Query = r47;
                                                r46 = r47;
                                            }
/* 214 */                                   r47.close();
                                            map8 = c1024id7;
                                            r43 = r47;
                                        } else {
                                            ?? r414 = Query;
/* 215 */                                   map8 = Collections.EMPTY_MAP;
/* 216 */                                   r414.close();
                                            r43 = r414;
                                        }
/* 222 */                               c1024id6.put(strZzd, map8);
                                        list = r43;
                                    } else {
                                        list = list;
                                    }
                                    while (r18.hasNext()) {
                                        iIntValue2 = num6.intValue();
/* 226 */                               if (this.f8170e.contains(num6)) {
/* 228 */                                   ij3Var.mo4557a().m9019G().m8511b(num6, "Skipping failed audience ID");
                                        } else {
/* 230 */                                   it8 = ((List) map8.get(num6)).iterator();
                                            zM1639a = true;
                                            while (true) {
                                                if (!it8.hasNext()) {
                                                    map9 = map8;
                                                    wh3Var2 = wh3Var;
                                                    num3 = num6;
                                                    break;
                                                }
                                                zzff zzffVar15 = (zzff) it8.next();
                                                wh3Var2 = wh3Var;
                                                num3 = num6;
                                                map9 = map8;
/* 231 */                                       cd3Var2 = new cd3(this, this.f8169d, iIntValue2, zzffVar15, 0);
                                                Long l17 = this.f8172i;
                                                Long l18 = this.f8173v;
/* 232 */                                       iZzb = zzffVar15.zzb();
/* 235 */                                       as3Var = (as3) this.f8171f.getOrDefault(num3, null);
                                                if (as3Var == null) {
                                                    z5 = false;
                                                } else {
/* 237 */                                           z5 = as3Var.f2081d.get(iZzb);
                                                }
/* 238 */                                       zM1639a = cd3Var2.m1639a(l17, l18, zzhsVarM9579a, j, pe3VarM255j0, z5);
                                                if (!zM1639a) {
/* 241 */                                           this.f8170e.add(num3);
                                                    break;
                                                }
/* 240 */                                       m3752E(num3).m1160a(cd3Var2);
                                                num6 = num3;
                                                map8 = map9;
                                                wh3Var = wh3Var2;
                                            }
                                            if (!zM1639a) {
/* 242 */                                       this.f8170e.add(num3);
                                            }
                                            wh3Var = wh3Var2;
                                            map8 = map9;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    if (!z) {
/* 344 */               return new ArrayList();
                    }
/* 243 */           if (!list2.isEmpty()) {
/* 245 */               C1024id c1024id15 = new C1024id();
/* 246 */               it4 = list2.iterator();
                        le2Var = c1024id15;
                        while (it4.hasNext()) {
                            zziu zziuVar6 = (zziu) it4.next();
/* 247 */                   strZzc = zziuVar6.zzc();
/* 248 */                   map6 = (Map) le2Var.get(strZzc);
                            if (map6 == null) {
/* 249 */                       ae3 ae3VarM6755f18 = mp3Var.m6755f0();
                                ij3Var4 = (ij3) ae3VarM6755f18.f16749a;
                                str11 = this.f8169d;
/* 250 */                       ae3VarM6755f18.m9593A();
/* 251 */                       ae3VarM6755f18.mo1375y();
/* 252 */                       kb1.m6058k(str11);
/* 253 */                       kb1.m6058k(strZzc);
/* 254 */                       c1024id5 = new C1024id();
/* 256 */                       cursorQuery2 = ae3VarM6755f18.m261q0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzc}, null, null, null);
/* 257 */                       if (cursorQuery2.moveToFirst()) {
                                    it5 = it4;
                                    while (true) {
/* 259 */                               zzfn zzfnVar7 = (zzfn) ((zzfm) ci3.m1677m0(zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
/* 261 */                               numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                        list5 = (List) c1024id5.get(numValueOf5);
                                        if (list5 == null) {
                                            ij3Var5 = ij3Var4;
/* 262 */                                   arrayList3 = new ArrayList();
/* 263 */                                   c1024id5.put(numValueOf5, arrayList3);
                                        } else {
                                            ij3Var5 = ij3Var4;
                                            arrayList3 = list5;
                                        }
/* 264 */                               arrayList3.add(zzfnVar7);
                                        str12 = str11;
/* 267 */                               if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        ij3Var4 = ij3Var5;
                                        str11 = str12;
                                    }
/* 268 */                           cursorQuery2.close();
                                    map6 = c1024id5;
                                } else {
                                    it5 = it4;
/* 269 */                           map6 = Collections.EMPTY_MAP;
/* 270 */                           cursorQuery2.close();
                                }
/* 276 */                       le2Var.put(strZzc, map6);
                            } else {
                                it5 = it4;
                            }
/* 279 */                   it6 = map6.keySet().iterator();
                            le2Var2 = le2Var;
                            while (it6.hasNext()) {
                                num2 = (Integer) it6.next();
                                iIntValue = num2.intValue();
/* 280 */                       if (this.f8170e.contains(num2)) {
/* 282 */                           ij3Var.mo4557a().m9019G().m8511b(num2, str8);
                                    break;
                                    break;
                                }
/* 284 */                       it7 = ((List) map6.get(num2)).iterator();
                                zM1640b = true;
                                le2Var3 = le2Var2;
                                while (true) {
                                    if (it7.hasNext()) {
                                        zzfnVar = (zzfn) it7.next();
                                        map7 = map6;
/* 286 */                               if (Log.isLoggable(ij3Var.mo4557a().m9021J(), 2)) {
/* 288 */                                   sh3 sh3VarM9019G8 = ij3Var.mo4557a().m9019G();
/* 289 */                                   if (zzfnVar.zza()) {
                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf4 = null;
                                            }
/* 292 */                                   sh3VarM9019G8.m8513d("Evaluating filter. audience, filter, property", num2, numValueOf4, ij3Var.m4565m().m6658c(zzfnVar.zzc()));
/* 296 */                                   ij3Var.mo4557a().m9019G().m8511b(mp3Var.m6761i0().m1690d0(zzfnVar), "Filter definition");
                                        }
/* 297 */                               if (zzfnVar.zza()) {
                                        }
                                        str10 = str8;
/* 311 */                               sh3 sh3VarM9017E8 = ij3Var.mo4557a().m9017E();
                                        th3 th3VarM9013H8 = uh3.m9013H(this.f8169d);
/* 312 */                               if (zzfnVar.zza()) {
                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                        } else {
                                            numValueOf3 = null;
                                        }
/* 313 */                               sh3VarM9017E8.m8512c(th3VarM9013H8, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
/* 314 */                               this.f8170e.add(num2);
                                        str8 = str10;
                                        map6 = map7;
                                        le2Var2 = le2Var3;
                                        it6 = it6;
                                    } else {
                                        map7 = map6;
                                        le2Var3 = le2Var3;
                                        it6 = it6;
                                        str10 = str8;
                                    }
                                    if (!zM1640b) {
/* 314 */                               this.f8170e.add(num2);
                                    }
                                    str8 = str10;
                                    map6 = map7;
                                    le2Var2 = le2Var3;
                                    it6 = it6;
/* 308 */                           m3752E(num2).m1160a(cd3Var);
                                    str8 = str10;
                                    iIntValue = i2;
                                    map6 = map7;
                                    le2Var3 = le2Var3;
                                    it6 = it6;
                                }
                            }
                            it4 = it5;
                            le2Var = le2Var2;
                        }
                    }
/* 316 */           arrayList2 = new ArrayList();
/* 318 */           xb1<Integer> xb1Var6 = (xb1) this.f8171f.keySet();
                    xb1Var6.removeAll(this.f8170e);
                    while (r3.hasNext()) {
                        int iIntValue8 = num7.intValue();
/* 320 */               as3 as3Var8 = (as3) this.f8171f.get(num7);
/* 321 */               kb1.m6061n(as3Var8);
/* 322 */               zzhg zzhgVarM1161b6 = as3Var8.m1161b(iIntValue8);
/* 323 */               arrayList2.add(zzhgVarM1161b6);
/* 324 */               ae3VarM6755f1 = mp3Var.m6755f0();
                        ij3Var3 = (ij3) ae3VarM6755f1.f16749a;
                        str9 = this.f8169d;
/* 325 */               zzii zziiVarZzc6 = zzhgVarM1161b6.zzc();
/* 326 */               ae3VarM6755f1.m9593A();
/* 327 */               ae3VarM6755f1.mo1375y();
/* 328 */               kb1.m6058k(str9);
/* 329 */               kb1.m6061n(zziiVarZzc6);
/* 330 */               byte[] bArrZzcc6 = zziiVarZzc6.zzcc();
/* 331 */               contentValues = new ContentValues();
/* 332 */               contentValues.put("app_id", str9);
/* 333 */               contentValues.put(str5, num7);
/* 334 */               contentValues.put("current_results", bArrZzcc6);
                        if (ae3VarM6755f1.m261q0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
/* 339 */                   ij3Var3.mo4557a().m9016D().m8511b(uh3.m9013H(str9), "Failed to insert filter results (got -1). appId");
                        }
                    }
                    return arrayList2;
                }

                /* JADX INFO: renamed from: E */
                public final as3 m3752E(Integer num) {
/* 7 */             if (this.f8171f.containsKey(num)) {
/* 16 */                return (as3) this.f8171f.getOrDefault(num, null);
                    }
/* 23 */            as3 as3Var = new as3(this, this.f8169d);
/* 28 */            this.f8171f.put(num, as3Var);
/* 31 */            return as3Var;
                }
            }
