.class public final Lqh1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lh72;


# static fields
.field public static final o:[I

.field public static final p:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lw;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:Lgn1;

.field public final l:Lc81;

.field public final m:Ltx2;

.field public final n:Lhc1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lqh1;->o:[I

    .line 5
    .line 6
    invoke-static {}, Lmy2;->j()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILw;Z[IIILgn1;Lc81;Ltx2;Lfg0;Lhc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqh1;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lqh1;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lqh1;->c:I

    .line 9
    .line 10
    iput p4, p0, Lqh1;->d:I

    .line 11
    .line 12
    instance-of p1, p5, Lsq0;

    .line 13
    .line 14
    iput-boolean p1, p0, Lqh1;->f:Z

    .line 15
    .line 16
    iput-boolean p6, p0, Lqh1;->g:Z

    .line 17
    .line 18
    iput-object p7, p0, Lqh1;->h:[I

    .line 19
    .line 20
    iput p8, p0, Lqh1;->i:I

    .line 21
    .line 22
    iput p9, p0, Lqh1;->j:I

    .line 23
    .line 24
    iput-object p10, p0, Lqh1;->k:Lgn1;

    .line 25
    .line 26
    iput-object p11, p0, Lqh1;->l:Lc81;

    .line 27
    .line 28
    iput-object p12, p0, Lqh1;->m:Ltx2;

    .line 29
    .line 30
    iput-object p5, p0, Lqh1;->e:Lw;

    .line 31
    .line 32
    iput-object p14, p0, Lqh1;->n:Lhc1;

    .line 33
    .line 34
    return-void
.end method

.method public static A(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;
    .locals 1

    .line 1
    instance-of v0, p0, Ls02;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static/range {p0 .. p5}, Lqh1;->B(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static B(Ls02;Lgn1;Lc81;Ltx2;Lfg0;Lhc1;)Lqh1;
    .locals 34

    move-object/from16 v0, p0

    .line 1
    iget v1, v0, Ls02;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    move v10, v3

    goto :goto_0

    :cond_0
    move v10, v2

    .line 2
    :goto_0
    iget-object v1, v0, Ls02;->b:Ljava/lang/String;

    .line 3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    .line 4
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v6, 0xd800

    if-lt v5, v6, :cond_1

    move v5, v2

    :goto_1
    add-int/lit8 v7, v5, 0x1

    .line 5
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_1
    move v7, v2

    :cond_2
    add-int/lit8 v5, v7, 0x1

    .line 6
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xd

    if-lt v7, v6, :cond_4

    and-int/lit16 v7, v7, 0x1fff

    move v9, v8

    :goto_2
    add-int/lit8 v11, v5, 0x1

    .line 7
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_3

    and-int/lit16 v5, v5, 0x1fff

    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    add-int/lit8 v9, v9, 0xd

    move v5, v11

    goto :goto_2

    :cond_3
    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    move v5, v11

    :cond_4
    if-nez v7, :cond_5

    .line 8
    sget-object v7, Lqh1;->o:[I

    move/from16 v17, v2

    move v2, v3

    move v12, v2

    move v13, v12

    move v14, v13

    move v15, v14

    move-object v11, v7

    move v9, v8

    move v7, v15

    move v8, v7

    goto/16 :goto_c

    :cond_5
    add-int/lit8 v7, v5, 0x1

    .line 9
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_7

    and-int/lit16 v5, v5, 0x1fff

    move v9, v8

    :goto_3
    add-int/lit8 v11, v7, 0x1

    .line 10
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_6

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v11

    goto :goto_3

    :cond_6
    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    move v7, v11

    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 11
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_9

    and-int/lit16 v7, v7, 0x1fff

    move v11, v8

    :goto_4
    add-int/lit8 v12, v9, 0x1

    .line 12
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_8

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_4

    :cond_8
    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    move v9, v12

    :cond_9
    add-int/lit8 v11, v9, 0x1

    .line 13
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_b

    and-int/lit16 v9, v9, 0x1fff

    move v12, v8

    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 14
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_a

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_a
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_b
    add-int/lit8 v12, v11, 0x1

    .line 15
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    move v13, v8

    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 16
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_c

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_c
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_d
    add-int/lit8 v13, v12, 0x1

    .line 17
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    move v14, v8

    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 18
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_e

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_e
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_f
    add-int/lit8 v14, v13, 0x1

    .line 19
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    move v15, v8

    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 20
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_10

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_10
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_11
    add-int/lit8 v15, v14, 0x1

    .line 21
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    move/from16 v16, v8

    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 22
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_12

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_12
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_13
    add-int/lit8 v16, v15, 0x1

    .line 23
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_15

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v17, v2

    move/from16 v2, v16

    move/from16 v16, v8

    :goto_a
    add-int/lit8 v18, v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v6, :cond_14

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v16

    or-int/2addr v15, v2

    add-int/lit8 v16, v16, 0xd

    move/from16 v2, v18

    goto :goto_a

    :cond_14
    shl-int v2, v2, v16

    or-int/2addr v15, v2

    move/from16 v16, v18

    goto :goto_b

    :cond_15
    move/from16 v17, v2

    :goto_b
    add-int v2, v15, v13

    add-int/2addr v2, v14

    .line 25
    new-array v2, v2, [I

    mul-int/lit8 v14, v5, 0x2

    add-int/2addr v14, v7

    move v7, v9

    move v9, v8

    move v8, v11

    move-object v11, v2

    move v2, v5

    move/from16 v5, v16

    .line 26
    :goto_c
    sget-object v3, Lqh1;->p:Lsun/misc/Unsafe;

    .line 27
    iget-object v9, v0, Ls02;->c:[Ljava/lang/Object;

    .line 28
    iget-object v6, v0, Ls02;->a:Lw;

    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move/from16 v20, v2

    mul-int/lit8 v2, v12, 0x3

    .line 30
    new-array v2, v2, [I

    mul-int/lit8 v12, v12, 0x2

    .line 31
    new-array v12, v12, [Ljava/lang/Object;

    add-int/2addr v13, v15

    move/from16 v24, v13

    move/from16 v23, v15

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_d
    if-ge v5, v4, :cond_32

    add-int/lit8 v25, v5, 0x1

    .line 32
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move-object/from16 v26, v2

    const v2, 0xd800

    if-lt v5, v2, :cond_17

    and-int/lit16 v5, v5, 0x1fff

    move/from16 v2, v25

    const/16 v25, 0xd

    :goto_e
    add-int/lit8 v27, v2, 0x1

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v28, v4

    const v4, 0xd800

    if-lt v2, v4, :cond_16

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v25

    or-int/2addr v5, v2

    add-int/lit8 v25, v25, 0xd

    move/from16 v2, v27

    move/from16 v4, v28

    goto :goto_e

    :cond_16
    shl-int v2, v2, v25

    or-int/2addr v5, v2

    move/from16 v2, v27

    goto :goto_f

    :cond_17
    move/from16 v28, v4

    move/from16 v2, v25

    :goto_f
    add-int/lit8 v4, v2, 0x1

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v25, v4

    const v4, 0xd800

    if-lt v2, v4, :cond_19

    and-int/lit16 v2, v2, 0x1fff

    move/from16 v4, v25

    const/16 v25, 0xd

    :goto_10
    add-int/lit8 v27, v4, 0x1

    .line 35
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v29, v2

    const v2, 0xd800

    if-lt v4, v2, :cond_18

    and-int/lit16 v2, v4, 0x1fff

    shl-int v2, v2, v25

    or-int v2, v29, v2

    add-int/lit8 v25, v25, 0xd

    move/from16 v4, v27

    goto :goto_10

    :cond_18
    shl-int v2, v4, v25

    or-int v2, v29, v2

    move/from16 v4, v27

    goto :goto_11

    :cond_19
    move/from16 v4, v25

    :goto_11
    move/from16 v25, v5

    and-int/lit16 v5, v2, 0xff

    move/from16 v27, v7

    and-int/lit16 v7, v2, 0x400

    if-eqz v7, :cond_1a

    add-int/lit8 v7, v21, 0x1

    .line 36
    aput v22, v11, v21

    move/from16 v21, v7

    :cond_1a
    const/16 v7, 0x33

    move/from16 v31, v8

    if-lt v5, v7, :cond_22

    add-int/lit8 v7, v4, 0x1

    .line 37
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v8, 0xd800

    if-lt v4, v8, :cond_1c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v32, 0xd

    :goto_12
    add-int/lit8 v33, v7, 0x1

    .line 38
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v8, :cond_1b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v32

    or-int/2addr v4, v7

    add-int/lit8 v32, v32, 0xd

    move/from16 v7, v33

    const v8, 0xd800

    goto :goto_12

    :cond_1b
    shl-int v7, v7, v32

    or-int/2addr v4, v7

    move/from16 v7, v33

    :cond_1c
    add-int/lit8 v8, v5, -0x33

    move/from16 v32, v4

    const/16 v4, 0x9

    if-eq v8, v4, :cond_1e

    const/16 v4, 0x11

    if-ne v8, v4, :cond_1d

    goto :goto_14

    :cond_1d
    const/16 v4, 0xc

    if-ne v8, v4, :cond_1f

    if-nez v10, :cond_1f

    .line 39
    div-int/lit8 v4, v22, 0x3

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v8, v14, 0x1

    aget-object v14, v9, v14

    aput-object v14, v12, v4

    :goto_13
    move v14, v8

    goto :goto_15

    .line 40
    :cond_1e
    :goto_14
    div-int/lit8 v4, v22, 0x3

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v8, v14, 0x1

    aget-object v14, v9, v14

    aput-object v14, v12, v4

    goto :goto_13

    :cond_1f
    :goto_15
    mul-int/lit8 v4, v32, 0x2

    .line 41
    aget-object v8, v9, v4

    move/from16 v29, v4

    .line 42
    instance-of v4, v8, Ljava/lang/reflect/Field;

    if-eqz v4, :cond_20

    .line 43
    check-cast v8, Ljava/lang/reflect/Field;

    :goto_16
    move v4, v7

    goto :goto_17

    .line 44
    :cond_20
    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, Lqh1;->N(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    .line 45
    aput-object v8, v9, v29

    goto :goto_16

    .line 46
    :goto_17
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    add-int/lit8 v8, v29, 0x1

    move/from16 v29, v4

    .line 47
    aget-object v4, v9, v8

    move/from16 v30, v7

    .line 48
    instance-of v7, v4, Ljava/lang/reflect/Field;

    if-eqz v7, :cond_21

    .line 49
    check-cast v4, Ljava/lang/reflect/Field;

    goto :goto_18

    .line 50
    :cond_21
    check-cast v4, Ljava/lang/String;

    invoke-static {v6, v4}, Lqh1;->N(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 51
    aput-object v4, v9, v8

    .line 52
    :goto_18
    invoke-virtual {v3, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v4, v7

    move/from16 v7, v30

    move/from16 v30, v29

    move/from16 v29, v7

    move v7, v4

    const/4 v4, 0x0

    goto/16 :goto_22

    :cond_22
    add-int/lit8 v7, v14, 0x1

    .line 53
    aget-object v8, v9, v14

    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, Lqh1;->N(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    move/from16 v32, v7

    const/16 v7, 0x9

    if-eq v5, v7, :cond_29

    const/16 v7, 0x11

    if-ne v5, v7, :cond_23

    goto :goto_1c

    :cond_23
    const/16 v7, 0x1b

    if-eq v5, v7, :cond_28

    const/16 v7, 0x31

    if-ne v5, v7, :cond_24

    goto :goto_1b

    :cond_24
    const/16 v7, 0xc

    if-eq v5, v7, :cond_27

    const/16 v7, 0x1e

    if-eq v5, v7, :cond_27

    const/16 v7, 0x2c

    if-ne v5, v7, :cond_25

    goto :goto_1a

    :cond_25
    const/16 v7, 0x32

    if-ne v5, v7, :cond_2a

    add-int/lit8 v7, v23, 0x1

    .line 54
    aput v22, v11, v23

    .line 55
    div-int/lit8 v23, v22, 0x3

    mul-int/lit8 v23, v23, 0x2

    add-int/lit8 v29, v14, 0x2

    aget-object v30, v9, v32

    aput-object v30, v12, v23

    move/from16 v30, v7

    and-int/lit16 v7, v2, 0x800

    if-eqz v7, :cond_26

    add-int/lit8 v23, v23, 0x1

    add-int/lit8 v7, v14, 0x3

    .line 56
    aget-object v14, v9, v29

    aput-object v14, v12, v23

    move v14, v7

    :goto_19
    move/from16 v23, v30

    goto :goto_1d

    :cond_26
    move/from16 v14, v29

    goto :goto_19

    :cond_27
    :goto_1a
    if-nez v10, :cond_2a

    .line 57
    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v29, v9, v32

    aput-object v29, v12, v7

    goto :goto_1d

    .line 58
    :cond_28
    :goto_1b
    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v29, v9, v32

    aput-object v29, v12, v7

    goto :goto_1d

    .line 59
    :cond_29
    :goto_1c
    div-int/lit8 v7, v22, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    aput-object v14, v12, v7

    :cond_2a
    move/from16 v14, v32

    .line 60
    :goto_1d
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    and-int/lit16 v8, v2, 0x1000

    move/from16 v29, v7

    const/16 v7, 0x1000

    if-ne v8, v7, :cond_2e

    const/16 v7, 0x11

    if-gt v5, v7, :cond_2e

    add-int/lit8 v7, v4, 0x1

    .line 61
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v8, 0xd800

    if-lt v4, v8, :cond_2c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v19, 0xd

    :goto_1e
    add-int/lit8 v30, v7, 0x1

    .line 62
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v8, :cond_2b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v19

    or-int/2addr v4, v7

    add-int/lit8 v19, v19, 0xd

    move/from16 v7, v30

    goto :goto_1e

    :cond_2b
    shl-int v7, v7, v19

    or-int/2addr v4, v7

    goto :goto_1f

    :cond_2c
    move/from16 v30, v7

    :goto_1f
    mul-int/lit8 v7, v20, 0x2

    .line 63
    div-int/lit8 v19, v4, 0x20

    add-int v19, v19, v7

    .line 64
    aget-object v7, v9, v19

    .line 65
    instance-of v8, v7, Ljava/lang/reflect/Field;

    if-eqz v8, :cond_2d

    .line 66
    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_20

    .line 67
    :cond_2d
    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v7}, Lqh1;->N(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 68
    aput-object v7, v9, v19

    .line 69
    :goto_20
    invoke-virtual {v3, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    .line 70
    rem-int/lit8 v4, v4, 0x20

    goto :goto_21

    :cond_2e
    const v7, 0xfffff

    move/from16 v30, v4

    const/4 v4, 0x0

    :goto_21
    const/16 v8, 0x12

    if-lt v5, v8, :cond_2f

    const/16 v8, 0x31

    if-gt v5, v8, :cond_2f

    add-int/lit8 v8, v24, 0x1

    .line 71
    aput v29, v11, v24

    move/from16 v24, v8

    :cond_2f
    :goto_22
    add-int/lit8 v8, v22, 0x1

    .line 72
    aput v25, v26, v22

    add-int/lit8 v19, v22, 0x2

    move-object/from16 v25, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_30

    const/high16 v1, 0x20000000

    goto :goto_23

    :cond_30
    const/4 v1, 0x0

    :goto_23
    and-int/lit16 v2, v2, 0x100

    if-eqz v2, :cond_31

    const/high16 v2, 0x10000000

    goto :goto_24

    :cond_31
    const/4 v2, 0x0

    :goto_24
    or-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x14

    or-int/2addr v1, v2

    or-int v1, v1, v29

    .line 73
    aput v1, v26, v8

    add-int/lit8 v22, v22, 0x3

    shl-int/lit8 v1, v4, 0x14

    or-int/2addr v1, v7

    .line 74
    aput v1, v26, v19

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move/from16 v7, v27

    move/from16 v4, v28

    move/from16 v5, v30

    move/from16 v8, v31

    goto/16 :goto_d

    :cond_32
    move-object/from16 v26, v2

    move/from16 v27, v7

    move/from16 v31, v8

    .line 75
    new-instance v4, Lqh1;

    .line 76
    iget-object v9, v0, Ls02;->a:Lw;

    move-object/from16 v14, p1

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    move-object v6, v12

    move v12, v15

    move-object/from16 v5, v26

    move-object/from16 v15, p2

    .line 77
    invoke-direct/range {v4 .. v18}, Lqh1;-><init>([I[Ljava/lang/Object;IILw;Z[IIILgn1;Lc81;Ltx2;Lfg0;Lhc1;)V

    return-object v4
.end method

.method public static C(I)J
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    int-to-long v0, p0

    .line 6
    return-wide v0
.end method

.method public static D(Ljava/lang/Object;J)I
    .locals 1

    .line 1
    sget-object v0, Lmy2;->c:Lky2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static E(Ljava/lang/Object;J)J
    .locals 1

    .line 1
    sget-object v0, Lmy2;->c:Lky2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static N(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v1, "Field "

    .line 31
    .line 32
    const-string v2, " for "

    .line 33
    .line 34
    invoke-static {v1, p1, v2}, Len;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, " not found. Known fields are "

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p1, p0}, Lio/sentry/u2;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public static T(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    ushr-int/lit8 p0, p0, 0x14

    .line 5
    .line 6
    return p0
.end method

.method public static W(ILjava/lang/Object;Ld52;)V
    .locals 5

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p2, p2, Ld52;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Ljw;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p2, p0, v0}, Ljw;->r(II)V

    .line 13
    .line 14
    .line 15
    iget p0, p2, Ljw;->c:I

    .line 16
    .line 17
    iget-object v0, p2, Ljw;->b:[B

    .line 18
    .line 19
    iget v1, p2, Ljw;->d:I

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    mul-int/lit8 v2, v2, 0x3

    .line 26
    .line 27
    invoke-static {v2}, Ljw;->i(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v3}, Ljw;->i(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ne v3, v2, :cond_0

    .line 40
    .line 41
    add-int v2, v1, v3

    .line 42
    .line 43
    iput v2, p2, Ljw;->d:I

    .line 44
    .line 45
    sub-int/2addr p0, v2

    .line 46
    sget-object v4, Lm13;->a:Li13;

    .line 47
    .line 48
    invoke-virtual {v4, p1, v0, v2, p0}, Li13;->o(Ljava/lang/String;[BII)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    iput v1, p2, Ljw;->d:I

    .line 53
    .line 54
    sub-int v0, p0, v1

    .line 55
    .line 56
    sub-int/2addr v0, v3

    .line 57
    invoke-virtual {p2, v0}, Ljw;->s(I)V

    .line 58
    .line 59
    .line 60
    iput p0, p2, Ljw;->d:I

    .line 61
    .line 62
    return-void

    .line 63
    :catch_0
    move-exception p0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {p1}, Lm13;->b(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p2, v2}, Ljw;->s(I)V

    .line 70
    .line 71
    .line 72
    iget v2, p2, Ljw;->d:I

    .line 73
    .line 74
    sub-int/2addr p0, v2

    .line 75
    sget-object v3, Lm13;->a:Li13;

    .line 76
    .line 77
    invoke-virtual {v3, p1, v0, v2, p0}, Li13;->o(Ljava/lang/String;[BII)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    iput p0, p2, Ljw;->d:I
    :try_end_0
    .catch Lk13; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    .line 83
    return-void

    .line 84
    :catch_1
    move-exception p0

    .line 85
    new-instance p1, Lkw;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Lkw;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :goto_0
    iput v1, p2, Ljw;->d:I

    .line 92
    .line 93
    sget-object v0, Ljw;->e:Ljava/util/logging/Logger;

    .line 94
    .line 95
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 96
    .line 97
    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lez0;->a:Ljava/nio/charset/Charset;

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :try_start_1
    array-length p1, p0

    .line 109
    invoke-virtual {p2, p1}, Ljw;->s(I)V

    .line 110
    .line 111
    .line 112
    array-length p1, p0

    .line 113
    const/4 v0, 0x0

    .line 114
    invoke-virtual {p2, p0, v0, p1}, Ljw;->l([BII)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :catch_2
    move-exception p0

    .line 119
    new-instance p1, Lkw;

    .line 120
    .line 121
    invoke-direct {p1, p0}, Lkw;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_1
    check-cast p1, Lvl;

    .line 126
    .line 127
    invoke-virtual {p2, p0, p1}, Ld52;->I(ILvl;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public static k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "Mutating immutable message: "

    .line 9
    .line 10
    invoke-static {p0, v0}, Ls80;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lsq0;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lsq0;

    .line 10
    .line 11
    invoke-virtual {p0}, Lsq0;->n()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static u(Lsq0;J)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lmy2;->c:Lky2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final F(Ljava/lang/Object;IJ)V
    .locals 2

    .line 1
    sget-object v0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lqh1;->n(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p1, p3, p4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Lqh1;->n:Lhc1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-object p0, v1

    .line 17
    check-cast p0, Lfc1;

    .line 18
    .line 19
    iget-boolean p0, p0, Lfc1;->a:Z

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lfc1;->b:Lfc1;

    .line 24
    .line 25
    invoke-virtual {p0}, Lfc1;->c()Lfc1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, v1}, Lhc1;->b(Ljava/lang/Object;Ljava/lang/Object;)Lfc1;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p3, p4, p0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {p2}, Lpm2;->m(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method public final G(Ljava/lang/Object;[BIIIIIIIJILbd;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v9, p6

    .line 6
    .line 7
    move/from16 v2, p7

    .line 8
    .line 9
    move-wide/from16 v3, p10

    .line 10
    .line 11
    move/from16 v10, p12

    .line 12
    .line 13
    sget-object v5, Lqh1;->p:Lsun/misc/Unsafe;

    .line 14
    .line 15
    add-int/lit8 v6, v10, 0x2

    .line 16
    .line 17
    iget-object v7, v0, Lqh1;->a:[I

    .line 18
    .line 19
    aget v6, v7, v6

    .line 20
    .line 21
    const v7, 0xfffff

    .line 22
    .line 23
    .line 24
    and-int/2addr v6, v7

    .line 25
    int-to-long v6, v6

    .line 26
    const/4 v8, 0x5

    .line 27
    const/4 v11, 0x1

    .line 28
    const/4 v12, 0x2

    .line 29
    packed-switch p9, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    :cond_0
    move/from16 v0, p3

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :pswitch_0
    const/4 v3, 0x3

    .line 37
    if-ne v2, v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0, v9, v1, v10}, Lqh1;->z(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    and-int/lit8 v2, p5, -0x8

    .line 44
    .line 45
    or-int/lit8 v7, v2, 0x4

    .line 46
    .line 47
    invoke-virtual {v0, v10}, Lqh1;->o(I)Lh72;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lqh1;

    .line 52
    .line 53
    move-object/from16 v4, p2

    .line 54
    .line 55
    move/from16 v5, p3

    .line 56
    .line 57
    move/from16 v6, p4

    .line 58
    .line 59
    move-object/from16 v8, p13

    .line 60
    .line 61
    invoke-virtual/range {v2 .. v8}, Lqh1;->H(Ljava/lang/Object;[BIIILbd;)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iput-object v3, v8, Lbd;->c:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v9, v10, v3}, Lqh1;->S(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return v2

    .line 71
    :pswitch_1
    move-object/from16 v13, p2

    .line 72
    .line 73
    move/from16 v11, p3

    .line 74
    .line 75
    move-object/from16 v8, p13

    .line 76
    .line 77
    if-nez v2, :cond_1

    .line 78
    .line 79
    invoke-static {v13, v11, v8}, Lk50;->p([BILbd;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-wide v10, v8, Lbd;->b:J

    .line 84
    .line 85
    invoke-static {v10, v11}, Lhw;->e(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v10

    .line 89
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 97
    .line 98
    .line 99
    return v0

    .line 100
    :cond_1
    move v0, v11

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :pswitch_2
    move-object/from16 v13, p2

    .line 104
    .line 105
    move/from16 v11, p3

    .line 106
    .line 107
    move-object/from16 v8, p13

    .line 108
    .line 109
    if-nez v2, :cond_1

    .line 110
    .line 111
    invoke-static {v13, v11, v8}, Lk50;->n([BILbd;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget v2, v8, Lbd;->a:I

    .line 116
    .line 117
    invoke-static {v2}, Lhw;->d(I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 129
    .line 130
    .line 131
    return v0

    .line 132
    :pswitch_3
    move-object/from16 v13, p2

    .line 133
    .line 134
    move/from16 v11, p3

    .line 135
    .line 136
    move-object/from16 v8, p13

    .line 137
    .line 138
    if-nez v2, :cond_1

    .line 139
    .line 140
    invoke-static {v13, v11, v8}, Lk50;->n([BILbd;)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iget v8, v8, Lbd;->a:I

    .line 145
    .line 146
    invoke-virtual {v0, v10}, Lqh1;->m(I)V

    .line 147
    .line 148
    .line 149
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v5, v1, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 157
    .line 158
    .line 159
    return v2

    .line 160
    :pswitch_4
    move-object/from16 v13, p2

    .line 161
    .line 162
    move/from16 v11, p3

    .line 163
    .line 164
    move-object/from16 v8, p13

    .line 165
    .line 166
    if-ne v2, v12, :cond_1

    .line 167
    .line 168
    invoke-static {v13, v11, v8}, Lk50;->f([BILbd;)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iget-object v2, v8, Lbd;->c:Ljava/lang/Object;

    .line 173
    .line 174
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 178
    .line 179
    .line 180
    return v0

    .line 181
    :pswitch_5
    move-object/from16 v13, p2

    .line 182
    .line 183
    move/from16 v11, p3

    .line 184
    .line 185
    move-object/from16 v8, p13

    .line 186
    .line 187
    if-ne v2, v12, :cond_1

    .line 188
    .line 189
    invoke-virtual {v0, v9, v1, v10}, Lqh1;->z(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v0, v10}, Lqh1;->o(I)Lh72;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    move/from16 v6, p4

    .line 198
    .line 199
    move-object v7, v8

    .line 200
    move v5, v11

    .line 201
    move-object v4, v13

    .line 202
    invoke-static/range {v2 .. v7}, Lk50;->B(Ljava/lang/Object;Lh72;[BIILbd;)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v0, v1, v9, v10, v2}, Lqh1;->S(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return v3

    .line 210
    :pswitch_6
    move-object/from16 v13, p2

    .line 211
    .line 212
    move/from16 v0, p3

    .line 213
    .line 214
    move-object/from16 v8, p13

    .line 215
    .line 216
    if-ne v2, v12, :cond_6

    .line 217
    .line 218
    invoke-static {v13, v0, v8}, Lk50;->n([BILbd;)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iget v2, v8, Lbd;->a:I

    .line 223
    .line 224
    if-nez v2, :cond_2

    .line 225
    .line 226
    const-string v2, ""

    .line 227
    .line 228
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_2
    const/high16 v8, 0x20000000

    .line 233
    .line 234
    and-int v8, p8, v8

    .line 235
    .line 236
    if-eqz v8, :cond_4

    .line 237
    .line 238
    add-int v8, v0, v2

    .line 239
    .line 240
    sget-object v10, Lm13;->a:Li13;

    .line 241
    .line 242
    invoke-virtual {v10, v13, v0, v8}, Li13;->t([BII)Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    if-eqz v8, :cond_3

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_3
    invoke-static {}, Lpz0;->b()Lpz0;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    throw v0

    .line 254
    :cond_4
    :goto_0
    new-instance v8, Ljava/lang/String;

    .line 255
    .line 256
    sget-object v10, Lez0;->a:Ljava/nio/charset/Charset;

    .line 257
    .line 258
    invoke-direct {v8, v13, v0, v2, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v1, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    add-int/2addr v0, v2

    .line 265
    :goto_1
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 266
    .line 267
    .line 268
    return v0

    .line 269
    :pswitch_7
    move-object/from16 v13, p2

    .line 270
    .line 271
    move/from16 v0, p3

    .line 272
    .line 273
    move-object/from16 v8, p13

    .line 274
    .line 275
    if-nez v2, :cond_6

    .line 276
    .line 277
    invoke-static {v13, v0, v8}, Lk50;->p([BILbd;)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    iget-wide v12, v8, Lbd;->b:J

    .line 282
    .line 283
    const-wide/16 v14, 0x0

    .line 284
    .line 285
    cmp-long v2, v12, v14

    .line 286
    .line 287
    if-eqz v2, :cond_5

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_5
    const/4 v11, 0x0

    .line 291
    :goto_2
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 299
    .line 300
    .line 301
    return v0

    .line 302
    :pswitch_8
    move-object/from16 v13, p2

    .line 303
    .line 304
    move/from16 v0, p3

    .line 305
    .line 306
    if-ne v2, v8, :cond_6

    .line 307
    .line 308
    invoke-static/range {p2 .. p3}, Lk50;->g([BI)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    add-int/lit8 v0, v0, 0x4

    .line 320
    .line 321
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 322
    .line 323
    .line 324
    return v0

    .line 325
    :pswitch_9
    move-object/from16 v13, p2

    .line 326
    .line 327
    move/from16 v0, p3

    .line 328
    .line 329
    if-ne v2, v11, :cond_6

    .line 330
    .line 331
    invoke-static/range {p2 .. p3}, Lk50;->h([BI)J

    .line 332
    .line 333
    .line 334
    move-result-wide v10

    .line 335
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    add-int/lit8 v0, v0, 0x8

    .line 343
    .line 344
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 345
    .line 346
    .line 347
    return v0

    .line 348
    :pswitch_a
    move-object/from16 v13, p2

    .line 349
    .line 350
    move/from16 v0, p3

    .line 351
    .line 352
    move-object/from16 v8, p13

    .line 353
    .line 354
    if-nez v2, :cond_6

    .line 355
    .line 356
    invoke-static {v13, v0, v8}, Lk50;->n([BILbd;)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iget v2, v8, Lbd;->a:I

    .line 361
    .line 362
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 370
    .line 371
    .line 372
    return v0

    .line 373
    :pswitch_b
    move-object/from16 v13, p2

    .line 374
    .line 375
    move/from16 v0, p3

    .line 376
    .line 377
    move-object/from16 v8, p13

    .line 378
    .line 379
    if-nez v2, :cond_6

    .line 380
    .line 381
    invoke-static {v13, v0, v8}, Lk50;->p([BILbd;)I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    iget-wide v10, v8, Lbd;->b:J

    .line 386
    .line 387
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 395
    .line 396
    .line 397
    return v0

    .line 398
    :pswitch_c
    move-object/from16 v13, p2

    .line 399
    .line 400
    move/from16 v0, p3

    .line 401
    .line 402
    if-ne v2, v8, :cond_6

    .line 403
    .line 404
    invoke-static/range {p2 .. p3}, Lk50;->g([BI)I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    add-int/lit8 v0, v0, 0x4

    .line 420
    .line 421
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 422
    .line 423
    .line 424
    return v0

    .line 425
    :pswitch_d
    move-object/from16 v13, p2

    .line 426
    .line 427
    move/from16 v0, p3

    .line 428
    .line 429
    if-ne v2, v11, :cond_6

    .line 430
    .line 431
    invoke-static/range {p2 .. p3}, Lk50;->h([BI)J

    .line 432
    .line 433
    .line 434
    move-result-wide v10

    .line 435
    invoke-static {v10, v11}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 436
    .line 437
    .line 438
    move-result-wide v10

    .line 439
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v5, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    add-int/lit8 v0, v0, 0x8

    .line 447
    .line 448
    invoke-virtual {v5, v1, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 449
    .line 450
    .line 451
    :cond_6
    :goto_3
    return v0

    .line 452
    nop

    .line 453
    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(Ljava/lang/Object;[BIIILbd;)I
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v14, p5

    move-object/from16 v13, p6

    .line 1
    invoke-static {v2}, Lqh1;->k(Ljava/lang/Object;)V

    .line 2
    sget-object v1, Lqh1;->p:Lsun/misc/Unsafe;

    move/from16 v5, p3

    const/4 v6, -0x1

    const/4 v7, 0x0

    const v8, 0xfffff

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_0
    const v16, 0xfffff

    :goto_1
    if-ge v5, v4, :cond_1d

    add-int/lit8 v12, v5, 0x1

    .line 3
    aget-byte v5, v3, v5

    if-gez v5, :cond_0

    .line 4
    invoke-static {v5, v3, v12, v13}, Lk50;->m(I[BILbd;)I

    move-result v12

    .line 5
    iget v5, v13, Lbd;->a:I

    :cond_0
    move/from16 v26, v12

    move v12, v5

    move/from16 v5, v26

    const/16 p3, 0x0

    ushr-int/lit8 v15, v12, 0x3

    and-int/lit8 v11, v12, 0x7

    .line 6
    iget v10, v0, Lqh1;->d:I

    const/16 v19, 0x3

    iget v3, v0, Lqh1;->c:I

    if-le v15, v6, :cond_2

    .line 7
    div-int/lit8 v7, v7, 0x3

    if-lt v15, v3, :cond_1

    if-gt v15, v10, :cond_1

    .line 8
    invoke-virtual {v0, v15, v7}, Lqh1;->Q(II)I

    move-result v3

    goto :goto_2

    :cond_1
    const/4 v3, -0x1

    :goto_2
    const/4 v10, 0x0

    :goto_3
    const/4 v6, -0x1

    goto :goto_4

    :cond_2
    if-lt v15, v3, :cond_3

    if-gt v15, v10, :cond_3

    const/4 v10, 0x0

    .line 9
    invoke-virtual {v0, v15, v10}, Lqh1;->Q(II)I

    move-result v3

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    const/4 v3, -0x1

    goto :goto_3

    :goto_4
    if-ne v3, v6, :cond_4

    move/from16 v20, v6

    move v7, v10

    move/from16 v19, v7

    move/from16 v18, v15

    move-object v6, v0

    move-object v15, v1

    move-object v10, v2

    move v2, v12

    goto/16 :goto_16

    :cond_4
    add-int/lit8 v7, v3, 0x1

    .line 10
    iget-object v6, v0, Lqh1;->a:[I

    aget v7, v6, v7

    move/from16 v18, v10

    .line 11
    invoke-static {v7}, Lqh1;->T(I)I

    move-result v10

    and-int v4, v7, v16

    move/from16 v20, v5

    int-to-long v4, v4

    move-wide/from16 v21, v4

    const/16 v4, 0x11

    if-gt v10, v4, :cond_11

    add-int/lit8 v4, v3, 0x2

    .line 12
    aget v4, v6, v4

    ushr-int/lit8 v6, v4, 0x14

    const/4 v5, 0x1

    shl-int v23, v5, v6

    and-int v4, v4, v16

    if-eq v4, v8, :cond_6

    move/from16 v6, v16

    if-eq v8, v6, :cond_5

    int-to-long v5, v8

    .line 13
    invoke-virtual {v1, v2, v5, v6, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v5, v4

    .line 14
    invoke-virtual {v1, v2, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v9

    move/from16 v24, v4

    :goto_5
    move/from16 v25, v9

    goto :goto_6

    :cond_6
    move/from16 v24, v8

    goto :goto_5

    :goto_6
    const/4 v4, 0x5

    packed-switch v10, :pswitch_data_0

    move-object/from16 v9, p2

    move-object v10, v1

    move-object v1, v2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    goto/16 :goto_12

    :pswitch_0
    move/from16 v4, v19

    if-ne v11, v4, :cond_7

    .line 15
    invoke-virtual {v0, v3, v2}, Lqh1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v5, v15, 0x3

    or-int/lit8 v8, v5, 0x4

    .line 16
    invoke-virtual {v0, v3}, Lqh1;->o(I)Lh72;

    move-result-object v5

    .line 17
    check-cast v5, Lqh1;

    move/from16 v7, p4

    move-object v9, v13

    move/from16 v6, v20

    const/16 v17, -0x1

    move v13, v3

    move-object v3, v5

    move-object/from16 v5, p2

    .line 18
    invoke-virtual/range {v3 .. v9}, Lqh1;->H(Ljava/lang/Object;[BIIILbd;)I

    move-result v3

    move-object v7, v5

    .line 19
    iput-object v4, v9, Lbd;->c:Ljava/lang/Object;

    .line 20
    invoke-virtual {v0, v13, v2, v4}, Lqh1;->R(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v4, v25, v23

    move v5, v3

    move-object v3, v7

    move v7, v13

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move-object v13, v9

    move v9, v4

    move/from16 v4, p4

    goto/16 :goto_1

    :cond_7
    move-object v9, v13

    const/16 v17, -0x1

    move v13, v3

    move-object v10, v1

    move-object v1, v2

    move-object v7, v9

    move/from16 v8, v20

    move-object/from16 v9, p2

    goto/16 :goto_12

    :pswitch_1
    move-object/from16 v7, p2

    move-object v9, v13

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_8

    .line 21
    invoke-static {v7, v3, v9}, Lk50;->p([BILbd;)I

    move-result v8

    .line 22
    iget-wide v3, v9, Lbd;->b:J

    .line 23
    invoke-static {v3, v4}, Lhw;->e(J)J

    move-result-wide v5

    move-wide/from16 v3, v21

    .line 24
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v10, v2

    or-int v2, v25, v23

    move/from16 v4, p4

    move-object v3, v7

    move v5, v8

    move v7, v13

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move-object v13, v9

    move v9, v2

    :goto_7
    move-object v2, v10

    goto/16 :goto_1

    :cond_8
    move-object v8, v9

    move-object v9, v7

    move-object v7, v8

    move-object v10, v1

    move-object v1, v2

    :goto_8
    move v8, v3

    goto/16 :goto_12

    :pswitch_2
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_9

    .line 25
    invoke-static {v7, v3, v9}, Lk50;->n([BILbd;)I

    move-result v2

    .line 26
    iget v3, v9, Lbd;->a:I

    .line 27
    invoke-static {v3}, Lhw;->d(I)I

    move-result v3

    .line 28
    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v7

    move v7, v13

    move-object v13, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v10

    :goto_a
    move v6, v15

    move/from16 v8, v24

    goto/16 :goto_0

    :cond_9
    move-object v8, v10

    move-object v10, v1

    move-object v1, v8

    move-object v8, v9

    move-object v9, v7

    move-object v7, v8

    goto :goto_8

    :pswitch_3
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_9

    .line 29
    invoke-static {v7, v3, v9}, Lk50;->n([BILbd;)I

    move-result v2

    .line 30
    iget v3, v9, Lbd;->a:I

    .line 31
    invoke-virtual {v0, v13}, Lqh1;->m(I)V

    .line 32
    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_9

    :pswitch_4
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_9

    .line 33
    invoke-static {v7, v3, v9}, Lk50;->f([BILbd;)I

    move-result v2

    .line 34
    iget-object v3, v9, Lbd;->c:Ljava/lang/Object;

    invoke-virtual {v1, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_5
    move-object/from16 v7, p2

    move-object v10, v2

    move-object v9, v13

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_a

    move-object v2, v1

    .line 35
    invoke-virtual {v0, v13, v10}, Lqh1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v2

    .line 36
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    move-result-object v2

    move/from16 v5, p4

    move-object v8, v4

    move-object v6, v9

    move v4, v3

    move-object v3, v7

    .line 37
    invoke-static/range {v1 .. v6}, Lk50;->B(Ljava/lang/Object;Lh72;[BIILbd;)I

    move-result v2

    move-object v9, v3

    move-object v3, v1

    move-object v1, v6

    .line 38
    invoke-virtual {v0, v13, v10, v3}, Lqh1;->R(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v10

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object v13, v1

    move-object v1, v8

    :goto_c
    move/from16 v8, v24

    goto/16 :goto_1

    :cond_a
    move-object v8, v1

    move-object v1, v9

    move-object v9, v7

    :cond_b
    move-object v7, v1

    move-object v1, v10

    move-object v10, v8

    goto/16 :goto_8

    :pswitch_6
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x2

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_b

    const/high16 v2, 0x20000000

    and-int/2addr v2, v7

    if-nez v2, :cond_c

    .line 39
    invoke-static {v9, v3, v1}, Lk50;->j([BILbd;)I

    move-result v2

    goto :goto_d

    .line 40
    :cond_c
    invoke-static {v9, v3, v1}, Lk50;->k([BILbd;)I

    move-result v2

    .line 41
    :goto_d
    iget-object v3, v1, Lbd;->c:Ljava/lang/Object;

    invoke-virtual {v8, v10, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_b

    :pswitch_7
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-nez v11, :cond_b

    .line 42
    invoke-static {v9, v3, v1}, Lk50;->p([BILbd;)I

    move-result v2

    .line 43
    iget-wide v3, v1, Lbd;->b:J

    const-wide/16 v19, 0x0

    cmp-long v3, v3, v19

    if-eqz v3, :cond_d

    const/4 v3, 0x1

    goto :goto_e

    :cond_d
    move/from16 v3, v18

    .line 44
    :goto_e
    sget-object v4, Lmy2;->c:Lky2;

    invoke-virtual {v4, v10, v5, v6, v3}, Lky2;->k(Ljava/lang/Object;JZ)V

    goto :goto_b

    :pswitch_8
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v4, :cond_b

    .line 45
    invoke-static {v9, v3}, Lk50;->g([BI)I

    move-result v2

    invoke-virtual {v8, v10, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v5, v3, 0x4

    or-int v2, v25, v23

    move/from16 v4, p4

    move-object v3, v9

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object v13, v1

    move v9, v2

    move-object v1, v8

    move-object v2, v10

    goto :goto_c

    :pswitch_9
    move-object/from16 v9, p2

    move-object v8, v1

    move-object v10, v2

    move-object v1, v13

    move-wide/from16 v5, v21

    const/4 v2, 0x1

    const/16 v17, -0x1

    move v13, v3

    move/from16 v3, v20

    if-ne v11, v2, :cond_e

    move-wide/from16 v21, v5

    .line 46
    invoke-static {v9, v3}, Lk50;->h([BI)J

    move-result-wide v5

    move-object v7, v1

    move-object v1, v8

    move-object v2, v10

    move v8, v3

    move-wide/from16 v3, v21

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v5, v8, 0x8

    :goto_f
    or-int v3, v25, v23

    move-object v4, v9

    move v9, v3

    move-object v3, v4

    move v4, v13

    move-object v13, v7

    move v7, v4

    move/from16 v4, p4

    goto/16 :goto_a

    :cond_e
    move-object v7, v1

    move-object v1, v8

    move v8, v3

    move-object/from16 v26, v10

    move-object v10, v1

    move-object/from16 v1, v26

    goto/16 :goto_12

    :pswitch_a
    move-object/from16 v9, p2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    move-wide/from16 v3, v21

    if-nez v11, :cond_f

    .line 47
    invoke-static {v9, v8, v7}, Lk50;->n([BILbd;)I

    move-result v5

    .line 48
    iget v6, v7, Lbd;->a:I

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_f

    :cond_f
    move-object v10, v1

    :cond_10
    move-object v1, v2

    goto/16 :goto_12

    :pswitch_b
    move-object/from16 v9, p2

    move-object v7, v13

    move/from16 v8, v20

    const/16 v17, -0x1

    move v13, v3

    move-wide/from16 v3, v21

    if-nez v11, :cond_f

    .line 49
    invoke-static {v9, v8, v7}, Lk50;->p([BILbd;)I

    move-result v8

    .line 50
    iget-wide v5, v7, Lbd;->b:J

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v10, v1

    or-int v1, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    move v5, v8

    :goto_10
    move-object v3, v9

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move v9, v1

    :goto_11
    move-object v1, v10

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v9, p2

    move-object v10, v1

    move-object v7, v13

    move/from16 v8, v20

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    move v13, v3

    if-ne v11, v4, :cond_10

    .line 51
    invoke-static {v9, v8}, Lk50;->g([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 52
    sget-object v3, Lmy2;->c:Lky2;

    invoke-virtual {v3, v2, v5, v6, v1}, Lky2;->n(Ljava/lang/Object;JF)V

    add-int/lit8 v5, v8, 0x4

    or-int v1, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    goto :goto_10

    :pswitch_d
    move-object/from16 v9, p2

    move-object v10, v1

    move-object v7, v13

    move/from16 v8, v20

    move-wide/from16 v5, v21

    const/4 v1, 0x1

    const/16 v17, -0x1

    move v13, v3

    if-ne v11, v1, :cond_10

    .line 53
    invoke-static {v9, v8}, Lk50;->h([BI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    .line 54
    sget-object v1, Lmy2;->c:Lky2;

    move-wide/from16 v26, v5

    move-wide v5, v3

    move-wide/from16 v3, v26

    invoke-virtual/range {v1 .. v6}, Lky2;->m(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v5, v8, 0x8

    or-int v2, v25, v23

    move v3, v13

    move-object v13, v7

    move v7, v3

    move/from16 v4, p4

    move-object v3, v9

    move v6, v15

    move/from16 v8, v24

    const v16, 0xfffff

    move v9, v2

    move-object v2, v1

    goto :goto_11

    :goto_12
    move-object v6, v0

    move v5, v8

    move v2, v12

    move v7, v13

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v8, v24

    move/from16 v9, v25

    move/from16 v18, v15

    move-object v15, v10

    move-object v10, v1

    goto/16 :goto_16

    :cond_11
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move v13, v3

    move/from16 v3, v20

    move-wide/from16 v5, v21

    const/16 v17, -0x1

    const/16 v4, 0x1b

    if-ne v10, v4, :cond_15

    const/4 v4, 0x2

    if-ne v11, v4, :cond_14

    .line 55
    invoke-virtual {v2, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcz0;

    .line 56
    move-object v7, v4

    check-cast v7, Ld0;

    .line 57
    iget-boolean v7, v7, Ld0;->a:Z

    if-nez v7, :cond_13

    .line 58
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_12

    const/16 v7, 0xa

    goto :goto_13

    :cond_12
    mul-int/lit8 v7, v7, 0x2

    .line 59
    :goto_13
    invoke-interface {v4, v7}, Lcz0;->x(I)Lcz0;

    move-result-object v4

    .line 60
    invoke-virtual {v2, v1, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_13
    move-object v6, v4

    .line 61
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    move-result-object v1

    move v4, v12

    move-object v12, v2

    move v2, v4

    move/from16 v5, p4

    move-object/from16 v7, p6

    move v4, v3

    move-object/from16 v3, p2

    .line 62
    invoke-static/range {v1 .. v7}, Lk50;->i(Lh72;I[BIILcz0;Lbd;)I

    move-result v1

    move/from16 v4, p4

    move v5, v1

    move-object v1, v12

    move v7, v13

    move v6, v15

    const v16, 0xfffff

    move-object/from16 v13, p6

    move v12, v2

    move-object/from16 v2, p1

    goto/16 :goto_1

    :cond_14
    move/from16 v26, v12

    move-object v12, v2

    move/from16 v2, v26

    move-object/from16 v1, p1

    move/from16 v24, v8

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v17, v9

    move/from16 v18, v15

    move-object v15, v12

    move v12, v13

    goto/16 :goto_14

    :cond_15
    move/from16 v26, v12

    move-object v12, v2

    move/from16 v2, v26

    const/16 v1, 0x31

    if-gt v10, v1, :cond_17

    move/from16 v24, v8

    move v1, v9

    int-to-long v8, v7

    move/from16 v4, p4

    move v7, v13

    move/from16 v20, v17

    move/from16 v19, v18

    move-object/from16 v13, p6

    move/from16 v17, v1

    move/from16 v18, v15

    move-object/from16 v1, p1

    move-object v15, v12

    move/from16 v26, v2

    move-object/from16 v2, p2

    move-wide/from16 v27, v5

    move/from16 v5, v26

    move v6, v11

    move-wide/from16 v11, v27

    .line 63
    invoke-virtual/range {v0 .. v13}, Lqh1;->J(Ljava/lang/Object;[BIIIIIJIJLbd;)I

    move-result v6

    move v2, v5

    move v12, v7

    if-eq v6, v3, :cond_16

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v5, v6

    move v7, v12

    move/from16 v9, v17

    move/from16 v6, v18

    move/from16 v8, v24

    const v16, 0xfffff

    move v12, v2

    move-object v2, v1

    move-object v1, v15

    goto/16 :goto_1

    :cond_16
    move-object v10, v1

    move v5, v6

    move v7, v12

    move/from16 v9, v17

    move/from16 v8, v24

    move-object v6, v0

    goto/16 :goto_16

    :cond_17
    move-object/from16 v1, p1

    move/from16 v24, v8

    move/from16 v20, v17

    move/from16 v19, v18

    move/from16 v17, v9

    move v9, v10

    move/from16 v18, v15

    move-object v15, v12

    move v12, v13

    move-wide/from16 v26, v5

    move v6, v11

    move-wide/from16 v10, v26

    const/16 v4, 0x32

    if-ne v9, v4, :cond_19

    const/4 v4, 0x2

    if-eq v6, v4, :cond_18

    :goto_14
    move-object v6, v0

    move-object v10, v1

    move v5, v3

    :goto_15
    move v7, v12

    move/from16 v9, v17

    move/from16 v8, v24

    goto :goto_16

    .line 64
    :cond_18
    invoke-virtual {v0, v1, v12, v10, v11}, Lqh1;->F(Ljava/lang/Object;IJ)V

    throw p3

    :cond_19
    move/from16 v4, p4

    move-object/from16 v13, p6

    move v5, v2

    move v8, v7

    move-object/from16 v2, p2

    move v7, v6

    move/from16 v6, v18

    .line 65
    invoke-virtual/range {v0 .. v13}, Lqh1;->G(Ljava/lang/Object;[BIIIIIIIJILbd;)I

    move-result v7

    move-object v10, v1

    move v2, v5

    move-object v6, v0

    if-eq v7, v3, :cond_1a

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move-object v0, v6

    move v5, v7

    move v7, v12

    move-object v1, v15

    move/from16 v9, v17

    move/from16 v6, v18

    move/from16 v8, v24

    const v16, 0xfffff

    move v12, v2

    goto/16 :goto_7

    :cond_1a
    move v5, v7

    goto :goto_15

    :goto_16
    if-ne v2, v14, :cond_1b

    if-eqz v14, :cond_1b

    move/from16 v4, p4

    move v12, v2

    :goto_17
    const v0, 0xfffff

    goto :goto_18

    .line 66
    :cond_1b
    move-object v0, v10

    check-cast v0, Lsq0;

    iget-object v1, v0, Lsq0;->unknownFields:Lrx2;

    .line 67
    sget-object v3, Lrx2;->f:Lrx2;

    if-ne v1, v3, :cond_1c

    .line 68
    invoke-static {}, Lrx2;->c()Lrx2;

    move-result-object v1

    .line 69
    iput-object v1, v0, Lsq0;->unknownFields:Lrx2;

    :cond_1c
    move/from16 v3, p4

    move-object v4, v1

    move v0, v2

    move v2, v5

    move-object/from16 v1, p2

    move-object/from16 v5, p6

    .line 70
    invoke-static/range {v0 .. v5}, Lk50;->l(I[BIILrx2;Lbd;)I

    move-result v2

    move v5, v0

    move-object/from16 v13, p6

    move v4, v3

    move v12, v5

    move-object v0, v6

    move-object v1, v15

    move/from16 v6, v18

    const v16, 0xfffff

    move-object/from16 v3, p2

    move v5, v2

    goto/16 :goto_7

    :cond_1d
    move-object v6, v0

    move-object v15, v1

    move-object v10, v2

    move/from16 v24, v8

    move/from16 v17, v9

    const/16 p3, 0x0

    goto :goto_17

    :goto_18
    if-eq v8, v0, :cond_1e

    int-to-long v0, v8

    .line 71
    invoke-virtual {v15, v10, v0, v1, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 72
    :cond_1e
    iget v0, v6, Lqh1;->i:I

    :goto_19
    iget v1, v6, Lqh1;->j:I

    if-ge v0, v1, :cond_1f

    .line 73
    iget-object v1, v6, Lqh1;->h:[I

    aget v1, v1, v0

    move-object/from16 v2, p3

    .line 74
    invoke-virtual {v6, v1, v10, v2}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_1f
    if-nez v14, :cond_21

    if-ne v5, v4, :cond_20

    goto :goto_1a

    .line 75
    :cond_20
    invoke-static {}, Lpz0;->f()Lpz0;

    move-result-object v0

    throw v0

    :cond_21
    if-gt v5, v4, :cond_22

    if-ne v12, v14, :cond_22

    :goto_1a
    return v5

    .line 76
    :cond_22
    invoke-static {}, Lpz0;->f()Lpz0;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I(Ljava/lang/Object;[BIILbd;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    move-object/from16 v13, p5

    .line 10
    .line 11
    invoke-static {v2}, Lqh1;->k(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lqh1;->p:Lsun/misc/Unsafe;

    .line 15
    .line 16
    move/from16 v3, p3

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const v10, 0xfffff

    .line 21
    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    :goto_0
    if-ge v3, v8, :cond_1c

    .line 25
    .line 26
    add-int/lit8 v6, v3, 0x1

    .line 27
    .line 28
    aget-byte v3, v7, v3

    .line 29
    .line 30
    if-gez v3, :cond_0

    .line 31
    .line 32
    invoke-static {v3, v7, v6, v13}, Lk50;->m(I[BILbd;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget v3, v13, Lbd;->a:I

    .line 37
    .line 38
    :cond_0
    ushr-int/lit8 v12, v3, 0x3

    .line 39
    .line 40
    const v16, 0xfffff

    .line 41
    .line 42
    .line 43
    and-int/lit8 v14, v3, 0x7

    .line 44
    .line 45
    iget v9, v0, Lqh1;->d:I

    .line 46
    .line 47
    iget v15, v0, Lqh1;->c:I

    .line 48
    .line 49
    if-le v12, v4, :cond_2

    .line 50
    .line 51
    div-int/lit8 v5, v5, 0x3

    .line 52
    .line 53
    if-lt v12, v15, :cond_1

    .line 54
    .line 55
    if-gt v12, v9, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v12, v5}, Lqh1;->Q(II)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v4, -0x1

    .line 63
    :goto_1
    const/4 v15, 0x0

    .line 64
    :goto_2
    move v9, v4

    .line 65
    const/4 v4, -0x1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    if-lt v12, v15, :cond_3

    .line 68
    .line 69
    if-gt v12, v9, :cond_3

    .line 70
    .line 71
    const/4 v15, 0x0

    .line 72
    invoke-virtual {v0, v12, v15}, Lqh1;->Q(II)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const/4 v15, 0x0

    .line 78
    const/4 v4, -0x1

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    if-ne v9, v4, :cond_4

    .line 81
    .line 82
    move v5, v6

    .line 83
    move-object v6, v2

    .line 84
    move v2, v5

    .line 85
    move-object/from16 v22, v1

    .line 86
    .line 87
    move v5, v3

    .line 88
    move/from16 v18, v4

    .line 89
    .line 90
    move/from16 v17, v12

    .line 91
    .line 92
    move v12, v15

    .line 93
    goto/16 :goto_15

    .line 94
    .line 95
    :cond_4
    add-int/lit8 v5, v9, 0x1

    .line 96
    .line 97
    iget-object v4, v0, Lqh1;->a:[I

    .line 98
    .line 99
    aget v5, v4, v5

    .line 100
    .line 101
    invoke-static {v5}, Lqh1;->T(I)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    move/from16 p3, v3

    .line 106
    .line 107
    and-int v3, v5, v16

    .line 108
    .line 109
    move-object/from16 v18, v4

    .line 110
    .line 111
    int-to-long v3, v3

    .line 112
    move-wide/from16 v19, v3

    .line 113
    .line 114
    const/16 v3, 0x11

    .line 115
    .line 116
    if-gt v15, v3, :cond_11

    .line 117
    .line 118
    add-int/lit8 v3, v9, 0x2

    .line 119
    .line 120
    aget v3, v18, v3

    .line 121
    .line 122
    ushr-int/lit8 v18, v3, 0x14

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    shl-int v18, v4, v18

    .line 126
    .line 127
    and-int v3, v3, v16

    .line 128
    .line 129
    if-eq v3, v10, :cond_7

    .line 130
    .line 131
    move/from16 v4, v16

    .line 132
    .line 133
    move/from16 v21, v5

    .line 134
    .line 135
    if-eq v10, v4, :cond_5

    .line 136
    .line 137
    int-to-long v4, v10

    .line 138
    invoke-virtual {v1, v2, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 139
    .line 140
    .line 141
    const v4, 0xfffff

    .line 142
    .line 143
    .line 144
    :cond_5
    if-eq v3, v4, :cond_6

    .line 145
    .line 146
    int-to-long v4, v3

    .line 147
    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    :cond_6
    move v10, v3

    .line 152
    goto :goto_4

    .line 153
    :cond_7
    move/from16 v21, v5

    .line 154
    .line 155
    :goto_4
    const/4 v3, 0x5

    .line 156
    packed-switch v15, :pswitch_data_0

    .line 157
    .line 158
    .line 159
    move-object v15, v1

    .line 160
    move-object v1, v2

    .line 161
    move-object v8, v7

    .line 162
    const/16 v17, -0x1

    .line 163
    .line 164
    :goto_5
    move v7, v6

    .line 165
    goto/16 :goto_11

    .line 166
    .line 167
    :pswitch_0
    if-nez v14, :cond_8

    .line 168
    .line 169
    invoke-static {v7, v6, v13}, Lk50;->p([BILbd;)I

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    iget-wide v3, v13, Lbd;->b:J

    .line 174
    .line 175
    invoke-static {v3, v4}, Lhw;->e(J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    move-wide/from16 v3, v19

    .line 180
    .line 181
    const/16 v17, -0x1

    .line 182
    .line 183
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 184
    .line 185
    .line 186
    move-object v15, v2

    .line 187
    or-int v11, v11, v18

    .line 188
    .line 189
    move v5, v9

    .line 190
    move v4, v12

    .line 191
    move v3, v14

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_8
    const/16 v17, -0x1

    .line 195
    .line 196
    move-object v15, v1

    .line 197
    move-object v1, v2

    .line 198
    :goto_6
    move-object v8, v7

    .line 199
    goto :goto_5

    .line 200
    :pswitch_1
    move-object v15, v2

    .line 201
    move-wide/from16 v4, v19

    .line 202
    .line 203
    const/16 v17, -0x1

    .line 204
    .line 205
    if-nez v14, :cond_9

    .line 206
    .line 207
    invoke-static {v7, v6, v13}, Lk50;->n([BILbd;)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    iget v2, v13, Lbd;->a:I

    .line 212
    .line 213
    invoke-static {v2}, Lhw;->d(I)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 218
    .line 219
    .line 220
    :goto_7
    or-int v11, v11, v18

    .line 221
    .line 222
    move v5, v9

    .line 223
    move v4, v12

    .line 224
    move-object v2, v15

    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_9
    move-object v8, v15

    .line 228
    move-object v15, v1

    .line 229
    move-object v1, v8

    .line 230
    goto :goto_6

    .line 231
    :pswitch_2
    move-object v15, v2

    .line 232
    move-wide/from16 v4, v19

    .line 233
    .line 234
    const/16 v17, -0x1

    .line 235
    .line 236
    if-nez v14, :cond_9

    .line 237
    .line 238
    invoke-static {v7, v6, v13}, Lk50;->n([BILbd;)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    iget v2, v13, Lbd;->a:I

    .line 243
    .line 244
    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :pswitch_3
    move-object v15, v2

    .line 249
    move-wide/from16 v4, v19

    .line 250
    .line 251
    const/4 v2, 0x2

    .line 252
    const/16 v17, -0x1

    .line 253
    .line 254
    if-ne v14, v2, :cond_9

    .line 255
    .line 256
    invoke-static {v7, v6, v13}, Lk50;->f([BILbd;)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    iget-object v2, v13, Lbd;->c:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-virtual {v1, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :pswitch_4
    move-object v15, v2

    .line 267
    const/4 v2, 0x2

    .line 268
    const/16 v17, -0x1

    .line 269
    .line 270
    if-ne v14, v2, :cond_a

    .line 271
    .line 272
    move-object v2, v1

    .line 273
    invoke-virtual {v0, v9, v15}, Lqh1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    move-object v3, v2

    .line 278
    invoke-virtual {v0, v9}, Lqh1;->o(I)Lh72;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    move-object v4, v7

    .line 283
    move-object v7, v3

    .line 284
    move-object v3, v4

    .line 285
    move v4, v6

    .line 286
    move v5, v8

    .line 287
    move-object v6, v13

    .line 288
    invoke-static/range {v1 .. v6}, Lk50;->B(Ljava/lang/Object;Lh72;[BIILbd;)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    move-object v8, v3

    .line 293
    invoke-virtual {v0, v9, v15, v1}, Lqh1;->R(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    or-int v11, v11, v18

    .line 297
    .line 298
    move v3, v2

    .line 299
    :goto_8
    move-object v1, v7

    .line 300
    move-object v7, v8

    .line 301
    move v5, v9

    .line 302
    move v4, v12

    .line 303
    move-object v2, v15

    .line 304
    :goto_9
    move/from16 v8, p4

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_a
    move-object v8, v7

    .line 309
    move-object v7, v1

    .line 310
    move-object v1, v15

    .line 311
    move-object v15, v7

    .line 312
    goto/16 :goto_5

    .line 313
    .line 314
    :pswitch_5
    move-object v15, v2

    .line 315
    move-object v8, v7

    .line 316
    move-wide/from16 v4, v19

    .line 317
    .line 318
    const/4 v2, 0x2

    .line 319
    const/16 v17, -0x1

    .line 320
    .line 321
    move-object v7, v1

    .line 322
    move v1, v6

    .line 323
    if-ne v14, v2, :cond_c

    .line 324
    .line 325
    const/high16 v2, 0x20000000

    .line 326
    .line 327
    and-int v2, v21, v2

    .line 328
    .line 329
    if-nez v2, :cond_b

    .line 330
    .line 331
    invoke-static {v8, v1, v13}, Lk50;->j([BILbd;)I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    :goto_a
    move v3, v1

    .line 336
    goto :goto_b

    .line 337
    :cond_b
    invoke-static {v8, v1, v13}, Lk50;->k([BILbd;)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    goto :goto_a

    .line 342
    :goto_b
    iget-object v1, v13, Lbd;->c:Ljava/lang/Object;

    .line 343
    .line 344
    invoke-virtual {v7, v15, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :goto_c
    or-int v11, v11, v18

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_c
    move-object/from16 v23, v7

    .line 351
    .line 352
    move v7, v1

    .line 353
    move-object v1, v15

    .line 354
    move-object/from16 v15, v23

    .line 355
    .line 356
    goto/16 :goto_11

    .line 357
    .line 358
    :pswitch_6
    move-object v15, v2

    .line 359
    move-object v8, v7

    .line 360
    move-wide/from16 v4, v19

    .line 361
    .line 362
    const/16 v17, -0x1

    .line 363
    .line 364
    move-object v7, v1

    .line 365
    move v1, v6

    .line 366
    if-nez v14, :cond_c

    .line 367
    .line 368
    invoke-static {v8, v1, v13}, Lk50;->p([BILbd;)I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    iget-wide v1, v13, Lbd;->b:J

    .line 373
    .line 374
    const-wide/16 v19, 0x0

    .line 375
    .line 376
    cmp-long v1, v1, v19

    .line 377
    .line 378
    if-eqz v1, :cond_d

    .line 379
    .line 380
    const/4 v1, 0x1

    .line 381
    goto :goto_d

    .line 382
    :cond_d
    const/4 v1, 0x0

    .line 383
    :goto_d
    sget-object v2, Lmy2;->c:Lky2;

    .line 384
    .line 385
    invoke-virtual {v2, v15, v4, v5, v1}, Lky2;->k(Ljava/lang/Object;JZ)V

    .line 386
    .line 387
    .line 388
    goto :goto_c

    .line 389
    :pswitch_7
    move-object v15, v2

    .line 390
    move-object v8, v7

    .line 391
    move-wide/from16 v4, v19

    .line 392
    .line 393
    const/16 v17, -0x1

    .line 394
    .line 395
    move-object v7, v1

    .line 396
    move v1, v6

    .line 397
    if-ne v14, v3, :cond_c

    .line 398
    .line 399
    invoke-static {v8, v1}, Lk50;->g([BI)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-virtual {v7, v15, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 404
    .line 405
    .line 406
    add-int/lit8 v3, v1, 0x4

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :pswitch_8
    move-object v15, v2

    .line 410
    move-object v8, v7

    .line 411
    move-wide/from16 v4, v19

    .line 412
    .line 413
    const/4 v2, 0x1

    .line 414
    const/16 v17, -0x1

    .line 415
    .line 416
    move-object v7, v1

    .line 417
    move v1, v6

    .line 418
    if-ne v14, v2, :cond_e

    .line 419
    .line 420
    move-wide v3, v4

    .line 421
    invoke-static {v8, v1}, Lk50;->h([BI)J

    .line 422
    .line 423
    .line 424
    move-result-wide v5

    .line 425
    move-object v2, v7

    .line 426
    move v7, v1

    .line 427
    move-object v1, v2

    .line 428
    move-object v2, v15

    .line 429
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 430
    .line 431
    .line 432
    add-int/lit8 v3, v7, 0x8

    .line 433
    .line 434
    or-int v11, v11, v18

    .line 435
    .line 436
    :goto_e
    move-object v7, v8

    .line 437
    :goto_f
    move v5, v9

    .line 438
    move v4, v12

    .line 439
    goto/16 :goto_9

    .line 440
    .line 441
    :cond_e
    move-object/from16 v23, v7

    .line 442
    .line 443
    move v7, v1

    .line 444
    move-object/from16 v1, v23

    .line 445
    .line 446
    move-object/from16 v23, v15

    .line 447
    .line 448
    move-object v15, v1

    .line 449
    move-object/from16 v1, v23

    .line 450
    .line 451
    goto/16 :goto_11

    .line 452
    .line 453
    :pswitch_9
    move-object v8, v7

    .line 454
    move-wide/from16 v3, v19

    .line 455
    .line 456
    const/16 v17, -0x1

    .line 457
    .line 458
    move v7, v6

    .line 459
    if-nez v14, :cond_f

    .line 460
    .line 461
    invoke-static {v8, v7, v13}, Lk50;->n([BILbd;)I

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    iget v6, v13, Lbd;->a:I

    .line 466
    .line 467
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 468
    .line 469
    .line 470
    or-int v11, v11, v18

    .line 471
    .line 472
    move v3, v5

    .line 473
    goto :goto_e

    .line 474
    :cond_f
    move-object v15, v1

    .line 475
    :cond_10
    move-object v1, v2

    .line 476
    goto/16 :goto_11

    .line 477
    .line 478
    :pswitch_a
    move-object v8, v7

    .line 479
    move-wide/from16 v3, v19

    .line 480
    .line 481
    const/16 v17, -0x1

    .line 482
    .line 483
    move v7, v6

    .line 484
    if-nez v14, :cond_f

    .line 485
    .line 486
    invoke-static {v8, v7, v13}, Lk50;->p([BILbd;)I

    .line 487
    .line 488
    .line 489
    move-result v7

    .line 490
    iget-wide v5, v13, Lbd;->b:J

    .line 491
    .line 492
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 493
    .line 494
    .line 495
    move-object v15, v1

    .line 496
    or-int v11, v11, v18

    .line 497
    .line 498
    move v3, v7

    .line 499
    goto :goto_e

    .line 500
    :pswitch_b
    move-object v15, v1

    .line 501
    move-object v8, v7

    .line 502
    move-wide/from16 v4, v19

    .line 503
    .line 504
    const/16 v17, -0x1

    .line 505
    .line 506
    move v7, v6

    .line 507
    if-ne v14, v3, :cond_10

    .line 508
    .line 509
    invoke-static {v8, v7}, Lk50;->g([BI)I

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    sget-object v3, Lmy2;->c:Lky2;

    .line 518
    .line 519
    invoke-virtual {v3, v2, v4, v5, v1}, Lky2;->n(Ljava/lang/Object;JF)V

    .line 520
    .line 521
    .line 522
    add-int/lit8 v3, v7, 0x4

    .line 523
    .line 524
    :goto_10
    or-int v11, v11, v18

    .line 525
    .line 526
    move-object v7, v8

    .line 527
    move v5, v9

    .line 528
    move v4, v12

    .line 529
    move-object v1, v15

    .line 530
    goto/16 :goto_9

    .line 531
    .line 532
    :pswitch_c
    move-object v15, v1

    .line 533
    move-object v8, v7

    .line 534
    move-wide/from16 v4, v19

    .line 535
    .line 536
    const/4 v1, 0x1

    .line 537
    const/16 v17, -0x1

    .line 538
    .line 539
    move v7, v6

    .line 540
    if-ne v14, v1, :cond_10

    .line 541
    .line 542
    invoke-static {v8, v7}, Lk50;->h([BI)J

    .line 543
    .line 544
    .line 545
    move-result-wide v19

    .line 546
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 547
    .line 548
    .line 549
    move-result-wide v19

    .line 550
    sget-object v1, Lmy2;->c:Lky2;

    .line 551
    .line 552
    move-wide v3, v4

    .line 553
    move-wide/from16 v5, v19

    .line 554
    .line 555
    invoke-virtual/range {v1 .. v6}, Lky2;->m(Ljava/lang/Object;JD)V

    .line 556
    .line 557
    .line 558
    move-object v1, v2

    .line 559
    add-int/lit8 v3, v7, 0x8

    .line 560
    .line 561
    goto :goto_10

    .line 562
    :goto_11
    move/from16 v5, p3

    .line 563
    .line 564
    move-object v6, v1

    .line 565
    move v2, v7

    .line 566
    move-object/from16 v22, v15

    .line 567
    .line 568
    move/from16 v18, v17

    .line 569
    .line 570
    move/from16 v17, v12

    .line 571
    .line 572
    move v12, v9

    .line 573
    goto/16 :goto_15

    .line 574
    .line 575
    :cond_11
    move-object v3, v2

    .line 576
    move-object v2, v1

    .line 577
    move-object v1, v3

    .line 578
    move/from16 v21, v5

    .line 579
    .line 580
    move-object v8, v7

    .line 581
    move-wide/from16 v3, v19

    .line 582
    .line 583
    const/16 v17, -0x1

    .line 584
    .line 585
    move v7, v6

    .line 586
    const/16 v5, 0x1b

    .line 587
    .line 588
    if-ne v15, v5, :cond_15

    .line 589
    .line 590
    const/4 v5, 0x2

    .line 591
    if-ne v14, v5, :cond_14

    .line 592
    .line 593
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    check-cast v5, Lcz0;

    .line 598
    .line 599
    move-object v6, v5

    .line 600
    check-cast v6, Ld0;

    .line 601
    .line 602
    iget-boolean v6, v6, Ld0;->a:Z

    .line 603
    .line 604
    if-nez v6, :cond_13

    .line 605
    .line 606
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    if-nez v6, :cond_12

    .line 611
    .line 612
    const/16 v6, 0xa

    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_12
    mul-int/lit8 v6, v6, 0x2

    .line 616
    .line 617
    :goto_12
    invoke-interface {v5, v6}, Lcz0;->x(I)Lcz0;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    invoke-virtual {v2, v1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    :cond_13
    move-object v6, v5

    .line 625
    invoke-virtual {v0, v9}, Lqh1;->o(I)Lh72;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    move/from16 v5, p4

    .line 630
    .line 631
    move v4, v7

    .line 632
    move-object v3, v8

    .line 633
    move-object v7, v13

    .line 634
    move-object v8, v2

    .line 635
    move/from16 v2, p3

    .line 636
    .line 637
    invoke-static/range {v1 .. v7}, Lk50;->i(Lh72;I[BIILcz0;Lbd;)I

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    move-object/from16 v2, p1

    .line 642
    .line 643
    move-object/from16 v7, p2

    .line 644
    .line 645
    move-object/from16 v13, p5

    .line 646
    .line 647
    move v3, v1

    .line 648
    move-object v1, v8

    .line 649
    goto/16 :goto_f

    .line 650
    .line 651
    :cond_14
    move-object/from16 v3, p1

    .line 652
    .line 653
    move/from16 v5, p3

    .line 654
    .line 655
    move-object/from16 v22, v2

    .line 656
    .line 657
    move v1, v7

    .line 658
    move v14, v10

    .line 659
    move v15, v11

    .line 660
    move/from16 v18, v17

    .line 661
    .line 662
    move/from16 v17, v12

    .line 663
    .line 664
    move v12, v9

    .line 665
    goto/16 :goto_13

    .line 666
    .line 667
    :cond_15
    move/from16 v5, p3

    .line 668
    .line 669
    move-object v8, v2

    .line 670
    move v1, v7

    .line 671
    const/16 v2, 0x31

    .line 672
    .line 673
    if-gt v15, v2, :cond_17

    .line 674
    .line 675
    move-object v7, v8

    .line 676
    move v6, v9

    .line 677
    move/from16 v2, v21

    .line 678
    .line 679
    int-to-long v8, v2

    .line 680
    move-object/from16 v2, p2

    .line 681
    .line 682
    move-object/from16 v13, p5

    .line 683
    .line 684
    move-object/from16 v22, v7

    .line 685
    .line 686
    move/from16 v18, v17

    .line 687
    .line 688
    move v7, v6

    .line 689
    move/from16 v17, v12

    .line 690
    .line 691
    move v6, v14

    .line 692
    move v14, v10

    .line 693
    move v10, v15

    .line 694
    move v15, v11

    .line 695
    move-wide v11, v3

    .line 696
    move/from16 v4, p4

    .line 697
    .line 698
    move v3, v1

    .line 699
    move-object/from16 v1, p1

    .line 700
    .line 701
    invoke-virtual/range {v0 .. v13}, Lqh1;->J(Ljava/lang/Object;[BIIIIIJIJLbd;)I

    .line 702
    .line 703
    .line 704
    move-result v6

    .line 705
    move v12, v3

    .line 706
    move-object v3, v1

    .line 707
    move v1, v12

    .line 708
    move v12, v7

    .line 709
    if-eq v6, v1, :cond_16

    .line 710
    .line 711
    move-object/from16 v7, p2

    .line 712
    .line 713
    move/from16 v8, p4

    .line 714
    .line 715
    move-object/from16 v13, p5

    .line 716
    .line 717
    move-object v2, v3

    .line 718
    move v3, v6

    .line 719
    move v5, v12

    .line 720
    move v10, v14

    .line 721
    move v11, v15

    .line 722
    move/from16 v4, v17

    .line 723
    .line 724
    move-object/from16 v1, v22

    .line 725
    .line 726
    goto/16 :goto_0

    .line 727
    .line 728
    :cond_16
    move v2, v6

    .line 729
    move v10, v14

    .line 730
    move v11, v15

    .line 731
    move-object v6, v3

    .line 732
    goto/16 :goto_15

    .line 733
    .line 734
    :cond_17
    move-object/from16 v22, v8

    .line 735
    .line 736
    move v6, v14

    .line 737
    move/from16 v18, v17

    .line 738
    .line 739
    move/from16 v2, v21

    .line 740
    .line 741
    move-wide v7, v3

    .line 742
    move v14, v10

    .line 743
    move/from16 v17, v12

    .line 744
    .line 745
    move v10, v15

    .line 746
    move-object/from16 v3, p1

    .line 747
    .line 748
    move v12, v9

    .line 749
    move v15, v11

    .line 750
    const/16 v4, 0x32

    .line 751
    .line 752
    if-ne v10, v4, :cond_19

    .line 753
    .line 754
    const/4 v4, 0x2

    .line 755
    if-eq v6, v4, :cond_18

    .line 756
    .line 757
    :goto_13
    move v2, v1

    .line 758
    move-object v6, v3

    .line 759
    :goto_14
    move v10, v14

    .line 760
    move v11, v15

    .line 761
    goto :goto_15

    .line 762
    :cond_18
    invoke-virtual {v0, v3, v12, v7, v8}, Lqh1;->F(Ljava/lang/Object;IJ)V

    .line 763
    .line 764
    .line 765
    const/4 v0, 0x0

    .line 766
    throw v0

    .line 767
    :cond_19
    move-object v4, v3

    .line 768
    move v3, v1

    .line 769
    move-object v1, v4

    .line 770
    move/from16 v4, p4

    .line 771
    .line 772
    move-object/from16 v13, p5

    .line 773
    .line 774
    move v9, v10

    .line 775
    move-wide v10, v7

    .line 776
    move v8, v2

    .line 777
    move v7, v6

    .line 778
    move/from16 v6, v17

    .line 779
    .line 780
    move-object/from16 v2, p2

    .line 781
    .line 782
    invoke-virtual/range {v0 .. v13}, Lqh1;->G(Ljava/lang/Object;[BIIIIIIIJILbd;)I

    .line 783
    .line 784
    .line 785
    move-result v7

    .line 786
    move-object v6, v1

    .line 787
    move v1, v3

    .line 788
    if-eq v7, v1, :cond_1a

    .line 789
    .line 790
    move-object/from16 v0, p0

    .line 791
    .line 792
    move/from16 v8, p4

    .line 793
    .line 794
    move-object/from16 v13, p5

    .line 795
    .line 796
    move-object v2, v6

    .line 797
    move v3, v7

    .line 798
    move v5, v12

    .line 799
    move v10, v14

    .line 800
    move v11, v15

    .line 801
    move/from16 v4, v17

    .line 802
    .line 803
    move-object/from16 v1, v22

    .line 804
    .line 805
    move-object/from16 v7, p2

    .line 806
    .line 807
    goto/16 :goto_0

    .line 808
    .line 809
    :cond_1a
    move v2, v7

    .line 810
    goto :goto_14

    .line 811
    :goto_15
    move-object v0, v6

    .line 812
    check-cast v0, Lsq0;

    .line 813
    .line 814
    iget-object v1, v0, Lsq0;->unknownFields:Lrx2;

    .line 815
    .line 816
    sget-object v3, Lrx2;->f:Lrx2;

    .line 817
    .line 818
    if-ne v1, v3, :cond_1b

    .line 819
    .line 820
    invoke-static {}, Lrx2;->c()Lrx2;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    iput-object v1, v0, Lsq0;->unknownFields:Lrx2;

    .line 825
    .line 826
    :cond_1b
    move/from16 v3, p4

    .line 827
    .line 828
    move-object v4, v1

    .line 829
    move v0, v5

    .line 830
    move-object/from16 v1, p2

    .line 831
    .line 832
    move-object/from16 v5, p5

    .line 833
    .line 834
    invoke-static/range {v0 .. v5}, Lk50;->l(I[BIILrx2;Lbd;)I

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    move-object/from16 v7, p2

    .line 839
    .line 840
    move-object/from16 v13, p5

    .line 841
    .line 842
    move v8, v3

    .line 843
    move-object v2, v6

    .line 844
    move v5, v12

    .line 845
    move/from16 v4, v17

    .line 846
    .line 847
    move-object/from16 v1, v22

    .line 848
    .line 849
    move v3, v0

    .line 850
    move-object/from16 v0, p0

    .line 851
    .line 852
    goto/16 :goto_0

    .line 853
    .line 854
    :cond_1c
    move-object/from16 v22, v1

    .line 855
    .line 856
    move-object v6, v2

    .line 857
    move v4, v8

    .line 858
    move v14, v10

    .line 859
    move v15, v11

    .line 860
    const v0, 0xfffff

    .line 861
    .line 862
    .line 863
    if-eq v14, v0, :cond_1d

    .line 864
    .line 865
    int-to-long v0, v14

    .line 866
    move-object/from16 v2, v22

    .line 867
    .line 868
    invoke-virtual {v2, v6, v0, v1, v15}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 869
    .line 870
    .line 871
    :cond_1d
    if-ne v3, v4, :cond_1e

    .line 872
    .line 873
    return-void

    .line 874
    :cond_1e
    invoke-static {}, Lpz0;->f()Lpz0;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    throw v0

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Ljava/lang/Object;[BIIIIIJIJLbd;)I
    .locals 12

    move/from16 v0, p5

    move/from16 v1, p6

    move/from16 v6, p7

    move-wide/from16 v2, p11

    .line 1
    sget-object v4, Lqh1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v4, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz0;

    .line 2
    move-object v7, v5

    check-cast v7, Ld0;

    .line 3
    iget-boolean v7, v7, Ld0;->a:Z

    const/4 v8, 0x2

    if-nez v7, :cond_1

    .line 4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_0

    const/16 v7, 0xa

    goto :goto_0

    :cond_0
    mul-int/2addr v7, v8

    .line 5
    :goto_0
    invoke-interface {v5, v7}, Lcz0;->x(I)Lcz0;

    move-result-object v5

    .line 6
    invoke-virtual {v4, p1, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    move-object v4, v5

    const/4 p1, 0x5

    const-wide/16 v2, 0x0

    const/4 v5, 0x1

    packed-switch p10, :pswitch_data_0

    goto/16 :goto_29

    :pswitch_0
    const/4 p1, 0x3

    if-ne v1, p1, :cond_4b

    .line 7
    invoke-virtual {p0, v6}, Lqh1;->o(I)Lh72;

    move-result-object p0

    and-int/lit8 p1, v0, -0x8

    or-int/lit8 p1, p1, 0x4

    .line 8
    invoke-interface {p0}, Lh72;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 9
    move-object v2, p0

    check-cast v2, Lqh1;

    move/from16 p11, p1

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p12, p13

    move-object/from16 p7, v1

    move-object/from16 p6, v2

    .line 10
    invoke-virtual/range {p6 .. p12}, Lqh1;->H(Ljava/lang/Object;[BIIILbd;)I

    move-result p1

    move-object/from16 v6, p6

    move-object/from16 v2, p7

    move/from16 v3, p10

    move/from16 p3, p11

    move-object/from16 v5, p12

    .line 11
    iput-object v2, v5, Lbd;->c:Ljava/lang/Object;

    .line 12
    invoke-interface {p0, v2}, Lh72;->b(Ljava/lang/Object;)V

    .line 13
    iput-object v2, v5, Lbd;->c:Ljava/lang/Object;

    .line 14
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge p1, v3, :cond_3

    .line 15
    invoke-static {p2, p1, v5}, Lk50;->n([BILbd;)I

    move-result v2

    .line 16
    iget v7, v5, Lbd;->a:I

    if-eq v0, v7, :cond_2

    goto :goto_2

    .line 17
    :cond_2
    invoke-interface {p0}, Lh72;->newInstance()Ljava/lang/Object;

    move-result-object p1

    move-object/from16 p7, p1

    move-object/from16 p8, p2

    move/from16 p11, p3

    move/from16 p9, v2

    move/from16 p10, v3

    move-object/from16 p12, v5

    move-object/from16 p6, v6

    .line 18
    invoke-virtual/range {p6 .. p12}, Lqh1;->H(Ljava/lang/Object;[BIIILbd;)I

    move-result p1

    move-object/from16 v1, p7

    .line 19
    iput-object v1, v5, Lbd;->c:Ljava/lang/Object;

    .line 20
    invoke-interface {p0, v1}, Lh72;->b(Ljava/lang/Object;)V

    .line 21
    iput-object v1, v5, Lbd;->c:Ljava/lang/Object;

    .line 22
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    :goto_2
    return p1

    :pswitch_1
    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_6

    .line 23
    check-cast v4, Lja1;

    .line 24
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 25
    iget p1, v5, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_3
    if-ge p0, p1, :cond_4

    .line 26
    invoke-static {p2, p0, v5}, Lk50;->p([BILbd;)I

    move-result p0

    .line 27
    iget-wide v0, v5, Lbd;->b:J

    invoke-static {v0, v1}, Lhw;->e(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lja1;->b(J)V

    goto :goto_3

    :cond_4
    if-ne p0, p1, :cond_5

    return p0

    .line 28
    :cond_5
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_6
    if-nez v1, :cond_4b

    .line 29
    check-cast v4, Lja1;

    .line 30
    invoke-static {p2, p3, v5}, Lk50;->p([BILbd;)I

    move-result p0

    .line 31
    iget-wide v6, v5, Lbd;->b:J

    invoke-static {v6, v7}, Lhw;->e(J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lja1;->b(J)V

    :goto_4
    if-ge p0, v3, :cond_8

    .line 32
    invoke-static {p2, p0, v5}, Lk50;->n([BILbd;)I

    move-result p1

    .line 33
    iget p3, v5, Lbd;->a:I

    if-eq v0, p3, :cond_7

    goto :goto_5

    .line 34
    :cond_7
    invoke-static {p2, p1, v5}, Lk50;->p([BILbd;)I

    move-result p0

    .line 35
    iget-wide v6, v5, Lbd;->b:J

    invoke-static {v6, v7}, Lhw;->e(J)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lja1;->b(J)V

    goto :goto_4

    :cond_8
    :goto_5
    return p0

    :pswitch_2
    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_b

    .line 36
    check-cast v4, Lry0;

    .line 37
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 38
    iget p1, v5, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_6
    if-ge p0, p1, :cond_9

    .line 39
    invoke-static {p2, p0, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 40
    iget p3, v5, Lbd;->a:I

    invoke-static {p3}, Lhw;->d(I)I

    move-result p3

    invoke-virtual {v4, p3}, Lry0;->b(I)V

    goto :goto_6

    :cond_9
    if-ne p0, p1, :cond_a

    return p0

    .line 41
    :cond_a
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_b
    if-nez v1, :cond_4b

    .line 42
    check-cast v4, Lry0;

    .line 43
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 44
    iget p1, v5, Lbd;->a:I

    invoke-static {p1}, Lhw;->d(I)I

    move-result p1

    invoke-virtual {v4, p1}, Lry0;->b(I)V

    :goto_7
    if-ge p0, v3, :cond_d

    .line 45
    invoke-static {p2, p0, v5}, Lk50;->n([BILbd;)I

    move-result p1

    .line 46
    iget p3, v5, Lbd;->a:I

    if-eq v0, p3, :cond_c

    goto :goto_8

    .line 47
    :cond_c
    invoke-static {p2, p1, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 48
    iget p1, v5, Lbd;->a:I

    invoke-static {p1}, Lhw;->d(I)I

    move-result p1

    invoke-virtual {v4, p1}, Lry0;->b(I)V

    goto :goto_7

    :cond_d
    :goto_8
    return p0

    :pswitch_3
    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_10

    .line 49
    check-cast v4, Lry0;

    .line 50
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p1

    .line 51
    iget p3, v5, Lbd;->a:I

    add-int/2addr p3, p1

    :goto_9
    if-ge p1, p3, :cond_e

    .line 52
    invoke-static {p2, p1, v5}, Lk50;->n([BILbd;)I

    move-result p1

    .line 53
    iget v0, v5, Lbd;->a:I

    invoke-virtual {v4, v0}, Lry0;->b(I)V

    goto :goto_9

    :cond_e
    if-ne p1, p3, :cond_f

    goto :goto_a

    .line 54
    :cond_f
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_10
    if-nez v1, :cond_4b

    move-object v1, p2

    move v2, p3

    .line 55
    invoke-static/range {v0 .. v5}, Lk50;->o(I[BIILcz0;Lbd;)I

    move-result p1

    .line 56
    :goto_a
    invoke-virtual {p0, v6}, Lqh1;->m(I)V

    .line 57
    sget-object p0, Ll72;->a:Ljava/lang/Class;

    return p1

    :pswitch_4
    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_4b

    .line 58
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 59
    iget p3, v5, Lbd;->a:I

    if-ltz p3, :cond_18

    .line 60
    array-length v1, p2

    sub-int/2addr v1, p0

    if-gt p3, v1, :cond_17

    if-nez p3, :cond_11

    .line 61
    sget-object p3, Lvl;->b:Ltl;

    invoke-interface {v4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 62
    :cond_11
    invoke-static {p2, p0, p3}, Lvl;->c([BII)Ltl;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr p0, p3

    :goto_c
    if-ge p0, v3, :cond_16

    .line 63
    invoke-static {p2, p0, v5}, Lk50;->n([BILbd;)I

    move-result p3

    .line 64
    iget v1, v5, Lbd;->a:I

    if-eq v0, v1, :cond_12

    goto :goto_d

    .line 65
    :cond_12
    invoke-static {p2, p3, v5}, Lk50;->n([BILbd;)I

    move-result p0

    .line 66
    iget p3, v5, Lbd;->a:I

    if-ltz p3, :cond_15

    .line 67
    array-length v1, p2

    sub-int/2addr v1, p0

    if-gt p3, v1, :cond_14

    if-nez p3, :cond_13

    .line 68
    sget-object p3, Lvl;->b:Ltl;

    invoke-interface {v4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 69
    :cond_13
    invoke-static {p2, p0, p3}, Lvl;->c([BII)Ltl;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 70
    :cond_14
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    .line 71
    :cond_15
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    :cond_16
    :goto_d
    return p0

    .line 72
    :cond_17
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    .line 73
    :cond_18
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    :pswitch_5
    move/from16 v3, p4

    move-object/from16 v5, p13

    if-ne v1, v8, :cond_4b

    .line 74
    invoke-virtual {p0, v6}, Lqh1;->o(I)Lh72;

    move-result-object p0

    move-object/from16 p6, p0

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p7, v0

    move/from16 p10, v3

    move-object/from16 p11, v4

    move-object/from16 p12, v5

    .line 75
    invoke-static/range {p6 .. p12}, Lk50;->i(Lh72;I[BIILcz0;Lbd;)I

    move-result p0

    return p0

    :pswitch_6
    move-object/from16 v7, p13

    move v6, v0

    move-object v9, v4

    move/from16 v4, p4

    if-ne v1, v8, :cond_4b

    const-wide/32 v10, 0x20000000

    and-long v10, p8, v10

    cmp-long p1, v10, v2

    .line 76
    const-string v1, ""

    if-nez p1, :cond_1f

    .line 77
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 78
    iget p1, v7, Lbd;->a:I

    if-ltz p1, :cond_1e

    if-nez p1, :cond_19

    .line 79
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 80
    :cond_19
    new-instance p3, Ljava/lang/String;

    sget-object v2, Lez0;->a:Ljava/nio/charset/Charset;

    invoke-direct {p3, p2, p0, p1, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 81
    invoke-interface {v9, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_e
    add-int/2addr p0, p1

    :goto_f
    if-ge p0, v4, :cond_1d

    .line 82
    invoke-static {p2, p0, v7}, Lk50;->n([BILbd;)I

    move-result p1

    .line 83
    iget p3, v7, Lbd;->a:I

    if-eq v6, p3, :cond_1a

    goto :goto_10

    .line 84
    :cond_1a
    invoke-static {p2, p1, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 85
    iget p1, v7, Lbd;->a:I

    if-ltz p1, :cond_1c

    if-nez p1, :cond_1b

    .line 86
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 87
    :cond_1b
    new-instance p3, Ljava/lang/String;

    sget-object v2, Lez0;->a:Ljava/nio/charset/Charset;

    invoke-direct {p3, p2, p0, p1, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 88
    invoke-interface {v9, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 89
    :cond_1c
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    :cond_1d
    :goto_10
    return p0

    .line 90
    :cond_1e
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    .line 91
    :cond_1f
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 92
    iget p1, v7, Lbd;->a:I

    if-ltz p1, :cond_27

    if-nez p1, :cond_20

    .line 93
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_20
    add-int p3, p0, p1

    .line 94
    sget-object v2, Lm13;->a:Li13;

    invoke-virtual {v2, p2, p0, p3}, Li13;->t([BII)Z

    move-result v2

    if-eqz v2, :cond_26

    .line 95
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lez0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, p0, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 96
    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_11
    move p0, p3

    :goto_12
    if-ge p0, v4, :cond_25

    .line 97
    invoke-static {p2, p0, v7}, Lk50;->n([BILbd;)I

    move-result p1

    .line 98
    iget p3, v7, Lbd;->a:I

    if-eq v6, p3, :cond_21

    goto :goto_13

    .line 99
    :cond_21
    invoke-static {p2, p1, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 100
    iget p1, v7, Lbd;->a:I

    if-ltz p1, :cond_24

    if-nez p1, :cond_22

    .line 101
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_22
    add-int p3, p0, p1

    .line 102
    sget-object v2, Lm13;->a:Li13;

    invoke-virtual {v2, p2, p0, p3}, Li13;->t([BII)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 103
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lez0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, p0, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 104
    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 105
    :cond_23
    invoke-static {}, Lpz0;->b()Lpz0;

    move-result-object p0

    throw p0

    .line 106
    :cond_24
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    :cond_25
    :goto_13
    return p0

    .line 107
    :cond_26
    invoke-static {}, Lpz0;->b()Lpz0;

    move-result-object p0

    throw p0

    .line 108
    :cond_27
    invoke-static {}, Lpz0;->e()Lpz0;

    move-result-object p0

    throw p0

    :pswitch_7
    move-object/from16 v7, p13

    move v6, v0

    move-object v9, v4

    move/from16 v4, p4

    const/4 p1, 0x0

    if-ne v1, v8, :cond_2b

    .line 109
    move-object v4, v9

    check-cast v4, Lak;

    .line 110
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 111
    iget p3, v7, Lbd;->a:I

    add-int/2addr p3, p0

    :goto_14
    if-ge p0, p3, :cond_29

    .line 112
    invoke-static {p2, p0, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 113
    iget-wide v8, v7, Lbd;->b:J

    cmp-long v1, v8, v2

    if-eqz v1, :cond_28

    move v1, v5

    goto :goto_15

    :cond_28
    move v1, p1

    :goto_15
    invoke-virtual {v4, v1}, Lak;->b(Z)V

    goto :goto_14

    :cond_29
    if-ne p0, p3, :cond_2a

    return p0

    .line 114
    :cond_2a
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_2b
    if-nez v1, :cond_4b

    .line 115
    move-object v1, v9

    check-cast v1, Lak;

    .line 116
    invoke-static {p2, p3, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 117
    iget-wide v8, v7, Lbd;->b:J

    cmp-long p3, v8, v2

    if-eqz p3, :cond_2c

    move p3, v5

    goto :goto_16

    :cond_2c
    move p3, p1

    :goto_16
    invoke-virtual {v1, p3}, Lak;->b(Z)V

    :goto_17
    if-ge p0, v4, :cond_2f

    .line 118
    invoke-static {p2, p0, v7}, Lk50;->n([BILbd;)I

    move-result p3

    .line 119
    iget v8, v7, Lbd;->a:I

    if-eq v6, v8, :cond_2d

    goto :goto_19

    .line 120
    :cond_2d
    invoke-static {p2, p3, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 121
    iget-wide v8, v7, Lbd;->b:J

    cmp-long p3, v8, v2

    if-eqz p3, :cond_2e

    move p3, v5

    goto :goto_18

    :cond_2e
    move p3, p1

    :goto_18
    invoke-virtual {v1, p3}, Lak;->b(Z)V

    goto :goto_17

    :cond_2f
    :goto_19
    return p0

    :pswitch_8
    move-object/from16 v7, p13

    move v6, v0

    move-object v9, v4

    move/from16 v4, p4

    if-ne v1, v8, :cond_32

    .line 122
    move-object v4, v9

    check-cast v4, Lry0;

    .line 123
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 124
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_1a
    if-ge p0, p1, :cond_30

    .line 125
    invoke-static {p2, p0}, Lk50;->g([BI)I

    move-result p3

    invoke-virtual {v4, p3}, Lry0;->b(I)V

    add-int/lit8 p0, p0, 0x4

    goto :goto_1a

    :cond_30
    if-ne p0, p1, :cond_31

    return p0

    .line 126
    :cond_31
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_32
    if-ne v1, p1, :cond_4b

    .line 127
    move-object p1, v9

    check-cast p1, Lry0;

    .line 128
    invoke-static/range {p2 .. p3}, Lk50;->g([BI)I

    move-result v1

    invoke-virtual {p1, v1}, Lry0;->b(I)V

    add-int/lit8 p3, p3, 0x4

    :goto_1b
    if-ge p3, v4, :cond_34

    .line 129
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 130
    iget v1, v7, Lbd;->a:I

    if-eq v6, v1, :cond_33

    goto :goto_1c

    .line 131
    :cond_33
    invoke-static {p2, p0}, Lk50;->g([BI)I

    move-result p3

    invoke-virtual {p1, p3}, Lry0;->b(I)V

    add-int/lit8 p3, p0, 0x4

    goto :goto_1b

    :cond_34
    :goto_1c
    return p3

    :pswitch_9
    move-object/from16 v7, p13

    move v6, v0

    move-object v9, v4

    move/from16 v4, p4

    if-ne v1, v8, :cond_37

    .line 132
    move-object v4, v9

    check-cast v4, Lja1;

    .line 133
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 134
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_1d
    if-ge p0, p1, :cond_35

    .line 135
    invoke-static {p2, p0}, Lk50;->h([BI)J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Lja1;->b(J)V

    add-int/lit8 p0, p0, 0x8

    goto :goto_1d

    :cond_35
    if-ne p0, p1, :cond_36

    return p0

    .line 136
    :cond_36
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_37
    if-ne v1, v5, :cond_4b

    .line 137
    move-object p1, v9

    check-cast p1, Lja1;

    .line 138
    invoke-static/range {p2 .. p3}, Lk50;->h([BI)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lja1;->b(J)V

    add-int/lit8 p3, p3, 0x8

    :goto_1e
    if-ge p3, v4, :cond_39

    .line 139
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 140
    iget v1, v7, Lbd;->a:I

    if-eq v6, v1, :cond_38

    goto :goto_1f

    .line 141
    :cond_38
    invoke-static {p2, p0}, Lk50;->h([BI)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lja1;->b(J)V

    add-int/lit8 p3, p0, 0x8

    goto :goto_1e

    :cond_39
    :goto_1f
    return p3

    :pswitch_a
    move-object/from16 v7, p13

    move v6, v0

    move-object v9, v4

    move/from16 v4, p4

    if-ne v1, v8, :cond_3c

    .line 142
    move-object v4, v9

    check-cast v4, Lry0;

    .line 143
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 144
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_20
    if-ge p0, p1, :cond_3a

    .line 145
    invoke-static {p2, p0, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 146
    iget p3, v7, Lbd;->a:I

    invoke-virtual {v4, p3}, Lry0;->b(I)V

    goto :goto_20

    :cond_3a
    if-ne p0, p1, :cond_3b

    return p0

    .line 147
    :cond_3b
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_3c
    if-nez v1, :cond_4b

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, v4

    move/from16 p6, v6

    move-object/from16 p11, v7

    move-object/from16 p10, v9

    .line 148
    invoke-static/range {p6 .. p11}, Lk50;->o(I[BIILcz0;Lbd;)I

    move-result p0

    return p0

    :pswitch_b
    move/from16 v3, p4

    move-object/from16 v7, p13

    move v6, v0

    if-ne v1, v8, :cond_3f

    .line 149
    check-cast v4, Lja1;

    .line 150
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 151
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_21
    if-ge p0, p1, :cond_3d

    .line 152
    invoke-static {p2, p0, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 153
    iget-wide v1, v7, Lbd;->b:J

    invoke-virtual {v4, v1, v2}, Lja1;->b(J)V

    goto :goto_21

    :cond_3d
    if-ne p0, p1, :cond_3e

    return p0

    .line 154
    :cond_3e
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_3f
    if-nez v1, :cond_4b

    .line 155
    check-cast v4, Lja1;

    .line 156
    invoke-static {p2, p3, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 157
    iget-wide v1, v7, Lbd;->b:J

    invoke-virtual {v4, v1, v2}, Lja1;->b(J)V

    :goto_22
    if-ge p0, v3, :cond_41

    .line 158
    invoke-static {p2, p0, v7}, Lk50;->n([BILbd;)I

    move-result p1

    .line 159
    iget p3, v7, Lbd;->a:I

    if-eq v6, p3, :cond_40

    goto :goto_23

    .line 160
    :cond_40
    invoke-static {p2, p1, v7}, Lk50;->p([BILbd;)I

    move-result p0

    .line 161
    iget-wide v1, v7, Lbd;->b:J

    invoke-virtual {v4, v1, v2}, Lja1;->b(J)V

    goto :goto_22

    :cond_41
    :goto_23
    return p0

    :pswitch_c
    move/from16 v3, p4

    move-object/from16 v7, p13

    move v6, v0

    if-ne v1, v8, :cond_44

    .line 162
    check-cast v4, Lqj0;

    .line 163
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 164
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_24
    if-ge p0, p1, :cond_42

    .line 165
    invoke-static {p2, p0}, Lk50;->g([BI)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    .line 166
    invoke-virtual {v4, p3}, Lqj0;->b(F)V

    add-int/lit8 p0, p0, 0x4

    goto :goto_24

    :cond_42
    if-ne p0, p1, :cond_43

    return p0

    .line 167
    :cond_43
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_44
    if-ne v1, p1, :cond_4b

    .line 168
    check-cast v4, Lqj0;

    .line 169
    invoke-static/range {p2 .. p3}, Lk50;->g([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    .line 170
    invoke-virtual {v4, p0}, Lqj0;->b(F)V

    add-int/lit8 p3, p3, 0x4

    :goto_25
    if-ge p3, v3, :cond_46

    .line 171
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 172
    iget p1, v7, Lbd;->a:I

    if-eq v6, p1, :cond_45

    goto :goto_26

    .line 173
    :cond_45
    invoke-static {p2, p0}, Lk50;->g([BI)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    .line 174
    invoke-virtual {v4, p1}, Lqj0;->b(F)V

    add-int/lit8 p3, p0, 0x4

    goto :goto_25

    :cond_46
    :goto_26
    return p3

    :pswitch_d
    move/from16 v3, p4

    move-object/from16 v7, p13

    move v6, v0

    if-ne v1, v8, :cond_49

    .line 175
    check-cast v4, Lk90;

    .line 176
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 177
    iget p1, v7, Lbd;->a:I

    add-int/2addr p1, p0

    :goto_27
    if-ge p0, p1, :cond_47

    .line 178
    invoke-static {p2, p0}, Lk50;->h([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    .line 179
    invoke-virtual {v4, v1, v2}, Lk90;->b(D)V

    add-int/lit8 p0, p0, 0x8

    goto :goto_27

    :cond_47
    if-ne p0, p1, :cond_48

    return p0

    .line 180
    :cond_48
    invoke-static {}, Lpz0;->g()Lpz0;

    move-result-object p0

    throw p0

    :cond_49
    if-ne v1, v5, :cond_4b

    .line 181
    check-cast v4, Lk90;

    .line 182
    invoke-static/range {p2 .. p3}, Lk50;->h([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    .line 183
    invoke-virtual {v4, p0, p1}, Lk90;->b(D)V

    add-int/lit8 p3, p3, 0x8

    :goto_28
    if-ge p3, v3, :cond_4b

    .line 184
    invoke-static {p2, p3, v7}, Lk50;->n([BILbd;)I

    move-result p0

    .line 185
    iget p1, v7, Lbd;->a:I

    if-eq v6, p1, :cond_4a

    goto :goto_29

    .line 186
    :cond_4a
    invoke-static {p2, p0}, Lk50;->h([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    .line 187
    invoke-virtual {v4, v1, v2}, Lk90;->b(D)V

    add-int/lit8 p3, p0, 0x8

    goto :goto_28

    :cond_4b
    :goto_29
    return p3

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Ljava/lang/Object;JLiw;Lh72;Ldg0;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lqh1;->l:Lc81;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p1, p4, Liw;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lhw;

    .line 10
    .line 11
    iget p2, p4, Liw;->b:I

    .line 12
    .line 13
    and-int/lit8 p3, p2, 0x7

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p3, v0, :cond_3

    .line 17
    .line 18
    :cond_0
    invoke-interface {p5}, Lh72;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p4, p3, p5, p6}, Liw;->d(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p5, p3}, Lh72;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lhw;->g()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-nez p3, :cond_2

    .line 36
    .line 37
    iget p3, p4, Liw;->d:I

    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p1}, Lhw;->C()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-eq p3, p2, :cond_0

    .line 47
    .line 48
    iput p3, p4, Liw;->d:I

    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void

    .line 51
    :cond_3
    invoke-static {}, Lpz0;->c()Lnz0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0
.end method

.method public final L(Ljava/lang/Object;ILiw;Lh72;Ldg0;)V
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p2, v0

    .line 5
    int-to-long v0, p2

    .line 6
    iget-object p0, p0, Lqh1;->l:Lc81;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p1, p3, Liw;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lhw;

    .line 15
    .line 16
    iget p2, p3, Liw;->b:I

    .line 17
    .line 18
    and-int/lit8 v0, p2, 0x7

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-ne v0, v1, :cond_3

    .line 22
    .line 23
    :cond_0
    invoke-interface {p4}, Lh72;->newInstance()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0, p4, p5}, Liw;->f(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p4, v0}, Lh72;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lhw;->g()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    iget v0, p3, Liw;->d:I

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p1}, Lhw;->C()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eq v0, p2, :cond_0

    .line 52
    .line 53
    iput v0, p3, Liw;->d:I

    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void

    .line 56
    :cond_3
    invoke-static {}, Lpz0;->c()Lnz0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    throw p0
.end method

.method public final M(ILiw;Ljava/lang/Object;)V
    .locals 3

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/4 v1, 0x2

    .line 5
    const v2, 0xfffff

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    and-int p0, p1, v2

    .line 11
    .line 12
    int-to-long p0, p0

    .line 13
    invoke-virtual {p2, v1}, Liw;->R(I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p2, Liw;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lhw;

    .line 19
    .line 20
    invoke-virtual {p2}, Lhw;->B()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p3, p0, p1, p2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-boolean p0, p0, Lqh1;->f:Z

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    and-int p0, p1, v2

    .line 33
    .line 34
    int-to-long p0, p0

    .line 35
    invoke-virtual {p2, v1}, Liw;->R(I)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p2, Liw;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p2, Lhw;

    .line 41
    .line 42
    invoke-virtual {p2}, Lhw;->A()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p3, p0, p1, p2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    and-int p0, p1, v2

    .line 51
    .line 52
    int-to-long p0, p0

    .line 53
    invoke-virtual {p2}, Liw;->k()Lvl;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p3, p0, p1, p2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final O(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Lqh1;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    const p1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, p0

    .line 11
    int-to-long v0, p1

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p0, p0, 0x14

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    shl-int p0, p1, p0

    .line 24
    .line 25
    sget-object p1, Lmy2;->c:Lky2;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    or-int/2addr p0, p1

    .line 32
    invoke-static {p2, p0, v0, v1}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final P(ILjava/lang/Object;I)V
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Lqh1;->a:[I

    .line 4
    .line 5
    aget p0, p0, p3

    .line 6
    .line 7
    const p3, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p0, p3

    .line 11
    int-to-long v0, p0

    .line 12
    invoke-static {p2, p1, v0, v1}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final Q(II)I
    .locals 4

    .line 1
    iget-object p0, p0, Lqh1;->a:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    :goto_0
    if-gt p2, v0, :cond_2

    .line 9
    .line 10
    add-int v1, v0, p2

    .line 11
    .line 12
    ushr-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    mul-int/lit8 v2, v1, 0x3

    .line 15
    .line 16
    aget v3, p0, v2

    .line 17
    .line 18
    if-ne p1, v3, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    if-ge p1, v3, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    move v0, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    move p2, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 p0, -0x1

    .line 32
    return p0
.end method

.method public final R(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final S(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lqh1;->U(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, p1, p3}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final U(I)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object p0, p0, Lqh1;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method public final V(Ljava/lang/Object;Ld52;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lqh1;->a:[I

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    sget-object v5, Lqh1;->p:Lsun/misc/Unsafe;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const v9, 0xfffff

    .line 14
    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    :goto_0
    if-ge v8, v4, :cond_5

    .line 18
    .line 19
    invoke-virtual {v0, v8}, Lqh1;->U(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    aget v12, v3, v8

    .line 24
    .line 25
    invoke-static {v11}, Lqh1;->T(I)I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    const/16 v14, 0x11

    .line 30
    .line 31
    const/4 v15, 0x1

    .line 32
    if-gt v13, v14, :cond_1

    .line 33
    .line 34
    add-int/lit8 v14, v8, 0x2

    .line 35
    .line 36
    aget v14, v3, v14

    .line 37
    .line 38
    const v16, 0xfffff

    .line 39
    .line 40
    .line 41
    and-int v6, v14, v16

    .line 42
    .line 43
    if-eq v6, v9, :cond_0

    .line 44
    .line 45
    int-to-long v9, v6

    .line 46
    invoke-virtual {v5, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    move v9, v6

    .line 51
    :cond_0
    ushr-int/lit8 v6, v14, 0x14

    .line 52
    .line 53
    shl-int v6, v15, v6

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const v16, 0xfffff

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    :goto_1
    and-int v11, v11, v16

    .line 61
    .line 62
    move/from16 v17, v8

    .line 63
    .line 64
    int-to-long v7, v11

    .line 65
    const/16 v11, 0x3f

    .line 66
    .line 67
    packed-switch v13, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    move/from16 v13, v17

    .line 71
    .line 72
    :cond_2
    :goto_2
    const/4 v14, 0x0

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :pswitch_0
    move/from16 v13, v17

    .line 76
    .line 77
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v2, v12, v6, v7}, Ld52;->J(ILjava/lang/Object;Lh72;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_1
    move/from16 v13, v17

    .line 96
    .line 97
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_2

    .line 102
    .line 103
    invoke-static {v1, v7, v8}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Ljw;

    .line 110
    .line 111
    shl-long v17, v6, v15

    .line 112
    .line 113
    shr-long/2addr v6, v11

    .line 114
    xor-long v6, v17, v6

    .line 115
    .line 116
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :pswitch_2
    move/from16 v13, v17

    .line 121
    .line 122
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_2

    .line 127
    .line 128
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v7, Ljw;

    .line 135
    .line 136
    shl-int/lit8 v8, v6, 0x1

    .line 137
    .line 138
    shr-int/lit8 v6, v6, 0x1f

    .line 139
    .line 140
    xor-int/2addr v6, v8

    .line 141
    const/4 v14, 0x0

    .line 142
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v6}, Ljw;->s(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :pswitch_3
    move/from16 v13, v17

    .line 150
    .line 151
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_2

    .line 156
    .line 157
    invoke-static {v1, v7, v8}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v8, Ljw;

    .line 164
    .line 165
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_4
    move/from16 v13, v17

    .line 170
    .line 171
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_2

    .line 176
    .line 177
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v7, Ljw;

    .line 184
    .line 185
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :pswitch_5
    move/from16 v13, v17

    .line 190
    .line 191
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_2

    .line 196
    .line 197
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v7, Ljw;

    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, v6}, Ljw;->q(I)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_3

    .line 213
    .line 214
    :pswitch_6
    move/from16 v13, v17

    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-eqz v6, :cond_2

    .line 222
    .line 223
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v7, Ljw;

    .line 230
    .line 231
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v6}, Ljw;->s(I)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :pswitch_7
    move/from16 v13, v17

    .line 240
    .line 241
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-eqz v6, :cond_2

    .line 246
    .line 247
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    check-cast v6, Lvl;

    .line 252
    .line 253
    invoke-virtual {v2, v12, v6}, Ld52;->I(ILvl;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_2

    .line 257
    .line 258
    :pswitch_8
    move/from16 v13, v17

    .line 259
    .line 260
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v6, :cond_2

    .line 265
    .line 266
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-virtual {v2, v12, v6, v7}, Ld52;->K(ILjava/lang/Object;Lh72;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_2

    .line 278
    .line 279
    :pswitch_9
    move/from16 v13, v17

    .line 280
    .line 281
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_2

    .line 286
    .line 287
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-static {v12, v6, v2}, Lqh1;->W(ILjava/lang/Object;Ld52;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :pswitch_a
    move/from16 v13, v17

    .line 297
    .line 298
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-eqz v6, :cond_2

    .line 303
    .line 304
    sget-object v6, Lmy2;->c:Lky2;

    .line 305
    .line 306
    invoke-virtual {v6, v1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    check-cast v6, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v7, Ljw;

    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 322
    .line 323
    .line 324
    int-to-byte v6, v6

    .line 325
    invoke-virtual {v7, v6}, Ljw;->k(B)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    :pswitch_b
    move/from16 v13, v17

    .line 331
    .line 332
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_2

    .line 337
    .line 338
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 339
    .line 340
    .line 341
    move-result v6

    .line 342
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v7, Ljw;

    .line 345
    .line 346
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :pswitch_c
    move/from16 v13, v17

    .line 352
    .line 353
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_2

    .line 358
    .line 359
    invoke-static {v1, v7, v8}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 360
    .line 361
    .line 362
    move-result-wide v6

    .line 363
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v8, Ljw;

    .line 366
    .line 367
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_2

    .line 371
    .line 372
    :pswitch_d
    move/from16 v13, v17

    .line 373
    .line 374
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    if-eqz v6, :cond_2

    .line 379
    .line 380
    invoke-static {v1, v7, v8}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v7, Ljw;

    .line 387
    .line 388
    const/4 v14, 0x0

    .line 389
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v7, v6}, Ljw;->q(I)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_2

    .line 396
    .line 397
    :pswitch_e
    move/from16 v13, v17

    .line 398
    .line 399
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-eqz v6, :cond_2

    .line 404
    .line 405
    invoke-static {v1, v7, v8}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v8, Ljw;

    .line 412
    .line 413
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :pswitch_f
    move/from16 v13, v17

    .line 419
    .line 420
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-eqz v6, :cond_2

    .line 425
    .line 426
    invoke-static {v1, v7, v8}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v6

    .line 430
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v8, Ljw;

    .line 433
    .line 434
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_2

    .line 438
    .line 439
    :pswitch_10
    move/from16 v13, v17

    .line 440
    .line 441
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 442
    .line 443
    .line 444
    move-result v6

    .line 445
    if-eqz v6, :cond_2

    .line 446
    .line 447
    sget-object v6, Lmy2;->c:Lky2;

    .line 448
    .line 449
    invoke-virtual {v6, v1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    check-cast v6, Ljava/lang/Float;

    .line 454
    .line 455
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v7, Ljw;

    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_2

    .line 474
    .line 475
    :pswitch_11
    move/from16 v13, v17

    .line 476
    .line 477
    invoke-virtual {v0, v12, v1, v13}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-eqz v6, :cond_2

    .line 482
    .line 483
    sget-object v6, Lmy2;->c:Lky2;

    .line 484
    .line 485
    invoke-virtual {v6, v1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    check-cast v6, Ljava/lang/Double;

    .line 490
    .line 491
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v8, Ljw;

    .line 498
    .line 499
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 503
    .line 504
    .line 505
    move-result-wide v6

    .line 506
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_2

    .line 510
    .line 511
    :pswitch_12
    move/from16 v13, v17

    .line 512
    .line 513
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    if-nez v6, :cond_3

    .line 518
    .line 519
    goto/16 :goto_2

    .line 520
    .line 521
    :cond_3
    invoke-virtual {v0, v13}, Lqh1;->n(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    iget-object v0, v0, Lqh1;->n:Lhc1;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-static {v1}, Lpm2;->m(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    const/4 v0, 0x0

    .line 534
    throw v0

    .line 535
    :pswitch_13
    move/from16 v13, v17

    .line 536
    .line 537
    aget v6, v3, v13

    .line 538
    .line 539
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    check-cast v7, Ljava/util/List;

    .line 544
    .line 545
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    invoke-static {v6, v7, v2, v8}, Ll72;->F(ILjava/util/List;Ld52;Lh72;)V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_2

    .line 553
    .line 554
    :pswitch_14
    move/from16 v13, v17

    .line 555
    .line 556
    aget v6, v3, v13

    .line 557
    .line 558
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v7

    .line 562
    check-cast v7, Ljava/util/List;

    .line 563
    .line 564
    invoke-static {v6, v7, v2, v15}, Ll72;->M(ILjava/util/List;Ld52;Z)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_2

    .line 568
    .line 569
    :pswitch_15
    move/from16 v13, v17

    .line 570
    .line 571
    aget v6, v3, v13

    .line 572
    .line 573
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    check-cast v7, Ljava/util/List;

    .line 578
    .line 579
    invoke-static {v6, v7, v2, v15}, Ll72;->L(ILjava/util/List;Ld52;Z)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_2

    .line 583
    .line 584
    :pswitch_16
    move/from16 v13, v17

    .line 585
    .line 586
    aget v6, v3, v13

    .line 587
    .line 588
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    check-cast v7, Ljava/util/List;

    .line 593
    .line 594
    invoke-static {v6, v7, v2, v15}, Ll72;->K(ILjava/util/List;Ld52;Z)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_2

    .line 598
    .line 599
    :pswitch_17
    move/from16 v13, v17

    .line 600
    .line 601
    aget v6, v3, v13

    .line 602
    .line 603
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v7

    .line 607
    check-cast v7, Ljava/util/List;

    .line 608
    .line 609
    invoke-static {v6, v7, v2, v15}, Ll72;->J(ILjava/util/List;Ld52;Z)V

    .line 610
    .line 611
    .line 612
    goto/16 :goto_2

    .line 613
    .line 614
    :pswitch_18
    move/from16 v13, v17

    .line 615
    .line 616
    aget v6, v3, v13

    .line 617
    .line 618
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    check-cast v7, Ljava/util/List;

    .line 623
    .line 624
    invoke-static {v6, v7, v2, v15}, Ll72;->B(ILjava/util/List;Ld52;Z)V

    .line 625
    .line 626
    .line 627
    goto/16 :goto_2

    .line 628
    .line 629
    :pswitch_19
    move/from16 v13, v17

    .line 630
    .line 631
    aget v6, v3, v13

    .line 632
    .line 633
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    check-cast v7, Ljava/util/List;

    .line 638
    .line 639
    invoke-static {v6, v7, v2, v15}, Ll72;->O(ILjava/util/List;Ld52;Z)V

    .line 640
    .line 641
    .line 642
    goto/16 :goto_2

    .line 643
    .line 644
    :pswitch_1a
    move/from16 v13, v17

    .line 645
    .line 646
    aget v6, v3, v13

    .line 647
    .line 648
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    check-cast v7, Ljava/util/List;

    .line 653
    .line 654
    invoke-static {v6, v7, v2, v15}, Ll72;->y(ILjava/util/List;Ld52;Z)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_2

    .line 658
    .line 659
    :pswitch_1b
    move/from16 v13, v17

    .line 660
    .line 661
    aget v6, v3, v13

    .line 662
    .line 663
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    check-cast v7, Ljava/util/List;

    .line 668
    .line 669
    invoke-static {v6, v7, v2, v15}, Ll72;->C(ILjava/util/List;Ld52;Z)V

    .line 670
    .line 671
    .line 672
    goto/16 :goto_2

    .line 673
    .line 674
    :pswitch_1c
    move/from16 v13, v17

    .line 675
    .line 676
    aget v6, v3, v13

    .line 677
    .line 678
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v7

    .line 682
    check-cast v7, Ljava/util/List;

    .line 683
    .line 684
    invoke-static {v6, v7, v2, v15}, Ll72;->D(ILjava/util/List;Ld52;Z)V

    .line 685
    .line 686
    .line 687
    goto/16 :goto_2

    .line 688
    .line 689
    :pswitch_1d
    move/from16 v13, v17

    .line 690
    .line 691
    aget v6, v3, v13

    .line 692
    .line 693
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    check-cast v7, Ljava/util/List;

    .line 698
    .line 699
    invoke-static {v6, v7, v2, v15}, Ll72;->G(ILjava/util/List;Ld52;Z)V

    .line 700
    .line 701
    .line 702
    goto/16 :goto_2

    .line 703
    .line 704
    :pswitch_1e
    move/from16 v13, v17

    .line 705
    .line 706
    aget v6, v3, v13

    .line 707
    .line 708
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    check-cast v7, Ljava/util/List;

    .line 713
    .line 714
    invoke-static {v6, v7, v2, v15}, Ll72;->P(ILjava/util/List;Ld52;Z)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_2

    .line 718
    .line 719
    :pswitch_1f
    move/from16 v13, v17

    .line 720
    .line 721
    aget v6, v3, v13

    .line 722
    .line 723
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v7

    .line 727
    check-cast v7, Ljava/util/List;

    .line 728
    .line 729
    invoke-static {v6, v7, v2, v15}, Ll72;->H(ILjava/util/List;Ld52;Z)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_2

    .line 733
    .line 734
    :pswitch_20
    move/from16 v13, v17

    .line 735
    .line 736
    aget v6, v3, v13

    .line 737
    .line 738
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v7

    .line 742
    check-cast v7, Ljava/util/List;

    .line 743
    .line 744
    invoke-static {v6, v7, v2, v15}, Ll72;->E(ILjava/util/List;Ld52;Z)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_2

    .line 748
    .line 749
    :pswitch_21
    move/from16 v13, v17

    .line 750
    .line 751
    aget v6, v3, v13

    .line 752
    .line 753
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v7

    .line 757
    check-cast v7, Ljava/util/List;

    .line 758
    .line 759
    invoke-static {v6, v7, v2, v15}, Ll72;->A(ILjava/util/List;Ld52;Z)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_2

    .line 763
    .line 764
    :pswitch_22
    move/from16 v13, v17

    .line 765
    .line 766
    aget v6, v3, v13

    .line 767
    .line 768
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    check-cast v7, Ljava/util/List;

    .line 773
    .line 774
    const/4 v14, 0x0

    .line 775
    invoke-static {v6, v7, v2, v14}, Ll72;->M(ILjava/util/List;Ld52;Z)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_3

    .line 779
    .line 780
    :pswitch_23
    move/from16 v13, v17

    .line 781
    .line 782
    const/4 v14, 0x0

    .line 783
    aget v6, v3, v13

    .line 784
    .line 785
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v7

    .line 789
    check-cast v7, Ljava/util/List;

    .line 790
    .line 791
    invoke-static {v6, v7, v2, v14}, Ll72;->L(ILjava/util/List;Ld52;Z)V

    .line 792
    .line 793
    .line 794
    goto/16 :goto_3

    .line 795
    .line 796
    :pswitch_24
    move/from16 v13, v17

    .line 797
    .line 798
    const/4 v14, 0x0

    .line 799
    aget v6, v3, v13

    .line 800
    .line 801
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v7

    .line 805
    check-cast v7, Ljava/util/List;

    .line 806
    .line 807
    invoke-static {v6, v7, v2, v14}, Ll72;->K(ILjava/util/List;Ld52;Z)V

    .line 808
    .line 809
    .line 810
    goto/16 :goto_3

    .line 811
    .line 812
    :pswitch_25
    move/from16 v13, v17

    .line 813
    .line 814
    const/4 v14, 0x0

    .line 815
    aget v6, v3, v13

    .line 816
    .line 817
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v7

    .line 821
    check-cast v7, Ljava/util/List;

    .line 822
    .line 823
    invoke-static {v6, v7, v2, v14}, Ll72;->J(ILjava/util/List;Ld52;Z)V

    .line 824
    .line 825
    .line 826
    goto/16 :goto_3

    .line 827
    .line 828
    :pswitch_26
    move/from16 v13, v17

    .line 829
    .line 830
    const/4 v14, 0x0

    .line 831
    aget v6, v3, v13

    .line 832
    .line 833
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    check-cast v7, Ljava/util/List;

    .line 838
    .line 839
    invoke-static {v6, v7, v2, v14}, Ll72;->B(ILjava/util/List;Ld52;Z)V

    .line 840
    .line 841
    .line 842
    goto/16 :goto_3

    .line 843
    .line 844
    :pswitch_27
    move/from16 v13, v17

    .line 845
    .line 846
    const/4 v14, 0x0

    .line 847
    aget v6, v3, v13

    .line 848
    .line 849
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v7

    .line 853
    check-cast v7, Ljava/util/List;

    .line 854
    .line 855
    invoke-static {v6, v7, v2, v14}, Ll72;->O(ILjava/util/List;Ld52;Z)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_2

    .line 859
    .line 860
    :pswitch_28
    move/from16 v13, v17

    .line 861
    .line 862
    aget v6, v3, v13

    .line 863
    .line 864
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v7

    .line 868
    check-cast v7, Ljava/util/List;

    .line 869
    .line 870
    invoke-static {v6, v7, v2}, Ll72;->z(ILjava/util/List;Ld52;)V

    .line 871
    .line 872
    .line 873
    goto/16 :goto_2

    .line 874
    .line 875
    :pswitch_29
    move/from16 v13, v17

    .line 876
    .line 877
    aget v6, v3, v13

    .line 878
    .line 879
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v7

    .line 883
    check-cast v7, Ljava/util/List;

    .line 884
    .line 885
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 886
    .line 887
    .line 888
    move-result-object v8

    .line 889
    invoke-static {v6, v7, v2, v8}, Ll72;->I(ILjava/util/List;Ld52;Lh72;)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_2

    .line 893
    .line 894
    :pswitch_2a
    move/from16 v13, v17

    .line 895
    .line 896
    aget v6, v3, v13

    .line 897
    .line 898
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v7

    .line 902
    check-cast v7, Ljava/util/List;

    .line 903
    .line 904
    invoke-static {v6, v7, v2}, Ll72;->N(ILjava/util/List;Ld52;)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_2

    .line 908
    .line 909
    :pswitch_2b
    move/from16 v13, v17

    .line 910
    .line 911
    aget v6, v3, v13

    .line 912
    .line 913
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    check-cast v7, Ljava/util/List;

    .line 918
    .line 919
    const/4 v14, 0x0

    .line 920
    invoke-static {v6, v7, v2, v14}, Ll72;->y(ILjava/util/List;Ld52;Z)V

    .line 921
    .line 922
    .line 923
    goto/16 :goto_3

    .line 924
    .line 925
    :pswitch_2c
    move/from16 v13, v17

    .line 926
    .line 927
    const/4 v14, 0x0

    .line 928
    aget v6, v3, v13

    .line 929
    .line 930
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v7

    .line 934
    check-cast v7, Ljava/util/List;

    .line 935
    .line 936
    invoke-static {v6, v7, v2, v14}, Ll72;->C(ILjava/util/List;Ld52;Z)V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_3

    .line 940
    .line 941
    :pswitch_2d
    move/from16 v13, v17

    .line 942
    .line 943
    const/4 v14, 0x0

    .line 944
    aget v6, v3, v13

    .line 945
    .line 946
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v7

    .line 950
    check-cast v7, Ljava/util/List;

    .line 951
    .line 952
    invoke-static {v6, v7, v2, v14}, Ll72;->D(ILjava/util/List;Ld52;Z)V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_3

    .line 956
    .line 957
    :pswitch_2e
    move/from16 v13, v17

    .line 958
    .line 959
    const/4 v14, 0x0

    .line 960
    aget v6, v3, v13

    .line 961
    .line 962
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    check-cast v7, Ljava/util/List;

    .line 967
    .line 968
    invoke-static {v6, v7, v2, v14}, Ll72;->G(ILjava/util/List;Ld52;Z)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_3

    .line 972
    .line 973
    :pswitch_2f
    move/from16 v13, v17

    .line 974
    .line 975
    const/4 v14, 0x0

    .line 976
    aget v6, v3, v13

    .line 977
    .line 978
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v7

    .line 982
    check-cast v7, Ljava/util/List;

    .line 983
    .line 984
    invoke-static {v6, v7, v2, v14}, Ll72;->P(ILjava/util/List;Ld52;Z)V

    .line 985
    .line 986
    .line 987
    goto/16 :goto_3

    .line 988
    .line 989
    :pswitch_30
    move/from16 v13, v17

    .line 990
    .line 991
    const/4 v14, 0x0

    .line 992
    aget v6, v3, v13

    .line 993
    .line 994
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v7

    .line 998
    check-cast v7, Ljava/util/List;

    .line 999
    .line 1000
    invoke-static {v6, v7, v2, v14}, Ll72;->H(ILjava/util/List;Ld52;Z)V

    .line 1001
    .line 1002
    .line 1003
    goto/16 :goto_3

    .line 1004
    .line 1005
    :pswitch_31
    move/from16 v13, v17

    .line 1006
    .line 1007
    const/4 v14, 0x0

    .line 1008
    aget v6, v3, v13

    .line 1009
    .line 1010
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v7

    .line 1014
    check-cast v7, Ljava/util/List;

    .line 1015
    .line 1016
    invoke-static {v6, v7, v2, v14}, Ll72;->E(ILjava/util/List;Ld52;Z)V

    .line 1017
    .line 1018
    .line 1019
    goto/16 :goto_3

    .line 1020
    .line 1021
    :pswitch_32
    move/from16 v13, v17

    .line 1022
    .line 1023
    const/4 v14, 0x0

    .line 1024
    aget v6, v3, v13

    .line 1025
    .line 1026
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v7

    .line 1030
    check-cast v7, Ljava/util/List;

    .line 1031
    .line 1032
    invoke-static {v6, v7, v2, v14}, Ll72;->A(ILjava/util/List;Ld52;Z)V

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_2

    .line 1036
    .line 1037
    :pswitch_33
    move/from16 v13, v17

    .line 1038
    .line 1039
    and-int/2addr v6, v10

    .line 1040
    if-eqz v6, :cond_2

    .line 1041
    .line 1042
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v6

    .line 1046
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v7

    .line 1050
    invoke-virtual {v2, v12, v6, v7}, Ld52;->J(ILjava/lang/Object;Lh72;)V

    .line 1051
    .line 1052
    .line 1053
    goto/16 :goto_2

    .line 1054
    .line 1055
    :pswitch_34
    move/from16 v13, v17

    .line 1056
    .line 1057
    and-int/2addr v6, v10

    .line 1058
    if-eqz v6, :cond_2

    .line 1059
    .line 1060
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1061
    .line 1062
    .line 1063
    move-result-wide v6

    .line 1064
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1065
    .line 1066
    check-cast v8, Ljw;

    .line 1067
    .line 1068
    shl-long v17, v6, v15

    .line 1069
    .line 1070
    shr-long/2addr v6, v11

    .line 1071
    xor-long v6, v17, v6

    .line 1072
    .line 1073
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 1074
    .line 1075
    .line 1076
    goto/16 :goto_2

    .line 1077
    .line 1078
    :pswitch_35
    move/from16 v13, v17

    .line 1079
    .line 1080
    and-int/2addr v6, v10

    .line 1081
    if-eqz v6, :cond_2

    .line 1082
    .line 1083
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1084
    .line 1085
    .line 1086
    move-result v6

    .line 1087
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v7, Ljw;

    .line 1090
    .line 1091
    shl-int/lit8 v8, v6, 0x1

    .line 1092
    .line 1093
    shr-int/lit8 v6, v6, 0x1f

    .line 1094
    .line 1095
    xor-int/2addr v6, v8

    .line 1096
    const/4 v14, 0x0

    .line 1097
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v7, v6}, Ljw;->s(I)V

    .line 1101
    .line 1102
    .line 1103
    goto/16 :goto_2

    .line 1104
    .line 1105
    :pswitch_36
    move/from16 v13, v17

    .line 1106
    .line 1107
    and-int/2addr v6, v10

    .line 1108
    if-eqz v6, :cond_2

    .line 1109
    .line 1110
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1111
    .line 1112
    .line 1113
    move-result-wide v6

    .line 1114
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v8, Ljw;

    .line 1117
    .line 1118
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_2

    .line 1122
    .line 1123
    :pswitch_37
    move/from16 v13, v17

    .line 1124
    .line 1125
    and-int/2addr v6, v10

    .line 1126
    if-eqz v6, :cond_2

    .line 1127
    .line 1128
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1129
    .line 1130
    .line 1131
    move-result v6

    .line 1132
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v7, Ljw;

    .line 1135
    .line 1136
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 1137
    .line 1138
    .line 1139
    goto/16 :goto_2

    .line 1140
    .line 1141
    :pswitch_38
    move/from16 v13, v17

    .line 1142
    .line 1143
    and-int/2addr v6, v10

    .line 1144
    if-eqz v6, :cond_2

    .line 1145
    .line 1146
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1147
    .line 1148
    .line 1149
    move-result v6

    .line 1150
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v7, Ljw;

    .line 1153
    .line 1154
    const/4 v14, 0x0

    .line 1155
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v7, v6}, Ljw;->q(I)V

    .line 1159
    .line 1160
    .line 1161
    goto/16 :goto_3

    .line 1162
    .line 1163
    :pswitch_39
    move/from16 v13, v17

    .line 1164
    .line 1165
    const/4 v14, 0x0

    .line 1166
    and-int/2addr v6, v10

    .line 1167
    if-eqz v6, :cond_2

    .line 1168
    .line 1169
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1170
    .line 1171
    .line 1172
    move-result v6

    .line 1173
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1174
    .line 1175
    check-cast v7, Ljw;

    .line 1176
    .line 1177
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v7, v6}, Ljw;->s(I)V

    .line 1181
    .line 1182
    .line 1183
    goto/16 :goto_2

    .line 1184
    .line 1185
    :pswitch_3a
    move/from16 v13, v17

    .line 1186
    .line 1187
    and-int/2addr v6, v10

    .line 1188
    if-eqz v6, :cond_2

    .line 1189
    .line 1190
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v6

    .line 1194
    check-cast v6, Lvl;

    .line 1195
    .line 1196
    invoke-virtual {v2, v12, v6}, Ld52;->I(ILvl;)V

    .line 1197
    .line 1198
    .line 1199
    goto/16 :goto_2

    .line 1200
    .line 1201
    :pswitch_3b
    move/from16 v13, v17

    .line 1202
    .line 1203
    and-int/2addr v6, v10

    .line 1204
    if-eqz v6, :cond_2

    .line 1205
    .line 1206
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v6

    .line 1210
    invoke-virtual {v0, v13}, Lqh1;->o(I)Lh72;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v7

    .line 1214
    invoke-virtual {v2, v12, v6, v7}, Ld52;->K(ILjava/lang/Object;Lh72;)V

    .line 1215
    .line 1216
    .line 1217
    goto/16 :goto_2

    .line 1218
    .line 1219
    :pswitch_3c
    move/from16 v13, v17

    .line 1220
    .line 1221
    and-int/2addr v6, v10

    .line 1222
    if-eqz v6, :cond_2

    .line 1223
    .line 1224
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v6

    .line 1228
    invoke-static {v12, v6, v2}, Lqh1;->W(ILjava/lang/Object;Ld52;)V

    .line 1229
    .line 1230
    .line 1231
    goto/16 :goto_2

    .line 1232
    .line 1233
    :pswitch_3d
    move/from16 v13, v17

    .line 1234
    .line 1235
    and-int/2addr v6, v10

    .line 1236
    if-eqz v6, :cond_2

    .line 1237
    .line 1238
    sget-object v6, Lmy2;->c:Lky2;

    .line 1239
    .line 1240
    invoke-virtual {v6, v1, v7, v8}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v6

    .line 1244
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v7, Ljw;

    .line 1247
    .line 1248
    const/4 v14, 0x0

    .line 1249
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 1250
    .line 1251
    .line 1252
    int-to-byte v6, v6

    .line 1253
    invoke-virtual {v7, v6}, Ljw;->k(B)V

    .line 1254
    .line 1255
    .line 1256
    goto/16 :goto_2

    .line 1257
    .line 1258
    :pswitch_3e
    move/from16 v13, v17

    .line 1259
    .line 1260
    and-int/2addr v6, v10

    .line 1261
    if-eqz v6, :cond_2

    .line 1262
    .line 1263
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1264
    .line 1265
    .line 1266
    move-result v6

    .line 1267
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1268
    .line 1269
    check-cast v7, Ljw;

    .line 1270
    .line 1271
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 1272
    .line 1273
    .line 1274
    goto/16 :goto_2

    .line 1275
    .line 1276
    :pswitch_3f
    move/from16 v13, v17

    .line 1277
    .line 1278
    and-int/2addr v6, v10

    .line 1279
    if-eqz v6, :cond_2

    .line 1280
    .line 1281
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v6

    .line 1285
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1286
    .line 1287
    check-cast v8, Ljw;

    .line 1288
    .line 1289
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 1290
    .line 1291
    .line 1292
    goto/16 :goto_2

    .line 1293
    .line 1294
    :pswitch_40
    move/from16 v13, v17

    .line 1295
    .line 1296
    and-int/2addr v6, v10

    .line 1297
    if-eqz v6, :cond_2

    .line 1298
    .line 1299
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1300
    .line 1301
    .line 1302
    move-result v6

    .line 1303
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v7, Ljw;

    .line 1306
    .line 1307
    const/4 v14, 0x0

    .line 1308
    invoke-virtual {v7, v12, v14}, Ljw;->r(II)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v7, v6}, Ljw;->q(I)V

    .line 1312
    .line 1313
    .line 1314
    goto :goto_3

    .line 1315
    :pswitch_41
    move/from16 v13, v17

    .line 1316
    .line 1317
    const/4 v14, 0x0

    .line 1318
    and-int/2addr v6, v10

    .line 1319
    if-eqz v6, :cond_4

    .line 1320
    .line 1321
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1322
    .line 1323
    .line 1324
    move-result-wide v6

    .line 1325
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast v8, Ljw;

    .line 1328
    .line 1329
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_3

    .line 1333
    :pswitch_42
    move/from16 v13, v17

    .line 1334
    .line 1335
    const/4 v14, 0x0

    .line 1336
    and-int/2addr v6, v10

    .line 1337
    if-eqz v6, :cond_4

    .line 1338
    .line 1339
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v6

    .line 1343
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v8, Ljw;

    .line 1346
    .line 1347
    invoke-virtual {v8, v12, v6, v7}, Ljw;->t(IJ)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_3

    .line 1351
    :pswitch_43
    move/from16 v13, v17

    .line 1352
    .line 1353
    const/4 v14, 0x0

    .line 1354
    and-int/2addr v6, v10

    .line 1355
    if-eqz v6, :cond_4

    .line 1356
    .line 1357
    sget-object v6, Lmy2;->c:Lky2;

    .line 1358
    .line 1359
    invoke-virtual {v6, v1, v7, v8}, Lky2;->f(Ljava/lang/Object;J)F

    .line 1360
    .line 1361
    .line 1362
    move-result v6

    .line 1363
    iget-object v7, v2, Ld52;->a:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v7, Ljw;

    .line 1366
    .line 1367
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1371
    .line 1372
    .line 1373
    move-result v6

    .line 1374
    invoke-virtual {v7, v12, v6}, Ljw;->m(II)V

    .line 1375
    .line 1376
    .line 1377
    goto :goto_3

    .line 1378
    :pswitch_44
    move/from16 v13, v17

    .line 1379
    .line 1380
    const/4 v14, 0x0

    .line 1381
    and-int/2addr v6, v10

    .line 1382
    if-eqz v6, :cond_4

    .line 1383
    .line 1384
    sget-object v6, Lmy2;->c:Lky2;

    .line 1385
    .line 1386
    invoke-virtual {v6, v1, v7, v8}, Lky2;->e(Ljava/lang/Object;J)D

    .line 1387
    .line 1388
    .line 1389
    move-result-wide v6

    .line 1390
    iget-object v8, v2, Ld52;->a:Ljava/lang/Object;

    .line 1391
    .line 1392
    check-cast v8, Ljw;

    .line 1393
    .line 1394
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1395
    .line 1396
    .line 1397
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1398
    .line 1399
    .line 1400
    move-result-wide v6

    .line 1401
    invoke-virtual {v8, v12, v6, v7}, Ljw;->o(IJ)V

    .line 1402
    .line 1403
    .line 1404
    :cond_4
    :goto_3
    add-int/lit8 v8, v13, 0x3

    .line 1405
    .line 1406
    goto/16 :goto_0

    .line 1407
    .line 1408
    :cond_5
    iget-object v0, v0, Lqh1;->m:Ltx2;

    .line 1409
    .line 1410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1411
    .line 1412
    .line 1413
    move-object v0, v1

    .line 1414
    check-cast v0, Lsq0;

    .line 1415
    .line 1416
    iget-object v0, v0, Lsq0;->unknownFields:Lrx2;

    .line 1417
    .line 1418
    invoke-virtual {v0, v2}, Lrx2;->e(Ld52;)V

    .line 1419
    .line 1420
    .line 1421
    return-void

    .line 1422
    nop

    .line 1423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lqh1;->k(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lqh1;->a:[I

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lqh1;->U(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr v3, v2

    .line 21
    int-to-long v6, v3

    .line 22
    aget v1, v1, v0

    .line 23
    .line 24
    invoke-static {v2}, Lqh1;->T(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lqh1;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_1
    move-object v5, p1

    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :pswitch_1
    invoke-virtual {p0, v1, p2, v0}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    sget-object v2, Lmy2;->c:Lky2;

    .line 45
    .line 46
    invoke-virtual {v2, p2, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {p1, v6, v7, v2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1, p1, v0}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Lqh1;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_3
    invoke-virtual {p0, v1, p2, v0}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    sget-object v2, Lmy2;->c:Lky2;

    .line 68
    .line 69
    invoke-virtual {v2, p2, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {p1, v6, v7, v2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, p1, v0}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_4
    sget-object v1, Ll72;->a:Ljava/lang/Class;

    .line 81
    .line 82
    sget-object v1, Lmy2;->c:Lky2;

    .line 83
    .line 84
    invoke-virtual {v1, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, p2, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v3, p0, Lqh1;->n:Lhc1;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v1}, Lhc1;->b(Ljava/lang/Object;Ljava/lang/Object;)Lfc1;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {p1, v6, v7, v1}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_5
    iget-object v1, p0, Lqh1;->l:Lc81;

    .line 106
    .line 107
    invoke-virtual {v1, p1, v6, v7, p2}, Lc81;->b(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Lqh1;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    sget-object v1, Lmy2;->c:Lky2;

    .line 122
    .line 123
    invoke-virtual {v1, p2, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    invoke-static {p1, v6, v7, v1, v2}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    sget-object v1, Lmy2;->c:Lky2;

    .line 141
    .line 142
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_0

    .line 158
    .line 159
    sget-object v1, Lmy2;->c:Lky2;

    .line 160
    .line 161
    invoke-virtual {v1, p2, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v1

    .line 165
    invoke-static {p1, v6, v7, v1, v2}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_0

    .line 178
    .line 179
    sget-object v1, Lmy2;->c:Lky2;

    .line 180
    .line 181
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_0

    .line 198
    .line 199
    sget-object v1, Lmy2;->c:Lky2;

    .line 200
    .line 201
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_0

    .line 218
    .line 219
    sget-object v1, Lmy2;->c:Lky2;

    .line 220
    .line 221
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_0

    .line 238
    .line 239
    sget-object v1, Lmy2;->c:Lky2;

    .line 240
    .line 241
    invoke-virtual {v1, p2, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {p1, v6, v7, v1}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, Lqh1;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_0

    .line 263
    .line 264
    sget-object v1, Lmy2;->c:Lky2;

    .line 265
    .line 266
    invoke-virtual {v1, p2, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-static {p1, v6, v7, v1}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_0

    .line 283
    .line 284
    sget-object v1, Lmy2;->c:Lky2;

    .line 285
    .line 286
    invoke-virtual {v1, p2, v6, v7}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-virtual {v1, p1, v6, v7, v2}, Lky2;->k(Ljava/lang/Object;JZ)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_0

    .line 303
    .line 304
    sget-object v1, Lmy2;->c:Lky2;

    .line 305
    .line 306
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_0

    .line 323
    .line 324
    sget-object v1, Lmy2;->c:Lky2;

    .line 325
    .line 326
    invoke-virtual {v1, p2, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 327
    .line 328
    .line 329
    move-result-wide v1

    .line 330
    invoke-static {p1, v6, v7, v1, v2}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_0

    .line 343
    .line 344
    sget-object v1, Lmy2;->c:Lky2;

    .line 345
    .line 346
    invoke-virtual {v1, p2, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-static {p1, v1, v6, v7}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-eqz v1, :cond_0

    .line 363
    .line 364
    sget-object v1, Lmy2;->c:Lky2;

    .line 365
    .line 366
    invoke-virtual {v1, p2, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v1

    .line 370
    invoke-static {p1, v6, v7, v1, v2}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_1

    .line 377
    .line 378
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_0

    .line 383
    .line 384
    sget-object v1, Lmy2;->c:Lky2;

    .line 385
    .line 386
    invoke-virtual {v1, p2, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 387
    .line 388
    .line 389
    move-result-wide v1

    .line 390
    invoke-static {p1, v6, v7, v1, v2}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_1

    .line 397
    .line 398
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_0

    .line 403
    .line 404
    sget-object v1, Lmy2;->c:Lky2;

    .line 405
    .line 406
    invoke-virtual {v1, p2, v6, v7}, Lky2;->f(Ljava/lang/Object;J)F

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    invoke-virtual {v1, p1, v6, v7, v2}, Lky2;->n(Ljava/lang/Object;JF)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0, v0, p1}, Lqh1;->O(ILjava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_1

    .line 417
    .line 418
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_0

    .line 423
    .line 424
    sget-object v4, Lmy2;->c:Lky2;

    .line 425
    .line 426
    invoke-virtual {v4, p2, v6, v7}, Lky2;->e(Ljava/lang/Object;J)D

    .line 427
    .line 428
    .line 429
    move-result-wide v8

    .line 430
    move-object v5, p1

    .line 431
    invoke-virtual/range {v4 .. v9}, Lky2;->m(Ljava/lang/Object;JD)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0, v0, v5}, Lqh1;->O(ILjava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 438
    .line 439
    move-object p1, v5

    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_1
    move-object v5, p1

    .line 443
    iget-object p0, p0, Lqh1;->m:Ltx2;

    .line 444
    .line 445
    invoke-static {p0, v5, p2}, Ll72;->w(Ltx2;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    instance-of v0, p1, Lsq0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lsq0;

    .line 15
    .line 16
    const v2, 0x7fffffff

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lsq0;->u(I)V

    .line 20
    .line 21
    .line 22
    iput v1, v0, Lw;->memoizedHashCode:I

    .line 23
    .line 24
    invoke-virtual {v0}, Lsq0;->o()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lqh1;->a:[I

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    move v2, v1

    .line 31
    :goto_0
    if-ge v2, v0, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lqh1;->U(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const v4, 0xfffff

    .line 38
    .line 39
    .line 40
    and-int/2addr v4, v3

    .line 41
    int-to-long v4, v4

    .line 42
    invoke-static {v3}, Lqh1;->T(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/16 v6, 0x9

    .line 47
    .line 48
    if-eq v3, v6, :cond_2

    .line 49
    .line 50
    packed-switch v3, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_0
    sget-object v3, Lqh1;->p:Lsun/misc/Unsafe;

    .line 55
    .line 56
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    iget-object v7, p0, Lqh1;->n:Lhc1;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v7, v6

    .line 68
    check-cast v7, Lfc1;

    .line 69
    .line 70
    iput-boolean v1, v7, Lfc1;->a:Z

    .line 71
    .line 72
    invoke-virtual {v3, p1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_1
    iget-object v3, p0, Lqh1;->l:Lc81;

    .line 77
    .line 78
    invoke-virtual {v3, p1, v4, v5}, Lc81;->a(Ljava/lang/Object;J)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :pswitch_2
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    sget-object v6, Lqh1;->p:Lsun/misc/Unsafe;

    .line 93
    .line 94
    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v3, v4}, Lh72;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    iget-object p0, p0, Lqh1;->m:Ltx2;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast p1, Lsq0;

    .line 110
    .line 111
    iget-object p0, p1, Lsq0;->unknownFields:Lrx2;

    .line 112
    .line 113
    iput-boolean v1, p0, Lrx2;->e:Z

    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v3, v0

    .line 6
    move v2, v1

    .line 7
    move v4, v2

    .line 8
    :goto_0
    iget v5, p0, Lqh1;->i:I

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_f

    .line 12
    .line 13
    iget-object v5, p0, Lqh1;->h:[I

    .line 14
    .line 15
    aget v5, v5, v2

    .line 16
    .line 17
    iget-object v7, p0, Lqh1;->a:[I

    .line 18
    .line 19
    aget v8, v7, v5

    .line 20
    .line 21
    invoke-virtual {p0, v5}, Lqh1;->U(I)I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    add-int/lit8 v10, v5, 0x2

    .line 26
    .line 27
    aget v7, v7, v10

    .line 28
    .line 29
    and-int v10, v7, v0

    .line 30
    .line 31
    ushr-int/lit8 v7, v7, 0x14

    .line 32
    .line 33
    shl-int v7, v6, v7

    .line 34
    .line 35
    if-eq v10, v3, :cond_1

    .line 36
    .line 37
    if-eq v10, v0, :cond_0

    .line 38
    .line 39
    sget-object v3, Lqh1;->p:Lsun/misc/Unsafe;

    .line 40
    .line 41
    int-to-long v11, v10

    .line 42
    invoke-virtual {v3, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    :cond_0
    move v3, v10

    .line 47
    :cond_1
    const/high16 v10, 0x10000000

    .line 48
    .line 49
    and-int/2addr v10, v9

    .line 50
    if-eqz v10, :cond_4

    .line 51
    .line 52
    if-ne v3, v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v5, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    and-int v10, v4, v7

    .line 60
    .line 61
    if-eqz v10, :cond_3

    .line 62
    .line 63
    move v10, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v10, v1

    .line 66
    :goto_1
    if-nez v10, :cond_4

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_4
    invoke-static {v9}, Lqh1;->T(I)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const/16 v11, 0x9

    .line 75
    .line 76
    if-eq v10, v11, :cond_b

    .line 77
    .line 78
    const/16 v11, 0x11

    .line 79
    .line 80
    if-eq v10, v11, :cond_b

    .line 81
    .line 82
    const/16 v6, 0x1b

    .line 83
    .line 84
    if-eq v10, v6, :cond_8

    .line 85
    .line 86
    const/16 v6, 0x3c

    .line 87
    .line 88
    if-eq v10, v6, :cond_7

    .line 89
    .line 90
    const/16 v6, 0x44

    .line 91
    .line 92
    if-eq v10, v6, :cond_7

    .line 93
    .line 94
    const/16 v6, 0x31

    .line 95
    .line 96
    if-eq v10, v6, :cond_8

    .line 97
    .line 98
    const/16 v6, 0x32

    .line 99
    .line 100
    if-eq v10, v6, :cond_5

    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_5
    and-int v6, v9, v0

    .line 105
    .line 106
    int-to-long v6, v6

    .line 107
    sget-object v8, Lmy2;->c:Lky2;

    .line 108
    .line 109
    invoke-virtual {v8, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    iget-object v7, p0, Lqh1;->n:Lhc1;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    check-cast v6, Lfc1;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_6
    invoke-virtual {p0, v5}, Lqh1;->n(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Lpm2;->m(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    const/4 p0, 0x0

    .line 136
    throw p0

    .line 137
    :cond_7
    invoke-virtual {p0, v8, p1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_e

    .line 142
    .line 143
    invoke-virtual {p0, v5}, Lqh1;->o(I)Lh72;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    and-int v6, v9, v0

    .line 148
    .line 149
    int-to-long v6, v6

    .line 150
    sget-object v8, Lmy2;->c:Lky2;

    .line 151
    .line 152
    invoke-virtual {v8, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-interface {v5, v6}, Lh72;->c(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_e

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_8
    and-int v6, v9, v0

    .line 164
    .line 165
    int-to-long v6, v6

    .line 166
    sget-object v8, Lmy2;->c:Lky2;

    .line 167
    .line 168
    invoke-virtual {v8, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_9

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    invoke-virtual {p0, v5}, Lqh1;->o(I)Lh72;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    move v7, v1

    .line 186
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-ge v7, v8, :cond_e

    .line 191
    .line 192
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-interface {v5, v8}, Lh72;->c(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-nez v8, :cond_a

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_b
    if-ne v3, v0, :cond_c

    .line 207
    .line 208
    invoke-virtual {p0, v5, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    goto :goto_3

    .line 213
    :cond_c
    and-int/2addr v7, v4

    .line 214
    if-eqz v7, :cond_d

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_d
    move v6, v1

    .line 218
    :goto_3
    if-eqz v6, :cond_e

    .line 219
    .line 220
    invoke-virtual {p0, v5}, Lqh1;->o(I)Lh72;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    and-int v6, v9, v0

    .line 225
    .line 226
    int-to-long v6, v6

    .line 227
    sget-object v8, Lmy2;->c:Lky2;

    .line 228
    .line 229
    invoke-virtual {v8, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-interface {v5, v6}, Lh72;->c(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_e

    .line 238
    .line 239
    :goto_4
    return v1

    .line 240
    :cond_e
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_f
    return v6
.end method

.method public final d(Lsq0;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqh1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lqh1;->q(Lsq0;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lqh1;->p(Lsq0;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final e(Ljava/lang/Object;Ld52;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Ld52;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Ljw;

    .line 13
    .line 14
    iget-boolean v4, v0, Lqh1;->g:Z

    .line 15
    .line 16
    if-eqz v4, :cond_3

    .line 17
    .line 18
    iget-object v4, v0, Lqh1;->a:[I

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    const/4 v6, 0x0

    .line 22
    move v7, v6

    .line 23
    :goto_0
    if-ge v7, v5, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0, v7}, Lqh1;->U(I)I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    aget v9, v4, v7

    .line 30
    .line 31
    invoke-static {v8}, Lqh1;->T(I)I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    const/16 v11, 0x3f

    .line 36
    .line 37
    const/4 v12, 0x1

    .line 38
    const v13, 0xfffff

    .line 39
    .line 40
    .line 41
    packed-switch v10, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :pswitch_0
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_1

    .line 51
    .line 52
    and-int/2addr v8, v13

    .line 53
    int-to-long v10, v8

    .line 54
    sget-object v8, Lmy2;->c:Lky2;

    .line 55
    .line 56
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v2, v9, v8, v10}, Ld52;->J(ILjava/lang/Object;Lh72;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :pswitch_1
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_1

    .line 74
    .line 75
    and-int/2addr v8, v13

    .line 76
    int-to-long v13, v8

    .line 77
    invoke-static {v1, v13, v14}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    shl-long v15, v13, v12

    .line 82
    .line 83
    shr-long v10, v13, v11

    .line 84
    .line 85
    xor-long/2addr v10, v15

    .line 86
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :pswitch_2
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_1

    .line 96
    .line 97
    and-int/2addr v8, v13

    .line 98
    int-to-long v10, v8

    .line 99
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    shl-int/lit8 v10, v8, 0x1

    .line 104
    .line 105
    shr-int/lit8 v8, v8, 0x1f

    .line 106
    .line 107
    xor-int/2addr v8, v10

    .line 108
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v8}, Ljw;->s(I)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :pswitch_3
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eqz v10, :cond_1

    .line 121
    .line 122
    and-int/2addr v8, v13

    .line 123
    int-to-long v10, v8

    .line 124
    invoke-static {v1, v10, v11}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :pswitch_4
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_1

    .line 138
    .line 139
    and-int/2addr v8, v13

    .line 140
    int-to-long v10, v8

    .line 141
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :pswitch_5
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_1

    .line 155
    .line 156
    and-int/2addr v8, v13

    .line 157
    int-to-long v10, v8

    .line 158
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v8}, Ljw;->q(I)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :pswitch_6
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-eqz v10, :cond_1

    .line 175
    .line 176
    and-int/2addr v8, v13

    .line 177
    int-to-long v10, v8

    .line 178
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v8}, Ljw;->s(I)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :pswitch_7
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_1

    .line 195
    .line 196
    and-int/2addr v8, v13

    .line 197
    int-to-long v10, v8

    .line 198
    sget-object v8, Lmy2;->c:Lky2;

    .line 199
    .line 200
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    check-cast v8, Lvl;

    .line 205
    .line 206
    invoke-virtual {v2, v9, v8}, Ld52;->I(ILvl;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :pswitch_8
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_1

    .line 216
    .line 217
    and-int/2addr v8, v13

    .line 218
    int-to-long v10, v8

    .line 219
    sget-object v8, Lmy2;->c:Lky2;

    .line 220
    .line 221
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-virtual {v2, v9, v8, v10}, Ld52;->K(ILjava/lang/Object;Lh72;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :pswitch_9
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    if-eqz v10, :cond_1

    .line 239
    .line 240
    and-int/2addr v8, v13

    .line 241
    int-to-long v10, v8

    .line 242
    sget-object v8, Lmy2;->c:Lky2;

    .line 243
    .line 244
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-static {v9, v8, v2}, Lqh1;->W(ILjava/lang/Object;Ld52;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_a
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-eqz v10, :cond_1

    .line 258
    .line 259
    and-int/2addr v8, v13

    .line 260
    int-to-long v10, v8

    .line 261
    sget-object v8, Lmy2;->c:Lky2;

    .line 262
    .line 263
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    check-cast v8, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 274
    .line 275
    .line 276
    int-to-byte v8, v8

    .line 277
    invoke-virtual {v3, v8}, Ljw;->k(B)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :pswitch_b
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    if-eqz v10, :cond_1

    .line 287
    .line 288
    and-int/2addr v8, v13

    .line 289
    int-to-long v10, v8

    .line 290
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :pswitch_c
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    if-eqz v10, :cond_1

    .line 304
    .line 305
    and-int/2addr v8, v13

    .line 306
    int-to-long v10, v8

    .line 307
    invoke-static {v1, v10, v11}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 308
    .line 309
    .line 310
    move-result-wide v10

    .line 311
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :pswitch_d
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    if-eqz v10, :cond_1

    .line 321
    .line 322
    and-int/2addr v8, v13

    .line 323
    int-to-long v10, v8

    .line 324
    invoke-static {v1, v10, v11}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v8}, Ljw;->q(I)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    :pswitch_e
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-eqz v10, :cond_1

    .line 341
    .line 342
    and-int/2addr v8, v13

    .line 343
    int-to-long v10, v8

    .line 344
    invoke-static {v1, v10, v11}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 345
    .line 346
    .line 347
    move-result-wide v10

    .line 348
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :pswitch_f
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    if-eqz v10, :cond_1

    .line 358
    .line 359
    and-int/2addr v8, v13

    .line 360
    int-to-long v10, v8

    .line 361
    invoke-static {v1, v10, v11}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 362
    .line 363
    .line 364
    move-result-wide v10

    .line 365
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :pswitch_10
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    if-eqz v10, :cond_1

    .line 375
    .line 376
    and-int/2addr v8, v13

    .line 377
    int-to-long v10, v8

    .line 378
    sget-object v8, Lmy2;->c:Lky2;

    .line 379
    .line 380
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    check-cast v8, Ljava/lang/Float;

    .line 385
    .line 386
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_1

    .line 401
    .line 402
    :pswitch_11
    invoke-virtual {v0, v9, v1, v7}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 403
    .line 404
    .line 405
    move-result v10

    .line 406
    if-eqz v10, :cond_1

    .line 407
    .line 408
    and-int/2addr v8, v13

    .line 409
    int-to-long v10, v8

    .line 410
    sget-object v8, Lmy2;->c:Lky2;

    .line 411
    .line 412
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    check-cast v8, Ljava/lang/Double;

    .line 417
    .line 418
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 419
    .line 420
    .line 421
    move-result-wide v10

    .line 422
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 426
    .line 427
    .line 428
    move-result-wide v10

    .line 429
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_12
    and-int/2addr v8, v13

    .line 435
    int-to-long v8, v8

    .line 436
    sget-object v10, Lmy2;->c:Lky2;

    .line 437
    .line 438
    invoke-virtual {v10, v1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    if-nez v8, :cond_0

    .line 443
    .line 444
    goto/16 :goto_1

    .line 445
    .line 446
    :cond_0
    invoke-virtual {v0, v7}, Lqh1;->n(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    iget-object v0, v0, Lqh1;->n:Lhc1;

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-static {v1}, Lpm2;->m(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    const/4 v0, 0x0

    .line 459
    throw v0

    .line 460
    :pswitch_13
    aget v9, v4, v7

    .line 461
    .line 462
    and-int/2addr v8, v13

    .line 463
    int-to-long v10, v8

    .line 464
    sget-object v8, Lmy2;->c:Lky2;

    .line 465
    .line 466
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    check-cast v8, Ljava/util/List;

    .line 471
    .line 472
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    invoke-static {v9, v8, v2, v10}, Ll72;->F(ILjava/util/List;Ld52;Lh72;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_1

    .line 480
    .line 481
    :pswitch_14
    aget v9, v4, v7

    .line 482
    .line 483
    and-int/2addr v8, v13

    .line 484
    int-to-long v10, v8

    .line 485
    sget-object v8, Lmy2;->c:Lky2;

    .line 486
    .line 487
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    check-cast v8, Ljava/util/List;

    .line 492
    .line 493
    invoke-static {v9, v8, v2, v12}, Ll72;->M(ILjava/util/List;Ld52;Z)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_1

    .line 497
    .line 498
    :pswitch_15
    aget v9, v4, v7

    .line 499
    .line 500
    and-int/2addr v8, v13

    .line 501
    int-to-long v10, v8

    .line 502
    sget-object v8, Lmy2;->c:Lky2;

    .line 503
    .line 504
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v8

    .line 508
    check-cast v8, Ljava/util/List;

    .line 509
    .line 510
    invoke-static {v9, v8, v2, v12}, Ll72;->L(ILjava/util/List;Ld52;Z)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_1

    .line 514
    .line 515
    :pswitch_16
    aget v9, v4, v7

    .line 516
    .line 517
    and-int/2addr v8, v13

    .line 518
    int-to-long v10, v8

    .line 519
    sget-object v8, Lmy2;->c:Lky2;

    .line 520
    .line 521
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v8

    .line 525
    check-cast v8, Ljava/util/List;

    .line 526
    .line 527
    invoke-static {v9, v8, v2, v12}, Ll72;->K(ILjava/util/List;Ld52;Z)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_1

    .line 531
    .line 532
    :pswitch_17
    aget v9, v4, v7

    .line 533
    .line 534
    and-int/2addr v8, v13

    .line 535
    int-to-long v10, v8

    .line 536
    sget-object v8, Lmy2;->c:Lky2;

    .line 537
    .line 538
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v8

    .line 542
    check-cast v8, Ljava/util/List;

    .line 543
    .line 544
    invoke-static {v9, v8, v2, v12}, Ll72;->J(ILjava/util/List;Ld52;Z)V

    .line 545
    .line 546
    .line 547
    goto/16 :goto_1

    .line 548
    .line 549
    :pswitch_18
    aget v9, v4, v7

    .line 550
    .line 551
    and-int/2addr v8, v13

    .line 552
    int-to-long v10, v8

    .line 553
    sget-object v8, Lmy2;->c:Lky2;

    .line 554
    .line 555
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    check-cast v8, Ljava/util/List;

    .line 560
    .line 561
    invoke-static {v9, v8, v2, v12}, Ll72;->B(ILjava/util/List;Ld52;Z)V

    .line 562
    .line 563
    .line 564
    goto/16 :goto_1

    .line 565
    .line 566
    :pswitch_19
    aget v9, v4, v7

    .line 567
    .line 568
    and-int/2addr v8, v13

    .line 569
    int-to-long v10, v8

    .line 570
    sget-object v8, Lmy2;->c:Lky2;

    .line 571
    .line 572
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    check-cast v8, Ljava/util/List;

    .line 577
    .line 578
    invoke-static {v9, v8, v2, v12}, Ll72;->O(ILjava/util/List;Ld52;Z)V

    .line 579
    .line 580
    .line 581
    goto/16 :goto_1

    .line 582
    .line 583
    :pswitch_1a
    aget v9, v4, v7

    .line 584
    .line 585
    and-int/2addr v8, v13

    .line 586
    int-to-long v10, v8

    .line 587
    sget-object v8, Lmy2;->c:Lky2;

    .line 588
    .line 589
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    check-cast v8, Ljava/util/List;

    .line 594
    .line 595
    invoke-static {v9, v8, v2, v12}, Ll72;->y(ILjava/util/List;Ld52;Z)V

    .line 596
    .line 597
    .line 598
    goto/16 :goto_1

    .line 599
    .line 600
    :pswitch_1b
    aget v9, v4, v7

    .line 601
    .line 602
    and-int/2addr v8, v13

    .line 603
    int-to-long v10, v8

    .line 604
    sget-object v8, Lmy2;->c:Lky2;

    .line 605
    .line 606
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    check-cast v8, Ljava/util/List;

    .line 611
    .line 612
    invoke-static {v9, v8, v2, v12}, Ll72;->C(ILjava/util/List;Ld52;Z)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :pswitch_1c
    aget v9, v4, v7

    .line 618
    .line 619
    and-int/2addr v8, v13

    .line 620
    int-to-long v10, v8

    .line 621
    sget-object v8, Lmy2;->c:Lky2;

    .line 622
    .line 623
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v8

    .line 627
    check-cast v8, Ljava/util/List;

    .line 628
    .line 629
    invoke-static {v9, v8, v2, v12}, Ll72;->D(ILjava/util/List;Ld52;Z)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_1

    .line 633
    .line 634
    :pswitch_1d
    aget v9, v4, v7

    .line 635
    .line 636
    and-int/2addr v8, v13

    .line 637
    int-to-long v10, v8

    .line 638
    sget-object v8, Lmy2;->c:Lky2;

    .line 639
    .line 640
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v8

    .line 644
    check-cast v8, Ljava/util/List;

    .line 645
    .line 646
    invoke-static {v9, v8, v2, v12}, Ll72;->G(ILjava/util/List;Ld52;Z)V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_1

    .line 650
    .line 651
    :pswitch_1e
    aget v9, v4, v7

    .line 652
    .line 653
    and-int/2addr v8, v13

    .line 654
    int-to-long v10, v8

    .line 655
    sget-object v8, Lmy2;->c:Lky2;

    .line 656
    .line 657
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v8

    .line 661
    check-cast v8, Ljava/util/List;

    .line 662
    .line 663
    invoke-static {v9, v8, v2, v12}, Ll72;->P(ILjava/util/List;Ld52;Z)V

    .line 664
    .line 665
    .line 666
    goto/16 :goto_1

    .line 667
    .line 668
    :pswitch_1f
    aget v9, v4, v7

    .line 669
    .line 670
    and-int/2addr v8, v13

    .line 671
    int-to-long v10, v8

    .line 672
    sget-object v8, Lmy2;->c:Lky2;

    .line 673
    .line 674
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v8

    .line 678
    check-cast v8, Ljava/util/List;

    .line 679
    .line 680
    invoke-static {v9, v8, v2, v12}, Ll72;->H(ILjava/util/List;Ld52;Z)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_1

    .line 684
    .line 685
    :pswitch_20
    aget v9, v4, v7

    .line 686
    .line 687
    and-int/2addr v8, v13

    .line 688
    int-to-long v10, v8

    .line 689
    sget-object v8, Lmy2;->c:Lky2;

    .line 690
    .line 691
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    check-cast v8, Ljava/util/List;

    .line 696
    .line 697
    invoke-static {v9, v8, v2, v12}, Ll72;->E(ILjava/util/List;Ld52;Z)V

    .line 698
    .line 699
    .line 700
    goto/16 :goto_1

    .line 701
    .line 702
    :pswitch_21
    aget v9, v4, v7

    .line 703
    .line 704
    and-int/2addr v8, v13

    .line 705
    int-to-long v10, v8

    .line 706
    sget-object v8, Lmy2;->c:Lky2;

    .line 707
    .line 708
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v8

    .line 712
    check-cast v8, Ljava/util/List;

    .line 713
    .line 714
    invoke-static {v9, v8, v2, v12}, Ll72;->A(ILjava/util/List;Ld52;Z)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_1

    .line 718
    .line 719
    :pswitch_22
    aget v9, v4, v7

    .line 720
    .line 721
    and-int/2addr v8, v13

    .line 722
    int-to-long v10, v8

    .line 723
    sget-object v8, Lmy2;->c:Lky2;

    .line 724
    .line 725
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v8

    .line 729
    check-cast v8, Ljava/util/List;

    .line 730
    .line 731
    invoke-static {v9, v8, v2, v6}, Ll72;->M(ILjava/util/List;Ld52;Z)V

    .line 732
    .line 733
    .line 734
    goto/16 :goto_1

    .line 735
    .line 736
    :pswitch_23
    aget v9, v4, v7

    .line 737
    .line 738
    and-int/2addr v8, v13

    .line 739
    int-to-long v10, v8

    .line 740
    sget-object v8, Lmy2;->c:Lky2;

    .line 741
    .line 742
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v8

    .line 746
    check-cast v8, Ljava/util/List;

    .line 747
    .line 748
    invoke-static {v9, v8, v2, v6}, Ll72;->L(ILjava/util/List;Ld52;Z)V

    .line 749
    .line 750
    .line 751
    goto/16 :goto_1

    .line 752
    .line 753
    :pswitch_24
    aget v9, v4, v7

    .line 754
    .line 755
    and-int/2addr v8, v13

    .line 756
    int-to-long v10, v8

    .line 757
    sget-object v8, Lmy2;->c:Lky2;

    .line 758
    .line 759
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v8

    .line 763
    check-cast v8, Ljava/util/List;

    .line 764
    .line 765
    invoke-static {v9, v8, v2, v6}, Ll72;->K(ILjava/util/List;Ld52;Z)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_1

    .line 769
    .line 770
    :pswitch_25
    aget v9, v4, v7

    .line 771
    .line 772
    and-int/2addr v8, v13

    .line 773
    int-to-long v10, v8

    .line 774
    sget-object v8, Lmy2;->c:Lky2;

    .line 775
    .line 776
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v8

    .line 780
    check-cast v8, Ljava/util/List;

    .line 781
    .line 782
    invoke-static {v9, v8, v2, v6}, Ll72;->J(ILjava/util/List;Ld52;Z)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_1

    .line 786
    .line 787
    :pswitch_26
    aget v9, v4, v7

    .line 788
    .line 789
    and-int/2addr v8, v13

    .line 790
    int-to-long v10, v8

    .line 791
    sget-object v8, Lmy2;->c:Lky2;

    .line 792
    .line 793
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    check-cast v8, Ljava/util/List;

    .line 798
    .line 799
    invoke-static {v9, v8, v2, v6}, Ll72;->B(ILjava/util/List;Ld52;Z)V

    .line 800
    .line 801
    .line 802
    goto/16 :goto_1

    .line 803
    .line 804
    :pswitch_27
    aget v9, v4, v7

    .line 805
    .line 806
    and-int/2addr v8, v13

    .line 807
    int-to-long v10, v8

    .line 808
    sget-object v8, Lmy2;->c:Lky2;

    .line 809
    .line 810
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v8

    .line 814
    check-cast v8, Ljava/util/List;

    .line 815
    .line 816
    invoke-static {v9, v8, v2, v6}, Ll72;->O(ILjava/util/List;Ld52;Z)V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_1

    .line 820
    .line 821
    :pswitch_28
    aget v9, v4, v7

    .line 822
    .line 823
    and-int/2addr v8, v13

    .line 824
    int-to-long v10, v8

    .line 825
    sget-object v8, Lmy2;->c:Lky2;

    .line 826
    .line 827
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v8

    .line 831
    check-cast v8, Ljava/util/List;

    .line 832
    .line 833
    invoke-static {v9, v8, v2}, Ll72;->z(ILjava/util/List;Ld52;)V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_1

    .line 837
    .line 838
    :pswitch_29
    aget v9, v4, v7

    .line 839
    .line 840
    and-int/2addr v8, v13

    .line 841
    int-to-long v10, v8

    .line 842
    sget-object v8, Lmy2;->c:Lky2;

    .line 843
    .line 844
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v8

    .line 848
    check-cast v8, Ljava/util/List;

    .line 849
    .line 850
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 851
    .line 852
    .line 853
    move-result-object v10

    .line 854
    invoke-static {v9, v8, v2, v10}, Ll72;->I(ILjava/util/List;Ld52;Lh72;)V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_1

    .line 858
    .line 859
    :pswitch_2a
    aget v9, v4, v7

    .line 860
    .line 861
    and-int/2addr v8, v13

    .line 862
    int-to-long v10, v8

    .line 863
    sget-object v8, Lmy2;->c:Lky2;

    .line 864
    .line 865
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v8

    .line 869
    check-cast v8, Ljava/util/List;

    .line 870
    .line 871
    invoke-static {v9, v8, v2}, Ll72;->N(ILjava/util/List;Ld52;)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_1

    .line 875
    .line 876
    :pswitch_2b
    aget v9, v4, v7

    .line 877
    .line 878
    and-int/2addr v8, v13

    .line 879
    int-to-long v10, v8

    .line 880
    sget-object v8, Lmy2;->c:Lky2;

    .line 881
    .line 882
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v8

    .line 886
    check-cast v8, Ljava/util/List;

    .line 887
    .line 888
    invoke-static {v9, v8, v2, v6}, Ll72;->y(ILjava/util/List;Ld52;Z)V

    .line 889
    .line 890
    .line 891
    goto/16 :goto_1

    .line 892
    .line 893
    :pswitch_2c
    aget v9, v4, v7

    .line 894
    .line 895
    and-int/2addr v8, v13

    .line 896
    int-to-long v10, v8

    .line 897
    sget-object v8, Lmy2;->c:Lky2;

    .line 898
    .line 899
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v8

    .line 903
    check-cast v8, Ljava/util/List;

    .line 904
    .line 905
    invoke-static {v9, v8, v2, v6}, Ll72;->C(ILjava/util/List;Ld52;Z)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_1

    .line 909
    .line 910
    :pswitch_2d
    aget v9, v4, v7

    .line 911
    .line 912
    and-int/2addr v8, v13

    .line 913
    int-to-long v10, v8

    .line 914
    sget-object v8, Lmy2;->c:Lky2;

    .line 915
    .line 916
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v8

    .line 920
    check-cast v8, Ljava/util/List;

    .line 921
    .line 922
    invoke-static {v9, v8, v2, v6}, Ll72;->D(ILjava/util/List;Ld52;Z)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_1

    .line 926
    .line 927
    :pswitch_2e
    aget v9, v4, v7

    .line 928
    .line 929
    and-int/2addr v8, v13

    .line 930
    int-to-long v10, v8

    .line 931
    sget-object v8, Lmy2;->c:Lky2;

    .line 932
    .line 933
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v8

    .line 937
    check-cast v8, Ljava/util/List;

    .line 938
    .line 939
    invoke-static {v9, v8, v2, v6}, Ll72;->G(ILjava/util/List;Ld52;Z)V

    .line 940
    .line 941
    .line 942
    goto/16 :goto_1

    .line 943
    .line 944
    :pswitch_2f
    aget v9, v4, v7

    .line 945
    .line 946
    and-int/2addr v8, v13

    .line 947
    int-to-long v10, v8

    .line 948
    sget-object v8, Lmy2;->c:Lky2;

    .line 949
    .line 950
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    check-cast v8, Ljava/util/List;

    .line 955
    .line 956
    invoke-static {v9, v8, v2, v6}, Ll72;->P(ILjava/util/List;Ld52;Z)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_1

    .line 960
    .line 961
    :pswitch_30
    aget v9, v4, v7

    .line 962
    .line 963
    and-int/2addr v8, v13

    .line 964
    int-to-long v10, v8

    .line 965
    sget-object v8, Lmy2;->c:Lky2;

    .line 966
    .line 967
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v8

    .line 971
    check-cast v8, Ljava/util/List;

    .line 972
    .line 973
    invoke-static {v9, v8, v2, v6}, Ll72;->H(ILjava/util/List;Ld52;Z)V

    .line 974
    .line 975
    .line 976
    goto/16 :goto_1

    .line 977
    .line 978
    :pswitch_31
    aget v9, v4, v7

    .line 979
    .line 980
    and-int/2addr v8, v13

    .line 981
    int-to-long v10, v8

    .line 982
    sget-object v8, Lmy2;->c:Lky2;

    .line 983
    .line 984
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v8

    .line 988
    check-cast v8, Ljava/util/List;

    .line 989
    .line 990
    invoke-static {v9, v8, v2, v6}, Ll72;->E(ILjava/util/List;Ld52;Z)V

    .line 991
    .line 992
    .line 993
    goto/16 :goto_1

    .line 994
    .line 995
    :pswitch_32
    aget v9, v4, v7

    .line 996
    .line 997
    and-int/2addr v8, v13

    .line 998
    int-to-long v10, v8

    .line 999
    sget-object v8, Lmy2;->c:Lky2;

    .line 1000
    .line 1001
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v8

    .line 1005
    check-cast v8, Ljava/util/List;

    .line 1006
    .line 1007
    invoke-static {v9, v8, v2, v6}, Ll72;->A(ILjava/util/List;Ld52;Z)V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_1

    .line 1011
    .line 1012
    :pswitch_33
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v10

    .line 1016
    if-eqz v10, :cond_1

    .line 1017
    .line 1018
    and-int/2addr v8, v13

    .line 1019
    int-to-long v10, v8

    .line 1020
    sget-object v8, Lmy2;->c:Lky2;

    .line 1021
    .line 1022
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v8

    .line 1026
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v10

    .line 1030
    invoke-virtual {v2, v9, v8, v10}, Ld52;->J(ILjava/lang/Object;Lh72;)V

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_1

    .line 1034
    .line 1035
    :pswitch_34
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v10

    .line 1039
    if-eqz v10, :cond_1

    .line 1040
    .line 1041
    and-int/2addr v8, v13

    .line 1042
    int-to-long v13, v8

    .line 1043
    sget-object v8, Lmy2;->c:Lky2;

    .line 1044
    .line 1045
    invoke-virtual {v8, v1, v13, v14}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1046
    .line 1047
    .line 1048
    move-result-wide v13

    .line 1049
    shl-long v15, v13, v12

    .line 1050
    .line 1051
    shr-long v10, v13, v11

    .line 1052
    .line 1053
    xor-long/2addr v10, v15

    .line 1054
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_1

    .line 1058
    .line 1059
    :pswitch_35
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v10

    .line 1063
    if-eqz v10, :cond_1

    .line 1064
    .line 1065
    and-int/2addr v8, v13

    .line 1066
    int-to-long v10, v8

    .line 1067
    sget-object v8, Lmy2;->c:Lky2;

    .line 1068
    .line 1069
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1070
    .line 1071
    .line 1072
    move-result v8

    .line 1073
    shl-int/lit8 v10, v8, 0x1

    .line 1074
    .line 1075
    shr-int/lit8 v8, v8, 0x1f

    .line 1076
    .line 1077
    xor-int/2addr v8, v10

    .line 1078
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v3, v8}, Ljw;->s(I)V

    .line 1082
    .line 1083
    .line 1084
    goto/16 :goto_1

    .line 1085
    .line 1086
    :pswitch_36
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v10

    .line 1090
    if-eqz v10, :cond_1

    .line 1091
    .line 1092
    and-int/2addr v8, v13

    .line 1093
    int-to-long v10, v8

    .line 1094
    sget-object v8, Lmy2;->c:Lky2;

    .line 1095
    .line 1096
    invoke-virtual {v8, v1, v10, v11}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v10

    .line 1100
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 1101
    .line 1102
    .line 1103
    goto/16 :goto_1

    .line 1104
    .line 1105
    :pswitch_37
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v10

    .line 1109
    if-eqz v10, :cond_1

    .line 1110
    .line 1111
    and-int/2addr v8, v13

    .line 1112
    int-to-long v10, v8

    .line 1113
    sget-object v8, Lmy2;->c:Lky2;

    .line 1114
    .line 1115
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1116
    .line 1117
    .line 1118
    move-result v8

    .line 1119
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 1120
    .line 1121
    .line 1122
    goto/16 :goto_1

    .line 1123
    .line 1124
    :pswitch_38
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v10

    .line 1128
    if-eqz v10, :cond_1

    .line 1129
    .line 1130
    and-int/2addr v8, v13

    .line 1131
    int-to-long v10, v8

    .line 1132
    sget-object v8, Lmy2;->c:Lky2;

    .line 1133
    .line 1134
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1135
    .line 1136
    .line 1137
    move-result v8

    .line 1138
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v3, v8}, Ljw;->q(I)V

    .line 1142
    .line 1143
    .line 1144
    goto/16 :goto_1

    .line 1145
    .line 1146
    :pswitch_39
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v10

    .line 1150
    if-eqz v10, :cond_1

    .line 1151
    .line 1152
    and-int/2addr v8, v13

    .line 1153
    int-to-long v10, v8

    .line 1154
    sget-object v8, Lmy2;->c:Lky2;

    .line 1155
    .line 1156
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1157
    .line 1158
    .line 1159
    move-result v8

    .line 1160
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v3, v8}, Ljw;->s(I)V

    .line 1164
    .line 1165
    .line 1166
    goto/16 :goto_1

    .line 1167
    .line 1168
    :pswitch_3a
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v10

    .line 1172
    if-eqz v10, :cond_1

    .line 1173
    .line 1174
    and-int/2addr v8, v13

    .line 1175
    int-to-long v10, v8

    .line 1176
    sget-object v8, Lmy2;->c:Lky2;

    .line 1177
    .line 1178
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v8

    .line 1182
    check-cast v8, Lvl;

    .line 1183
    .line 1184
    invoke-virtual {v2, v9, v8}, Ld52;->I(ILvl;)V

    .line 1185
    .line 1186
    .line 1187
    goto/16 :goto_1

    .line 1188
    .line 1189
    :pswitch_3b
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v10

    .line 1193
    if-eqz v10, :cond_1

    .line 1194
    .line 1195
    and-int/2addr v8, v13

    .line 1196
    int-to-long v10, v8

    .line 1197
    sget-object v8, Lmy2;->c:Lky2;

    .line 1198
    .line 1199
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v8

    .line 1203
    invoke-virtual {v0, v7}, Lqh1;->o(I)Lh72;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v10

    .line 1207
    invoke-virtual {v2, v9, v8, v10}, Ld52;->K(ILjava/lang/Object;Lh72;)V

    .line 1208
    .line 1209
    .line 1210
    goto/16 :goto_1

    .line 1211
    .line 1212
    :pswitch_3c
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v10

    .line 1216
    if-eqz v10, :cond_1

    .line 1217
    .line 1218
    and-int/2addr v8, v13

    .line 1219
    int-to-long v10, v8

    .line 1220
    sget-object v8, Lmy2;->c:Lky2;

    .line 1221
    .line 1222
    invoke-virtual {v8, v1, v10, v11}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v8

    .line 1226
    invoke-static {v9, v8, v2}, Lqh1;->W(ILjava/lang/Object;Ld52;)V

    .line 1227
    .line 1228
    .line 1229
    goto/16 :goto_1

    .line 1230
    .line 1231
    :pswitch_3d
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v10

    .line 1235
    if-eqz v10, :cond_1

    .line 1236
    .line 1237
    and-int/2addr v8, v13

    .line 1238
    int-to-long v10, v8

    .line 1239
    sget-object v8, Lmy2;->c:Lky2;

    .line 1240
    .line 1241
    invoke-virtual {v8, v1, v10, v11}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v8

    .line 1245
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 1246
    .line 1247
    .line 1248
    int-to-byte v8, v8

    .line 1249
    invoke-virtual {v3, v8}, Ljw;->k(B)V

    .line 1250
    .line 1251
    .line 1252
    goto/16 :goto_1

    .line 1253
    .line 1254
    :pswitch_3e
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v10

    .line 1258
    if-eqz v10, :cond_1

    .line 1259
    .line 1260
    and-int/2addr v8, v13

    .line 1261
    int-to-long v10, v8

    .line 1262
    sget-object v8, Lmy2;->c:Lky2;

    .line 1263
    .line 1264
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1265
    .line 1266
    .line 1267
    move-result v8

    .line 1268
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 1269
    .line 1270
    .line 1271
    goto/16 :goto_1

    .line 1272
    .line 1273
    :pswitch_3f
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v10

    .line 1277
    if-eqz v10, :cond_1

    .line 1278
    .line 1279
    and-int/2addr v8, v13

    .line 1280
    int-to-long v10, v8

    .line 1281
    sget-object v8, Lmy2;->c:Lky2;

    .line 1282
    .line 1283
    invoke-virtual {v8, v1, v10, v11}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v10

    .line 1287
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 1288
    .line 1289
    .line 1290
    goto :goto_1

    .line 1291
    :pswitch_40
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v10

    .line 1295
    if-eqz v10, :cond_1

    .line 1296
    .line 1297
    and-int/2addr v8, v13

    .line 1298
    int-to-long v10, v8

    .line 1299
    sget-object v8, Lmy2;->c:Lky2;

    .line 1300
    .line 1301
    invoke-virtual {v8, v1, v10, v11}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1302
    .line 1303
    .line 1304
    move-result v8

    .line 1305
    invoke-virtual {v3, v9, v6}, Ljw;->r(II)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v3, v8}, Ljw;->q(I)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_1

    .line 1312
    :pswitch_41
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v10

    .line 1316
    if-eqz v10, :cond_1

    .line 1317
    .line 1318
    and-int/2addr v8, v13

    .line 1319
    int-to-long v10, v8

    .line 1320
    sget-object v8, Lmy2;->c:Lky2;

    .line 1321
    .line 1322
    invoke-virtual {v8, v1, v10, v11}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1323
    .line 1324
    .line 1325
    move-result-wide v10

    .line 1326
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 1327
    .line 1328
    .line 1329
    goto :goto_1

    .line 1330
    :pswitch_42
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v10

    .line 1334
    if-eqz v10, :cond_1

    .line 1335
    .line 1336
    and-int/2addr v8, v13

    .line 1337
    int-to-long v10, v8

    .line 1338
    sget-object v8, Lmy2;->c:Lky2;

    .line 1339
    .line 1340
    invoke-virtual {v8, v1, v10, v11}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1341
    .line 1342
    .line 1343
    move-result-wide v10

    .line 1344
    invoke-virtual {v3, v9, v10, v11}, Ljw;->t(IJ)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_1

    .line 1348
    :pswitch_43
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v10

    .line 1352
    if-eqz v10, :cond_1

    .line 1353
    .line 1354
    and-int/2addr v8, v13

    .line 1355
    int-to-long v10, v8

    .line 1356
    sget-object v8, Lmy2;->c:Lky2;

    .line 1357
    .line 1358
    invoke-virtual {v8, v1, v10, v11}, Lky2;->f(Ljava/lang/Object;J)F

    .line 1359
    .line 1360
    .line 1361
    move-result v8

    .line 1362
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1366
    .line 1367
    .line 1368
    move-result v8

    .line 1369
    invoke-virtual {v3, v9, v8}, Ljw;->m(II)V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_1

    .line 1373
    :pswitch_44
    invoke-virtual {v0, v7, v1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v10

    .line 1377
    if-eqz v10, :cond_1

    .line 1378
    .line 1379
    and-int/2addr v8, v13

    .line 1380
    int-to-long v10, v8

    .line 1381
    sget-object v8, Lmy2;->c:Lky2;

    .line 1382
    .line 1383
    invoke-virtual {v8, v1, v10, v11}, Lky2;->e(Ljava/lang/Object;J)D

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v10

    .line 1387
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1391
    .line 1392
    .line 1393
    move-result-wide v10

    .line 1394
    invoke-virtual {v3, v9, v10, v11}, Ljw;->o(IJ)V

    .line 1395
    .line 1396
    .line 1397
    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x3

    .line 1398
    .line 1399
    goto/16 :goto_0

    .line 1400
    .line 1401
    :cond_2
    iget-object v0, v0, Lqh1;->m:Ltx2;

    .line 1402
    .line 1403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    move-object v0, v1

    .line 1407
    check-cast v0, Lsq0;

    .line 1408
    .line 1409
    iget-object v0, v0, Lsq0;->unknownFields:Lrx2;

    .line 1410
    .line 1411
    invoke-virtual {v0, v2}, Lrx2;->e(Ld52;)V

    .line 1412
    .line 1413
    .line 1414
    return-void

    .line 1415
    :cond_3
    invoke-virtual/range {p0 .. p2}, Lqh1;->V(Ljava/lang/Object;Ld52;)V

    .line 1416
    .line 1417
    .line 1418
    return-void

    .line 1419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lsq0;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lqh1;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lqh1;->U(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    invoke-static {v4}, Lqh1;->T(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v8, 0x4d5

    .line 24
    .line 25
    const/16 v9, 0x4cf

    .line 26
    .line 27
    const/16 v10, 0x25

    .line 28
    .line 29
    packed-switch v4, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    sget-object v4, Lmy2;->c:Lky2;

    .line 41
    .line 42
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    mul-int/lit8 v3, v3, 0x35

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    :goto_1
    add-int/2addr v4, v3

    .line 53
    move v3, v4

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v3, v3, 0x35

    .line 63
    .line 64
    invoke-static {p1, v6, v7}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_1

    .line 73
    :pswitch_2
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    mul-int/lit8 v3, v3, 0x35

    .line 80
    .line 81
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    goto :goto_1

    .line 86
    :pswitch_3
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    mul-int/lit8 v3, v3, 0x35

    .line 93
    .line 94
    invoke-static {p1, v6, v7}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    goto :goto_1

    .line 103
    :pswitch_4
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_2

    .line 108
    .line 109
    mul-int/lit8 v3, v3, 0x35

    .line 110
    .line 111
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    goto :goto_1

    .line 116
    :pswitch_5
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    mul-int/lit8 v3, v3, 0x35

    .line 123
    .line 124
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    goto :goto_1

    .line 129
    :pswitch_6
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    mul-int/lit8 v3, v3, 0x35

    .line 136
    .line 137
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    goto :goto_1

    .line 142
    :pswitch_7
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_2

    .line 147
    .line 148
    mul-int/lit8 v3, v3, 0x35

    .line 149
    .line 150
    sget-object v4, Lmy2;->c:Lky2;

    .line 151
    .line 152
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    sget-object v4, Lmy2;->c:Lky2;

    .line 168
    .line 169
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    mul-int/lit8 v3, v3, 0x35

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    goto :goto_1

    .line 180
    :pswitch_9
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_2

    .line 185
    .line 186
    mul-int/lit8 v3, v3, 0x35

    .line 187
    .line 188
    sget-object v4, Lmy2;->c:Lky2;

    .line 189
    .line 190
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :pswitch_a
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_2

    .line 207
    .line 208
    mul-int/lit8 v3, v3, 0x35

    .line 209
    .line 210
    sget-object v4, Lmy2;->c:Lky2;

    .line 211
    .line 212
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    sget-object v5, Lez0;->a:Ljava/nio/charset/Charset;

    .line 223
    .line 224
    if-eqz v4, :cond_0

    .line 225
    .line 226
    :goto_2
    move v8, v9

    .line 227
    :cond_0
    add-int/2addr v8, v3

    .line 228
    move v3, v8

    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :pswitch_b
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_2

    .line 236
    .line 237
    mul-int/lit8 v3, v3, 0x35

    .line 238
    .line 239
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_c
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_2

    .line 250
    .line 251
    mul-int/lit8 v3, v3, 0x35

    .line 252
    .line 253
    invoke-static {p1, v6, v7}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :pswitch_d
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_2

    .line 268
    .line 269
    mul-int/lit8 v3, v3, 0x35

    .line 270
    .line 271
    invoke-static {p1, v6, v7}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :pswitch_e
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_2

    .line 282
    .line 283
    mul-int/lit8 v3, v3, 0x35

    .line 284
    .line 285
    invoke-static {p1, v6, v7}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v4

    .line 289
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :pswitch_f
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_2

    .line 300
    .line 301
    mul-int/lit8 v3, v3, 0x35

    .line 302
    .line 303
    invoke-static {p1, v6, v7}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 304
    .line 305
    .line 306
    move-result-wide v4

    .line 307
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :pswitch_10
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_2

    .line 318
    .line 319
    mul-int/lit8 v3, v3, 0x35

    .line 320
    .line 321
    sget-object v4, Lmy2;->c:Lky2;

    .line 322
    .line 323
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Ljava/lang/Float;

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :pswitch_11
    invoke-virtual {p0, v5, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_2

    .line 344
    .line 345
    mul-int/lit8 v3, v3, 0x35

    .line 346
    .line 347
    sget-object v4, Lmy2;->c:Lky2;

    .line 348
    .line 349
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    check-cast v4, Ljava/lang/Double;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 356
    .line 357
    .line 358
    move-result-wide v4

    .line 359
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 360
    .line 361
    .line 362
    move-result-wide v4

    .line 363
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 370
    .line 371
    sget-object v4, Lmy2;->c:Lky2;

    .line 372
    .line 373
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 384
    .line 385
    sget-object v4, Lmy2;->c:Lky2;

    .line 386
    .line 387
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :pswitch_14
    sget-object v4, Lmy2;->c:Lky2;

    .line 398
    .line 399
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    if-eqz v4, :cond_1

    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    .line 410
    .line 411
    add-int/2addr v3, v10

    .line 412
    goto/16 :goto_4

    .line 413
    .line 414
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 415
    .line 416
    sget-object v4, Lmy2;->c:Lky2;

    .line 417
    .line 418
    invoke-virtual {v4, p1, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 419
    .line 420
    .line 421
    move-result-wide v4

    .line 422
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 429
    .line 430
    sget-object v4, Lmy2;->c:Lky2;

    .line 431
    .line 432
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    goto/16 :goto_1

    .line 437
    .line 438
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 439
    .line 440
    sget-object v4, Lmy2;->c:Lky2;

    .line 441
    .line 442
    invoke-virtual {v4, p1, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 443
    .line 444
    .line 445
    move-result-wide v4

    .line 446
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 453
    .line 454
    sget-object v4, Lmy2;->c:Lky2;

    .line 455
    .line 456
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 463
    .line 464
    sget-object v4, Lmy2;->c:Lky2;

    .line 465
    .line 466
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    goto/16 :goto_1

    .line 471
    .line 472
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 473
    .line 474
    sget-object v4, Lmy2;->c:Lky2;

    .line 475
    .line 476
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 483
    .line 484
    sget-object v4, Lmy2;->c:Lky2;

    .line 485
    .line 486
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    goto/16 :goto_1

    .line 495
    .line 496
    :pswitch_1c
    sget-object v4, Lmy2;->c:Lky2;

    .line 497
    .line 498
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    if-eqz v4, :cond_1

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    goto :goto_3

    .line 509
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 510
    .line 511
    sget-object v4, Lmy2;->c:Lky2;

    .line 512
    .line 513
    invoke-virtual {v4, p1, v6, v7}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/String;

    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    goto/16 :goto_1

    .line 524
    .line 525
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 526
    .line 527
    sget-object v4, Lmy2;->c:Lky2;

    .line 528
    .line 529
    invoke-virtual {v4, p1, v6, v7}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    sget-object v5, Lez0;->a:Ljava/nio/charset/Charset;

    .line 534
    .line 535
    if-eqz v4, :cond_0

    .line 536
    .line 537
    goto/16 :goto_2

    .line 538
    .line 539
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 540
    .line 541
    sget-object v4, Lmy2;->c:Lky2;

    .line 542
    .line 543
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    goto/16 :goto_1

    .line 548
    .line 549
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 550
    .line 551
    sget-object v4, Lmy2;->c:Lky2;

    .line 552
    .line 553
    invoke-virtual {v4, p1, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 554
    .line 555
    .line 556
    move-result-wide v4

    .line 557
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    goto/16 :goto_1

    .line 562
    .line 563
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 564
    .line 565
    sget-object v4, Lmy2;->c:Lky2;

    .line 566
    .line 567
    invoke-virtual {v4, p1, v6, v7}, Lky2;->g(Ljava/lang/Object;J)I

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    goto/16 :goto_1

    .line 572
    .line 573
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 574
    .line 575
    sget-object v4, Lmy2;->c:Lky2;

    .line 576
    .line 577
    invoke-virtual {v4, p1, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 578
    .line 579
    .line 580
    move-result-wide v4

    .line 581
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    goto/16 :goto_1

    .line 586
    .line 587
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 588
    .line 589
    sget-object v4, Lmy2;->c:Lky2;

    .line 590
    .line 591
    invoke-virtual {v4, p1, v6, v7}, Lky2;->h(Ljava/lang/Object;J)J

    .line 592
    .line 593
    .line 594
    move-result-wide v4

    .line 595
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    goto/16 :goto_1

    .line 600
    .line 601
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 602
    .line 603
    sget-object v4, Lmy2;->c:Lky2;

    .line 604
    .line 605
    invoke-virtual {v4, p1, v6, v7}, Lky2;->f(Ljava/lang/Object;J)F

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 610
    .line 611
    .line 612
    move-result v4

    .line 613
    goto/16 :goto_1

    .line 614
    .line 615
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 616
    .line 617
    sget-object v4, Lmy2;->c:Lky2;

    .line 618
    .line 619
    invoke-virtual {v4, p1, v6, v7}, Lky2;->e(Ljava/lang/Object;J)D

    .line 620
    .line 621
    .line 622
    move-result-wide v4

    .line 623
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 624
    .line 625
    .line 626
    move-result-wide v4

    .line 627
    invoke-static {v4, v5}, Lez0;->b(J)I

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    goto/16 :goto_1

    .line 632
    .line 633
    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 638
    .line 639
    iget-object p0, p0, Lqh1;->m:Ltx2;

    .line 640
    .line 641
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    iget-object p0, p1, Lsq0;->unknownFields:Lrx2;

    .line 645
    .line 646
    invoke-virtual {p0}, Lrx2;->hashCode()I

    .line 647
    .line 648
    .line 649
    move-result p0

    .line 650
    add-int/2addr p0, v3

    .line 651
    return p0

    .line 652
    nop

    .line 653
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Liw;Ldg0;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move-object/from16 v6, p3

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lqh1;->k(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v8, v1, Lqh1;->m:Ltx2;

    .line 16
    .line 17
    iget-object v9, v1, Lqh1;->h:[I

    .line 18
    .line 19
    iget v10, v1, Lqh1;->j:I

    .line 20
    .line 21
    iget v11, v1, Lqh1;->i:I

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    :goto_0
    :try_start_0
    invoke-virtual {v4}, Liw;->c()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v3, v1, Lqh1;->c:I

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-lt v0, v3, :cond_0

    .line 32
    .line 33
    iget v3, v1, Lqh1;->d:I

    .line 34
    .line 35
    if-gt v0, v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v0, v5}, Lqh1;->Q(II)I

    .line 38
    .line 39
    .line 40
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 41
    :goto_1
    move v7, v3

    .line 42
    goto :goto_3

    .line 43
    :goto_2
    move-object v6, v1

    .line 44
    goto/16 :goto_f

    .line 45
    .line 46
    :cond_0
    const/4 v3, -0x1

    .line 47
    goto :goto_1

    .line 48
    :goto_3
    if-gez v7, :cond_6

    .line 49
    .line 50
    const v3, 0x7fffffff

    .line 51
    .line 52
    .line 53
    if-ne v0, v3, :cond_2

    .line 54
    .line 55
    :goto_4
    if-ge v11, v10, :cond_1

    .line 56
    .line 57
    aget v0, v9, v11

    .line 58
    .line 59
    invoke-virtual {v1, v0, v2, v13}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v11, v11, 0x1

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_1
    if-eqz v13, :cond_e

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    :goto_5
    move-object v0, v2

    .line 71
    check-cast v0, Lsq0;

    .line 72
    .line 73
    iput-object v13, v0, Lsq0;->unknownFields:Lrx2;

    .line 74
    .line 75
    goto/16 :goto_12

    .line 76
    .line 77
    :cond_2
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    if-nez v13, :cond_3

    .line 81
    .line 82
    invoke-static {v2}, Ltx2;->a(Ljava/lang/Object;)Lrx2;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v13, v0

    .line 87
    :cond_3
    invoke-static {v13, v4}, Ltx2;->b(Ljava/lang/Object;Liw;)Z

    .line 88
    .line 89
    .line 90
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    :goto_6
    if-ge v11, v10, :cond_5

    .line 95
    .line 96
    aget v0, v9, v11

    .line 97
    .line 98
    invoke-virtual {v1, v0, v2, v13}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v11, v11, 0x1

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_5
    if-eqz v13, :cond_e

    .line 105
    .line 106
    :goto_7
    goto :goto_5

    .line 107
    :cond_6
    :try_start_2
    invoke-virtual {v1, v7}, Lqh1;->U(I)I

    .line 108
    .line 109
    .line 110
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 111
    :try_start_3
    invoke-static {v3}, Lqh1;->T(I)I

    .line 112
    .line 113
    .line 114
    move-result v14
    :try_end_3
    .catch Lnz0; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    const/4 v12, 0x3

    .line 118
    const v18, 0xfffff

    .line 119
    .line 120
    .line 121
    iget-object v15, v1, Lqh1;->l:Lc81;

    .line 122
    .line 123
    packed-switch v14, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    if-nez v13, :cond_7

    .line 127
    .line 128
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Ltx2;->a(Ljava/lang/Object;)Lrx2;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    move-object v13, v0

    .line 136
    goto :goto_a

    .line 137
    :catch_0
    :goto_8
    move-object v6, v1

    .line 138
    move-object v14, v4

    .line 139
    :catch_1
    :goto_9
    move-object v12, v8

    .line 140
    move-object v15, v9

    .line 141
    goto/16 :goto_10

    .line 142
    .line 143
    :cond_7
    :goto_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v13, v4}, Ltx2;->b(Ljava/lang/Object;Liw;)Z

    .line 147
    .line 148
    .line 149
    move-result v0
    :try_end_4
    .catch Lnz0; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 150
    if-nez v0, :cond_9

    .line 151
    .line 152
    :goto_b
    if-ge v11, v10, :cond_8

    .line 153
    .line 154
    aget v0, v9, v11

    .line 155
    .line 156
    invoke-virtual {v1, v0, v2, v13}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v11, v11, 0x1

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_8
    if-eqz v13, :cond_e

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :pswitch_0
    :try_start_5
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->z(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lw;

    .line 170
    .line 171
    invoke-virtual {v1, v7}, Lqh1;->o(I)Lh72;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v4, v12}, Liw;->R(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v3, v5, v6}, Liw;->d(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v2, v0, v7, v3}, Lqh1;->S(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_9
    :goto_c
    move-object v6, v1

    .line 185
    move-object v14, v4

    .line 186
    :goto_d
    move-object v12, v8

    .line 187
    move-object v15, v9

    .line 188
    goto/16 :goto_13

    .line 189
    .line 190
    :pswitch_1
    and-int v3, v3, v18

    .line 191
    .line 192
    int-to-long v14, v3

    .line 193
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 194
    .line 195
    .line 196
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v3, Lhw;

    .line 199
    .line 200
    invoke-virtual {v3}, Lhw;->z()J

    .line 201
    .line 202
    .line 203
    move-result-wide v17

    .line 204
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_c

    .line 215
    :pswitch_2
    and-int v3, v3, v18

    .line 216
    .line 217
    int-to-long v14, v3

    .line 218
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 219
    .line 220
    .line 221
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v3, Lhw;

    .line 224
    .line 225
    invoke-virtual {v3}, Lhw;->y()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_c

    .line 240
    :pswitch_3
    and-int v3, v3, v18

    .line 241
    .line 242
    int-to-long v14, v3

    .line 243
    const/4 v3, 0x1

    .line 244
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 245
    .line 246
    .line 247
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, Lhw;

    .line 250
    .line 251
    invoke-virtual {v3}, Lhw;->x()J

    .line 252
    .line 253
    .line 254
    move-result-wide v17

    .line 255
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_c

    .line 266
    :pswitch_4
    and-int v3, v3, v18

    .line 267
    .line 268
    int-to-long v14, v3

    .line 269
    const/4 v3, 0x5

    .line 270
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 271
    .line 272
    .line 273
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v3, Lhw;

    .line 276
    .line 277
    invoke-virtual {v3}, Lhw;->w()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_c

    .line 292
    :pswitch_5
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 293
    .line 294
    .line 295
    iget-object v5, v4, Liw;->e:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v5, Lhw;

    .line 298
    .line 299
    invoke-virtual {v5}, Lhw;->q()I

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    invoke-virtual {v1, v7}, Lqh1;->m(I)V

    .line 304
    .line 305
    .line 306
    and-int v3, v3, v18

    .line 307
    .line 308
    int-to-long v14, v3

    .line 309
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_c

    .line 320
    .line 321
    :pswitch_6
    and-int v3, v3, v18

    .line 322
    .line 323
    int-to-long v14, v3

    .line 324
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 325
    .line 326
    .line 327
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v3, Lhw;

    .line 330
    .line 331
    invoke-virtual {v3}, Lhw;->D()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_c

    .line 346
    .line 347
    :pswitch_7
    and-int v3, v3, v18

    .line 348
    .line 349
    int-to-long v14, v3

    .line 350
    invoke-virtual {v4}, Liw;->k()Lvl;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_c

    .line 361
    .line 362
    :pswitch_8
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->z(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    check-cast v3, Lw;

    .line 367
    .line 368
    invoke-virtual {v1, v7}, Lqh1;->o(I)Lh72;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    const/4 v12, 0x2

    .line 373
    invoke-virtual {v4, v12}, Liw;->R(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, v3, v5, v6}, Liw;->f(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v2, v0, v7, v3}, Lqh1;->S(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_c

    .line 383
    .line 384
    :pswitch_9
    invoke-virtual {v1, v3, v4, v2}, Lqh1;->M(ILiw;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_c

    .line 391
    .line 392
    :pswitch_a
    and-int v3, v3, v18

    .line 393
    .line 394
    int-to-long v14, v3

    .line 395
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 396
    .line 397
    .line 398
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v3, Lhw;

    .line 401
    .line 402
    invoke-virtual {v3}, Lhw;->m()Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_c

    .line 417
    .line 418
    :pswitch_b
    and-int v3, v3, v18

    .line 419
    .line 420
    int-to-long v14, v3

    .line 421
    const/4 v3, 0x5

    .line 422
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 423
    .line 424
    .line 425
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v3, Lhw;

    .line 428
    .line 429
    invoke-virtual {v3}, Lhw;->r()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_c

    .line 444
    .line 445
    :pswitch_c
    and-int v3, v3, v18

    .line 446
    .line 447
    int-to-long v14, v3

    .line 448
    const/4 v3, 0x1

    .line 449
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 450
    .line 451
    .line 452
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v3, Lhw;

    .line 455
    .line 456
    invoke-virtual {v3}, Lhw;->s()J

    .line 457
    .line 458
    .line 459
    move-result-wide v17

    .line 460
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_c

    .line 471
    .line 472
    :pswitch_d
    and-int v3, v3, v18

    .line 473
    .line 474
    int-to-long v14, v3

    .line 475
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 476
    .line 477
    .line 478
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v3, Lhw;

    .line 481
    .line 482
    invoke-virtual {v3}, Lhw;->u()I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_c

    .line 497
    .line 498
    :pswitch_e
    and-int v3, v3, v18

    .line 499
    .line 500
    int-to-long v14, v3

    .line 501
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 502
    .line 503
    .line 504
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v3, Lhw;

    .line 507
    .line 508
    invoke-virtual {v3}, Lhw;->E()J

    .line 509
    .line 510
    .line 511
    move-result-wide v17

    .line 512
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 520
    .line 521
    .line 522
    goto/16 :goto_c

    .line 523
    .line 524
    :pswitch_f
    and-int v3, v3, v18

    .line 525
    .line 526
    int-to-long v14, v3

    .line 527
    invoke-virtual {v4, v5}, Liw;->R(I)V

    .line 528
    .line 529
    .line 530
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v3, Lhw;

    .line 533
    .line 534
    invoke-virtual {v3}, Lhw;->v()J

    .line 535
    .line 536
    .line 537
    move-result-wide v17

    .line 538
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_c

    .line 549
    .line 550
    :pswitch_10
    and-int v3, v3, v18

    .line 551
    .line 552
    int-to-long v14, v3

    .line 553
    const/4 v3, 0x5

    .line 554
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 555
    .line 556
    .line 557
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v3, Lhw;

    .line 560
    .line 561
    invoke-virtual {v3}, Lhw;->t()F

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_c

    .line 576
    .line 577
    :pswitch_11
    and-int v3, v3, v18

    .line 578
    .line 579
    int-to-long v14, v3

    .line 580
    const/4 v3, 0x1

    .line 581
    invoke-virtual {v4, v3}, Liw;->R(I)V

    .line 582
    .line 583
    .line 584
    iget-object v3, v4, Liw;->e:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v3, Lhw;

    .line 587
    .line 588
    invoke-virtual {v3}, Lhw;->p()D

    .line 589
    .line 590
    .line 591
    move-result-wide v17

    .line 592
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-static {v2, v14, v15, v3}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v0, v2, v7}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 600
    .line 601
    .line 602
    goto/16 :goto_c

    .line 603
    .line 604
    :pswitch_12
    invoke-virtual {v1, v7}, Lqh1;->n(I)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v1, v7, v2, v0}, Lqh1;->v(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    throw v16

    .line 612
    :pswitch_13
    and-int v0, v3, v18

    .line 613
    .line 614
    int-to-long v14, v0

    .line 615
    invoke-virtual {v1, v7}, Lqh1;->o(I)Lh72;

    .line 616
    .line 617
    .line 618
    move-result-object v6
    :try_end_5
    .catch Lnz0; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 619
    move-object/from16 v7, p3

    .line 620
    .line 621
    move-object v5, v4

    .line 622
    move-wide v3, v14

    .line 623
    :try_start_6
    invoke-virtual/range {v1 .. v7}, Lqh1;->K(Ljava/lang/Object;JLiw;Lh72;Ldg0;)V
    :try_end_6
    .catch Lnz0; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 624
    .line 625
    .line 626
    move-object v4, v5

    .line 627
    goto/16 :goto_c

    .line 628
    .line 629
    :catch_2
    move-object v6, v1

    .line 630
    move-object v14, v5

    .line 631
    goto/16 :goto_9

    .line 632
    .line 633
    :pswitch_14
    and-int v0, v3, v18

    .line 634
    .line 635
    int-to-long v5, v0

    .line 636
    :try_start_7
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v4, v0}, Liw;->J(Ljava/util/List;)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_c

    .line 644
    .line 645
    :pswitch_15
    and-int v0, v3, v18

    .line 646
    .line 647
    int-to-long v5, v0

    .line 648
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v4, v0}, Liw;->H(Ljava/util/List;)V

    .line 653
    .line 654
    .line 655
    goto/16 :goto_c

    .line 656
    .line 657
    :pswitch_16
    and-int v0, v3, v18

    .line 658
    .line 659
    int-to-long v5, v0

    .line 660
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v4, v0}, Liw;->F(Ljava/util/List;)V

    .line 665
    .line 666
    .line 667
    goto/16 :goto_c

    .line 668
    .line 669
    :pswitch_17
    and-int v0, v3, v18

    .line 670
    .line 671
    int-to-long v5, v0

    .line 672
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v4, v0}, Liw;->D(Ljava/util/List;)V

    .line 677
    .line 678
    .line 679
    goto/16 :goto_c

    .line 680
    .line 681
    :pswitch_18
    and-int v0, v3, v18

    .line 682
    .line 683
    int-to-long v5, v0

    .line 684
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v4, v0}, Liw;->q(Ljava/util/List;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1, v7}, Lqh1;->m(I)V

    .line 692
    .line 693
    .line 694
    sget-object v0, Ll72;->a:Ljava/lang/Class;

    .line 695
    .line 696
    goto/16 :goto_c

    .line 697
    .line 698
    :pswitch_19
    and-int v0, v3, v18

    .line 699
    .line 700
    int-to-long v5, v0

    .line 701
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v4, v0}, Liw;->N(Ljava/util/List;)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_c

    .line 709
    .line 710
    :pswitch_1a
    and-int v0, v3, v18

    .line 711
    .line 712
    int-to-long v5, v0

    .line 713
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v4, v0}, Liw;->i(Ljava/util/List;)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_c

    .line 721
    .line 722
    :pswitch_1b
    and-int v0, v3, v18

    .line 723
    .line 724
    int-to-long v5, v0

    .line 725
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v4, v0}, Liw;->t(Ljava/util/List;)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_c

    .line 733
    .line 734
    :pswitch_1c
    and-int v0, v3, v18

    .line 735
    .line 736
    int-to-long v5, v0

    .line 737
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {v4, v0}, Liw;->v(Ljava/util/List;)V

    .line 742
    .line 743
    .line 744
    goto/16 :goto_c

    .line 745
    .line 746
    :pswitch_1d
    and-int v0, v3, v18

    .line 747
    .line 748
    int-to-long v5, v0

    .line 749
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-virtual {v4, v0}, Liw;->z(Ljava/util/List;)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_c

    .line 757
    .line 758
    :pswitch_1e
    and-int v0, v3, v18

    .line 759
    .line 760
    int-to-long v5, v0

    .line 761
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {v4, v0}, Liw;->P(Ljava/util/List;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_c

    .line 769
    .line 770
    :pswitch_1f
    and-int v0, v3, v18

    .line 771
    .line 772
    int-to-long v5, v0

    .line 773
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {v4, v0}, Liw;->B(Ljava/util/List;)V

    .line 778
    .line 779
    .line 780
    goto/16 :goto_c

    .line 781
    .line 782
    :pswitch_20
    and-int v0, v3, v18

    .line 783
    .line 784
    int-to-long v5, v0

    .line 785
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {v4, v0}, Liw;->x(Ljava/util/List;)V

    .line 790
    .line 791
    .line 792
    goto/16 :goto_c

    .line 793
    .line 794
    :pswitch_21
    and-int v0, v3, v18

    .line 795
    .line 796
    int-to-long v5, v0

    .line 797
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v4, v0}, Liw;->o(Ljava/util/List;)V

    .line 802
    .line 803
    .line 804
    goto/16 :goto_c

    .line 805
    .line 806
    :pswitch_22
    and-int v0, v3, v18

    .line 807
    .line 808
    int-to-long v5, v0

    .line 809
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v4, v0}, Liw;->J(Ljava/util/List;)V

    .line 814
    .line 815
    .line 816
    goto/16 :goto_c

    .line 817
    .line 818
    :pswitch_23
    and-int v0, v3, v18

    .line 819
    .line 820
    int-to-long v5, v0

    .line 821
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v4, v0}, Liw;->H(Ljava/util/List;)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_c

    .line 829
    .line 830
    :pswitch_24
    and-int v0, v3, v18

    .line 831
    .line 832
    int-to-long v5, v0

    .line 833
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v4, v0}, Liw;->F(Ljava/util/List;)V

    .line 838
    .line 839
    .line 840
    goto/16 :goto_c

    .line 841
    .line 842
    :pswitch_25
    and-int v0, v3, v18

    .line 843
    .line 844
    int-to-long v5, v0

    .line 845
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v4, v0}, Liw;->D(Ljava/util/List;)V

    .line 850
    .line 851
    .line 852
    goto/16 :goto_c

    .line 853
    .line 854
    :pswitch_26
    and-int v0, v3, v18

    .line 855
    .line 856
    int-to-long v5, v0

    .line 857
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-virtual {v4, v0}, Liw;->q(Ljava/util/List;)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v1, v7}, Lqh1;->m(I)V

    .line 865
    .line 866
    .line 867
    sget-object v0, Ll72;->a:Ljava/lang/Class;

    .line 868
    .line 869
    goto/16 :goto_c

    .line 870
    .line 871
    :pswitch_27
    and-int v0, v3, v18

    .line 872
    .line 873
    int-to-long v5, v0

    .line 874
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-virtual {v4, v0}, Liw;->N(Ljava/util/List;)V

    .line 879
    .line 880
    .line 881
    goto/16 :goto_c

    .line 882
    .line 883
    :pswitch_28
    and-int v0, v3, v18

    .line 884
    .line 885
    int-to-long v5, v0

    .line 886
    invoke-virtual {v15, v2, v5, v6}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v4, v0}, Liw;->m(Ljava/util/List;)V
    :try_end_7
    .catch Lnz0; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 891
    .line 892
    .line 893
    goto/16 :goto_c

    .line 894
    .line 895
    :pswitch_29
    :try_start_8
    invoke-virtual {v1, v7}, Lqh1;->o(I)Lh72;

    .line 896
    .line 897
    .line 898
    move-result-object v5
    :try_end_8
    .catch Lnz0; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 899
    move-object/from16 v6, p3

    .line 900
    .line 901
    :try_start_9
    invoke-virtual/range {v1 .. v6}, Lqh1;->L(Ljava/lang/Object;ILiw;Lh72;Ldg0;)V
    :try_end_9
    .catch Lnz0; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 902
    .line 903
    .line 904
    move-object v14, v4

    .line 905
    move-object v0, v6

    .line 906
    move-object v6, v1

    .line 907
    goto/16 :goto_d

    .line 908
    .line 909
    :catch_3
    move-object v14, v4

    .line 910
    move-object v0, v6

    .line 911
    move-object v6, v1

    .line 912
    goto/16 :goto_9

    .line 913
    .line 914
    :catch_4
    move-object/from16 v0, p3

    .line 915
    .line 916
    goto/16 :goto_8

    .line 917
    .line 918
    :pswitch_2a
    move-object v14, v4

    .line 919
    move-object v0, v6

    .line 920
    move-object v6, v1

    .line 921
    const/high16 v1, 0x20000000

    .line 922
    .line 923
    and-int/2addr v1, v3

    .line 924
    if-eqz v1, :cond_a

    .line 925
    .line 926
    const/4 v1, 0x1

    .line 927
    goto :goto_e

    .line 928
    :cond_a
    move v1, v5

    .line 929
    :goto_e
    if-eqz v1, :cond_b

    .line 930
    .line 931
    and-int v1, v3, v18

    .line 932
    .line 933
    int-to-long v3, v1

    .line 934
    :try_start_a
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v1

    .line 938
    const/4 v3, 0x1

    .line 939
    invoke-virtual {v14, v1, v3}, Liw;->L(Ljava/util/List;Z)V

    .line 940
    .line 941
    .line 942
    goto/16 :goto_d

    .line 943
    .line 944
    :cond_b
    and-int v1, v3, v18

    .line 945
    .line 946
    int-to-long v3, v1

    .line 947
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    invoke-virtual {v14, v1, v5}, Liw;->L(Ljava/util/List;Z)V

    .line 952
    .line 953
    .line 954
    goto/16 :goto_d

    .line 955
    .line 956
    :pswitch_2b
    move-object v14, v4

    .line 957
    move-object v0, v6

    .line 958
    move-object v6, v1

    .line 959
    and-int v1, v3, v18

    .line 960
    .line 961
    int-to-long v3, v1

    .line 962
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-virtual {v14, v1}, Liw;->i(Ljava/util/List;)V

    .line 967
    .line 968
    .line 969
    goto/16 :goto_d

    .line 970
    .line 971
    :pswitch_2c
    move-object v14, v4

    .line 972
    move-object v0, v6

    .line 973
    move-object v6, v1

    .line 974
    and-int v1, v3, v18

    .line 975
    .line 976
    int-to-long v3, v1

    .line 977
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 978
    .line 979
    .line 980
    move-result-object v1

    .line 981
    invoke-virtual {v14, v1}, Liw;->t(Ljava/util/List;)V

    .line 982
    .line 983
    .line 984
    goto/16 :goto_d

    .line 985
    .line 986
    :pswitch_2d
    move-object v14, v4

    .line 987
    move-object v0, v6

    .line 988
    move-object v6, v1

    .line 989
    and-int v1, v3, v18

    .line 990
    .line 991
    int-to-long v3, v1

    .line 992
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    invoke-virtual {v14, v1}, Liw;->v(Ljava/util/List;)V

    .line 997
    .line 998
    .line 999
    goto/16 :goto_d

    .line 1000
    .line 1001
    :pswitch_2e
    move-object v14, v4

    .line 1002
    move-object v0, v6

    .line 1003
    move-object v6, v1

    .line 1004
    and-int v1, v3, v18

    .line 1005
    .line 1006
    int-to-long v3, v1

    .line 1007
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    invoke-virtual {v14, v1}, Liw;->z(Ljava/util/List;)V

    .line 1012
    .line 1013
    .line 1014
    goto/16 :goto_d

    .line 1015
    .line 1016
    :pswitch_2f
    move-object v14, v4

    .line 1017
    move-object v0, v6

    .line 1018
    move-object v6, v1

    .line 1019
    and-int v1, v3, v18

    .line 1020
    .line 1021
    int-to-long v3, v1

    .line 1022
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    invoke-virtual {v14, v1}, Liw;->P(Ljava/util/List;)V

    .line 1027
    .line 1028
    .line 1029
    goto/16 :goto_d

    .line 1030
    .line 1031
    :pswitch_30
    move-object v14, v4

    .line 1032
    move-object v0, v6

    .line 1033
    move-object v6, v1

    .line 1034
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v3

    .line 1038
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    invoke-virtual {v14, v1}, Liw;->B(Ljava/util/List;)V

    .line 1043
    .line 1044
    .line 1045
    goto/16 :goto_d

    .line 1046
    .line 1047
    :pswitch_31
    move-object v14, v4

    .line 1048
    move-object v0, v6

    .line 1049
    move-object v6, v1

    .line 1050
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1051
    .line 1052
    .line 1053
    move-result-wide v3

    .line 1054
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    invoke-virtual {v14, v1}, Liw;->x(Ljava/util/List;)V

    .line 1059
    .line 1060
    .line 1061
    goto/16 :goto_d

    .line 1062
    .line 1063
    :pswitch_32
    move-object v14, v4

    .line 1064
    move-object v0, v6

    .line 1065
    move-object v6, v1

    .line 1066
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v3

    .line 1070
    invoke-virtual {v15, v2, v3, v4}, Lc81;->c(Ljava/lang/Object;J)Ljava/util/List;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-virtual {v14, v1}, Liw;->o(Ljava/util/List;)V

    .line 1075
    .line 1076
    .line 1077
    goto/16 :goto_d

    .line 1078
    .line 1079
    :pswitch_33
    move-object v14, v4

    .line 1080
    move-object v0, v6

    .line 1081
    move-object v6, v1

    .line 1082
    invoke-virtual {v6, v7, v2}, Lqh1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    check-cast v1, Lw;

    .line 1087
    .line 1088
    invoke-virtual {v6, v7}, Lqh1;->o(I)Lh72;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    invoke-virtual {v14, v12}, Liw;->R(I)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v14, v1, v3, v0}, Liw;->d(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v6, v7, v2, v1}, Lqh1;->R(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1099
    .line 1100
    .line 1101
    goto/16 :goto_d

    .line 1102
    .line 1103
    :pswitch_34
    move-object v14, v4

    .line 1104
    move-object v0, v6

    .line 1105
    move-object v6, v1

    .line 1106
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1107
    .line 1108
    .line 1109
    move-result-wide v3

    .line 1110
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1111
    .line 1112
    .line 1113
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v1, Lhw;
    :try_end_a
    .catch Lnz0; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1116
    .line 1117
    move-object v12, v8

    .line 1118
    move-object v15, v9

    .line 1119
    :try_start_b
    invoke-virtual {v1}, Lhw;->z()J

    .line 1120
    .line 1121
    .line 1122
    move-result-wide v8

    .line 1123
    invoke-static {v2, v3, v4, v8, v9}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    goto/16 :goto_13

    .line 1130
    .line 1131
    :catchall_0
    move-exception v0

    .line 1132
    goto/16 :goto_14

    .line 1133
    .line 1134
    :catchall_1
    move-exception v0

    .line 1135
    :goto_f
    move-object v12, v8

    .line 1136
    move-object v15, v9

    .line 1137
    goto/16 :goto_14

    .line 1138
    .line 1139
    :pswitch_35
    move-object v14, v4

    .line 1140
    move-object v0, v6

    .line 1141
    move-object v12, v8

    .line 1142
    move-object v15, v9

    .line 1143
    move-object v6, v1

    .line 1144
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1145
    .line 1146
    .line 1147
    move-result-wide v3

    .line 1148
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1149
    .line 1150
    .line 1151
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v1, Lhw;

    .line 1154
    .line 1155
    invoke-virtual {v1}, Lhw;->y()I

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1163
    .line 1164
    .line 1165
    goto/16 :goto_13

    .line 1166
    .line 1167
    :pswitch_36
    move-object v14, v4

    .line 1168
    move-object v0, v6

    .line 1169
    move-object v12, v8

    .line 1170
    move-object v15, v9

    .line 1171
    move-object v6, v1

    .line 1172
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v3

    .line 1176
    const/4 v1, 0x1

    .line 1177
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1178
    .line 1179
    .line 1180
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v1, Lhw;

    .line 1183
    .line 1184
    invoke-virtual {v1}, Lhw;->x()J

    .line 1185
    .line 1186
    .line 1187
    move-result-wide v8

    .line 1188
    invoke-static {v2, v3, v4, v8, v9}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1192
    .line 1193
    .line 1194
    goto/16 :goto_13

    .line 1195
    .line 1196
    :pswitch_37
    move-object v14, v4

    .line 1197
    move-object v0, v6

    .line 1198
    move-object v12, v8

    .line 1199
    move-object v15, v9

    .line 1200
    move-object v6, v1

    .line 1201
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1202
    .line 1203
    .line 1204
    move-result-wide v3

    .line 1205
    const/4 v1, 0x5

    .line 1206
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v1, Lhw;

    .line 1212
    .line 1213
    invoke-virtual {v1}, Lhw;->w()I

    .line 1214
    .line 1215
    .line 1216
    move-result v1

    .line 1217
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    goto/16 :goto_13

    .line 1224
    .line 1225
    :pswitch_38
    move-object v14, v4

    .line 1226
    move-object v0, v6

    .line 1227
    move-object v12, v8

    .line 1228
    move-object v15, v9

    .line 1229
    move-object v6, v1

    .line 1230
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1231
    .line 1232
    .line 1233
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v1, Lhw;

    .line 1236
    .line 1237
    invoke-virtual {v1}, Lhw;->q()I

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    invoke-virtual {v6, v7}, Lqh1;->m(I)V

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v3

    .line 1248
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_13

    .line 1255
    .line 1256
    :pswitch_39
    move-object v14, v4

    .line 1257
    move-object v0, v6

    .line 1258
    move-object v12, v8

    .line 1259
    move-object v15, v9

    .line 1260
    move-object v6, v1

    .line 1261
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v3

    .line 1265
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v1, Lhw;

    .line 1271
    .line 1272
    invoke-virtual {v1}, Lhw;->D()I

    .line 1273
    .line 1274
    .line 1275
    move-result v1

    .line 1276
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    goto/16 :goto_13

    .line 1283
    .line 1284
    :pswitch_3a
    move-object v14, v4

    .line 1285
    move-object v0, v6

    .line 1286
    move-object v12, v8

    .line 1287
    move-object v15, v9

    .line 1288
    move-object v6, v1

    .line 1289
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1290
    .line 1291
    .line 1292
    move-result-wide v3

    .line 1293
    invoke-virtual {v14}, Liw;->k()Lvl;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    invoke-static {v2, v3, v4, v1}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1301
    .line 1302
    .line 1303
    goto/16 :goto_13

    .line 1304
    .line 1305
    :pswitch_3b
    move-object v14, v4

    .line 1306
    move-object v0, v6

    .line 1307
    move-object v12, v8

    .line 1308
    move-object v15, v9

    .line 1309
    move-object v6, v1

    .line 1310
    invoke-virtual {v6, v7, v2}, Lqh1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v1

    .line 1314
    check-cast v1, Lw;

    .line 1315
    .line 1316
    invoke-virtual {v6, v7}, Lqh1;->o(I)Lh72;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v3

    .line 1320
    const/4 v4, 0x2

    .line 1321
    invoke-virtual {v14, v4}, Liw;->R(I)V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v14, v1, v3, v0}, Liw;->f(Ljava/lang/Object;Lh72;Ldg0;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v6, v7, v2, v1}, Lqh1;->R(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_13

    .line 1331
    .line 1332
    :pswitch_3c
    move-object v14, v4

    .line 1333
    move-object v0, v6

    .line 1334
    move-object v12, v8

    .line 1335
    move-object v15, v9

    .line 1336
    move-object v6, v1

    .line 1337
    invoke-virtual {v6, v3, v14, v2}, Lqh1;->M(ILiw;Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1341
    .line 1342
    .line 1343
    goto/16 :goto_13

    .line 1344
    .line 1345
    :pswitch_3d
    move-object v14, v4

    .line 1346
    move-object v0, v6

    .line 1347
    move-object v12, v8

    .line 1348
    move-object v15, v9

    .line 1349
    move-object v6, v1

    .line 1350
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1351
    .line 1352
    .line 1353
    move-result-wide v3

    .line 1354
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v1, Lhw;

    .line 1360
    .line 1361
    invoke-virtual {v1}, Lhw;->m()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v1

    .line 1365
    sget-object v5, Lmy2;->c:Lky2;

    .line 1366
    .line 1367
    invoke-virtual {v5, v2, v3, v4, v1}, Lky2;->k(Ljava/lang/Object;JZ)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1371
    .line 1372
    .line 1373
    goto/16 :goto_13

    .line 1374
    .line 1375
    :pswitch_3e
    move-object v14, v4

    .line 1376
    move-object v0, v6

    .line 1377
    move-object v12, v8

    .line 1378
    move-object v15, v9

    .line 1379
    move-object v6, v1

    .line 1380
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v3

    .line 1384
    const/4 v1, 0x5

    .line 1385
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1389
    .line 1390
    check-cast v1, Lhw;

    .line 1391
    .line 1392
    invoke-virtual {v1}, Lhw;->r()I

    .line 1393
    .line 1394
    .line 1395
    move-result v1

    .line 1396
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1400
    .line 1401
    .line 1402
    goto/16 :goto_13

    .line 1403
    .line 1404
    :pswitch_3f
    move-object v14, v4

    .line 1405
    move-object v0, v6

    .line 1406
    move-object v12, v8

    .line 1407
    move-object v15, v9

    .line 1408
    move-object v6, v1

    .line 1409
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1410
    .line 1411
    .line 1412
    move-result-wide v3

    .line 1413
    const/4 v1, 0x1

    .line 1414
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1415
    .line 1416
    .line 1417
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1418
    .line 1419
    check-cast v1, Lhw;

    .line 1420
    .line 1421
    invoke-virtual {v1}, Lhw;->s()J

    .line 1422
    .line 1423
    .line 1424
    move-result-wide v8

    .line 1425
    invoke-static {v2, v3, v4, v8, v9}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1429
    .line 1430
    .line 1431
    goto/16 :goto_13

    .line 1432
    .line 1433
    :pswitch_40
    move-object v14, v4

    .line 1434
    move-object v0, v6

    .line 1435
    move-object v12, v8

    .line 1436
    move-object v15, v9

    .line 1437
    move-object v6, v1

    .line 1438
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1439
    .line 1440
    .line 1441
    move-result-wide v3

    .line 1442
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1443
    .line 1444
    .line 1445
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1446
    .line 1447
    check-cast v1, Lhw;

    .line 1448
    .line 1449
    invoke-virtual {v1}, Lhw;->u()I

    .line 1450
    .line 1451
    .line 1452
    move-result v1

    .line 1453
    invoke-static {v2, v1, v3, v4}, Lmy2;->n(Ljava/lang/Object;IJ)V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1457
    .line 1458
    .line 1459
    goto/16 :goto_13

    .line 1460
    .line 1461
    :pswitch_41
    move-object v14, v4

    .line 1462
    move-object v0, v6

    .line 1463
    move-object v12, v8

    .line 1464
    move-object v15, v9

    .line 1465
    move-object v6, v1

    .line 1466
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1467
    .line 1468
    .line 1469
    move-result-wide v3

    .line 1470
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1471
    .line 1472
    .line 1473
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v1, Lhw;

    .line 1476
    .line 1477
    invoke-virtual {v1}, Lhw;->E()J

    .line 1478
    .line 1479
    .line 1480
    move-result-wide v8

    .line 1481
    invoke-static {v2, v3, v4, v8, v9}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1485
    .line 1486
    .line 1487
    goto/16 :goto_13

    .line 1488
    .line 1489
    :pswitch_42
    move-object v14, v4

    .line 1490
    move-object v0, v6

    .line 1491
    move-object v12, v8

    .line 1492
    move-object v15, v9

    .line 1493
    move-object v6, v1

    .line 1494
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1495
    .line 1496
    .line 1497
    move-result-wide v3

    .line 1498
    invoke-virtual {v14, v5}, Liw;->R(I)V

    .line 1499
    .line 1500
    .line 1501
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v1, Lhw;

    .line 1504
    .line 1505
    invoke-virtual {v1}, Lhw;->v()J

    .line 1506
    .line 1507
    .line 1508
    move-result-wide v8

    .line 1509
    invoke-static {v2, v3, v4, v8, v9}, Lmy2;->o(Ljava/lang/Object;JJ)V

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1513
    .line 1514
    .line 1515
    goto/16 :goto_13

    .line 1516
    .line 1517
    :pswitch_43
    move-object v14, v4

    .line 1518
    move-object v0, v6

    .line 1519
    move-object v12, v8

    .line 1520
    move-object v15, v9

    .line 1521
    move-object v6, v1

    .line 1522
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v3

    .line 1526
    const/4 v1, 0x5

    .line 1527
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1528
    .line 1529
    .line 1530
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v1, Lhw;

    .line 1533
    .line 1534
    invoke-virtual {v1}, Lhw;->t()F

    .line 1535
    .line 1536
    .line 1537
    move-result v1

    .line 1538
    sget-object v5, Lmy2;->c:Lky2;

    .line 1539
    .line 1540
    invoke-virtual {v5, v2, v3, v4, v1}, Lky2;->n(Ljava/lang/Object;JF)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 1544
    .line 1545
    .line 1546
    goto :goto_13

    .line 1547
    :pswitch_44
    move-object v14, v4

    .line 1548
    move-object v0, v6

    .line 1549
    move-object v12, v8

    .line 1550
    move-object v15, v9

    .line 1551
    move-object v6, v1

    .line 1552
    invoke-static {v3}, Lqh1;->C(I)J

    .line 1553
    .line 1554
    .line 1555
    move-result-wide v3

    .line 1556
    const/4 v1, 0x1

    .line 1557
    invoke-virtual {v14, v1}, Liw;->R(I)V

    .line 1558
    .line 1559
    .line 1560
    iget-object v1, v14, Liw;->e:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v1, Lhw;

    .line 1563
    .line 1564
    invoke-virtual {v1}, Lhw;->p()D

    .line 1565
    .line 1566
    .line 1567
    move-result-wide v8

    .line 1568
    sget-object v0, Lmy2;->c:Lky2;
    :try_end_b
    .catch Lnz0; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 1569
    .line 1570
    move-object v1, v2

    .line 1571
    move-wide v2, v3

    .line 1572
    move-wide v4, v8

    .line 1573
    :try_start_c
    invoke-virtual/range {v0 .. v5}, Lky2;->m(Ljava/lang/Object;JD)V
    :try_end_c
    .catch Lnz0; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1574
    .line 1575
    .line 1576
    move-object v2, v1

    .line 1577
    :try_start_d
    invoke-virtual {v6, v7, v2}, Lqh1;->O(ILjava/lang/Object;)V
    :try_end_d
    .catch Lnz0; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 1578
    .line 1579
    .line 1580
    goto :goto_13

    .line 1581
    :catchall_2
    move-exception v0

    .line 1582
    move-object v2, v1

    .line 1583
    goto :goto_14

    .line 1584
    :catch_5
    move-object v2, v1

    .line 1585
    goto :goto_10

    .line 1586
    :catch_6
    move-object v6, v1

    .line 1587
    move-object v14, v4

    .line 1588
    move-object v12, v8

    .line 1589
    move-object v15, v9

    .line 1590
    const/16 v16, 0x0

    .line 1591
    .line 1592
    :catch_7
    :goto_10
    :try_start_e
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1593
    .line 1594
    .line 1595
    if-nez v13, :cond_c

    .line 1596
    .line 1597
    invoke-static {v2}, Ltx2;->a(Ljava/lang/Object;)Lrx2;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v0

    .line 1601
    move-object v13, v0

    .line 1602
    :cond_c
    invoke-static {v13, v14}, Ltx2;->b(Ljava/lang/Object;Liw;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 1606
    if-nez v0, :cond_f

    .line 1607
    .line 1608
    :goto_11
    if-ge v11, v10, :cond_d

    .line 1609
    .line 1610
    aget v0, v15, v11

    .line 1611
    .line 1612
    invoke-virtual {v6, v0, v2, v13}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1613
    .line 1614
    .line 1615
    add-int/lit8 v11, v11, 0x1

    .line 1616
    .line 1617
    goto :goto_11

    .line 1618
    :cond_d
    if-eqz v13, :cond_e

    .line 1619
    .line 1620
    goto/16 :goto_7

    .line 1621
    .line 1622
    :cond_e
    :goto_12
    return-void

    .line 1623
    :cond_f
    :goto_13
    move-object v1, v6

    .line 1624
    move-object v8, v12

    .line 1625
    move-object v4, v14

    .line 1626
    move-object v9, v15

    .line 1627
    move-object/from16 v6, p3

    .line 1628
    .line 1629
    goto/16 :goto_0

    .line 1630
    .line 1631
    :catchall_3
    move-exception v0

    .line 1632
    goto/16 :goto_2

    .line 1633
    .line 1634
    :goto_14
    if-ge v11, v10, :cond_10

    .line 1635
    .line 1636
    aget v1, v15, v11

    .line 1637
    .line 1638
    invoke-virtual {v6, v1, v2, v13}, Lqh1;->l(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1639
    .line 1640
    .line 1641
    add-int/lit8 v11, v11, 0x1

    .line 1642
    .line 1643
    goto :goto_14

    .line 1644
    :cond_10
    if-eqz v13, :cond_11

    .line 1645
    .line 1646
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1647
    .line 1648
    .line 1649
    move-object v1, v2

    .line 1650
    check-cast v1, Lsq0;

    .line 1651
    .line 1652
    iput-object v13, v1, Lsq0;->unknownFields:Lrx2;

    .line 1653
    .line 1654
    :cond_11
    throw v0

    .line 1655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;[BIILbd;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lqh1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lqh1;->I(Ljava/lang/Object;[BIILbd;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v6, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move v4, p3

    .line 14
    move v5, p4

    .line 15
    move-object v7, p5

    .line 16
    invoke-virtual/range {v1 .. v7}, Lqh1;->H(Ljava/lang/Object;[BIIILbd;)I

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i(Lsq0;Lsq0;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lqh1;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Lqh1;->U(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    invoke-static {v5}, Lqh1;->T(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 29
    .line 30
    aget v5, v0, v5

    .line 31
    .line 32
    and-int/2addr v5, v6

    .line 33
    int-to-long v5, v5

    .line 34
    sget-object v9, Lmy2;->c:Lky2;

    .line 35
    .line 36
    invoke-virtual {v9, p1, v5, v6}, Lky2;->g(Ljava/lang/Object;J)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-virtual {v9, p2, v5, v6}, Lky2;->g(Ljava/lang/Object;J)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ne v10, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v9, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v9, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v5, v6}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_0
    move v4, v2

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :pswitch_1
    sget-object v4, Lmy2;->c:Lky2;

    .line 66
    .line 67
    invoke-virtual {v4, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v5, v4}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :pswitch_2
    sget-object v4, Lmy2;->c:Lky2;

    .line 82
    .line 83
    invoke-virtual {v4, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v4, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v5, v4}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_0

    .line 102
    .line 103
    sget-object v5, Lmy2;->c:Lky2;

    .line 104
    .line 105
    invoke-virtual {v5, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v5, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v6, v5}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    sget-object v5, Lmy2;->c:Lky2;

    .line 128
    .line 129
    invoke-virtual {v5, p1, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v9

    .line 133
    invoke-virtual {v5, p2, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    cmp-long v5, v9, v5

    .line 138
    .line 139
    if-nez v5, :cond_0

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_0

    .line 148
    .line 149
    sget-object v5, Lmy2;->c:Lky2;

    .line 150
    .line 151
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-ne v6, v5, :cond_0

    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_0

    .line 168
    .line 169
    sget-object v5, Lmy2;->c:Lky2;

    .line 170
    .line 171
    invoke-virtual {v5, p1, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    invoke-virtual {v5, p2, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    cmp-long v5, v9, v5

    .line 180
    .line 181
    if-nez v5, :cond_0

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_0

    .line 190
    .line 191
    sget-object v5, Lmy2;->c:Lky2;

    .line 192
    .line 193
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-ne v6, v5, :cond_0

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_0

    .line 210
    .line 211
    sget-object v5, Lmy2;->c:Lky2;

    .line 212
    .line 213
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-ne v6, v5, :cond_0

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_0

    .line 230
    .line 231
    sget-object v5, Lmy2;->c:Lky2;

    .line 232
    .line 233
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-ne v6, v5, :cond_0

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_0

    .line 250
    .line 251
    sget-object v5, Lmy2;->c:Lky2;

    .line 252
    .line 253
    invoke-virtual {v5, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v5, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-static {v6, v5}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_0

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_0

    .line 274
    .line 275
    sget-object v5, Lmy2;->c:Lky2;

    .line 276
    .line 277
    invoke-virtual {v5, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v5, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-static {v6, v5}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_0

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_0

    .line 298
    .line 299
    sget-object v5, Lmy2;->c:Lky2;

    .line 300
    .line 301
    invoke-virtual {v5, p1, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-virtual {v5, p2, v7, v8}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-static {v6, v5}, Ll72;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_0

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_0

    .line 322
    .line 323
    sget-object v5, Lmy2;->c:Lky2;

    .line 324
    .line 325
    invoke-virtual {v5, p1, v7, v8}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-virtual {v5, p2, v7, v8}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-ne v6, v5, :cond_0

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_0

    .line 342
    .line 343
    sget-object v5, Lmy2;->c:Lky2;

    .line 344
    .line 345
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-ne v6, v5, :cond_0

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_0

    .line 362
    .line 363
    sget-object v5, Lmy2;->c:Lky2;

    .line 364
    .line 365
    invoke-virtual {v5, p1, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 366
    .line 367
    .line 368
    move-result-wide v9

    .line 369
    invoke-virtual {v5, p2, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 370
    .line 371
    .line 372
    move-result-wide v5

    .line 373
    cmp-long v5, v9, v5

    .line 374
    .line 375
    if-nez v5, :cond_0

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_0

    .line 384
    .line 385
    sget-object v5, Lmy2;->c:Lky2;

    .line 386
    .line 387
    invoke-virtual {v5, p1, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-virtual {v5, p2, v7, v8}, Lky2;->g(Ljava/lang/Object;J)I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-ne v6, v5, :cond_0

    .line 396
    .line 397
    goto :goto_1

    .line 398
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_0

    .line 403
    .line 404
    sget-object v5, Lmy2;->c:Lky2;

    .line 405
    .line 406
    invoke-virtual {v5, p1, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 407
    .line 408
    .line 409
    move-result-wide v9

    .line 410
    invoke-virtual {v5, p2, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 411
    .line 412
    .line 413
    move-result-wide v5

    .line 414
    cmp-long v5, v9, v5

    .line 415
    .line 416
    if-nez v5, :cond_0

    .line 417
    .line 418
    goto :goto_1

    .line 419
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_0

    .line 424
    .line 425
    sget-object v5, Lmy2;->c:Lky2;

    .line 426
    .line 427
    invoke-virtual {v5, p1, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 428
    .line 429
    .line 430
    move-result-wide v9

    .line 431
    invoke-virtual {v5, p2, v7, v8}, Lky2;->h(Ljava/lang/Object;J)J

    .line 432
    .line 433
    .line 434
    move-result-wide v5

    .line 435
    cmp-long v5, v9, v5

    .line 436
    .line 437
    if-nez v5, :cond_0

    .line 438
    .line 439
    goto :goto_1

    .line 440
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-eqz v5, :cond_0

    .line 445
    .line 446
    sget-object v5, Lmy2;->c:Lky2;

    .line 447
    .line 448
    invoke-virtual {v5, p1, v7, v8}, Lky2;->f(Ljava/lang/Object;J)F

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-virtual {v5, p2, v7, v8}, Lky2;->f(Ljava/lang/Object;J)F

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-ne v6, v5, :cond_0

    .line 465
    .line 466
    goto :goto_1

    .line 467
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Lqh1;->j(Lsq0;Lsq0;I)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_0

    .line 472
    .line 473
    sget-object v5, Lmy2;->c:Lky2;

    .line 474
    .line 475
    invoke-virtual {v5, p1, v7, v8}, Lky2;->e(Ljava/lang/Object;J)D

    .line 476
    .line 477
    .line 478
    move-result-wide v9

    .line 479
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 480
    .line 481
    .line 482
    move-result-wide v9

    .line 483
    invoke-virtual {v5, p2, v7, v8}, Lky2;->e(Ljava/lang/Object;J)D

    .line 484
    .line 485
    .line 486
    move-result-wide v5

    .line 487
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 488
    .line 489
    .line 490
    move-result-wide v5

    .line 491
    cmp-long v5, v9, v5

    .line 492
    .line 493
    if-nez v5, :cond_0

    .line 494
    .line 495
    :goto_1
    if-nez v4, :cond_1

    .line 496
    .line 497
    goto :goto_2

    .line 498
    :cond_1
    add-int/lit8 v3, v3, 0x3

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_2
    iget-object p0, p0, Lqh1;->m:Ltx2;

    .line 503
    .line 504
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object p0, p1, Lsq0;->unknownFields:Lrx2;

    .line 508
    .line 509
    iget-object p1, p2, Lsq0;->unknownFields:Lrx2;

    .line 510
    .line 511
    invoke-virtual {p0, p1}, Lrx2;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    if-nez p0, :cond_3

    .line 516
    .line 517
    :goto_2
    return v2

    .line 518
    :cond_3
    return v4

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lsq0;Lsq0;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final l(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p3, p0, Lqh1;->a:[I

    .line 2
    .line 3
    aget p3, p3, p1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const v0, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p3, v0

    .line 13
    int-to-long v0, p3

    .line 14
    sget-object p3, Lmy2;->c:Lky2;

    .line 15
    .line 16
    invoke-virtual {p3, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lqh1;->m(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final m(I)V
    .locals 0

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object p0, p0, Lqh1;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final n(I)Ljava/lang/Object;
    .locals 0

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object p0, p0, Lqh1;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object p0, p0, p1

    .line 8
    .line 9
    return-object p0
.end method

.method public final newInstance()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lqh1;->k:Lgn1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqh1;->e:Lw;

    .line 7
    .line 8
    check-cast p0, Lsq0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lsq0;->q()Lsq0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final o(I)Lh72;
    .locals 2

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object p0, p0, Lqh1;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v0, p0, p1

    .line 8
    .line 9
    check-cast v0, Lh72;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    sget-object v0, Laz1;->c:Laz1;

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x1

    .line 17
    .line 18
    aget-object v1, p0, v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Laz1;->a(Ljava/lang/Class;)Lh72;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aput-object v0, p0, p1

    .line 27
    .line 28
    return-object v0
.end method

.method public final p(Lsq0;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lqh1;->p:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const v4, 0xfffff

    .line 8
    .line 9
    .line 10
    move v7, v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    :goto_0
    iget-object v9, v0, Lqh1;->a:[I

    .line 15
    .line 16
    array-length v10, v9

    .line 17
    if-ge v5, v10, :cond_8

    .line 18
    .line 19
    invoke-virtual {v0, v5}, Lqh1;->U(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    aget v11, v9, v5

    .line 24
    .line 25
    invoke-static {v10}, Lqh1;->T(I)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    const/16 v13, 0x11

    .line 30
    .line 31
    const/4 v14, 0x1

    .line 32
    if-gt v12, v13, :cond_0

    .line 33
    .line 34
    add-int/lit8 v13, v5, 0x2

    .line 35
    .line 36
    aget v9, v9, v13

    .line 37
    .line 38
    and-int v13, v9, v4

    .line 39
    .line 40
    ushr-int/lit8 v9, v9, 0x14

    .line 41
    .line 42
    shl-int v9, v14, v9

    .line 43
    .line 44
    if-eq v13, v7, :cond_1

    .line 45
    .line 46
    int-to-long v7, v13

    .line 47
    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    move v7, v13

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const/4 v9, 0x0

    .line 54
    :cond_1
    :goto_1
    and-int/2addr v10, v4

    .line 55
    int-to-long v3, v10

    .line 56
    const/16 v15, 0x3f

    .line 57
    .line 58
    const/4 v10, 0x4

    .line 59
    const/16 v13, 0x8

    .line 60
    .line 61
    packed-switch v12, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_10

    .line 65
    .line 66
    :pswitch_0
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lw;

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v11, v3, v4}, Ljw;->e(ILw;Lh72;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    :goto_2
    add-int/2addr v6, v3

    .line 87
    goto/16 :goto_10

    .line 88
    .line 89
    :pswitch_1
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-eqz v9, :cond_7

    .line 94
    .line 95
    invoke-static {v1, v3, v4}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    invoke-static {v11}, Ljw;->h(I)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    shl-long v10, v3, v14

    .line 104
    .line 105
    shr-long/2addr v3, v15

    .line 106
    xor-long/2addr v3, v10

    .line 107
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    :goto_3
    add-int/2addr v3, v9

    .line 112
    goto :goto_2

    .line 113
    :pswitch_2
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_7

    .line 118
    .line 119
    invoke-static {v1, v3, v4}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-static {v11}, Ljw;->h(I)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    shl-int/lit8 v9, v3, 0x1

    .line 128
    .line 129
    shr-int/lit8 v3, v3, 0x1f

    .line 130
    .line 131
    xor-int/2addr v3, v9

    .line 132
    invoke-static {v3}, Ljw;->i(I)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    :goto_4
    add-int/2addr v3, v4

    .line 137
    goto :goto_2

    .line 138
    :pswitch_3
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_7

    .line 143
    .line 144
    :goto_5
    invoke-static {v11, v13, v6}, Lfm0;->b(III)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    goto/16 :goto_10

    .line 149
    .line 150
    :pswitch_4
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    :goto_6
    invoke-static {v11, v10, v6}, Lfm0;->b(III)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    goto/16 :goto_10

    .line 161
    .line 162
    :pswitch_5
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_7

    .line 167
    .line 168
    invoke-static {v1, v3, v4}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v11}, Ljw;->h(I)I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v3}, Ljw;->f(I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    goto :goto_4

    .line 181
    :pswitch_6
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-eqz v9, :cond_7

    .line 186
    .line 187
    invoke-static {v1, v3, v4}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-static {v11}, Ljw;->h(I)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-static {v3}, Ljw;->i(I)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    goto :goto_4

    .line 200
    :pswitch_7
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_7

    .line 205
    .line 206
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Lvl;

    .line 211
    .line 212
    invoke-static {v11, v3}, Ljw;->a(ILvl;)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    goto/16 :goto_2

    .line 217
    .line 218
    :pswitch_8
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-eqz v9, :cond_7

    .line 223
    .line 224
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    sget-object v9, Ll72;->a:Ljava/lang/Class;

    .line 233
    .line 234
    check-cast v3, Lw;

    .line 235
    .line 236
    invoke-static {v11}, Ljw;->h(I)I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    invoke-virtual {v3, v4}, Lw;->b(Lh72;)I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    :goto_7
    invoke-static {v3, v3, v9, v6}, Lfm0;->c(IIII)I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    goto/16 :goto_10

    .line 249
    .line 250
    :pswitch_9
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_7

    .line 255
    .line 256
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    instance-of v4, v3, Lvl;

    .line 261
    .line 262
    if-eqz v4, :cond_2

    .line 263
    .line 264
    check-cast v3, Lvl;

    .line 265
    .line 266
    invoke-static {v11}, Ljw;->h(I)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    invoke-virtual {v3}, Lvl;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    :goto_8
    invoke-static {v3, v3, v4, v6}, Lfm0;->c(IIII)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    :goto_9
    move v6, v3

    .line 279
    goto/16 :goto_10

    .line 280
    .line 281
    :cond_2
    check-cast v3, Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v11}, Ljw;->h(I)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    invoke-static {v3}, Ljw;->g(Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    :goto_a
    add-int/2addr v3, v4

    .line 292
    add-int/2addr v3, v6

    .line 293
    goto :goto_9

    .line 294
    :pswitch_a
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_7

    .line 299
    .line 300
    :goto_b
    invoke-static {v11, v14, v6}, Lfm0;->b(III)I

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    goto/16 :goto_10

    .line 305
    .line 306
    :pswitch_b
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_7

    .line 311
    .line 312
    invoke-static {v11}, Ljw;->c(I)I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    goto/16 :goto_2

    .line 317
    .line 318
    :pswitch_c
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_7

    .line 323
    .line 324
    invoke-static {v11}, Ljw;->d(I)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    :pswitch_d
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_7

    .line 335
    .line 336
    invoke-static {v1, v3, v4}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    invoke-static {v11}, Ljw;->h(I)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    invoke-static {v3}, Ljw;->f(I)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :pswitch_e
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    if-eqz v9, :cond_7

    .line 355
    .line 356
    invoke-static {v1, v3, v4}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 357
    .line 358
    .line 359
    move-result-wide v3

    .line 360
    invoke-static {v11}, Ljw;->h(I)I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    goto/16 :goto_3

    .line 369
    .line 370
    :pswitch_f
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    if-eqz v9, :cond_7

    .line 375
    .line 376
    invoke-static {v1, v3, v4}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 377
    .line 378
    .line 379
    move-result-wide v3

    .line 380
    invoke-static {v11}, Ljw;->h(I)I

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :pswitch_10
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-eqz v3, :cond_7

    .line 395
    .line 396
    goto/16 :goto_6

    .line 397
    .line 398
    :pswitch_11
    invoke-virtual {v0, v11, v1, v5}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_7

    .line 403
    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v0, v5}, Lqh1;->n(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    iget-object v9, v0, Lqh1;->n:Lhc1;

    .line 415
    .line 416
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    invoke-static {v3, v4}, Lhc1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_10

    .line 423
    .line 424
    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    check-cast v3, Ljava/util/List;

    .line 429
    .line 430
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    sget-object v9, Ll72;->a:Ljava/lang/Class;

    .line 435
    .line 436
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-nez v9, :cond_3

    .line 441
    .line 442
    const/4 v12, 0x0

    .line 443
    goto :goto_d

    .line 444
    :cond_3
    const/4 v10, 0x0

    .line 445
    const/4 v12, 0x0

    .line 446
    :goto_c
    if-ge v10, v9, :cond_4

    .line 447
    .line 448
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    check-cast v13, Lw;

    .line 453
    .line 454
    invoke-static {v11, v13, v4}, Ljw;->e(ILw;Lh72;)I

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    add-int/2addr v12, v13

    .line 459
    add-int/lit8 v10, v10, 0x1

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :cond_4
    :goto_d
    add-int/2addr v6, v12

    .line 463
    goto/16 :goto_10

    .line 464
    .line 465
    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    check-cast v3, Ljava/util/List;

    .line 470
    .line 471
    invoke-static {v3}, Ll72;->p(Ljava/util/List;)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    if-lez v3, :cond_7

    .line 476
    .line 477
    invoke-static {v11}, Ljw;->h(I)I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    :goto_e
    invoke-static {v3, v4, v3, v6}, Lfm0;->c(IIII)I

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    goto/16 :goto_10

    .line 486
    .line 487
    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    check-cast v3, Ljava/util/List;

    .line 492
    .line 493
    invoke-static {v3}, Ll72;->n(Ljava/util/List;)I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-lez v3, :cond_7

    .line 498
    .line 499
    invoke-static {v11}, Ljw;->h(I)I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    goto :goto_e

    .line 504
    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, Ljava/util/List;

    .line 509
    .line 510
    invoke-static {v3}, Ll72;->g(Ljava/util/List;)I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    if-lez v3, :cond_7

    .line 515
    .line 516
    invoke-static {v11}, Ljw;->h(I)I

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    goto :goto_e

    .line 521
    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Ljava/util/List;

    .line 526
    .line 527
    invoke-static {v3}, Ll72;->e(Ljava/util/List;)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-lez v3, :cond_7

    .line 532
    .line 533
    invoke-static {v11}, Ljw;->h(I)I

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    goto :goto_e

    .line 538
    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    check-cast v3, Ljava/util/List;

    .line 543
    .line 544
    invoke-static {v3}, Ll72;->c(Ljava/util/List;)I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-lez v3, :cond_7

    .line 549
    .line 550
    invoke-static {v11}, Ljw;->h(I)I

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    goto :goto_e

    .line 555
    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    check-cast v3, Ljava/util/List;

    .line 560
    .line 561
    invoke-static {v3}, Ll72;->s(Ljava/util/List;)I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    if-lez v3, :cond_7

    .line 566
    .line 567
    invoke-static {v11}, Ljw;->h(I)I

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    goto :goto_e

    .line 572
    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    check-cast v3, Ljava/util/List;

    .line 577
    .line 578
    sget-object v4, Ll72;->a:Ljava/lang/Class;

    .line 579
    .line 580
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    if-lez v3, :cond_7

    .line 585
    .line 586
    invoke-static {v11}, Ljw;->h(I)I

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    goto :goto_e

    .line 591
    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    check-cast v3, Ljava/util/List;

    .line 596
    .line 597
    invoke-static {v3}, Ll72;->e(Ljava/util/List;)I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-lez v3, :cond_7

    .line 602
    .line 603
    invoke-static {v11}, Ljw;->h(I)I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    goto :goto_e

    .line 608
    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    check-cast v3, Ljava/util/List;

    .line 613
    .line 614
    invoke-static {v3}, Ll72;->g(Ljava/util/List;)I

    .line 615
    .line 616
    .line 617
    move-result v3

    .line 618
    if-lez v3, :cond_7

    .line 619
    .line 620
    invoke-static {v11}, Ljw;->h(I)I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    goto/16 :goto_e

    .line 625
    .line 626
    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    check-cast v3, Ljava/util/List;

    .line 631
    .line 632
    invoke-static {v3}, Ll72;->i(Ljava/util/List;)I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    if-lez v3, :cond_7

    .line 637
    .line 638
    invoke-static {v11}, Ljw;->h(I)I

    .line 639
    .line 640
    .line 641
    move-result v4

    .line 642
    goto/16 :goto_e

    .line 643
    .line 644
    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    check-cast v3, Ljava/util/List;

    .line 649
    .line 650
    invoke-static {v3}, Ll72;->u(Ljava/util/List;)I

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    if-lez v3, :cond_7

    .line 655
    .line 656
    invoke-static {v11}, Ljw;->h(I)I

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    goto/16 :goto_e

    .line 661
    .line 662
    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    check-cast v3, Ljava/util/List;

    .line 667
    .line 668
    invoke-static {v3}, Ll72;->k(Ljava/util/List;)I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    if-lez v3, :cond_7

    .line 673
    .line 674
    invoke-static {v11}, Ljw;->h(I)I

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    goto/16 :goto_e

    .line 679
    .line 680
    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    check-cast v3, Ljava/util/List;

    .line 685
    .line 686
    invoke-static {v3}, Ll72;->e(Ljava/util/List;)I

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    if-lez v3, :cond_7

    .line 691
    .line 692
    invoke-static {v11}, Ljw;->h(I)I

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    goto/16 :goto_e

    .line 697
    .line 698
    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    check-cast v3, Ljava/util/List;

    .line 703
    .line 704
    invoke-static {v3}, Ll72;->g(Ljava/util/List;)I

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    if-lez v3, :cond_7

    .line 709
    .line 710
    invoke-static {v11}, Ljw;->h(I)I

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    goto/16 :goto_e

    .line 715
    .line 716
    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    check-cast v3, Ljava/util/List;

    .line 721
    .line 722
    invoke-static {v11, v3}, Ll72;->o(ILjava/util/List;)I

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    goto/16 :goto_2

    .line 727
    .line 728
    :pswitch_23
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    check-cast v3, Ljava/util/List;

    .line 733
    .line 734
    invoke-static {v11, v3}, Ll72;->m(ILjava/util/List;)I

    .line 735
    .line 736
    .line 737
    move-result v3

    .line 738
    goto/16 :goto_2

    .line 739
    .line 740
    :pswitch_24
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    check-cast v3, Ljava/util/List;

    .line 745
    .line 746
    invoke-static {v11, v3}, Ll72;->f(ILjava/util/List;)I

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    goto/16 :goto_2

    .line 751
    .line 752
    :pswitch_25
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    check-cast v3, Ljava/util/List;

    .line 757
    .line 758
    invoke-static {v11, v3}, Ll72;->d(ILjava/util/List;)I

    .line 759
    .line 760
    .line 761
    move-result v3

    .line 762
    goto/16 :goto_2

    .line 763
    .line 764
    :pswitch_26
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    check-cast v3, Ljava/util/List;

    .line 769
    .line 770
    invoke-static {v11, v3}, Ll72;->b(ILjava/util/List;)I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    goto/16 :goto_2

    .line 775
    .line 776
    :pswitch_27
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    check-cast v3, Ljava/util/List;

    .line 781
    .line 782
    invoke-static {v11, v3}, Ll72;->r(ILjava/util/List;)I

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    goto/16 :goto_2

    .line 787
    .line 788
    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    check-cast v3, Ljava/util/List;

    .line 793
    .line 794
    invoke-static {v11, v3}, Ll72;->a(ILjava/util/List;)I

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    goto/16 :goto_2

    .line 799
    .line 800
    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    check-cast v3, Ljava/util/List;

    .line 805
    .line 806
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    invoke-static {v11, v3, v4}, Ll72;->l(ILjava/util/List;Lh72;)I

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    goto/16 :goto_2

    .line 815
    .line 816
    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    check-cast v3, Ljava/util/List;

    .line 821
    .line 822
    invoke-static {v11, v3}, Ll72;->q(ILjava/util/List;)I

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    goto/16 :goto_2

    .line 827
    .line 828
    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    check-cast v3, Ljava/util/List;

    .line 833
    .line 834
    sget-object v4, Ll72;->a:Ljava/lang/Class;

    .line 835
    .line 836
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-nez v3, :cond_5

    .line 841
    .line 842
    const/4 v4, 0x0

    .line 843
    goto :goto_f

    .line 844
    :cond_5
    invoke-static {v11}, Ljw;->h(I)I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    add-int/2addr v4, v14

    .line 849
    mul-int/2addr v4, v3

    .line 850
    :goto_f
    add-int/2addr v6, v4

    .line 851
    goto/16 :goto_10

    .line 852
    .line 853
    :pswitch_2c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, Ljava/util/List;

    .line 858
    .line 859
    invoke-static {v11, v3}, Ll72;->d(ILjava/util/List;)I

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    goto/16 :goto_2

    .line 864
    .line 865
    :pswitch_2d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    check-cast v3, Ljava/util/List;

    .line 870
    .line 871
    invoke-static {v11, v3}, Ll72;->f(ILjava/util/List;)I

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    goto/16 :goto_2

    .line 876
    .line 877
    :pswitch_2e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    check-cast v3, Ljava/util/List;

    .line 882
    .line 883
    invoke-static {v11, v3}, Ll72;->h(ILjava/util/List;)I

    .line 884
    .line 885
    .line 886
    move-result v3

    .line 887
    goto/16 :goto_2

    .line 888
    .line 889
    :pswitch_2f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    check-cast v3, Ljava/util/List;

    .line 894
    .line 895
    invoke-static {v11, v3}, Ll72;->t(ILjava/util/List;)I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    goto/16 :goto_2

    .line 900
    .line 901
    :pswitch_30
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    check-cast v3, Ljava/util/List;

    .line 906
    .line 907
    invoke-static {v11, v3}, Ll72;->j(ILjava/util/List;)I

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    goto/16 :goto_2

    .line 912
    .line 913
    :pswitch_31
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    check-cast v3, Ljava/util/List;

    .line 918
    .line 919
    invoke-static {v11, v3}, Ll72;->d(ILjava/util/List;)I

    .line 920
    .line 921
    .line 922
    move-result v3

    .line 923
    goto/16 :goto_2

    .line 924
    .line 925
    :pswitch_32
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    check-cast v3, Ljava/util/List;

    .line 930
    .line 931
    invoke-static {v11, v3}, Ll72;->f(ILjava/util/List;)I

    .line 932
    .line 933
    .line 934
    move-result v3

    .line 935
    goto/16 :goto_2

    .line 936
    .line 937
    :pswitch_33
    and-int/2addr v9, v8

    .line 938
    if-eqz v9, :cond_7

    .line 939
    .line 940
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    check-cast v3, Lw;

    .line 945
    .line 946
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    invoke-static {v11, v3, v4}, Ljw;->e(ILw;Lh72;)I

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    goto/16 :goto_2

    .line 955
    .line 956
    :pswitch_34
    and-int/2addr v9, v8

    .line 957
    if-eqz v9, :cond_7

    .line 958
    .line 959
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 960
    .line 961
    .line 962
    move-result-wide v3

    .line 963
    invoke-static {v11}, Ljw;->h(I)I

    .line 964
    .line 965
    .line 966
    move-result v9

    .line 967
    shl-long v10, v3, v14

    .line 968
    .line 969
    shr-long/2addr v3, v15

    .line 970
    xor-long/2addr v3, v10

    .line 971
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    goto/16 :goto_3

    .line 976
    .line 977
    :pswitch_35
    and-int/2addr v9, v8

    .line 978
    if-eqz v9, :cond_7

    .line 979
    .line 980
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 981
    .line 982
    .line 983
    move-result v3

    .line 984
    invoke-static {v11}, Ljw;->h(I)I

    .line 985
    .line 986
    .line 987
    move-result v4

    .line 988
    shl-int/lit8 v9, v3, 0x1

    .line 989
    .line 990
    shr-int/lit8 v3, v3, 0x1f

    .line 991
    .line 992
    xor-int/2addr v3, v9

    .line 993
    invoke-static {v3}, Ljw;->i(I)I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    goto/16 :goto_4

    .line 998
    .line 999
    :pswitch_36
    and-int v3, v8, v9

    .line 1000
    .line 1001
    if-eqz v3, :cond_7

    .line 1002
    .line 1003
    goto/16 :goto_5

    .line 1004
    .line 1005
    :pswitch_37
    and-int v3, v8, v9

    .line 1006
    .line 1007
    if-eqz v3, :cond_7

    .line 1008
    .line 1009
    goto/16 :goto_6

    .line 1010
    .line 1011
    :pswitch_38
    and-int/2addr v9, v8

    .line 1012
    if-eqz v9, :cond_7

    .line 1013
    .line 1014
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    invoke-static {v11}, Ljw;->h(I)I

    .line 1019
    .line 1020
    .line 1021
    move-result v4

    .line 1022
    invoke-static {v3}, Ljw;->f(I)I

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    goto/16 :goto_4

    .line 1027
    .line 1028
    :pswitch_39
    and-int/2addr v9, v8

    .line 1029
    if-eqz v9, :cond_7

    .line 1030
    .line 1031
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1032
    .line 1033
    .line 1034
    move-result v3

    .line 1035
    invoke-static {v11}, Ljw;->h(I)I

    .line 1036
    .line 1037
    .line 1038
    move-result v4

    .line 1039
    invoke-static {v3}, Ljw;->i(I)I

    .line 1040
    .line 1041
    .line 1042
    move-result v3

    .line 1043
    goto/16 :goto_4

    .line 1044
    .line 1045
    :pswitch_3a
    and-int/2addr v9, v8

    .line 1046
    if-eqz v9, :cond_7

    .line 1047
    .line 1048
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    check-cast v3, Lvl;

    .line 1053
    .line 1054
    invoke-static {v11, v3}, Ljw;->a(ILvl;)I

    .line 1055
    .line 1056
    .line 1057
    move-result v3

    .line 1058
    goto/16 :goto_2

    .line 1059
    .line 1060
    :pswitch_3b
    and-int/2addr v9, v8

    .line 1061
    if-eqz v9, :cond_7

    .line 1062
    .line 1063
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v3

    .line 1067
    invoke-virtual {v0, v5}, Lqh1;->o(I)Lh72;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v4

    .line 1071
    sget-object v9, Ll72;->a:Ljava/lang/Class;

    .line 1072
    .line 1073
    check-cast v3, Lw;

    .line 1074
    .line 1075
    invoke-static {v11}, Ljw;->h(I)I

    .line 1076
    .line 1077
    .line 1078
    move-result v9

    .line 1079
    invoke-virtual {v3, v4}, Lw;->b(Lh72;)I

    .line 1080
    .line 1081
    .line 1082
    move-result v3

    .line 1083
    goto/16 :goto_7

    .line 1084
    .line 1085
    :pswitch_3c
    and-int/2addr v9, v8

    .line 1086
    if-eqz v9, :cond_7

    .line 1087
    .line 1088
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    instance-of v4, v3, Lvl;

    .line 1093
    .line 1094
    if-eqz v4, :cond_6

    .line 1095
    .line 1096
    check-cast v3, Lvl;

    .line 1097
    .line 1098
    invoke-static {v11}, Ljw;->h(I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v4

    .line 1102
    invoke-virtual {v3}, Lvl;->size()I

    .line 1103
    .line 1104
    .line 1105
    move-result v3

    .line 1106
    goto/16 :goto_8

    .line 1107
    .line 1108
    :cond_6
    check-cast v3, Ljava/lang/String;

    .line 1109
    .line 1110
    invoke-static {v11}, Ljw;->h(I)I

    .line 1111
    .line 1112
    .line 1113
    move-result v4

    .line 1114
    invoke-static {v3}, Ljw;->g(Ljava/lang/String;)I

    .line 1115
    .line 1116
    .line 1117
    move-result v3

    .line 1118
    goto/16 :goto_a

    .line 1119
    .line 1120
    :pswitch_3d
    and-int v3, v8, v9

    .line 1121
    .line 1122
    if-eqz v3, :cond_7

    .line 1123
    .line 1124
    goto/16 :goto_b

    .line 1125
    .line 1126
    :pswitch_3e
    and-int v3, v8, v9

    .line 1127
    .line 1128
    if-eqz v3, :cond_7

    .line 1129
    .line 1130
    invoke-static {v11}, Ljw;->c(I)I

    .line 1131
    .line 1132
    .line 1133
    move-result v3

    .line 1134
    goto/16 :goto_2

    .line 1135
    .line 1136
    :pswitch_3f
    and-int v3, v8, v9

    .line 1137
    .line 1138
    if-eqz v3, :cond_7

    .line 1139
    .line 1140
    invoke-static {v11}, Ljw;->d(I)I

    .line 1141
    .line 1142
    .line 1143
    move-result v3

    .line 1144
    goto/16 :goto_2

    .line 1145
    .line 1146
    :pswitch_40
    and-int/2addr v9, v8

    .line 1147
    if-eqz v9, :cond_7

    .line 1148
    .line 1149
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    invoke-static {v11}, Ljw;->h(I)I

    .line 1154
    .line 1155
    .line 1156
    move-result v4

    .line 1157
    invoke-static {v3}, Ljw;->f(I)I

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    goto/16 :goto_4

    .line 1162
    .line 1163
    :pswitch_41
    and-int/2addr v9, v8

    .line 1164
    if-eqz v9, :cond_7

    .line 1165
    .line 1166
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1167
    .line 1168
    .line 1169
    move-result-wide v3

    .line 1170
    invoke-static {v11}, Ljw;->h(I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v9

    .line 1174
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 1175
    .line 1176
    .line 1177
    move-result v3

    .line 1178
    goto/16 :goto_3

    .line 1179
    .line 1180
    :pswitch_42
    and-int/2addr v9, v8

    .line 1181
    if-eqz v9, :cond_7

    .line 1182
    .line 1183
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v3

    .line 1187
    invoke-static {v11}, Ljw;->h(I)I

    .line 1188
    .line 1189
    .line 1190
    move-result v9

    .line 1191
    invoke-static {v3, v4}, Ljw;->j(J)I

    .line 1192
    .line 1193
    .line 1194
    move-result v3

    .line 1195
    goto/16 :goto_3

    .line 1196
    .line 1197
    :pswitch_43
    and-int v3, v8, v9

    .line 1198
    .line 1199
    if-eqz v3, :cond_7

    .line 1200
    .line 1201
    goto/16 :goto_6

    .line 1202
    .line 1203
    :pswitch_44
    and-int v3, v8, v9

    .line 1204
    .line 1205
    if-eqz v3, :cond_7

    .line 1206
    .line 1207
    goto/16 :goto_5

    .line 1208
    .line 1209
    :cond_7
    :goto_10
    add-int/lit8 v5, v5, 0x3

    .line 1210
    .line 1211
    const v4, 0xfffff

    .line 1212
    .line 1213
    .line 1214
    goto/16 :goto_0

    .line 1215
    .line 1216
    :cond_8
    iget-object v0, v0, Lqh1;->m:Ltx2;

    .line 1217
    .line 1218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    iget-object v0, v1, Lsq0;->unknownFields:Lrx2;

    .line 1222
    .line 1223
    invoke-virtual {v0}, Lrx2;->b()I

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    add-int/2addr v0, v6

    .line 1228
    return v0

    .line 1229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lsq0;)I
    .locals 12

    .line 1
    sget-object v0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    :goto_0
    iget-object v4, p0, Lqh1;->a:[I

    .line 7
    .line 8
    array-length v5, v4

    .line 9
    if-ge v2, v5, :cond_7

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lqh1;->U(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-static {v5}, Lqh1;->T(I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    aget v7, v4, v2

    .line 20
    .line 21
    const v8, 0xfffff

    .line 22
    .line 23
    .line 24
    and-int/2addr v5, v8

    .line 25
    int-to-long v8, v5

    .line 26
    sget-object v5, Lgh0;->b:Lgh0;

    .line 27
    .line 28
    iget v5, v5, Lgh0;->a:I

    .line 29
    .line 30
    if-lt v6, v5, :cond_0

    .line 31
    .line 32
    sget-object v5, Lgh0;->c:Lgh0;

    .line 33
    .line 34
    iget v5, v5, Lgh0;->a:I

    .line 35
    .line 36
    if-gt v6, v5, :cond_0

    .line 37
    .line 38
    add-int/lit8 v5, v2, 0x2

    .line 39
    .line 40
    aget v4, v4, v5

    .line 41
    .line 42
    :cond_0
    const/16 v4, 0x3f

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    const/16 v10, 0x8

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    packed-switch v6, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_f

    .line 52
    .line 53
    :pswitch_0
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_6

    .line 58
    .line 59
    sget-object v4, Lmy2;->c:Lky2;

    .line 60
    .line 61
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lw;

    .line 66
    .line 67
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v7, v4, v5}, Ljw;->e(ILw;Lh72;)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    :goto_1
    add-int/2addr v3, v4

    .line 76
    goto/16 :goto_f

    .line 77
    .line 78
    :pswitch_1
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_6

    .line 83
    .line 84
    invoke-static {p1, v8, v9}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    invoke-static {v7}, Ljw;->h(I)I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    shl-long v8, v5, v11

    .line 93
    .line 94
    shr-long v4, v5, v4

    .line 95
    .line 96
    xor-long/2addr v4, v8

    .line 97
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    :goto_2
    add-int/2addr v4, v7

    .line 102
    goto :goto_1

    .line 103
    :pswitch_2
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    invoke-static {p1, v8, v9}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-static {v7}, Ljw;->h(I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    shl-int/lit8 v6, v4, 0x1

    .line 118
    .line 119
    shr-int/lit8 v4, v4, 0x1f

    .line 120
    .line 121
    xor-int/2addr v4, v6

    .line 122
    invoke-static {v4}, Ljw;->i(I)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    :goto_3
    add-int/2addr v4, v5

    .line 127
    goto :goto_1

    .line 128
    :pswitch_3
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_6

    .line 133
    .line 134
    :goto_4
    invoke-static {v7, v10, v3}, Lfm0;->b(III)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    goto/16 :goto_f

    .line 139
    .line 140
    :pswitch_4
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    :goto_5
    invoke-static {v7, v5, v3}, Lfm0;->b(III)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    goto/16 :goto_f

    .line 151
    .line 152
    :pswitch_5
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_6

    .line 157
    .line 158
    invoke-static {p1, v8, v9}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-static {v7}, Ljw;->h(I)I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-static {v4}, Ljw;->f(I)I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    goto :goto_3

    .line 171
    :pswitch_6
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_6

    .line 176
    .line 177
    invoke-static {p1, v8, v9}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-static {v7}, Ljw;->h(I)I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    invoke-static {v4}, Ljw;->i(I)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    goto :goto_3

    .line 190
    :pswitch_7
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_6

    .line 195
    .line 196
    sget-object v4, Lmy2;->c:Lky2;

    .line 197
    .line 198
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Lvl;

    .line 203
    .line 204
    invoke-static {v7, v4}, Ljw;->a(ILvl;)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :pswitch_8
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_6

    .line 215
    .line 216
    sget-object v4, Lmy2;->c:Lky2;

    .line 217
    .line 218
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    sget-object v6, Ll72;->a:Ljava/lang/Class;

    .line 227
    .line 228
    check-cast v4, Lw;

    .line 229
    .line 230
    invoke-static {v7}, Ljw;->h(I)I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    invoke-virtual {v4, v5}, Lw;->b(Lh72;)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    :goto_6
    invoke-static {v4, v4, v6, v3}, Lfm0;->c(IIII)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    goto/16 :goto_f

    .line 243
    .line 244
    :pswitch_9
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_6

    .line 249
    .line 250
    sget-object v4, Lmy2;->c:Lky2;

    .line 251
    .line 252
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    instance-of v5, v4, Lvl;

    .line 257
    .line 258
    if-eqz v5, :cond_1

    .line 259
    .line 260
    check-cast v4, Lvl;

    .line 261
    .line 262
    invoke-static {v7}, Ljw;->h(I)I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    invoke-virtual {v4}, Lvl;->size()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    :goto_7
    invoke-static {v4, v4, v5, v3}, Lfm0;->c(IIII)I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    goto/16 :goto_f

    .line 275
    .line 276
    :cond_1
    check-cast v4, Ljava/lang/String;

    .line 277
    .line 278
    invoke-static {v7}, Ljw;->h(I)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v4}, Ljw;->g(Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    :goto_8
    add-int/2addr v4, v5

    .line 287
    add-int/2addr v4, v3

    .line 288
    move v3, v4

    .line 289
    goto/16 :goto_f

    .line 290
    .line 291
    :pswitch_a
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_6

    .line 296
    .line 297
    :goto_9
    invoke-static {v7, v11, v3}, Lfm0;->b(III)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    goto/16 :goto_f

    .line 302
    .line 303
    :pswitch_b
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_6

    .line 308
    .line 309
    invoke-static {v7}, Ljw;->c(I)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :pswitch_c
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_6

    .line 320
    .line 321
    invoke-static {v7}, Ljw;->d(I)I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :pswitch_d
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_6

    .line 332
    .line 333
    invoke-static {p1, v8, v9}, Lqh1;->D(Ljava/lang/Object;J)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    invoke-static {v7}, Ljw;->h(I)I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    invoke-static {v4}, Ljw;->f(I)I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :pswitch_e
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    if-eqz v4, :cond_6

    .line 352
    .line 353
    invoke-static {p1, v8, v9}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 354
    .line 355
    .line 356
    move-result-wide v4

    .line 357
    invoke-static {v7}, Ljw;->h(I)I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    :goto_a
    add-int/2addr v4, v6

    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :pswitch_f
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    if-eqz v4, :cond_6

    .line 373
    .line 374
    invoke-static {p1, v8, v9}, Lqh1;->E(Ljava/lang/Object;J)J

    .line 375
    .line 376
    .line 377
    move-result-wide v4

    .line 378
    invoke-static {v7}, Ljw;->h(I)I

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    goto :goto_a

    .line 387
    :pswitch_10
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_6

    .line 392
    .line 393
    goto/16 :goto_5

    .line 394
    .line 395
    :pswitch_11
    invoke-virtual {p0, v7, p1, v2}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    if-eqz v4, :cond_6

    .line 400
    .line 401
    goto/16 :goto_4

    .line 402
    .line 403
    :pswitch_12
    sget-object v4, Lmy2;->c:Lky2;

    .line 404
    .line 405
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {p0, v2}, Lqh1;->n(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    iget-object v6, p0, Lqh1;->n:Lhc1;

    .line 414
    .line 415
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-static {v4, v5}, Lhc1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto/16 :goto_f

    .line 422
    .line 423
    :pswitch_13
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    sget-object v6, Ll72;->a:Ljava/lang/Class;

    .line 432
    .line 433
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-nez v6, :cond_2

    .line 438
    .line 439
    move v9, v1

    .line 440
    goto :goto_c

    .line 441
    :cond_2
    move v8, v1

    .line 442
    move v9, v8

    .line 443
    :goto_b
    if-ge v8, v6, :cond_3

    .line 444
    .line 445
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    check-cast v10, Lw;

    .line 450
    .line 451
    invoke-static {v7, v10, v5}, Ljw;->e(ILw;Lh72;)I

    .line 452
    .line 453
    .line 454
    move-result v10

    .line 455
    add-int/2addr v9, v10

    .line 456
    add-int/lit8 v8, v8, 0x1

    .line 457
    .line 458
    goto :goto_b

    .line 459
    :cond_3
    :goto_c
    add-int/2addr v3, v9

    .line 460
    goto/16 :goto_f

    .line 461
    .line 462
    :pswitch_14
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    check-cast v4, Ljava/util/List;

    .line 467
    .line 468
    invoke-static {v4}, Ll72;->p(Ljava/util/List;)I

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-lez v4, :cond_6

    .line 473
    .line 474
    invoke-static {v7}, Ljw;->h(I)I

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    :goto_d
    invoke-static {v4, v5, v4, v3}, Lfm0;->c(IIII)I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    goto/16 :goto_f

    .line 483
    .line 484
    :pswitch_15
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    check-cast v4, Ljava/util/List;

    .line 489
    .line 490
    invoke-static {v4}, Ll72;->n(Ljava/util/List;)I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    if-lez v4, :cond_6

    .line 495
    .line 496
    invoke-static {v7}, Ljw;->h(I)I

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    goto :goto_d

    .line 501
    :pswitch_16
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Ljava/util/List;

    .line 506
    .line 507
    invoke-static {v4}, Ll72;->g(Ljava/util/List;)I

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    if-lez v4, :cond_6

    .line 512
    .line 513
    invoke-static {v7}, Ljw;->h(I)I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    goto :goto_d

    .line 518
    :pswitch_17
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    check-cast v4, Ljava/util/List;

    .line 523
    .line 524
    invoke-static {v4}, Ll72;->e(Ljava/util/List;)I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    if-lez v4, :cond_6

    .line 529
    .line 530
    invoke-static {v7}, Ljw;->h(I)I

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    goto :goto_d

    .line 535
    :pswitch_18
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Ljava/util/List;

    .line 540
    .line 541
    invoke-static {v4}, Ll72;->c(Ljava/util/List;)I

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    if-lez v4, :cond_6

    .line 546
    .line 547
    invoke-static {v7}, Ljw;->h(I)I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    goto :goto_d

    .line 552
    :pswitch_19
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    check-cast v4, Ljava/util/List;

    .line 557
    .line 558
    invoke-static {v4}, Ll72;->s(Ljava/util/List;)I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    if-lez v4, :cond_6

    .line 563
    .line 564
    invoke-static {v7}, Ljw;->h(I)I

    .line 565
    .line 566
    .line 567
    move-result v5

    .line 568
    goto :goto_d

    .line 569
    :pswitch_1a
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    check-cast v4, Ljava/util/List;

    .line 574
    .line 575
    sget-object v5, Ll72;->a:Ljava/lang/Class;

    .line 576
    .line 577
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 578
    .line 579
    .line 580
    move-result v4

    .line 581
    if-lez v4, :cond_6

    .line 582
    .line 583
    invoke-static {v7}, Ljw;->h(I)I

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    goto :goto_d

    .line 588
    :pswitch_1b
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    check-cast v4, Ljava/util/List;

    .line 593
    .line 594
    invoke-static {v4}, Ll72;->e(Ljava/util/List;)I

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    if-lez v4, :cond_6

    .line 599
    .line 600
    invoke-static {v7}, Ljw;->h(I)I

    .line 601
    .line 602
    .line 603
    move-result v5

    .line 604
    goto :goto_d

    .line 605
    :pswitch_1c
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    check-cast v4, Ljava/util/List;

    .line 610
    .line 611
    invoke-static {v4}, Ll72;->g(Ljava/util/List;)I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    if-lez v4, :cond_6

    .line 616
    .line 617
    invoke-static {v7}, Ljw;->h(I)I

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    goto/16 :goto_d

    .line 622
    .line 623
    :pswitch_1d
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    check-cast v4, Ljava/util/List;

    .line 628
    .line 629
    invoke-static {v4}, Ll72;->i(Ljava/util/List;)I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-lez v4, :cond_6

    .line 634
    .line 635
    invoke-static {v7}, Ljw;->h(I)I

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    goto/16 :goto_d

    .line 640
    .line 641
    :pswitch_1e
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    check-cast v4, Ljava/util/List;

    .line 646
    .line 647
    invoke-static {v4}, Ll72;->u(Ljava/util/List;)I

    .line 648
    .line 649
    .line 650
    move-result v4

    .line 651
    if-lez v4, :cond_6

    .line 652
    .line 653
    invoke-static {v7}, Ljw;->h(I)I

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    goto/16 :goto_d

    .line 658
    .line 659
    :pswitch_1f
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    check-cast v4, Ljava/util/List;

    .line 664
    .line 665
    invoke-static {v4}, Ll72;->k(Ljava/util/List;)I

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-lez v4, :cond_6

    .line 670
    .line 671
    invoke-static {v7}, Ljw;->h(I)I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    goto/16 :goto_d

    .line 676
    .line 677
    :pswitch_20
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    check-cast v4, Ljava/util/List;

    .line 682
    .line 683
    invoke-static {v4}, Ll72;->e(Ljava/util/List;)I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    if-lez v4, :cond_6

    .line 688
    .line 689
    invoke-static {v7}, Ljw;->h(I)I

    .line 690
    .line 691
    .line 692
    move-result v5

    .line 693
    goto/16 :goto_d

    .line 694
    .line 695
    :pswitch_21
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    check-cast v4, Ljava/util/List;

    .line 700
    .line 701
    invoke-static {v4}, Ll72;->g(Ljava/util/List;)I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    if-lez v4, :cond_6

    .line 706
    .line 707
    invoke-static {v7}, Ljw;->h(I)I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    goto/16 :goto_d

    .line 712
    .line 713
    :pswitch_22
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    invoke-static {v7, v4}, Ll72;->o(ILjava/util/List;)I

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    goto/16 :goto_1

    .line 722
    .line 723
    :pswitch_23
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    invoke-static {v7, v4}, Ll72;->m(ILjava/util/List;)I

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    goto/16 :goto_1

    .line 732
    .line 733
    :pswitch_24
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    invoke-static {v7, v4}, Ll72;->f(ILjava/util/List;)I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    goto/16 :goto_1

    .line 742
    .line 743
    :pswitch_25
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 744
    .line 745
    .line 746
    move-result-object v4

    .line 747
    invoke-static {v7, v4}, Ll72;->d(ILjava/util/List;)I

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    goto/16 :goto_1

    .line 752
    .line 753
    :pswitch_26
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    invoke-static {v7, v4}, Ll72;->b(ILjava/util/List;)I

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    goto/16 :goto_1

    .line 762
    .line 763
    :pswitch_27
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    invoke-static {v7, v4}, Ll72;->r(ILjava/util/List;)I

    .line 768
    .line 769
    .line 770
    move-result v4

    .line 771
    goto/16 :goto_1

    .line 772
    .line 773
    :pswitch_28
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 774
    .line 775
    .line 776
    move-result-object v4

    .line 777
    invoke-static {v7, v4}, Ll72;->a(ILjava/util/List;)I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    goto/16 :goto_1

    .line 782
    .line 783
    :pswitch_29
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 784
    .line 785
    .line 786
    move-result-object v4

    .line 787
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    invoke-static {v7, v4, v5}, Ll72;->l(ILjava/util/List;Lh72;)I

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    goto/16 :goto_1

    .line 796
    .line 797
    :pswitch_2a
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    invoke-static {v7, v4}, Ll72;->q(ILjava/util/List;)I

    .line 802
    .line 803
    .line 804
    move-result v4

    .line 805
    goto/16 :goto_1

    .line 806
    .line 807
    :pswitch_2b
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    sget-object v5, Ll72;->a:Ljava/lang/Class;

    .line 812
    .line 813
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    if-nez v4, :cond_4

    .line 818
    .line 819
    move v5, v1

    .line 820
    goto :goto_e

    .line 821
    :cond_4
    invoke-static {v7}, Ljw;->h(I)I

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    add-int/2addr v5, v11

    .line 826
    mul-int/2addr v5, v4

    .line 827
    :goto_e
    add-int/2addr v3, v5

    .line 828
    goto/16 :goto_f

    .line 829
    .line 830
    :pswitch_2c
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    invoke-static {v7, v4}, Ll72;->d(ILjava/util/List;)I

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    goto/16 :goto_1

    .line 839
    .line 840
    :pswitch_2d
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    invoke-static {v7, v4}, Ll72;->f(ILjava/util/List;)I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    goto/16 :goto_1

    .line 849
    .line 850
    :pswitch_2e
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    invoke-static {v7, v4}, Ll72;->h(ILjava/util/List;)I

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    goto/16 :goto_1

    .line 859
    .line 860
    :pswitch_2f
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v4

    .line 864
    invoke-static {v7, v4}, Ll72;->t(ILjava/util/List;)I

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    goto/16 :goto_1

    .line 869
    .line 870
    :pswitch_30
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-static {v7, v4}, Ll72;->j(ILjava/util/List;)I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    goto/16 :goto_1

    .line 879
    .line 880
    :pswitch_31
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    invoke-static {v7, v4}, Ll72;->d(ILjava/util/List;)I

    .line 885
    .line 886
    .line 887
    move-result v4

    .line 888
    goto/16 :goto_1

    .line 889
    .line 890
    :pswitch_32
    invoke-static {p1, v8, v9}, Lqh1;->u(Lsq0;J)Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    invoke-static {v7, v4}, Ll72;->f(ILjava/util/List;)I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    goto/16 :goto_1

    .line 899
    .line 900
    :pswitch_33
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-eqz v4, :cond_6

    .line 905
    .line 906
    sget-object v4, Lmy2;->c:Lky2;

    .line 907
    .line 908
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    check-cast v4, Lw;

    .line 913
    .line 914
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 915
    .line 916
    .line 917
    move-result-object v5

    .line 918
    invoke-static {v7, v4, v5}, Ljw;->e(ILw;Lh72;)I

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    goto/16 :goto_1

    .line 923
    .line 924
    :pswitch_34
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v5

    .line 928
    if-eqz v5, :cond_6

    .line 929
    .line 930
    sget-object v5, Lmy2;->c:Lky2;

    .line 931
    .line 932
    invoke-virtual {v5, p1, v8, v9}, Lky2;->h(Ljava/lang/Object;J)J

    .line 933
    .line 934
    .line 935
    move-result-wide v5

    .line 936
    invoke-static {v7}, Ljw;->h(I)I

    .line 937
    .line 938
    .line 939
    move-result v7

    .line 940
    shl-long v8, v5, v11

    .line 941
    .line 942
    shr-long v4, v5, v4

    .line 943
    .line 944
    xor-long/2addr v4, v8

    .line 945
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    goto/16 :goto_2

    .line 950
    .line 951
    :pswitch_35
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v4

    .line 955
    if-eqz v4, :cond_6

    .line 956
    .line 957
    sget-object v4, Lmy2;->c:Lky2;

    .line 958
    .line 959
    invoke-virtual {v4, p1, v8, v9}, Lky2;->g(Ljava/lang/Object;J)I

    .line 960
    .line 961
    .line 962
    move-result v4

    .line 963
    invoke-static {v7}, Ljw;->h(I)I

    .line 964
    .line 965
    .line 966
    move-result v5

    .line 967
    shl-int/lit8 v6, v4, 0x1

    .line 968
    .line 969
    shr-int/lit8 v4, v4, 0x1f

    .line 970
    .line 971
    xor-int/2addr v4, v6

    .line 972
    invoke-static {v4}, Ljw;->i(I)I

    .line 973
    .line 974
    .line 975
    move-result v4

    .line 976
    goto/16 :goto_3

    .line 977
    .line 978
    :pswitch_36
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    move-result v4

    .line 982
    if-eqz v4, :cond_6

    .line 983
    .line 984
    goto/16 :goto_4

    .line 985
    .line 986
    :pswitch_37
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v4

    .line 990
    if-eqz v4, :cond_6

    .line 991
    .line 992
    goto/16 :goto_5

    .line 993
    .line 994
    :pswitch_38
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result v4

    .line 998
    if-eqz v4, :cond_6

    .line 999
    .line 1000
    sget-object v4, Lmy2;->c:Lky2;

    .line 1001
    .line 1002
    invoke-virtual {v4, p1, v8, v9}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    invoke-static {v7}, Ljw;->h(I)I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    invoke-static {v4}, Ljw;->f(I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v4

    .line 1014
    goto/16 :goto_3

    .line 1015
    .line 1016
    :pswitch_39
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    if-eqz v4, :cond_6

    .line 1021
    .line 1022
    sget-object v4, Lmy2;->c:Lky2;

    .line 1023
    .line 1024
    invoke-virtual {v4, p1, v8, v9}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1025
    .line 1026
    .line 1027
    move-result v4

    .line 1028
    invoke-static {v7}, Ljw;->h(I)I

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    invoke-static {v4}, Ljw;->i(I)I

    .line 1033
    .line 1034
    .line 1035
    move-result v4

    .line 1036
    goto/16 :goto_3

    .line 1037
    .line 1038
    :pswitch_3a
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v4

    .line 1042
    if-eqz v4, :cond_6

    .line 1043
    .line 1044
    sget-object v4, Lmy2;->c:Lky2;

    .line 1045
    .line 1046
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v4

    .line 1050
    check-cast v4, Lvl;

    .line 1051
    .line 1052
    invoke-static {v7, v4}, Ljw;->a(ILvl;)I

    .line 1053
    .line 1054
    .line 1055
    move-result v4

    .line 1056
    goto/16 :goto_1

    .line 1057
    .line 1058
    :pswitch_3b
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v4

    .line 1062
    if-eqz v4, :cond_6

    .line 1063
    .line 1064
    sget-object v4, Lmy2;->c:Lky2;

    .line 1065
    .line 1066
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v4

    .line 1070
    invoke-virtual {p0, v2}, Lqh1;->o(I)Lh72;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v5

    .line 1074
    sget-object v6, Ll72;->a:Ljava/lang/Class;

    .line 1075
    .line 1076
    check-cast v4, Lw;

    .line 1077
    .line 1078
    invoke-static {v7}, Ljw;->h(I)I

    .line 1079
    .line 1080
    .line 1081
    move-result v6

    .line 1082
    invoke-virtual {v4, v5}, Lw;->b(Lh72;)I

    .line 1083
    .line 1084
    .line 1085
    move-result v4

    .line 1086
    goto/16 :goto_6

    .line 1087
    .line 1088
    :pswitch_3c
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v4

    .line 1092
    if-eqz v4, :cond_6

    .line 1093
    .line 1094
    sget-object v4, Lmy2;->c:Lky2;

    .line 1095
    .line 1096
    invoke-virtual {v4, p1, v8, v9}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    instance-of v5, v4, Lvl;

    .line 1101
    .line 1102
    if-eqz v5, :cond_5

    .line 1103
    .line 1104
    check-cast v4, Lvl;

    .line 1105
    .line 1106
    invoke-static {v7}, Ljw;->h(I)I

    .line 1107
    .line 1108
    .line 1109
    move-result v5

    .line 1110
    invoke-virtual {v4}, Lvl;->size()I

    .line 1111
    .line 1112
    .line 1113
    move-result v4

    .line 1114
    goto/16 :goto_7

    .line 1115
    .line 1116
    :cond_5
    check-cast v4, Ljava/lang/String;

    .line 1117
    .line 1118
    invoke-static {v7}, Ljw;->h(I)I

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    invoke-static {v4}, Ljw;->g(Ljava/lang/String;)I

    .line 1123
    .line 1124
    .line 1125
    move-result v4

    .line 1126
    goto/16 :goto_8

    .line 1127
    .line 1128
    :pswitch_3d
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v4

    .line 1132
    if-eqz v4, :cond_6

    .line 1133
    .line 1134
    goto/16 :goto_9

    .line 1135
    .line 1136
    :pswitch_3e
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v4

    .line 1140
    if-eqz v4, :cond_6

    .line 1141
    .line 1142
    invoke-static {v7}, Ljw;->c(I)I

    .line 1143
    .line 1144
    .line 1145
    move-result v4

    .line 1146
    goto/16 :goto_1

    .line 1147
    .line 1148
    :pswitch_3f
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v4

    .line 1152
    if-eqz v4, :cond_6

    .line 1153
    .line 1154
    invoke-static {v7}, Ljw;->d(I)I

    .line 1155
    .line 1156
    .line 1157
    move-result v4

    .line 1158
    goto/16 :goto_1

    .line 1159
    .line 1160
    :pswitch_40
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v4

    .line 1164
    if-eqz v4, :cond_6

    .line 1165
    .line 1166
    sget-object v4, Lmy2;->c:Lky2;

    .line 1167
    .line 1168
    invoke-virtual {v4, p1, v8, v9}, Lky2;->g(Ljava/lang/Object;J)I

    .line 1169
    .line 1170
    .line 1171
    move-result v4

    .line 1172
    invoke-static {v7}, Ljw;->h(I)I

    .line 1173
    .line 1174
    .line 1175
    move-result v5

    .line 1176
    invoke-static {v4}, Ljw;->f(I)I

    .line 1177
    .line 1178
    .line 1179
    move-result v4

    .line 1180
    goto/16 :goto_3

    .line 1181
    .line 1182
    :pswitch_41
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v4

    .line 1186
    if-eqz v4, :cond_6

    .line 1187
    .line 1188
    sget-object v4, Lmy2;->c:Lky2;

    .line 1189
    .line 1190
    invoke-virtual {v4, p1, v8, v9}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1191
    .line 1192
    .line 1193
    move-result-wide v4

    .line 1194
    invoke-static {v7}, Ljw;->h(I)I

    .line 1195
    .line 1196
    .line 1197
    move-result v6

    .line 1198
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 1199
    .line 1200
    .line 1201
    move-result v4

    .line 1202
    goto/16 :goto_a

    .line 1203
    .line 1204
    :pswitch_42
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v4

    .line 1208
    if-eqz v4, :cond_6

    .line 1209
    .line 1210
    sget-object v4, Lmy2;->c:Lky2;

    .line 1211
    .line 1212
    invoke-virtual {v4, p1, v8, v9}, Lky2;->h(Ljava/lang/Object;J)J

    .line 1213
    .line 1214
    .line 1215
    move-result-wide v4

    .line 1216
    invoke-static {v7}, Ljw;->h(I)I

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    invoke-static {v4, v5}, Ljw;->j(J)I

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    goto/16 :goto_a

    .line 1225
    .line 1226
    :pswitch_43
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v4

    .line 1230
    if-eqz v4, :cond_6

    .line 1231
    .line 1232
    goto/16 :goto_5

    .line 1233
    .line 1234
    :pswitch_44
    invoke-virtual {p0, v2, p1}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v4

    .line 1238
    if-eqz v4, :cond_6

    .line 1239
    .line 1240
    goto/16 :goto_4

    .line 1241
    .line 1242
    :cond_6
    :goto_f
    add-int/lit8 v2, v2, 0x3

    .line 1243
    .line 1244
    goto/16 :goto_0

    .line 1245
    .line 1246
    :cond_7
    iget-object p0, p0, Lqh1;->m:Ltx2;

    .line 1247
    .line 1248
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    iget-object p0, p1, Lsq0;->unknownFields:Lrx2;

    .line 1252
    .line 1253
    invoke-virtual {p0}, Lrx2;->b()I

    .line 1254
    .line 1255
    .line 1256
    move-result p0

    .line 1257
    add-int/2addr p0, v3

    .line 1258
    return p0

    .line 1259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(ILjava/lang/Object;)Z
    .locals 7

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Lqh1;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-int p1, p0, v1

    .line 27
    .line 28
    int-to-long v0, p1

    .line 29
    invoke-static {p0}, Lqh1;->T(I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    packed-switch p0, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lf42;->e()V

    .line 39
    .line 40
    .line 41
    return v5

    .line 42
    :pswitch_0
    sget-object p0, Lmy2;->c:Lky2;

    .line 43
    .line 44
    invoke-virtual {p0, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :pswitch_1
    sget-object p0, Lmy2;->c:Lky2;

    .line 53
    .line 54
    invoke-virtual {p0, p2, v0, v1}, Lky2;->h(Ljava/lang/Object;J)J

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    cmp-long p0, p0, v2

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :pswitch_2
    sget-object p0, Lmy2;->c:Lky2;

    .line 65
    .line 66
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :pswitch_3
    sget-object p0, Lmy2;->c:Lky2;

    .line 75
    .line 76
    invoke-virtual {p0, p2, v0, v1}, Lky2;->h(Ljava/lang/Object;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide p0

    .line 80
    cmp-long p0, p0, v2

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :pswitch_4
    sget-object p0, Lmy2;->c:Lky2;

    .line 87
    .line 88
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :pswitch_5
    sget-object p0, Lmy2;->c:Lky2;

    .line 97
    .line 98
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_3

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :pswitch_6
    sget-object p0, Lmy2;->c:Lky2;

    .line 107
    .line 108
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_3

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :pswitch_7
    sget-object p0, Lvl;->b:Ltl;

    .line 117
    .line 118
    sget-object p1, Lmy2;->c:Lky2;

    .line 119
    .line 120
    invoke-virtual {p1, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Ltl;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    xor-int/2addr p0, v6

    .line 129
    return p0

    .line 130
    :pswitch_8
    sget-object p0, Lmy2;->c:Lky2;

    .line 131
    .line 132
    invoke-virtual {p0, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_3

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :pswitch_9
    sget-object p0, Lmy2;->c:Lky2;

    .line 141
    .line 142
    invoke-virtual {p0, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    instance-of p1, p0, Ljava/lang/String;

    .line 147
    .line 148
    if-eqz p1, :cond_0

    .line 149
    .line 150
    check-cast p0, Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    xor-int/2addr p0, v6

    .line 157
    return p0

    .line 158
    :cond_0
    instance-of p1, p0, Lvl;

    .line 159
    .line 160
    if-eqz p1, :cond_1

    .line 161
    .line 162
    sget-object p1, Lvl;->b:Ltl;

    .line 163
    .line 164
    invoke-virtual {p1, p0}, Ltl;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    xor-int/2addr p0, v6

    .line 169
    return p0

    .line 170
    :cond_1
    invoke-static {}, Lf42;->e()V

    .line 171
    .line 172
    .line 173
    return v5

    .line 174
    :pswitch_a
    sget-object p0, Lmy2;->c:Lky2;

    .line 175
    .line 176
    invoke-virtual {p0, p2, v0, v1}, Lky2;->c(Ljava/lang/Object;J)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    return p0

    .line 181
    :pswitch_b
    sget-object p0, Lmy2;->c:Lky2;

    .line 182
    .line 183
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_3

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :pswitch_c
    sget-object p0, Lmy2;->c:Lky2;

    .line 191
    .line 192
    invoke-virtual {p0, p2, v0, v1}, Lky2;->h(Ljava/lang/Object;J)J

    .line 193
    .line 194
    .line 195
    move-result-wide p0

    .line 196
    cmp-long p0, p0, v2

    .line 197
    .line 198
    if-eqz p0, :cond_3

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :pswitch_d
    sget-object p0, Lmy2;->c:Lky2;

    .line 202
    .line 203
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_3

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :pswitch_e
    sget-object p0, Lmy2;->c:Lky2;

    .line 211
    .line 212
    invoke-virtual {p0, p2, v0, v1}, Lky2;->h(Ljava/lang/Object;J)J

    .line 213
    .line 214
    .line 215
    move-result-wide p0

    .line 216
    cmp-long p0, p0, v2

    .line 217
    .line 218
    if-eqz p0, :cond_3

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :pswitch_f
    sget-object p0, Lmy2;->c:Lky2;

    .line 222
    .line 223
    invoke-virtual {p0, p2, v0, v1}, Lky2;->h(Ljava/lang/Object;J)J

    .line 224
    .line 225
    .line 226
    move-result-wide p0

    .line 227
    cmp-long p0, p0, v2

    .line 228
    .line 229
    if-eqz p0, :cond_3

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :pswitch_10
    sget-object p0, Lmy2;->c:Lky2;

    .line 233
    .line 234
    invoke-virtual {p0, p2, v0, v1}, Lky2;->f(Ljava/lang/Object;J)F

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-eqz p0, :cond_3

    .line 243
    .line 244
    goto :goto_0

    .line 245
    :pswitch_11
    sget-object p0, Lmy2;->c:Lky2;

    .line 246
    .line 247
    invoke-virtual {p0, p2, v0, v1}, Lky2;->e(Ljava/lang/Object;J)D

    .line 248
    .line 249
    .line 250
    move-result-wide p0

    .line 251
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 252
    .line 253
    .line 254
    move-result-wide p0

    .line 255
    cmp-long p0, p0, v2

    .line 256
    .line 257
    if-eqz p0, :cond_3

    .line 258
    .line 259
    goto :goto_0

    .line 260
    :cond_2
    ushr-int/lit8 p0, v0, 0x14

    .line 261
    .line 262
    shl-int p0, v6, p0

    .line 263
    .line 264
    sget-object p1, Lmy2;->c:Lky2;

    .line 265
    .line 266
    invoke-virtual {p1, p2, v2, v3}, Lky2;->g(Ljava/lang/Object;J)I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    and-int/2addr p0, p1

    .line 271
    if-eqz p0, :cond_3

    .line 272
    .line 273
    :goto_0
    return v6

    .line 274
    :cond_3
    return v5

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(ILjava/lang/Object;I)Z
    .locals 2

    .line 1
    add-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Lqh1;->a:[I

    .line 4
    .line 5
    aget p0, p0, p3

    .line 6
    .line 7
    const p3, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p0, p3

    .line 11
    int-to-long v0, p0

    .line 12
    sget-object p0, Lmy2;->c:Lky2;

    .line 13
    .line 14
    invoke-virtual {p0, p2, v0, v1}, Lky2;->g(Ljava/lang/Object;J)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final v(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p1, v0

    .line 9
    int-to-long v0, p1

    .line 10
    sget-object p1, Lmy2;->c:Lky2;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0, v1}, Lky2;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p0, p0, Lqh1;->n:Lhc1;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-object v2, p1

    .line 24
    check-cast v2, Lfc1;

    .line 25
    .line 26
    iget-boolean v2, v2, Lfc1;->a:Z

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, Lfc1;->b:Lfc1;

    .line 31
    .line 32
    invoke-virtual {v2}, Lfc1;->c()Lfc1;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2, p1}, Lhc1;->b(Ljava/lang/Object;Ljava/lang/Object;)Lfc1;

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0, v1, v2}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object p1, Lfc1;->b:Lfc1;

    .line 48
    .line 49
    invoke-virtual {p1}, Lfc1;->c()Lfc1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p2, v0, v1, p1}, Lmy2;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p1, Lfc1;

    .line 60
    .line 61
    invoke-static {p3}, Lpm2;->m(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method

.method public final w(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p3}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    int-to-long v0, v0

    .line 17
    sget-object v2, Lqh1;->p:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lqh1;->o(I)Lh72;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p0, p1, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v3}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p3}, Lh72;->newInstance()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p3, v4, v3}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1, p2}, Lqh1;->O(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, Lh72;->newInstance()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p3, p1, p0}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2, v0, v1, p1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p0, p1

    .line 80
    :cond_3
    invoke-interface {p3, p0, v3}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object p0, p0, Lqh1;->a:[I

    .line 85
    .line 86
    aget p0, p0, p1

    .line 87
    .line 88
    invoke-static {p0, p3}, Lds0;->d(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final x(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lqh1;->a:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p0, v1, p3, p1}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    int-to-long v2, v2

    .line 21
    sget-object v4, Lqh1;->p:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v4, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v5, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lqh1;->o(I)Lh72;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, v1, p2, p1}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v5}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, p2, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p3}, Lh72;->newInstance()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {p3, v0, v5}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-virtual {p0, v1, p2, p1}, Lqh1;->P(ILjava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {v4, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    invoke-interface {p3}, Lh72;->newInstance()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p3, p1, p0}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p2, v2, v3, p1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p0, p1

    .line 84
    :cond_3
    invoke-interface {p3, p0, v5}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    aget p0, v0, p1

    .line 89
    .line 90
    invoke-static {p0, p3}, Lds0;->d(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final y(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lqh1;->o(I)Lh72;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Lqh1;->U(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    int-to-long v1, v1

    .line 14
    invoke-virtual {p0, p1, p2}, Lqh1;->r(ILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Lh72;->newInstance()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object p0, Lqh1;->p:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p0, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-interface {v0}, Lh72;->newInstance()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p1, p0}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p1
.end method

.method public final z(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p3}, Lqh1;->o(I)Lh72;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lqh1;->t(ILjava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lh72;->newInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object p1, Lqh1;->p:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lqh1;->U(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const p3, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p0, p3

    .line 26
    int-to-long v1, p0

    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lqh1;->s(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-interface {v0}, Lh72;->newInstance()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p1, p0}, Lh72;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p1
.end method
