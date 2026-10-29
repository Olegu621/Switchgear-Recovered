.class public Lcom/appsflyer/internal/AFa1hSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field public static final AFInAppEventType:Ljava/util/Map;

.field private static afDebugLog:J

.field private static afErrorLog:I

.field private static afErrorLogForExcManagerOnly:[B

.field private static afInfoLog:I

.field private static afVerboseLog:I

.field private static afWarnLog:I

.field public static final d:Ljava/util/Map;

.field private static e:Ljava/lang/Object;

.field private static force:J

.field private static i:Ljava/lang/Object;

.field private static unregisterClient:[B

.field private static v:J

.field private static w:[B


# direct methods
.method private static $$c(SSI)Ljava/lang/String;
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$13:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x73

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$12:I

    .line 8
    .line 9
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 10
    .line 11
    add-int/lit8 v2, p0, 0x1

    .line 12
    .line 13
    rsub-int p2, p2, 0x495

    .line 14
    .line 15
    rsub-int/lit8 p1, p1, 0x77

    .line 16
    .line 17
    new-array v2, v2, [B

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x79

    .line 23
    .line 24
    rem-int/lit16 v4, v0, 0x80

    .line 25
    .line 26
    sput v4, Lcom/appsflyer/internal/AFa1hSDK;->$12:I

    .line 27
    .line 28
    rem-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0x3c

    .line 33
    .line 34
    div-int/2addr v0, v3

    .line 35
    :cond_0
    move v0, p2

    .line 36
    move-object v4, v1

    .line 37
    move v1, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v0, v3

    .line 40
    :goto_0
    int-to-byte v4, p1

    .line 41
    aput-byte v4, v2, v0

    .line 42
    .line 43
    if-ne v0, p0, :cond_2

    .line 44
    .line 45
    new-instance p0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {p0, v2, v3}, Ljava/lang/String;-><init>([BI)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    aget-byte v4, v1, p2

    .line 54
    .line 55
    move v5, v0

    .line 56
    move v0, p2

    .line 57
    move p2, v4

    .line 58
    move-object v4, v1

    .line 59
    move v1, v5

    .line 60
    :goto_1
    add-int/2addr p1, p2

    .line 61
    add-int/lit8 p1, p1, -0x3

    .line 62
    .line 63
    add-int/lit8 p2, v0, 0x1

    .line 64
    .line 65
    move v0, v1

    .line 66
    move-object v1, v4

    .line 67
    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 73

    const-class v1, Ljava/lang/Throwable;

    const-class v2, Ljava/lang/Class;

    const-class v3, [B

    const/4 v4, 0x0

    .line 1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2
    const-class v6, Lcom/appsflyer/internal/AFa1hSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFa1hSDK;->init$0()V

    const/4 v7, 0x2

    .line 3
    :try_start_0
    new-array v0, v7, [Ljava/lang/Object;

    const/4 v8, 0x7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v0, v10

    const/4 v9, 0x3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v0, v4

    sget-object v11, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v12, 0xc2

    aget-byte v12, v11, v12

    int-to-byte v12, v12

    const/16 v13, 0x69

    aget-byte v14, v11, v13

    int-to-byte v14, v14

    const/16 v15, 0x491

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v14, 0x1a

    aget-byte v15, v11, v14

    int-to-byte v15, v15

    move/from16 v16, v13

    const/16 v13, 0x2e

    move/from16 v17, v4

    aget-byte v4, v11, v13

    int-to-byte v4, v4

    move/from16 v18, v9

    const/16 v9, 0x470

    invoke-static {v15, v4, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v9, v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v12, v4, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v9, 0x0

    invoke-virtual {v4, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_77

    move v4, v10

    move-object v12, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    long-to-int v10, v10

    const v11, -0x20000893

    xor-int v15, v11, v10

    and-int/2addr v11, v10

    or-int/2addr v11, v15

    not-int v11, v11

    mul-int/lit16 v11, v11, 0x26f

    neg-int v11, v11

    neg-int v11, v11

    const v15, 0x854cf16

    or-int v19, v15, v11

    shl-int/lit8 v19, v19, 0x1

    xor-int/2addr v11, v15

    sub-int v19, v19, v11

    not-int v11, v10

    const v15, 0x50b8c304

    or-int/2addr v11, v15

    mul-int/lit16 v11, v11, -0x26f

    and-int v15, v19, v11

    or-int v11, v19, v11

    add-int/2addr v15, v11

    const v11, -0x23072c9c

    or-int/2addr v11, v10

    not-int v11, v11

    const v19, 0x20000892

    or-int v11, v19, v11

    const v19, 0x53bfe70d

    xor-int v20, v19, v10

    and-int v10, v19, v10

    or-int v10, v20, v10

    not-int v10, v10

    or-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x26f

    neg-int v10, v10

    neg-int v10, v10

    or-int v11, v15, v10

    shl-int/2addr v11, v4

    xor-int/2addr v10, v15

    sub-int/2addr v11, v10

    not-int v10, v0

    const v15, 0x10dedcae

    xor-int v19, v15, v10

    and-int/2addr v10, v15

    or-int v10, v19, v10

    not-int v10, v10

    const v15, 0x9200351

    xor-int v19, v15, v10

    and-int/2addr v10, v15

    or-int v10, v19, v10

    const v15, -0x10c01c89

    xor-int v19, v15, v0

    and-int/2addr v15, v0

    or-int v15, v19, v15

    move/from16 v19, v4

    not-int v4, v15

    xor-int v20, v10, v4

    and-int/2addr v4, v10

    or-int v4, v20, v4

    mul-int/lit16 v4, v4, -0xfc

    neg-int v4, v4

    neg-int v4, v4

    xor-int v10, v11, v4

    and-int/2addr v4, v11

    shl-int/lit8 v4, v4, 0x1

    add-int/2addr v10, v4

    const v4, 0x7d1c16dc

    add-int/2addr v10, v4

    not-int v0, v0

    const v4, 0x10dedcae

    xor-int v11, v4, v0

    and-int/2addr v0, v4

    or-int/2addr v0, v11

    const v4, 0x93ec377

    or-int/2addr v0, v4

    not-int v0, v0

    not-int v4, v15

    or-int/2addr v0, v4

    mul-int/lit16 v4, v0, 0xfc

    move v11, v14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    const v14, 0x34e90

    mul-int/2addr v0, v14

    mul-int/lit16 v14, v10, -0x35a

    add-int/2addr v14, v0

    or-int v0, v4, v13

    mul-int/lit16 v0, v0, -0x35b

    not-int v0, v0

    sub-int/2addr v14, v0

    add-int/lit8 v14, v14, -0x1

    not-int v0, v13

    xor-int v20, v0, v4

    and-int/2addr v0, v4

    or-int v0, v20, v0

    not-int v0, v0

    move/from16 v20, v11

    not-int v11, v4

    not-int v15, v10

    xor-int v22, v11, v15

    and-int/2addr v11, v15

    or-int v11, v22, v11

    xor-int v22, v11, v13

    and-int/2addr v11, v13

    or-int v11, v22, v11

    not-int v11, v11

    xor-int v22, v0, v11

    and-int/2addr v0, v11

    or-int v0, v22, v0

    mul-int/lit16 v0, v0, 0x35b

    add-int/2addr v0, v14

    not-int v11, v13

    or-int/2addr v11, v15

    not-int v11, v11

    not-int v10, v10

    xor-int v13, v10, v4

    and-int/2addr v4, v10

    or-int/2addr v4, v13

    not-int v4, v4

    xor-int v10, v11, v4

    and-int/2addr v4, v11

    or-int/2addr v4, v10

    mul-int/lit16 v4, v4, 0x35b

    not-int v4, v4

    sub-int/2addr v0, v4

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    goto/16 :goto_79

    :cond_0
    const-wide v10, -0x35639f66afc09726L    # -2.654305789685746E51

    sput-wide v10, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    const v0, 0x227a1884

    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->afWarnLog:I

    sput v18, Lcom/appsflyer/internal/AFa1hSDK;->afVerboseLog:I

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->afErrorLogForExcManagerOnly:[B

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->AFInAppEventType:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/util/Map;

    const/16 v10, 0x1ff

    :try_start_1
    aget-byte v0, v12, v10

    int-to-byte v0, v0

    const/16 v13, 0x6b

    aget-byte v4, v12, v13

    int-to-byte v4, v4

    const/16 v11, 0x463

    invoke-static {v0, v4, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v14

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/16 v0, 0x7b

    aget-byte v0, v12, v0

    int-to-byte v0, v0

    aget-byte v4, v12, v13

    int-to-byte v4, v4

    const/16 v11, 0x443

    invoke-static {v0, v4, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_15

    goto :goto_0

    :cond_1
    move-object v0, v9

    :goto_0
    const/16 v4, 0x17

    const/16 v22, 0x48

    const/4 v15, 0x6

    const/16 v23, 0x4

    .line 4
    :try_start_2
    aget-byte v4, v12, v4

    int-to-byte v4, v4

    aget-byte v11, v12, v16
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    int-to-byte v11, v11

    move/from16 v24, v10

    or-int/lit16 v10, v11, 0x421

    int-to-short v10, v10

    :try_start_3
    invoke-static {v4, v11, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v10, v12, v15

    int-to-byte v10, v10

    aget-byte v11, v12, v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    int-to-byte v11, v11

    xor-int/lit16 v12, v11, 0x40a

    move/from16 v25, v13

    and-int/lit16 v13, v11, 0x40a

    or-int/2addr v12, v13

    int-to-short v12, v12

    :try_start_4
    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    if-eqz v4, :cond_2

    :catch_0
    move/from16 v26, v15

    goto :goto_3

    :catch_1
    :goto_1
    move/from16 v25, v13

    goto :goto_2

    :catch_2
    move/from16 v24, v10

    goto :goto_1

    :catch_3
    :goto_2
    move-object v4, v9

    :cond_2
    :try_start_5
    sget-object v10, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v11, v10, v22

    int-to-byte v11, v11

    aget-byte v12, v10, v16

    int-to-byte v12, v12

    const/16 v13, 0x40d

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v12, v10, v25

    int-to-byte v12, v12

    aget-byte v10, v10, v23
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    int-to-byte v10, v10

    xor-int/lit16 v13, v10, 0x3e8

    move/from16 v26, v15

    and-int/lit16 v15, v10, 0x3e8

    or-int/2addr v13, v15

    int-to-short v13, v13

    :try_start_6
    invoke-static {v12, v10, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :goto_3
    const/16 v10, 0x4f

    if-eqz v4, :cond_3

    .line 5
    :try_start_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v13, v12, v10

    int-to-byte v13, v13

    aget-byte v12, v12, v23

    int-to-byte v12, v12

    const/16 v15, 0x3e4

    invoke-static {v13, v12, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_4

    :catch_5
    :cond_3
    move-object v11, v9

    :goto_4
    const/16 v12, 0xc

    if-eqz v4, :cond_4

    :try_start_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    sget-object v15, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    move/from16 v27, v10

    :try_start_9
    aget-byte v10, v15, v12

    int-to-byte v10, v10

    aget-byte v15, v15, v23

    int-to-byte v15, v15

    or-int/lit16 v12, v15, 0x3ca

    int-to-short v12, v12

    invoke-static {v10, v15, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_6

    :catch_6
    :goto_5
    move-object v10, v9

    goto :goto_6

    :catch_7
    :cond_4
    move/from16 v27, v10

    goto :goto_5

    :goto_6
    if-eqz v4, :cond_5

    :try_start_a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    sget-object v13, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v15, v13, v27

    int-to-byte v15, v15

    aget-byte v13, v13, v23
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    int-to-byte v13, v13

    move/from16 v29, v8

    const/16 v8, 0x3cc

    :try_start_b
    invoke-static {v15, v13, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    goto :goto_8

    :catch_8
    :goto_7
    move-object v4, v9

    goto :goto_8

    :catch_9
    :cond_5
    move/from16 v29, v8

    goto :goto_7

    :goto_8
    const/16 v12, 0x3b8

    const-class v13, Ljava/lang/String;

    const/16 v30, 0x50

    if-eqz v11, :cond_6

    :goto_9
    const/16 v31, 0x2b6

    goto :goto_a

    :cond_6
    if-nez v0, :cond_7

    move-object v11, v9

    goto :goto_9

    :cond_7
    :try_start_c
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v15, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v31, 0x2b6

    aget-byte v8, v15, v27

    int-to-byte v8, v8

    aget-byte v7, v15, v31

    int-to-byte v7, v7

    const/16 v9, 0x3c2

    invoke-static {v8, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_15

    :try_start_d
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v7, v15, v30

    int-to-byte v7, v7

    aget-byte v8, v15, v20

    int-to-byte v8, v8

    invoke-static {v7, v8, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_76

    :goto_a
    const/16 v7, 0x3a0

    if-eqz v4, :cond_8

    goto :goto_b

    :cond_8
    :try_start_e
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v4, v0, v20

    int-to-byte v4, v4

    int-to-byte v8, v4

    or-int/lit16 v9, v8, 0x3a0

    int-to-short v9, v9

    invoke-static {v4, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_15

    :try_start_f
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    aget-byte v8, v0, v17

    int-to-byte v8, v8

    aget-byte v9, v0, v20

    int-to-byte v9, v9

    invoke-static {v8, v9, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v27

    int-to-byte v9, v9

    aget-byte v15, v0, v23

    int-to-byte v15, v15

    xor-int/lit16 v7, v15, 0x381

    and-int/lit16 v12, v15, 0x381

    or-int/2addr v7, v12

    int-to-short v7, v7

    invoke-static {v9, v15, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v8, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_75

    :try_start_10
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    aget-byte v7, v0, v30

    int-to-byte v7, v7

    aget-byte v0, v0, v20

    int-to-byte v0, v0

    const/16 v8, 0x3b8

    invoke-static {v7, v0, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_74

    :goto_b
    const/16 v7, 0x2f

    if-nez v10, :cond_a

    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v8, v0, 0x1

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit8 v0, v0, 0x1

    sub-int/2addr v8, v0

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    if-eqz v11, :cond_a

    add-int/lit8 v8, v8, 0x7

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_11
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v0, v7

    int-to-byte v8, v8

    aget-byte v9, v0, v25

    int-to-byte v9, v9

    const/16 v10, 0x387

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_15

    const/4 v9, 0x2

    :try_start_12
    new-array v10, v9, [Ljava/lang/Object;

    aput-object v8, v10, v19

    aput-object v11, v10, v17

    aget-byte v8, v0, v30

    int-to-byte v8, v8

    aget-byte v9, v0, v20

    int-to-byte v9, v9

    const/16 v12, 0x3b8

    invoke-static {v8, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v30

    int-to-byte v9, v9

    aget-byte v0, v0, v20

    int-to-byte v0, v0

    invoke-static {v9, v0, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v13}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception v0

    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_9

    throw v1

    :cond_9
    throw v0

    :cond_a
    :goto_c
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v0, v30

    int-to-byte v8, v8

    aget-byte v9, v0, v20

    int-to-byte v9, v9

    const/16 v12, 0x3b8

    invoke-static {v8, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    move/from16 v9, v29

    invoke-static {v8, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    const/16 v33, 0x0

    aput-object v33, v8, v17

    aput-object v10, v8, v19

    const/16 v32, 0x2

    aput-object v11, v8, v32

    aput-object v4, v8, v18

    aput-object v10, v8, v23

    const/4 v9, 0x5

    aput-object v11, v8, v9

    aput-object v4, v8, v26

    const/4 v4, 0x7

    new-array v10, v4, [Z

    fill-array-data v10, :array_1

    new-array v12, v4, [Z

    fill-array-data v12, :array_2

    new-array v15, v4, [Z

    aput-boolean v17, v15, v17

    aput-boolean v17, v15, v19

    const/16 v32, 0x2

    aput-boolean v19, v15, v32

    aput-boolean v19, v15, v18

    aput-boolean v17, v15, v23

    aput-boolean v19, v15, v9

    aput-boolean v19, v15, v26
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_15

    const/16 v35, 0x38

    const/16 v36, 0x72

    :try_start_14
    aget-byte v4, v0, v36

    int-to-byte v4, v4

    aget-byte v11, v0, v16
    :try_end_14
    .catch Ljava/lang/ClassNotFoundException; {:try_start_14 .. :try_end_14} :catch_c
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_15

    int-to-byte v11, v11

    move/from16 v37, v7

    xor-int/lit16 v7, v11, 0x368

    and-int/lit16 v9, v11, 0x368

    or-int/2addr v7, v9

    int-to-short v7, v7

    :try_start_15
    invoke-static {v4, v11, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v7, v0, v35

    int-to-byte v7, v7

    const/16 v9, 0x2c

    aget-byte v0, v0, v9

    int-to-byte v0, v0

    or-int/lit16 v9, v0, 0x343

    int-to-short v9, v9

    invoke-static {v7, v0, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_15
    .catch Ljava/lang/ClassNotFoundException; {:try_start_15 .. :try_end_15} :catch_b
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    const/16 v4, 0x22

    if-lt v0, v4, :cond_b

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move/from16 v4, v19

    goto :goto_d

    :cond_b
    move/from16 v4, v17

    :goto_d
    const/16 v7, 0x1d

    if-ne v0, v7, :cond_c

    goto :goto_e

    :cond_c
    move/from16 v11, v20

    if-lt v0, v11, :cond_d

    move/from16 v7, v19

    goto :goto_f

    :cond_d
    :goto_e
    move/from16 v7, v17

    :goto_f
    :try_start_16
    aput-boolean v7, v15, v17

    const/16 v7, 0x15

    if-lt v0, v7, :cond_e

    move/from16 v7, v19

    goto :goto_10

    :cond_e
    move/from16 v7, v17

    :goto_10
    aput-boolean v7, v15, v19

    const/16 v7, 0x15

    if-lt v0, v7, :cond_f

    move/from16 v0, v19

    goto :goto_11

    :cond_f
    move/from16 v0, v17

    :goto_11
    aput-boolean v0, v15, v23
    :try_end_16
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_16} :catch_a
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_15

    :catch_a
    :goto_12
    move v7, v4

    goto :goto_14

    :catch_b
    :goto_13
    move/from16 v4, v17

    goto :goto_12

    :catch_c
    move/from16 v37, v7

    goto :goto_13

    :goto_14
    move/from16 v4, v17

    move v9, v4

    :goto_15
    if-nez v9, :cond_60

    const/16 v0, 0x9

    if-ge v4, v0, :cond_60

    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v11, v0, 0x80

    sput v11, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v32, 0x2

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_5f

    :try_start_17
    aget-boolean v0, v15, v4
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_15

    if-eqz v0, :cond_5e

    const/16 v39, 0x7e

    const/16 v40, 0xe

    :try_start_18
    aget-boolean v41, v10, v4

    aget-object v0, v8, v4

    aget-boolean v42, v12, v4
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_71

    const/16 v43, 0x10

    if-eqz v41, :cond_14

    if-eqz v0, :cond_11

    .line 6
    :try_start_19
    sget-object v44, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v11, v44, v30
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    int-to-byte v11, v11

    move/from16 v45, v4

    const/16 v20, 0x1a

    :try_start_1a
    aget-byte v4, v44, v20
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    move/from16 v20, v7

    const/16 v7, 0x356

    int-to-byte v4, v4

    const/16 v7, 0x3b8

    :try_start_1b
    invoke-static {v11, v4, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v7, 0x112

    aget-byte v7, v44, v7

    int-to-byte v7, v7

    aget-byte v11, v44, v25
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    int-to-byte v11, v11

    move-object/from16 v44, v8

    const/16 v8, 0x361

    :try_start_1c
    invoke-static {v7, v11, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    if-eqz v4, :cond_12

    goto/16 :goto_1c

    :catchall_1
    move-exception v0

    goto :goto_18

    :catchall_2
    move-exception v0

    :goto_16
    move-object/from16 v44, v8

    goto :goto_18

    :catchall_3
    move-exception v0

    :goto_17
    move/from16 v20, v7

    goto :goto_16

    :catchall_4
    move-exception v0

    move/from16 v45, v4

    goto :goto_17

    :goto_18
    :try_start_1d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_10

    throw v4

    :catchall_5
    move-exception v0

    move-object/from16 v58, v3

    move-object v8, v6

    move/from16 v47, v9

    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v59, v14

    move-object/from16 v21, v15

    :goto_19
    move/from16 v42, v45

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    :goto_1a
    const/16 v57, 0x2e

    :goto_1b
    move-object v6, v5

    move-object v5, v2

    goto/16 :goto_73

    :cond_10
    throw v0

    :cond_11
    move/from16 v45, v4

    move/from16 v20, v7

    move-object/from16 v44, v8

    :cond_12
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v7, v43

    int-to-byte v8, v8

    aget-byte v11, v7, v39

    int-to-byte v11, v11

    move-object/from16 v41, v7

    const/16 v7, 0x35a

    invoke-static {v8, v11, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v29, 0x7

    aget-byte v0, v41, v29

    int-to-byte v0, v0

    aget-byte v7, v41, v18

    int-to-byte v7, v7

    const/16 v8, 0x356

    invoke-static {v0, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    :try_start_1e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v4, v41, v40

    int-to-byte v4, v4

    const/16 v11, 0x1a

    aget-byte v7, v41, v11

    int-to-byte v7, v7

    const/16 v8, 0x356

    invoke-static {v4, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_1f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_13

    throw v4

    :cond_13
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    :cond_14
    move/from16 v45, v4

    move/from16 v20, v7

    move-object/from16 v44, v8

    :goto_1c
    if-eqz v41, :cond_29

    :try_start_20
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_17

    :try_start_21
    sget-object v7, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v7, v17

    int-to-byte v8, v8

    const/16 v46, 0x1a

    aget-byte v11, v7, v46

    int-to-byte v11, v11

    move-object/from16 v47, v7

    const/16 v7, 0x3a0

    invoke-static {v8, v11, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v11, v47, v23

    int-to-byte v11, v11

    aget-byte v7, v47, v25
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_16

    int-to-byte v7, v7

    move/from16 v47, v9

    const/16 v9, 0x344

    :try_start_22
    invoke-static {v11, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v8, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_15

    const-wide/32 v48, -0x6069e416

    xor-long v7, v7, v48

    :try_start_23
    invoke-virtual {v4, v7, v8}, Ljava/util/Random;->setSeed(J)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_14

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v48, 0x0

    :goto_1d
    if-nez v7, :cond_27

    .line 7
    sget v11, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v11, v11, 0x19

    move-object/from16 v49, v7

    rem-int/lit16 v7, v11, 0x80

    sput v7, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v32, 0x2

    rem-int/lit8 v11, v11, 0x2

    if-nez v11, :cond_26

    move-object/from16 v50, v8

    if-nez v8, :cond_15

    move/from16 v7, v26

    goto/16 :goto_1f

    :cond_15
    if-nez v9, :cond_17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    not-int v7, v7

    const v8, -0x768b448

    xor-int v11, v8, v7

    and-int/2addr v8, v7

    or-int/2addr v8, v11

    not-int v8, v8

    const v11, 0x132302cf

    or-int/2addr v8, v11

    mul-int/lit16 v8, v8, -0x3a5

    const v11, -0x4c8807b6

    add-int/2addr v8, v11

    const v11, 0x132302cf

    or-int/2addr v7, v11

    not-int v7, v7

    const v11, -0x176bb6d0

    xor-int v51, v7, v11

    and-int/2addr v7, v11

    or-int v7, v51, v7

    mul-int/lit16 v7, v7, 0x3a5

    add-int/2addr v7, v8

    const v8, 0x5af839a8

    and-int v11, v7, v8

    or-int/2addr v7, v8

    add-int/2addr v11, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    const v8, 0x59dca44d

    xor-int v51, v8, v7

    and-int v52, v8, v7

    move/from16 v53, v8

    or-int v8, v51, v52

    move/from16 v51, v7

    not-int v7, v8

    const v52, 0x1162a0e0

    or-int v7, v52, v7

    mul-int/lit16 v7, v7, -0x29c

    neg-int v7, v7

    neg-int v7, v7

    const v54, -0x51a3a350

    or-int v55, v54, v7

    shl-int/lit8 v55, v55, 0x1

    xor-int v7, v54, v7

    sub-int v55, v55, v7

    const v7, 0x1162a0e0

    xor-int v54, v7, v51

    and-int v7, v7, v51

    or-int v7, v54, v7

    not-int v7, v7

    xor-int v51, v53, v7

    and-int v7, v53, v7

    or-int v7, v51, v7

    mul-int/lit16 v7, v7, 0x538

    neg-int v7, v7

    neg-int v7, v7

    xor-int v51, v55, v7

    and-int v7, v55, v7

    shl-int/lit8 v7, v7, 0x1

    add-int v51, v51, v7

    or-int v7, v8, v52

    mul-int/lit16 v7, v7, 0x29c

    add-int v7, v7, v51

    if-le v11, v7, :cond_16

    :goto_1e
    move/from16 v7, v23

    goto :goto_1f

    :cond_16
    const/4 v7, 0x5

    goto :goto_1f

    :cond_17
    if-nez v48, :cond_18

    goto :goto_1e

    :cond_18
    move/from16 v7, v18

    .line 8
    :goto_1f
    :try_start_24
    new-instance v8, Ljava/lang/StringBuilder;

    xor-int/lit8 v11, v7, 0x1

    and-int/lit8 v51, v7, 0x1

    shl-int/lit8 v51, v51, 0x1

    add-int v11, v11, v51

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v11, 0x2e

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_14

    move-object/from16 v21, v15

    move/from16 v11, v17

    :goto_20
    if-ge v11, v7, :cond_1b

    if-eqz v42, :cond_1a

    move/from16 v46, v7

    const/16 v15, 0x1a

    :try_start_25
    invoke-virtual {v4, v15}, Ljava/util/Random;->nextInt(I)I

    move-result v7
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    move v15, v11

    move/from16 v11, v26

    :try_start_26
    invoke-virtual {v4}, Ljava/util/Random;->nextBoolean()Z

    move-result v52
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    if-eqz v52, :cond_19

    neg-int v7, v7

    neg-int v7, v7

    xor-int/lit8 v52, v7, 0x41

    and-int/lit8 v7, v7, 0x41

    shl-int/lit8 v7, v7, 0x1

    add-int v52, v52, v7

    move/from16 v53, v11

    move/from16 v7, v52

    move-object/from16 v52, v12

    goto :goto_21

    :cond_19
    move/from16 v53, v11

    move-object/from16 v52, v12

    :try_start_27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit16 v12, v7, 0x212

    not-int v12, v12

    rsub-int v12, v12, 0x421

    const v54, 0xc6c0

    xor-int v55, v12, v54

    and-int v12, v12, v54

    shl-int/lit8 v12, v12, 0x1

    add-int v55, v55, v12

    not-int v12, v11

    or-int/2addr v12, v7

    not-int v12, v12

    xor-int/lit8 v54, v7, 0x60

    and-int/lit8 v56, v7, 0x60

    move/from16 v57, v7

    or-int v7, v54, v56

    not-int v7, v7

    or-int/2addr v7, v12

    mul-int/lit16 v7, v7, 0x211

    xor-int v12, v55, v7

    and-int v7, v55, v7

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v12, v7

    xor-int v7, v57, v11

    and-int v11, v57, v11

    or-int/2addr v7, v11

    not-int v7, v7

    const/16 v11, -0x61

    xor-int v54, v11, v7

    and-int/2addr v7, v11

    or-int v7, v54, v7

    mul-int/lit16 v7, v7, 0x211

    neg-int v7, v7

    neg-int v7, v7

    and-int v11, v12, v7

    or-int/2addr v7, v12

    add-int/2addr v7, v11

    :goto_21
    int-to-char v7, v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    move-object/from16 v54, v4

    move-object v12, v9

    move-object/from16 v55, v10

    goto/16 :goto_24

    :catchall_7
    move-exception v0

    :goto_22
    move-object/from16 v58, v3

    move-object v8, v6

    move-object/from16 v55, v10

    :goto_23
    move-object/from16 v59, v14

    goto/16 :goto_19

    :catchall_8
    move-exception v0

    move/from16 v53, v11

    move-object/from16 v52, v12

    goto :goto_22

    :catchall_9
    move-exception v0

    move-object/from16 v52, v12

    move/from16 v53, v26

    goto :goto_22

    :cond_1a
    move/from16 v46, v7

    move v15, v11

    move-object/from16 v52, v12

    move/from16 v53, v26

    const/16 v7, 0xc

    :try_start_28
    invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v11
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_c

    move-object v12, v9

    move-object v7, v10

    :try_start_29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_b

    long-to-int v9, v9

    mul-int/lit8 v10, v11, 0x46

    const v54, -0x88000

    and-int v55, v10, v54

    or-int v10, v10, v54

    add-int v55, v55, v10

    not-int v10, v11

    move-object/from16 v54, v4

    xor-int/lit16 v4, v10, -0x2001

    and-int/lit16 v10, v10, -0x2001

    or-int/2addr v4, v10

    xor-int v10, v4, v9

    and-int/2addr v4, v9

    or-int/2addr v4, v10

    not-int v4, v4

    xor-int/lit16 v10, v11, 0x2000

    move/from16 v56, v4

    and-int/lit16 v4, v11, 0x2000

    or-int/2addr v4, v10

    xor-int v10, v4, v9

    and-int/2addr v4, v9

    or-int/2addr v4, v10

    not-int v4, v4

    or-int v4, v56, v4

    mul-int/lit8 v4, v4, 0x45

    and-int v10, v55, v4

    or-int v4, v55, v4

    add-int/2addr v10, v4

    not-int v4, v11

    move-object/from16 v55, v7

    xor-int/lit16 v7, v4, 0x2000

    move/from16 v56, v7

    and-int/lit16 v7, v4, 0x2000

    or-int v7, v56, v7

    not-int v7, v7

    xor-int v56, v4, v9

    and-int/2addr v4, v9

    or-int v4, v56, v4

    not-int v4, v4

    xor-int v56, v7, v4

    and-int/2addr v4, v7

    or-int v4, v56, v4

    xor-int/lit16 v7, v9, 0x2000

    and-int/lit16 v9, v9, 0x2000

    or-int/2addr v7, v9

    not-int v7, v7

    or-int/2addr v4, v7

    mul-int/lit8 v4, v4, -0x45

    add-int/2addr v4, v10

    const/16 v7, -0x2001

    or-int/2addr v7, v11

    not-int v7, v7

    mul-int/lit8 v7, v7, 0x45

    add-int/2addr v7, v4

    int-to-char v4, v7

    :try_start_2a
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_24
    add-int/lit8 v11, v15, 0x1

    move-object v9, v12

    move/from16 v7, v46

    move-object/from16 v12, v52

    move/from16 v26, v53

    move-object/from16 v4, v54

    move-object/from16 v10, v55

    goto/16 :goto_20

    :catchall_a
    move-exception v0

    :goto_25
    move-object/from16 v58, v3

    move-object v8, v6

    goto/16 :goto_23

    :catchall_b
    move-exception v0

    move-object/from16 v55, v7

    goto :goto_25

    :catchall_c
    move-exception v0

    move-object/from16 v55, v10

    goto :goto_25

    :cond_1b
    move-object/from16 v54, v4

    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move/from16 v53, v26

    move-object v12, v9

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_a

    if-nez v50, :cond_1d

    const/4 v9, 0x2

    :try_start_2b
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v4, v7, v19

    aput-object v0, v7, v17

    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v4, v30

    int-to-byte v8, v8

    const/16 v11, 0x1a

    aget-byte v9, v4, v11

    int-to-byte v9, v9

    const/16 v10, 0x3b8

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v30

    int-to-byte v9, v9

    aget-byte v4, v4, v11

    int-to-byte v4, v4

    invoke-static {v9, v4, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v13}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_d

    move-object v8, v4

    move-object v9, v12

    move-object/from16 v7, v49

    goto/16 :goto_28

    :catchall_d
    move-exception v0

    :try_start_2c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1c

    throw v4

    :cond_1c
    throw v0
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_a

    :cond_1d
    if-nez v12, :cond_1f

    .line 9
    sget v7, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v8, v7, 0x55

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit8 v7, v7, 0x55

    sub-int/2addr v8, v7

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/4 v9, 0x2

    .line 10
    :try_start_2d
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v4, v7, v19

    aput-object v0, v7, v17

    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v4, v30

    int-to-byte v8, v8

    const/16 v11, 0x1a

    aget-byte v9, v4, v11

    int-to-byte v9, v9

    const/16 v12, 0x3b8

    invoke-static {v8, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v30

    int-to-byte v9, v9

    aget-byte v4, v4, v11

    int-to-byte v4, v4

    invoke-static {v9, v4, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v13}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_e

    move-object v9, v4

    :goto_26
    move-object/from16 v7, v49

    :goto_27
    move-object/from16 v8, v50

    goto/16 :goto_28

    :catchall_e
    move-exception v0

    :try_start_2e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1e

    throw v4

    :cond_1e
    throw v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_a

    :cond_1f
    if-nez v48, :cond_21

    const/4 v9, 0x2

    :try_start_2f
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v4, v7, v19

    aput-object v0, v7, v17

    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v4, v30

    int-to-byte v8, v8

    const/16 v11, 0x1a

    aget-byte v9, v4, v11

    int-to-byte v9, v9

    const/16 v10, 0x3b8

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v30

    int-to-byte v9, v9

    aget-byte v4, v4, v11

    int-to-byte v4, v4

    invoke-static {v9, v4, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v13}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_f

    move-object/from16 v48, v4

    move-object v9, v12

    goto :goto_26

    :catchall_f
    move-exception v0

    :try_start_30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_20

    throw v4

    :cond_20
    throw v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_a

    :cond_21
    const/4 v9, 0x2

    :try_start_31
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v4, v7, v19

    aput-object v0, v7, v17

    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v4, v30

    int-to-byte v8, v8

    const/16 v11, 0x1a

    aget-byte v9, v4, v11

    int-to-byte v9, v9

    const/16 v10, 0x3b8

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v30

    int-to-byte v9, v9

    aget-byte v15, v4, v11

    int-to-byte v15, v15

    invoke-static {v9, v15, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9, v13}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_13

    :try_start_32
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v8

    aget-byte v9, v4, v36

    int-to-byte v9, v9

    const/16 v11, 0x1a

    aget-byte v10, v4, v11

    int-to-byte v10, v10

    const/16 v15, 0x334

    invoke-static {v9, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v4, v30

    int-to-byte v10, v10

    move/from16 v46, v11

    aget-byte v11, v4, v46

    int-to-byte v11, v11

    const/16 v15, 0x3b8

    invoke-static {v10, v11, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_11

    :try_start_33
    aget-byte v9, v4, v36

    int-to-byte v9, v9

    const/16 v11, 0x1a

    aget-byte v10, v4, v11

    int-to-byte v10, v10

    const/16 v15, 0x334

    invoke-static {v9, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v4, v43

    int-to-byte v10, v10

    aget-byte v4, v4, v25

    int-to-byte v4, v4

    xor-int/lit16 v15, v4, 0x309

    and-int/lit16 v11, v4, 0x309

    or-int/2addr v11, v15

    int-to-short v11, v11

    invoke-static {v10, v4, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-virtual {v9, v4, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_10

    move-object v9, v12

    goto/16 :goto_27

    :goto_28
    move-object/from16 v15, v21

    move-object/from16 v12, v52

    move/from16 v26, v53

    move-object/from16 v4, v54

    move-object/from16 v10, v55

    goto/16 :goto_1d

    :catchall_10
    move-exception v0

    :try_start_34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_22

    throw v4

    :catch_d
    move-exception v0

    goto :goto_29

    :cond_22
    throw v0

    :catchall_11
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_23

    throw v4

    :cond_23
    throw v0
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_d
    .catchall {:try_start_34 .. :try_end_34} :catchall_a

    :goto_29
    :try_start_35
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v9, v8, v43

    int-to-byte v9, v9

    aget-byte v10, v8, v39

    int-to-byte v10, v10

    const/16 v11, 0x319

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v29, 0x7

    aget-byte v7, v8, v29

    int-to-byte v7, v7

    aget-byte v9, v8, v18

    int-to-byte v9, v9

    const/16 v10, 0x356

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_a

    const/4 v9, 0x2

    :try_start_36
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v0, v7, v19

    aput-object v4, v7, v17

    aget-byte v0, v8, v40

    int-to-byte v0, v0

    const/16 v11, 0x1a

    aget-byte v4, v8, v11

    int-to-byte v4, v4

    const/16 v8, 0x356

    invoke-static {v0, v4, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_12

    :catchall_12
    move-exception v0

    :try_start_37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_24

    throw v4

    :cond_24
    throw v0

    :catchall_13
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_25

    throw v4

    :cond_25
    throw v0

    :catchall_14
    move-exception v0

    :goto_2a
    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v21, v15

    move/from16 v53, v26

    goto/16 :goto_25

    :cond_26
    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v21, v15

    move/from16 v53, v26

    const/16 v33, 0x0

    .line 11
    throw v33

    :cond_27
    move-object/from16 v49, v7

    move-object/from16 v50, v8

    move-object/from16 v52, v12

    move-object v12, v9

    :goto_2b
    move-object/from16 v55, v10

    move-object/from16 v21, v15

    move/from16 v53, v26

    goto :goto_2e

    :catchall_15
    move-exception v0

    :goto_2c
    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v21, v15

    move/from16 v53, v26

    goto :goto_2d

    :catchall_16
    move-exception v0

    move/from16 v47, v9

    goto :goto_2c

    .line 12
    :goto_2d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_28

    throw v4

    :cond_28
    throw v0

    :catchall_17
    move-exception v0

    move/from16 v47, v9

    goto :goto_2a

    :cond_29
    move/from16 v47, v9

    move-object/from16 v52, v12

    const/4 v12, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    goto :goto_2b

    :goto_2e
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v4, 0x1aa

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    aget-byte v7, v0, v31

    int-to-byte v7, v7

    const/16 v8, 0x315

    invoke-static {v4, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_a

    :try_start_38
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v7

    aget-byte v8, v0, v27

    int-to-byte v8, v8

    aget-byte v9, v0, v23

    int-to-byte v9, v9

    const/16 v10, 0x2e5

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_70

    :try_start_39
    aget-byte v8, v0, v30

    int-to-byte v8, v8

    const/16 v11, 0x1a

    aget-byte v9, v0, v11

    int-to-byte v9, v9

    const/16 v10, 0x2db

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v35

    int-to-byte v9, v9

    aget-byte v10, v0, v23

    int-to-byte v10, v10

    xor-int/lit16 v15, v10, 0x2c0

    and-int/lit16 v11, v10, 0x2c0

    or-int/2addr v11, v15

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v7, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_6f

    :try_start_3a
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v29, 0x7

    aget-byte v9, v0, v29

    int-to-byte v9, v9

    xor-int/lit8 v10, v9, 0x56

    and-int/lit8 v11, v9, 0x56

    or-int/2addr v10, v11

    int-to-byte v10, v10

    const/16 v11, 0x2ca

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_a

    const/4 v9, 0x5

    :try_start_3b
    invoke-virtual {v7, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_6e

    :try_start_3c
    new-instance v8, Ljava/util/zip/ZipFile;

    invoke-direct {v8, v7}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_a

    const/16 v7, 0x1c8c

    :try_start_3d
    new-array v7, v7, [B

    move/from16 v9, v19

    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_6b

    move/from16 v9, v45

    :try_start_3e
    invoke-virtual {v8, v10}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v10
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_65

    .line 13
    sget v15, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v15, v15, 0x21

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 14
    :try_start_3f
    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    const/16 v15, 0x308

    aget-byte v15, v0, v15

    int-to-byte v15, v15

    const/16 v46, 0x1a

    aget-byte v4, v0, v46

    int-to-byte v4, v4

    invoke-static {v15, v4, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v15, v0, v40

    int-to-byte v15, v15

    aget-byte v11, v0, v46

    int-to-byte v11, v11

    move-object/from16 v42, v7

    const/16 v7, 0x2b0

    invoke-static {v15, v11, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_6a

    :try_start_40
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    aget-byte v10, v0, v16

    int-to-byte v10, v10

    const/16 v11, 0x1a

    aget-byte v15, v0, v11

    int-to-byte v15, v15

    move/from16 v46, v11

    const/16 v11, 0x29e

    invoke-static {v10, v15, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v15, v0, v40

    int-to-byte v15, v15

    aget-byte v11, v0, v46

    int-to-byte v11, v11

    invoke-static {v15, v11, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_69

    .line 15
    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v10, v10, 0x9

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 16
    :try_start_41
    filled-new-array/range {v42 .. v42}, [Ljava/lang/Object;

    move-result-object v10

    aget-byte v11, v0, v16

    int-to-byte v11, v11

    const/16 v46, 0x1a

    aget-byte v15, v0, v46

    int-to-byte v15, v15

    const/16 v7, 0x29e

    invoke-static {v11, v15, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v11, 0x31

    aget-byte v15, v0, v11
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_67

    int-to-byte v15, v15

    move/from16 v56, v11

    const/16 v51, 0x2e

    :try_start_42
    aget-byte v11, v0, v51
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_68

    int-to-byte v11, v11

    move-object/from16 v51, v12

    const/16 v12, 0x288

    :try_start_43
    invoke-static {v15, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v4, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_67

    :try_start_44
    aget-byte v7, v0, v16

    int-to-byte v7, v7

    const/16 v11, 0x1a

    aget-byte v10, v0, v11

    int-to-byte v10, v10

    const/16 v12, 0x29e

    invoke-static {v7, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v0, v43

    int-to-byte v10, v10

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    xor-int/lit16 v12, v0, 0x309

    and-int/lit16 v15, v0, 0x309

    or-int/2addr v12, v15

    int-to-short v12, v12

    invoke-static {v10, v0, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v7, v0, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v4, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_66

    const/16 v0, 0x14

    const/16 v4, 0x1c5a

    move v7, v0

    move v0, v4

    move-object v15, v14

    move-object/from16 v10, v42

    const/4 v12, 0x0

    .line 17
    :goto_2f
    :try_start_45
    array-length v4, v10
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_65

    const-wide/16 v45, 0x1

    move/from16 v11, v17

    :goto_30
    if-ge v11, v4, :cond_2a

    move/from16 v58, v4

    :try_start_46
    aget-byte v4, v10, v11
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_18

    move-object/from16 v59, v14

    move-object/from16 v60, v15

    int-to-long v14, v4

    shl-long v61, v45, v53

    add-long v14, v14, v61

    shl-long v61, v45, v43

    add-long v14, v14, v61

    sub-long v45, v14, v45

    add-int/lit8 v11, v11, 0x34

    xor-int/lit8 v14, v11, -0x33

    and-int/lit8 v4, v11, -0x33

    const/16 v19, 0x1

    shl-int/lit8 v11, v4, 0x1

    add-int/2addr v11, v14

    move/from16 v4, v58

    move-object/from16 v14, v59

    move-object/from16 v15, v60

    goto :goto_30

    :catchall_18
    move-exception v0

    move-object/from16 v59, v14

    :goto_31
    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    :goto_32
    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    :goto_33
    const/16 v57, 0x2e

    :goto_34
    move-object v3, v0

    goto/16 :goto_71

    :cond_2a
    move-object/from16 v59, v14

    move-object/from16 v60, v15

    add-int/lit8 v11, v7, 0x56

    add-int/lit16 v14, v7, 0x1c77

    .line 18
    :try_start_47
    aget-byte v14, v10, v14

    add-int/lit8 v14, v14, -0x62

    int-to-byte v14, v14

    aput-byte v14, v10, v11

    array-length v11, v10
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_64

    neg-int v14, v7

    move-object/from16 v19, v5

    :try_start_48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_63

    long-to-int v5, v4

    mul-int/lit16 v4, v14, -0xa7

    mul-int/lit16 v15, v11, -0xa7

    or-int v61, v4, v15

    const/16 v58, 0x1

    shl-int/lit8 v61, v61, 0x1

    move/from16 v58, v4

    xor-int v15, v58, v15

    sub-int v61, v61, v15

    not-int v15, v14

    not-int v4, v11

    xor-int v62, v15, v4

    and-int/2addr v15, v4

    or-int v15, v62, v15

    not-int v15, v15

    xor-int v62, v4, v5

    and-int/2addr v4, v5

    or-int v4, v62, v4

    not-int v4, v4

    xor-int v62, v15, v4

    and-int/2addr v4, v15

    or-int v4, v62, v4

    mul-int/lit16 v4, v4, 0x150

    and-int v15, v61, v4

    or-int v4, v61, v4

    add-int/2addr v15, v4

    or-int v4, v14, v11

    not-int v4, v4

    move/from16 v61, v4

    or-int v4, v14, v5

    not-int v4, v4

    xor-int v62, v61, v4

    and-int v4, v61, v4

    or-int v4, v62, v4

    mul-int/lit16 v4, v4, -0xa8

    neg-int v4, v4

    neg-int v4, v4

    and-int v61, v15, v4

    or-int/2addr v4, v15

    add-int v61, v61, v4

    not-int v4, v11

    not-int v5, v5

    or-int/2addr v5, v14

    not-int v5, v5

    xor-int v11, v4, v5

    and-int/2addr v4, v5

    or-int/2addr v4, v11

    mul-int/lit16 v4, v4, 0xa8

    and-int v5, v61, v4

    or-int v4, v61, v4

    add-int/2addr v5, v4

    move/from16 v4, v18

    :try_start_49
    new-array v11, v4, [Ljava/lang/Object;
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_62

    :try_start_4a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v32, 0x2

    aput-object v4, v11, v32

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v58, 0x1

    aput-object v4, v11, v58

    aput-object v10, v11, v17

    sget-object v5, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v10, 0xe4

    aget-byte v10, v5, v10

    int-to-byte v10, v10

    const/16 v42, 0x1a

    aget-byte v14, v5, v42

    int-to-byte v14, v14

    const/16 v15, 0x280

    invoke-static {v10, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v14, v14}, [Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_61

    :try_start_4b
    sget-object v11, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_60

    const/16 v15, 0x30

    if-nez v11, :cond_2c

    :try_start_4c
    sput-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v61

    shr-long v61, v61, v15

    const-wide v63, 0x2f92266f62980b64L    # 1.5307387042288393E-79

    add-long v61, v61, v63

    move-object/from16 v67, v5

    xor-long v4, v45, v61

    long-to-int v4, v4

    sget-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->force:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v61

    const/16 v5, 0x20

    shr-long v61, v61, v5

    const-wide v63, -0x2f92266f449a2a03L    # -2.765102556299299E79

    sub-long v63, v63, v61

    move-object v5, v10

    xor-long v10, v45, v63

    long-to-int v10, v10

    sget-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v61

    shr-long v61, v61, v15

    const-wide v63, -0x2f92266f449a2a06L    # -2.765102556299298E79

    add-long v61, v61, v63

    move/from16 v63, v10

    xor-long v10, v45, v61

    long-to-int v10, v10

    new-array v10, v10, [I

    sget-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v61

    shr-long v61, v61, v15

    const-wide v64, -0x2f92266f449a2a08L    # -2.7651025562992973E79

    sub-long v64, v64, v61

    move-object/from16 v61, v10

    xor-long v10, v45, v64

    long-to-int v10, v10

    sget-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    move/from16 v11, v17

    invoke-static {v11, v11}, Landroid/view/View;->getDefaultSize(II)I

    move-result v15

    neg-int v11, v15

    move-object/from16 v62, v14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v11, -0x13d

    add-int/lit16 v15, v15, 0x27e0

    move-object/from16 v64, v5

    not-int v5, v11

    xor-int/lit8 v65, v5, -0x21

    and-int/lit8 v5, v5, -0x21

    or-int v5, v65, v5

    or-int/2addr v5, v14

    not-int v5, v5

    move/from16 v65, v5

    not-int v5, v14

    or-int/2addr v5, v11

    xor-int/lit8 v66, v5, 0x20

    and-int/lit8 v5, v5, 0x20

    or-int v5, v66, v5

    not-int v5, v5

    xor-int v66, v65, v5

    and-int v5, v65, v5

    or-int v5, v66, v5

    mul-int/lit16 v5, v5, -0x13e

    add-int/2addr v5, v15

    const/16 v15, -0x21

    xor-int v65, v15, v11

    and-int/2addr v15, v11

    or-int v15, v65, v15

    not-int v15, v15

    move/from16 v65, v5

    or-int v5, v11, v14

    not-int v5, v5

    xor-int v66, v15, v5

    and-int/2addr v5, v15

    or-int v5, v66, v5

    mul-int/lit16 v5, v5, -0x13e

    add-int v5, v5, v65

    not-int v11, v11

    xor-int v15, v11, v14

    and-int/2addr v11, v14

    or-int/2addr v11, v15

    not-int v11, v11

    const/16 v14, -0x21

    xor-int v15, v14, v11

    and-int/2addr v11, v14

    or-int/2addr v11, v15

    mul-int/lit16 v11, v11, 0x13e

    neg-int v11, v11

    neg-int v11, v11

    and-int v14, v5, v11

    or-int/2addr v5, v11

    add-int/2addr v14, v5

    int-to-byte v5, v14

    ushr-long v14, v45, v5

    long-to-int v5, v14

    and-int v11, v5, v4

    not-int v11, v11

    or-int/2addr v5, v4

    and-int/2addr v5, v11

    aput v5, v61, v10

    sget-wide v10, Lcom/appsflyer/internal/AFa1hSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v14

    const/16 v5, 0x3c

    shr-long/2addr v14, v5

    const-wide v45, -0x2f92266f449a2a07L    # -2.7651025562992976E79

    add-long v14, v14, v45

    xor-long/2addr v10, v14

    long-to-int v5, v10

    sget-wide v10, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    long-to-int v10, v10

    not-int v11, v4

    and-int/2addr v11, v10

    not-int v10, v10

    and-int/2addr v4, v10

    or-int/2addr v4, v11

    aput v4, v61, v5

    sget v4, Lcom/appsflyer/internal/AFa1hSDK;->afWarnLog:I

    sget-object v5, Lcom/appsflyer/internal/AFa1hSDK;->afErrorLogForExcManagerOnly:[B

    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->afVerboseLog:I
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_1c

    move/from16 v14, v53

    :try_start_4d
    new-array v11, v14, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_1a

    const/16 v38, 0x5

    :try_start_4e
    aput-object v10, v11, v38

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v11, v23

    const/16 v18, 0x3

    aput-object v5, v11, v18

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v32, 0x2

    aput-object v4, v11, v32

    const/4 v4, 0x1

    aput-object v61, v11, v4

    const/16 v17, 0x0

    aput-object v64, v11, v17

    const/16 v5, 0x4a

    aget-byte v5, v67, v5

    int-to-byte v5, v5

    aget-byte v10, v67, v25

    int-to-byte v10, v10

    const/16 v15, 0x265

    invoke-static {v5, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v10, v67, v40

    int-to-byte v10, v10

    const/16 v46, 0x1a

    aget-byte v15, v67, v46

    int-to-byte v15, v15

    const/16 v4, 0x2b0

    invoke-static {v10, v15, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v61

    move-object/from16 v63, v62

    const-class v62, [I

    const-class v64, [B

    move-object/from16 v65, v63

    move-object/from16 v66, v63

    filled-new-array/range {v61 .. v66}, [Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v10, v63

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_19

    move/from16 v45, v7

    move/from16 v42, v9

    :goto_35
    move-object v5, v4

    goto/16 :goto_39

    :catchall_19
    move-exception v0

    goto :goto_36

    :catchall_1a
    move-exception v0

    const/16 v38, 0x5

    :goto_36
    :try_start_4f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2b

    throw v4

    :catchall_1b
    move-exception v0

    :goto_37
    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    :goto_38
    const/16 v18, 0x3

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v57, 0x2e

    move-object v3, v0

    move-object v8, v6

    move-object/from16 v6, v19

    goto/16 :goto_71

    :cond_2b
    throw v0
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_1b

    :catchall_1c
    move-exception v0

    move/from16 v14, v53

    const/16 v38, 0x5

    goto :goto_37

    :cond_2c
    move-object/from16 v67, v5

    move-object/from16 v64, v10

    move-object v10, v14

    move/from16 v14, v53

    const/16 v38, 0x5

    :try_start_50
    sput-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v4

    const/16 v53, 0x20

    shr-long v4, v4, v53

    const-wide v61, 0x791fb5156f022122L    # 2.7444550020748604E275

    sub-long v61, v61, v4

    xor-long v4, v45, v61

    long-to-int v4, v4

    sget-wide v45, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v61
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_5f

    shr-long v61, v61, v15

    const-wide v65, -0x791fb51537dd1116L

    sub-long v65, v65, v61

    xor-long v14, v45, v65

    long-to-int v5, v14

    const/4 v14, 0x3

    :try_start_51
    new-array v15, v14, [Ljava/lang/Object;
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_5e

    :try_start_52
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    const/16 v32, 0x2

    aput-object v5, v15, v32

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v58, 0x1

    aput-object v4, v15, v58

    const/16 v17, 0x0

    aput-object v64, v15, v17

    aget-byte v5, v67, v24

    int-to-byte v5, v5

    aget-byte v14, v67, v25

    int-to-byte v14, v14

    const/16 v4, 0x247

    invoke-static {v5, v14, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;

    check-cast v5, Ljava/lang/ClassLoader;

    const/4 v14, 0x1

    invoke-static {v4, v14, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v5
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_5c

    const/16 v28, 0xc

    :try_start_53
    aget-byte v14, v67, v28
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_5d

    int-to-byte v14, v14

    const/16 v45, 0x55

    :try_start_54
    aget-byte v4, v67, v45

    int-to-byte v4, v4

    move/from16 v45, v7

    const/16 v7, 0x227

    invoke-static {v14, v4, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    aget-byte v7, v67, v40

    int-to-byte v7, v7

    const/16 v46, 0x1a

    aget-byte v14, v67, v46
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_5c

    int-to-byte v14, v14

    move/from16 v42, v9

    const/16 v9, 0x2b0

    :try_start_55
    invoke-static {v7, v14, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    sget-object v9, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    filled-new-array {v7, v10, v9}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v4, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v11, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_5b

    goto/16 :goto_35

    :goto_39
    :try_start_56
    aget-byte v4, v67, v40

    int-to-byte v4, v4

    const/16 v11, 0x1a

    aget-byte v7, v67, v11

    int-to-byte v7, v7

    const/16 v9, 0x2b0

    invoke-static {v4, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v7, 0x37

    aget-byte v9, v67, v7

    int-to-byte v9, v9

    aget-byte v14, v67, v43

    int-to-byte v14, v14

    const/16 v15, 0x219

    invoke-static {v9, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v4, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/16 v9, 0x16

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, v5, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_5a

    if-eqz v41, :cond_3e

    :try_start_57
    sget-object v14, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_3c

    if-nez v14, :cond_2d

    .line 19
    sget v15, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v4, v15, 0x7d

    const/16 v58, 0x1

    shl-int/lit8 v46, v4, 0x1

    xor-int/lit8 v15, v15, 0x7d

    sub-int v15, v46, v15

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    move-object/from16 v15, v50

    goto :goto_3a

    :cond_2d
    move-object/from16 v15, v51

    :goto_3a
    if-nez v14, :cond_2f

    sget v14, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    xor-int/lit8 v46, v14, 0x55

    and-int/lit8 v14, v14, 0x55

    const/4 v4, 0x1

    shl-int/2addr v14, v4

    add-int v14, v46, v14

    rem-int/lit16 v4, v14, 0x80

    sput v4, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v32, 0x2

    rem-int/lit8 v14, v14, 0x2

    if-nez v14, :cond_2e

    const/16 v4, 0x57

    const/16 v17, 0x0

    :try_start_58
    div-int/lit8 v4, v4, 0x0
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_1d

    goto :goto_3b

    :catchall_1d
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    goto/16 :goto_38

    :cond_2e
    :goto_3b
    move-object/from16 v14, v48

    goto :goto_3c

    :cond_2f
    move-object/from16 v14, v49

    .line 20
    :goto_3c
    :try_start_59
    aget-byte v4, v67, v40

    int-to-byte v4, v4

    move/from16 v46, v7

    const/16 v11, 0x1a

    aget-byte v7, v67, v11

    int-to-byte v7, v7

    const/16 v9, 0x2b0

    const/16 v61, 0x12

    invoke-static {v4, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v7, v67, v46

    int-to-byte v7, v7

    const/16 v57, 0x2e

    aget-byte v9, v67, v57

    move-object/from16 v57, v15

    move-object/from16 v11, v60

    int-to-byte v9, v9

    const/16 v15, 0x216

    invoke-static {v7, v9, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v3, v10, v10}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v4, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    aget-byte v7, v67, v36

    int-to-byte v7, v7

    const/16 v62, 0x1a

    aget-byte v9, v67, v62

    int-to-byte v9, v9

    const/16 v15, 0x334

    invoke-static {v7, v9, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_3c

    :try_start_5a
    aget-byte v9, v67, v30

    int-to-byte v9, v9

    aget-byte v15, v67, v62

    int-to-byte v15, v15

    move-object/from16 v63, v12

    const/16 v12, 0x3b8

    invoke-static {v9, v15, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    filled-new-array/range {v57 .. v57}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_5a
    .catch Ljava/lang/Exception; {:try_start_5a .. :try_end_5a} :catch_f
    .catchall {:try_start_5a .. :try_end_5a} :catchall_33

    if-eqz v20, :cond_31

    .line 21
    sget v12, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    and-int/lit8 v15, v12, 0x7b

    or-int/lit8 v12, v12, 0x7b

    add-int/2addr v15, v12

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 22
    :try_start_5b
    aget-byte v12, v67, v30

    int-to-byte v12, v12

    const/16 v62, 0x1a

    aget-byte v15, v67, v62
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_20

    int-to-byte v15, v15

    move-object/from16 v64, v8

    const/16 v8, 0x3b8

    :try_start_5c
    invoke-static {v12, v15, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v12, v67, v27

    int-to-byte v12, v12

    aget-byte v15, v67, v43

    int-to-byte v15, v15

    move-object/from16 v65, v11

    const/16 v11, 0x213

    invoke-static {v12, v15, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v8, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_1f

    move-object/from16 v11, v57

    :try_start_5d
    invoke-virtual {v8, v11, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_1e

    goto :goto_41

    :catchall_1e
    move-exception v0

    goto :goto_3e

    :catchall_1f
    move-exception v0

    :goto_3d
    move-object/from16 v11, v57

    goto :goto_3e

    :catchall_20
    move-exception v0

    move-object/from16 v64, v8

    goto :goto_3d

    :goto_3e
    :try_start_5e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_30

    throw v4

    :catchall_21
    move-exception v0

    :goto_3f
    move-object v8, v6

    move-object/from16 v6, v19

    :goto_40
    const/16 v28, 0xc

    goto/16 :goto_4e

    :catch_e
    move-exception v0

    move-object/from16 v66, v1

    move-object v8, v6

    move-object/from16 v6, v19

    const/16 v28, 0xc

    goto/16 :goto_4c

    :cond_30
    throw v0
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_5e .. :try_end_5e} :catch_e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_21

    :cond_31
    move-object/from16 v64, v8

    move-object/from16 v65, v11

    move-object/from16 v11, v57

    :goto_41
    const/16 v8, 0x400

    :try_start_5f
    new-array v12, v8, [B

    aget-byte v15, v67, v43

    int-to-byte v15, v15

    const/16 v29, 0x7

    aget-byte v8, v67, v29
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_32

    int-to-byte v8, v8

    move-object/from16 v66, v1

    xor-int/lit16 v1, v8, 0x205

    move/from16 v67, v1

    and-int/lit16 v1, v8, 0x205

    or-int v1, v67, v1

    int-to-short v1, v1

    :try_start_60
    invoke-static {v15, v8, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v3, v10, v10}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_31

    :goto_42
    if-lez v0, :cond_33

    const/16 v8, 0x400

    :try_start_61
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_24

    move-object/from16 v15, v19

    :try_start_62
    filled-new-array {v12, v15, v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v4, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object/from16 v19, v4

    const/4 v4, -0x1

    if-eq v8, v4, :cond_32

    filled-new-array {v12, v15, v10}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v9, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_23

    neg-int v4, v8

    move-object/from16 v68, v5

    move-object v8, v6

    :try_start_63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_22

    long-to-int v5, v5

    mul-int/lit16 v6, v4, -0xd1

    mul-int/lit16 v10, v0, -0xd1

    add-int/2addr v10, v6

    not-int v6, v4

    move-object/from16 v67, v1

    not-int v1, v0

    xor-int v69, v6, v1

    and-int v70, v6, v1

    move/from16 v71, v1

    or-int v1, v69, v70

    not-int v1, v1

    mul-int/lit16 v1, v1, 0xd2

    add-int/2addr v1, v10

    not-int v10, v0

    move/from16 v69, v1

    not-int v1, v5

    xor-int v70, v10, v1

    and-int/2addr v1, v10

    or-int v1, v70, v1

    not-int v1, v1

    not-int v10, v4

    or-int/2addr v10, v5

    not-int v10, v10

    xor-int v70, v1, v10

    and-int/2addr v1, v10

    or-int v1, v70, v1

    mul-int/lit16 v1, v1, 0xd2

    neg-int v1, v1

    neg-int v1, v1

    and-int v10, v69, v1

    or-int v1, v69, v1

    add-int/2addr v10, v1

    not-int v1, v5

    xor-int v69, v6, v1

    and-int/2addr v1, v6

    or-int v1, v69, v1

    or-int/2addr v0, v1

    not-int v0, v0

    xor-int v1, v71, v4

    and-int v4, v71, v4

    or-int/2addr v1, v4

    or-int/2addr v1, v5

    not-int v1, v1

    xor-int v4, v0, v1

    and-int/2addr v0, v1

    or-int/2addr v0, v4

    mul-int/lit16 v0, v0, 0xd2

    and-int v1, v10, v0

    or-int/2addr v0, v10

    add-int/2addr v0, v1

    move-object v6, v8

    move-object/from16 v4, v19

    move-object/from16 v1, v67

    move-object/from16 v5, v68

    move-object/from16 v19, v15

    goto/16 :goto_42

    :catchall_22
    move-exception v0

    :goto_43
    move-object v6, v15

    move-object/from16 v1, v66

    goto/16 :goto_40

    :catchall_23
    move-exception v0

    move-object v8, v6

    goto :goto_43

    :cond_32
    :goto_44
    move-object v8, v6

    goto :goto_45

    :catchall_24
    move-exception v0

    move-object v8, v6

    move-object/from16 v15, v19

    goto :goto_43

    :cond_33
    move-object/from16 v15, v19

    goto :goto_44

    :goto_45
    :try_start_64
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v1, v0, v43

    int-to-byte v1, v1

    aget-byte v4, v0, v23

    int-to-byte v4, v4

    const/16 v5, 0x201

    invoke-static {v1, v4, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-virtual {v7, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-byte v4, v0, v22

    int-to-byte v4, v4

    const/16 v62, 0x1a

    aget-byte v5, v0, v62

    int-to-byte v5, v5

    xor-int/lit16 v6, v5, 0x1f0

    and-int/lit16 v10, v5, 0x1f0

    or-int/2addr v6, v10

    int-to-short v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v5, v0, v46

    int-to-byte v5, v5

    aget-byte v6, v0, v43

    int-to-byte v6, v6

    const/16 v10, 0x1e8

    invoke-static {v5, v6, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v4, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v1, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v43

    int-to-byte v1, v1

    aget-byte v4, v0, v25

    int-to-byte v4, v4

    xor-int/lit16 v5, v4, 0x309

    and-int/lit16 v6, v4, 0x309

    or-int/2addr v5, v6

    int-to-short v5, v5

    invoke-static {v1, v4, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-virtual {v7, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v25

    int-to-byte v1, v1

    aget-byte v4, v0, v61

    int-to-byte v4, v4

    const/16 v5, 0x1e5

    invoke-static {v1, v4, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v4, v0, v35

    int-to-byte v4, v4

    aget-byte v5, v0, v30

    int-to-byte v5, v5

    const/16 v6, 0x1d1

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v13, v13, v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_30

    :try_start_65
    aget-byte v4, v0, v30

    int-to-byte v4, v4

    const/16 v46, 0x1a

    aget-byte v5, v0, v46

    int-to-byte v5, v5

    const/16 v12, 0x3b8

    invoke-static {v4, v5, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_2e

    const/16 v28, 0xc

    :try_start_66
    aget-byte v5, v0, v28
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_2f

    int-to-byte v5, v5

    :try_start_67
    aget-byte v6, v0, v23

    int-to-byte v6, v6

    const/16 v7, 0x1cb

    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v4, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_2e

    .line 23
    sget v5, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v5, v5, 0x49

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 24
    :try_start_68
    aget-byte v5, v0, v30

    int-to-byte v5, v5

    const/16 v46, 0x1a

    aget-byte v6, v0, v46

    int-to-byte v6, v6

    const/16 v12, 0x3b8

    invoke-static {v5, v6, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_2c

    const/16 v28, 0xc

    :try_start_69
    aget-byte v6, v0, v28

    int-to-byte v6, v6

    aget-byte v9, v0, v23

    int-to-byte v9, v9

    invoke-static {v6, v9, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    invoke-virtual {v5, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v14, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_2b

    :try_start_6a
    filled-new-array {v4, v5, v15}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v10, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_2a

    :try_start_6b
    aget-byte v4, v0, v30

    int-to-byte v4, v4

    const/16 v46, 0x1a

    aget-byte v5, v0, v46

    int-to-byte v5, v5

    const/16 v12, 0x3b8

    invoke-static {v4, v5, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v57, 0x2e

    aget-byte v5, v0, v57
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_29

    move-object v6, v15

    int-to-byte v5, v5

    :try_start_6c
    aget-byte v7, v0, v61

    int-to-byte v7, v7

    const/16 v9, 0x1bd

    invoke-static {v5, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v4, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_28

    :try_start_6d
    aget-byte v4, v0, v30

    int-to-byte v4, v4

    const/16 v11, 0x1a

    aget-byte v5, v0, v11

    int-to-byte v5, v5

    const/16 v12, 0x3b8

    invoke-static {v4, v5, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v15, 0x2e

    aget-byte v5, v0, v15

    int-to-byte v5, v5

    aget-byte v7, v0, v61

    int-to-byte v7, v7

    invoke-static {v5, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v4, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v14, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_27

    :try_start_6e
    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_25

    if-nez v4, :cond_36

    .line 25
    sget v4, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v4, v4, 0x69

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v32, 0x2

    rem-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_35

    const/16 v11, 0x1a

    .line 26
    :try_start_6f
    aget-byte v4, v0, v11

    int-to-byte v4, v4

    aget-byte v0, v0, v23

    int-to-byte v0, v0

    xor-int/lit16 v5, v0, 0x1a8

    and-int/lit16 v7, v0, 0x1a8

    or-int/2addr v5, v7

    int-to-short v5, v5

    invoke-static {v4, v0, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v2, v0, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_26

    :try_start_70
    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;

    goto :goto_46

    :catchall_25
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object/from16 v2, v64

    move-object/from16 v1, v66

    const/16 v18, 0x3

    const/16 v34, 0x3b8

    goto/16 :goto_33

    :catchall_26
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_34

    throw v1

    :cond_34
    throw v0

    :cond_35
    const/16 v33, 0x0

    .line 27
    throw v33

    :cond_36
    :goto_46
    move-object v5, v2

    move-object/from16 v58, v3

    move-object/from16 v67, v8

    const/16 v34, 0x3b8

    goto/16 :goto_5a

    :catchall_27
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_37

    throw v1

    :cond_37
    throw v0

    :catchall_28
    move-exception v0

    goto :goto_47

    :catchall_29
    move-exception v0

    move-object v6, v15

    :goto_47
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_38

    throw v1

    :cond_38
    throw v0
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_25

    :catchall_2a
    move-exception v0

    move-object v6, v15

    :goto_48
    move-object/from16 v1, v66

    goto/16 :goto_4e

    :catchall_2b
    move-exception v0

    move-object v6, v15

    goto :goto_49

    :catchall_2c
    move-exception v0

    move-object v6, v15

    const/16 v28, 0xc

    :goto_49
    :try_start_71
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_39

    throw v1

    :catchall_2d
    move-exception v0

    goto :goto_48

    :cond_39
    throw v0

    :catchall_2e
    move-exception v0

    move-object v6, v15

    const/16 v28, 0xc

    goto :goto_4a

    :catchall_2f
    move-exception v0

    move-object v6, v15

    :goto_4a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3a

    throw v1

    :cond_3a
    throw v0

    :catchall_30
    move-exception v0

    move-object v6, v15

    :goto_4b
    const/16 v28, 0xc

    goto :goto_48

    :catchall_31
    move-exception v0

    move-object v8, v6

    move-object/from16 v6, v19

    goto :goto_4b

    :catchall_32
    move-exception v0

    move-object/from16 v66, v1

    goto/16 :goto_3f

    :catchall_33
    move-exception v0

    move-object/from16 v66, v1

    move-object/from16 v64, v8

    move-object/from16 v11, v57

    const/16 v28, 0xc

    move-object v8, v6

    move-object/from16 v6, v19

    goto/16 :goto_4e

    :catch_f
    move-exception v0

    move-object/from16 v66, v1

    move-object/from16 v64, v8

    move-object/from16 v11, v57

    const/16 v28, 0xc

    move-object v8, v6

    move-object/from16 v6, v19

    :goto_4c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v4, v5, v43

    int-to-byte v4, v4

    aget-byte v7, v5, v39

    int-to-byte v7, v7

    const/16 v9, 0x209

    invoke-static {v4, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v29, 0x7

    aget-byte v4, v5, v29

    int-to-byte v4, v4

    const/16 v18, 0x3

    aget-byte v7, v5, v18

    int-to-byte v7, v7

    const/16 v10, 0x356

    invoke-static {v4, v7, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_2d

    const/4 v9, 0x2

    :try_start_72
    new-array v7, v9, [Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v0, v7, v4

    const/16 v17, 0x0

    aput-object v1, v7, v17

    aget-byte v0, v5, v40

    int-to-byte v0, v0

    const/16 v46, 0x1a

    aget-byte v1, v5, v46

    int-to-byte v1, v1

    const/16 v10, 0x356

    invoke-static {v0, v1, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_35

    move-object/from16 v1, v66

    :try_start_73
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_34

    :catchall_34
    move-exception v0

    goto :goto_4d

    :catchall_35
    move-exception v0

    move-object/from16 v1, v66

    :goto_4d
    :try_start_74
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3b

    throw v5

    :catchall_36
    move-exception v0

    goto :goto_4e

    :cond_3b
    throw v0
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_36

    :goto_4e
    :try_start_75
    sget-object v5, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v7, v5, v30

    int-to-byte v7, v7

    const/16 v46, 0x1a

    aget-byte v9, v5, v46
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_3a

    int-to-byte v9, v9

    const/16 v12, 0x3b8

    :try_start_76
    invoke-static {v7, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_3b

    :try_start_77
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v15, 0x2e

    aget-byte v9, v5, v15

    int-to-byte v9, v9

    aget-byte v10, v5, v61

    int-to-byte v10, v10

    const/16 v12, 0x1bd

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_3a

    :try_start_78
    aget-byte v7, v5, v30

    int-to-byte v7, v7

    const/16 v11, 0x1a

    aget-byte v9, v5, v11
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_39

    int-to-byte v9, v9

    const/16 v10, 0x3b8

    :try_start_79
    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v15, 0x2e

    aget-byte v9, v5, v15

    int-to-byte v9, v9

    aget-byte v5, v5, v61

    int-to-byte v5, v5

    invoke-static {v9, v5, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v7, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v14, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_38

    :try_start_7a
    throw v0

    :catchall_37
    move-exception v0

    :goto_4f
    move-object v5, v2

    move-object/from16 v58, v3

    move/from16 v34, v10

    :goto_50
    move-object/from16 v2, v64

    :goto_51
    const/16 v18, 0x3

    goto/16 :goto_33

    :catchall_38
    move-exception v0

    goto :goto_52

    :catchall_39
    move-exception v0

    const/16 v10, 0x3b8

    :goto_52
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3c

    throw v5

    :cond_3c
    throw v0

    :catchall_3a
    move-exception v0

    const/16 v10, 0x3b8

    goto :goto_53

    :catchall_3b
    move-exception v0

    move v10, v12

    :goto_53
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3d

    throw v5

    :cond_3d
    throw v0
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_37

    :catchall_3c
    move-exception v0

    move-object/from16 v64, v8

    const/16 v10, 0x3b8

    const/16 v28, 0xc

    move-object v8, v6

    move-object/from16 v6, v19

    goto :goto_4f

    :cond_3e
    move-object/from16 v68, v5

    move/from16 v46, v7

    move-object/from16 v64, v8

    move-object/from16 v63, v12

    move-object/from16 v65, v60

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v61, 0x12

    move-object v8, v6

    move-object/from16 v6, v19

    const/16 v0, 0xe4

    .line 29
    :try_start_7b
    aget-byte v0, v67, v0

    int-to-byte v0, v0

    const/16 v11, 0x1a

    aget-byte v5, v67, v11

    int-to-byte v5, v5

    const/16 v7, 0x1ab

    invoke-static {v0, v5, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    aget-byte v5, v67, v40

    int-to-byte v5, v5

    aget-byte v7, v67, v11

    int-to-byte v7, v7

    const/16 v9, 0x2b0

    invoke-static {v5, v7, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    filled-new-array/range {v68 .. v68}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    aget-byte v9, v67, v30

    int-to-byte v9, v9

    aget-byte v12, v67, v23

    int-to-byte v12, v12

    xor-int/lit16 v14, v12, 0x180

    and-int/lit16 v4, v12, 0x180

    or-int/2addr v4, v14

    int-to-short v4, v4

    invoke-static {v9, v12, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-virtual {v0, v4, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v7, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aget-byte v4, v67, v22

    int-to-byte v4, v4

    const/16 v11, 0x1a

    aget-byte v9, v67, v11

    int-to-byte v9, v9

    const/16 v12, 0x185

    invoke-static {v4, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v9, v67, v35

    int-to-byte v9, v9

    aget-byte v12, v67, v23

    int-to-byte v12, v12

    or-int/lit16 v14, v12, 0x160

    int-to-short v14, v14

    invoke-static {v9, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x0

    invoke-virtual {v4, v9, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    aget-byte v4, v67, v46
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_56

    int-to-byte v4, v4

    const/16 v15, 0x2e

    :try_start_7c
    aget-byte v12, v67, v15
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_59

    int-to-byte v12, v12

    const/16 v14, 0x216

    :try_start_7d
    invoke-static {v4, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v5, v4, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_56

    :try_start_7e
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v4

    const/16 v7, 0x308

    aget-byte v7, v67, v7

    int-to-byte v7, v7

    const/16 v11, 0x1a

    aget-byte v12, v67, v11

    int-to-byte v12, v12

    const/16 v14, 0x2ca

    invoke-static {v7, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v12, v67, v40

    int-to-byte v12, v12

    aget-byte v14, v67, v11

    int-to-byte v14, v14

    const/16 v11, 0x2b0

    invoke-static {v12, v14, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_58

    const/16 v11, 0x1a

    :try_start_7f
    aget-byte v4, v67, v11

    int-to-byte v4, v4

    aget-byte v12, v67, v23

    int-to-byte v12, v12

    xor-int/lit16 v14, v12, 0x1a8

    and-int/lit16 v11, v12, 0x1a8

    or-int/2addr v11, v14

    int-to-short v11, v11

    invoke-static {v4, v12, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x0

    invoke-virtual {v2, v4, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v8, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_57

    const/16 v4, 0x24b

    :try_start_80
    aget-byte v4, v67, v4

    neg-int v4, v4

    int-to-byte v4, v4

    const/16 v62, 0x1a

    aget-byte v12, v67, v62

    int-to-byte v12, v12

    const/16 v14, 0x16a

    invoke-static {v4, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v12, 0x0

    invoke-virtual {v4, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v14

    invoke-virtual {v14, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    aget-byte v12, v67, v43

    int-to-byte v12, v12

    const/16 v29, 0x7

    aget-byte v15, v67, v29
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_56

    int-to-byte v15, v15

    move-object/from16 v66, v1

    xor-int/lit16 v1, v15, 0x205

    move/from16 v58, v1

    and-int/lit16 v1, v15, 0x205

    or-int v1, v58, v1

    int-to-short v1, v1

    :try_start_81
    invoke-static {v12, v15, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v3, v10, v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v4, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    aget-byte v10, v67, v27

    int-to-byte v10, v10

    aget-byte v12, v67, v46

    int-to-byte v12, v12

    const/16 v15, 0x14e

    invoke-static {v10, v12, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v4, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    aget-byte v4, v67, v23

    int-to-byte v4, v4

    const/16 v62, 0x1a

    aget-byte v12, v67, v62

    int-to-byte v12, v12

    const/16 v15, 0x144

    invoke-static {v4, v12, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v12, v67, v43

    int-to-byte v12, v12

    aget-byte v15, v67, v25
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_55

    int-to-byte v15, v15

    move-object/from16 v58, v3

    or-int/lit16 v3, v15, 0x309

    int-to-short v3, v3

    :try_start_82
    invoke-static {v12, v15, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    const/4 v12, 0x0

    invoke-virtual {v4, v3, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/16 v4, 0x400

    new-array v12, v4, [B

    const/4 v15, 0x0

    :goto_54
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v7, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    move-object/from16 v60, v4

    invoke-virtual/range {v60 .. v60}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_54

    if-lez v4, :cond_41

    .line 30
    sget v67, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    move-object/from16 v68, v5

    add-int/lit8 v5, v67, 0x11

    move-object/from16 v67, v8

    rem-int/lit16 v8, v5, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v32, 0x2

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_40

    move-object v5, v2

    move-object v8, v3

    int-to-long v2, v15

    move-wide/from16 v69, v2

    const/4 v2, 0x1

    :try_start_83
    new-array v3, v2, [Ljava/lang/Object;

    move-object/from16 v2, v60

    invoke-virtual {v9, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v71

    cmp-long v3, v69, v71

    move-object/from16 v69, v7

    move-object/from16 v60, v8

    if-gez v3, :cond_3f

    goto :goto_57

    :cond_3f
    :goto_55
    const/4 v12, 0x0

    goto :goto_58

    :catchall_3d
    move-exception v0

    move-object v3, v0

    move-object/from16 v2, v64

    move-object/from16 v1, v66

    move-object/from16 v8, v67

    :goto_56
    const/16 v18, 0x3

    const/16 v57, 0x2e

    goto/16 :goto_71

    :cond_40
    move-object v5, v2

    move-object/from16 v2, v60

    move-object/from16 v60, v3

    move-object v3, v7

    int-to-long v7, v15

    move-object/from16 v69, v3

    const/4 v3, 0x0

    .line 31
    invoke-virtual {v9, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v70

    check-cast v70, Ljava/lang/Long;

    invoke-virtual/range {v70 .. v70}, Ljava/lang/Long;->longValue()J

    move-result-wide v70
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_3d

    cmp-long v3, v7, v70

    if-gez v3, :cond_3f

    .line 32
    :goto_57
    sget v3, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v3, v3, 0x5b

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 33
    :try_start_84
    filled-new-array {v12, v6, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v14, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_3d

    neg-int v2, v4

    neg-int v2, v2

    or-int v3, v15, v2

    const/4 v4, 0x1

    shl-int/2addr v3, v4

    xor-int/2addr v2, v15

    sub-int v15, v3, v2

    move-object v2, v5

    move-object/from16 v3, v60

    move-object/from16 v8, v67

    move-object/from16 v5, v68

    move-object/from16 v7, v69

    goto/16 :goto_54

    :cond_41
    move-object v5, v2

    move-object/from16 v60, v3

    move-object/from16 v69, v7

    move-object/from16 v67, v8

    goto :goto_55

    :goto_58
    :try_start_85
    invoke-virtual {v10, v14, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_85
    .catchall {:try_start_85 .. :try_end_85} :catchall_52

    move-object/from16 v8, v60

    move-object/from16 v3, v69

    :try_start_86
    invoke-virtual {v8, v3, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v14, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_86
    .catch Ljava/lang/Exception; {:try_start_86 .. :try_end_86} :catch_10
    .catchall {:try_start_86 .. :try_end_86} :catchall_3d

    :catch_10
    :try_start_87
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v2, 0x307

    aget-byte v2, v1, v2

    neg-int v2, v2

    int-to-byte v2, v2

    aget-byte v3, v1, v61

    int-to-byte v3, v3

    const/16 v7, 0x134

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v40

    int-to-byte v3, v3

    const/16 v62, 0x1a

    aget-byte v7, v1, v62

    int-to-byte v7, v7

    const/16 v8, 0x111

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v1, v25

    int-to-byte v7, v7

    aget-byte v9, v1, v62

    int-to-byte v9, v9

    xor-int/lit16 v10, v9, 0xf2

    and-int/lit16 v12, v9, 0xf2

    or-int/2addr v10, v12

    int-to-short v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v3, v7}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_52

    :try_start_88
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v1, v40

    int-to-byte v3, v3

    const/16 v62, 0x1a

    aget-byte v7, v1, v62

    int-to-byte v7, v7

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v1, v46

    int-to-byte v7, v7

    const/16 v29, 0x7

    aget-byte v8, v1, v29

    int-to-byte v8, v8

    or-int/lit16 v9, v8, 0xeb

    int-to-short v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    filled-new-array/range {v58 .. v58}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_88
    .catchall {:try_start_88 .. :try_end_88} :catchall_53

    :try_start_89
    filled-new-array {v0, v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_89
    .catchall {:try_start_89 .. :try_end_89} :catchall_52

    const/16 v2, 0x15c

    :try_start_8a
    aget-byte v2, v1, v2

    int-to-byte v2, v2

    aget-byte v3, v1, v61

    int-to-byte v3, v3

    const/16 v7, 0xe8

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x112

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    int-to-byte v7, v3

    const/16 v8, 0xc9

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v1, v36

    int-to-byte v8, v8

    aget-byte v9, v1, v37

    int-to-byte v9, v9

    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    and-int/lit16 v10, v10, 0x3cb

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v9, 0xde

    aget-byte v9, v1, v9

    int-to-byte v9, v9

    aget-byte v10, v1, v37

    int-to-byte v10, v10

    xor-int/lit16 v12, v10, 0xa2

    and-int/lit16 v14, v10, 0xa2

    or-int/2addr v12, v14

    int-to-short v12, v12

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v4, 0x1

    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v10, Ljava/util/ArrayList;

    check-cast v9, Ljava/util/List;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9
    :try_end_8a
    .catch Ljava/lang/Exception; {:try_start_8a .. :try_end_8a} :catch_11
    .catchall {:try_start_8a .. :try_end_8a} :catchall_4b

    const/16 v17, 0x0

    :try_start_8b
    aget-byte v12, v1, v17

    int-to-byte v12, v12

    aget-byte v1, v1, v23

    int-to-byte v1, v1

    or-int/lit16 v14, v1, 0x83

    int-to-short v14, v14

    invoke-static {v12, v1, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v5, v1, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_4c

    :try_start_8c
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v1, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_8c
    .catch Ljava/lang/Exception; {:try_start_8c .. :try_end_8c} :catch_11
    .catchall {:try_start_8c .. :try_end_8c} :catchall_4b

    const/4 v12, 0x0

    :goto_59
    if-ge v12, v9, :cond_42

    .line 34
    sget v14, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    xor-int/lit8 v15, v14, 0x3

    const/16 v18, 0x3

    and-int/lit8 v14, v14, 0x3

    const/4 v4, 0x1

    shl-int/2addr v14, v4

    add-int/2addr v15, v14

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 35
    :try_start_8d
    invoke-static {v3, v12}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v1, v12, v14}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_8d
    .catch Ljava/lang/Exception; {:try_start_8d .. :try_end_8d} :catch_11
    .catchall {:try_start_8d .. :try_end_8d} :catchall_3d

    add-int/lit8 v12, v12, 0x1

    goto :goto_59

    :catch_11
    move-exception v0

    move-object/from16 v2, v64

    move-object/from16 v8, v67

    const/16 v57, 0x2e

    goto/16 :goto_63

    :cond_42
    :try_start_8e
    invoke-virtual {v8, v2, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8e
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_8e} :catch_11
    .catchall {:try_start_8e .. :try_end_8e} :catchall_4b

    .line 36
    sget v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v1, v1, 0x3f

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 37
    :try_start_8f
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;
    :try_end_8f
    .catchall {:try_start_8f .. :try_end_8f} :catchall_4b

    if-nez v1, :cond_43

    :try_start_90
    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;
    :try_end_90
    .catchall {:try_start_90 .. :try_end_90} :catchall_3d

    :cond_43
    move-object v1, v0

    :goto_5a
    if-eqz v41, :cond_46

    .line 38
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    xor-int/lit8 v2, v0, 0x43

    and-int/lit8 v0, v0, 0x43

    const/4 v4, 0x1

    shl-int/2addr v0, v4

    add-int/2addr v2, v0

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 39
    :try_start_91
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v2, v0, v25

    int-to-byte v2, v2

    aget-byte v3, v0, v61

    int-to-byte v3, v3

    const/16 v7, 0x1e5

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v56

    int-to-byte v3, v3

    aget-byte v7, v0, v30

    int-to-byte v7, v7

    sget v8, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    and-int/lit16 v8, v8, 0x380

    int-to-short v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    aget-byte v7, v0, v25

    int-to-byte v7, v7

    const/16 v11, 0x1a

    aget-byte v8, v0, v11

    int-to-byte v8, v8

    or-int/lit16 v9, v8, 0xf2

    int-to-short v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v13, v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v2, v3, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_41

    const/16 v11, 0x1a

    :try_start_92
    aget-byte v7, v0, v11

    int-to-byte v7, v7

    aget-byte v8, v0, v23

    int-to-byte v8, v8

    or-int/lit16 v9, v8, 0x1a8

    int-to-short v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v5, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_40

    move-object/from16 v8, v67

    :try_start_93
    invoke-virtual {v7, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_3f

    move-object/from16 v14, v65

    :try_start_94
    filled-new-array {v14, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_3e

    if-eqz v3, :cond_44

    .line 40
    sget v7, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v9, v7, 0x3f

    const/4 v4, 0x1

    shl-int/2addr v9, v4

    xor-int/lit8 v7, v7, 0x3f

    sub-int/2addr v9, v7

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 41
    :try_start_95
    aget-byte v7, v0, v43

    int-to-byte v7, v7

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    xor-int/lit16 v9, v0, 0x309

    and-int/lit16 v10, v0, 0x309

    or-int/2addr v9, v10

    int-to-short v9, v9

    invoke-static {v7, v0, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v2, v0, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5c

    :catchall_3e
    move-exception v0

    :goto_5b
    move-object v3, v0

    move-object/from16 v2, v64

    move-object/from16 v1, v66

    goto/16 :goto_56

    :cond_44
    :goto_5c
    move-object v0, v3

    goto :goto_5e

    :catchall_3f
    move-exception v0

    goto :goto_5d

    :catchall_40
    move-exception v0

    move-object/from16 v8, v67

    :goto_5d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_3e

    :catchall_41
    move-exception v0

    move-object/from16 v8, v67

    goto :goto_5b

    :cond_46
    move-object/from16 v14, v65

    move-object/from16 v8, v67

    :try_start_96
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v2, v0, v25

    int-to-byte v2, v2

    const/16 v11, 0x1a

    aget-byte v3, v0, v11

    int-to-byte v3, v3

    xor-int/lit16 v7, v3, 0xf2

    and-int/lit16 v9, v3, 0xf2

    or-int/2addr v7, v9

    int-to-short v7, v7

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v56

    int-to-byte v3, v3

    aget-byte v0, v0, v30

    int-to-byte v0, v0

    sget v7, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    and-int/lit16 v7, v7, 0x380

    int-to-short v7, v7

    invoke-static {v3, v0, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_49

    const/4 v4, 0x1

    :try_start_97
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_97
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_97 .. :try_end_97} :catch_12
    .catchall {:try_start_97 .. :try_end_97} :catchall_3e

    goto :goto_5e

    :catch_12
    move-exception v0

    :try_start_98
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_98
    .catch Ljava/lang/ClassNotFoundException; {:try_start_98 .. :try_end_98} :catch_13
    .catchall {:try_start_98 .. :try_end_98} :catchall_3e

    :catch_13
    const/4 v0, 0x0

    :goto_5e
    if-eqz v0, :cond_4b

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    :try_start_99
    move-object v12, v0

    check-cast v12, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v3, v0, v25

    int-to-byte v3, v3

    const/16 v7, 0x78

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v15

    const-class v2, Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v3, v41, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    const/16 v1, 0x348c

    new-array v10, v1, [B

    const/16 v1, 0x1aa

    aget-byte v1, v0, v1

    int-to-byte v1, v1

    aget-byte v2, v0, v31

    int-to-byte v2, v2

    xor-int/lit8 v3, v2, 0x10

    and-int/lit8 v7, v2, 0x10

    or-int/2addr v3, v7

    int-to-short v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1
    :try_end_99
    .catchall {:try_start_99 .. :try_end_99} :catchall_49

    move-object/from16 v2, v64

    :try_start_9a
    invoke-virtual {v2, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_48

    :try_start_9b
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0x308

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v11, 0x1a

    aget-byte v7, v0, v11

    int-to-byte v7, v7

    const/16 v14, 0x2ca

    invoke-static {v3, v7, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v0, v40

    int-to-byte v7, v7

    aget-byte v9, v0, v11

    int-to-byte v9, v9

    const/16 v4, 0x2b0

    invoke-static {v7, v9, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_9b
    .catchall {:try_start_9b .. :try_end_9b} :catchall_47

    .line 44
    sget v3, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v3, v3, 0x6d

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 45
    :try_start_9c
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    aget-byte v3, v0, v16

    int-to-byte v3, v3

    const/16 v11, 0x1a

    aget-byte v4, v0, v11

    int-to-byte v4, v4

    const/16 v7, 0x29e

    invoke-static {v3, v4, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v4, v0, v40

    int-to-byte v4, v4

    aget-byte v9, v0, v11

    int-to-byte v9, v9

    const/16 v11, 0x2b0

    invoke-static {v4, v9, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_46

    :try_start_9d
    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v4, v0, v16

    int-to-byte v4, v4

    const/16 v46, 0x1a

    aget-byte v9, v0, v46

    int-to-byte v9, v9

    invoke-static {v4, v9, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v9, v0, v56
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_45

    int-to-byte v9, v9

    const/16 v57, 0x2e

    :try_start_9e
    aget-byte v11, v0, v57

    int-to-byte v11, v11

    const/16 v14, 0x288

    invoke-static {v9, v11, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v9

    filled-new-array/range {v58 .. v58}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v4, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_44

    :try_start_9f
    aget-byte v3, v0, v16

    int-to-byte v3, v3

    const/16 v11, 0x1a

    aget-byte v4, v0, v11

    int-to-byte v4, v4

    invoke-static {v3, v4, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v4, v0, v43

    int-to-byte v4, v4

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    xor-int/lit16 v7, v0, 0x309

    and-int/lit16 v9, v0, 0x309

    or-int/2addr v7, v9

    int-to-short v7, v7

    invoke-static {v4, v0, v7}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v3, v0, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_43

    :try_start_a0
    invoke-static/range {v45 .. v45}, Ljava/lang/Math;->abs(I)I

    move-result v7

    const/16 v0, 0x3460

    move-object v1, v8

    move-object v8, v2

    move-object v2, v5

    move-object v5, v6

    move-object v6, v1

    move/from16 v9, v42

    move-object/from16 v3, v58

    move-object/from16 v14, v59

    move-object/from16 v1, v66

    const/16 v17, 0x0

    const/16 v18, 0x3

    const/16 v53, 0x6

    goto/16 :goto_2f

    :catchall_42
    move-exception v0

    :goto_5f
    move-object v3, v0

    move-object/from16 v1, v66

    const/16 v18, 0x3

    goto/16 :goto_71

    :catchall_43
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_47

    throw v1

    :cond_47
    throw v0

    :catchall_44
    move-exception v0

    goto :goto_60

    :catchall_45
    move-exception v0

    const/16 v57, 0x2e

    :goto_60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :cond_48
    throw v0

    :catchall_46
    move-exception v0

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_49

    throw v1

    :cond_49
    throw v0

    :catchall_47
    move-exception v0

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4a

    throw v1

    :cond_4a
    throw v0

    :catchall_48
    move-exception v0

    :goto_61
    const/16 v57, 0x2e

    goto :goto_5f

    :catchall_49
    move-exception v0

    move-object/from16 v2, v64

    goto :goto_61

    :cond_4b
    move-object/from16 v2, v64

    const/16 v57, 0x2e

    const-class v0, Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v3}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v12, v63

    invoke-virtual {v12, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v3, v41, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_42

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v0, v0

    const v1, -0x4a8564a0

    xor-int v3, v1, v0

    and-int v7, v1, v0

    or-int/2addr v3, v7

    not-int v3, v3

    const v7, 0xd841eff

    xor-int v9, v7, v3

    and-int/2addr v3, v7

    or-int/2addr v3, v9

    mul-int/lit16 v3, v3, 0x106

    not-int v3, v3

    const v7, 0x7f055d38

    sub-int/2addr v7, v3

    const v3, -0x2556302e

    and-int v9, v7, v3

    or-int/2addr v3, v7

    add-int/2addr v9, v3

    not-int v0, v0

    xor-int v3, v1, v0

    and-int/2addr v0, v1

    or-int/2addr v0, v3

    not-int v0, v0

    const v1, 0xd841eff

    or-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x106

    neg-int v0, v0

    neg-int v0, v0

    and-int v1, v9, v0

    or-int/2addr v0, v9

    add-int/2addr v1, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v0, v9

    const v3, 0x4741b1ab

    xor-int v7, v3, v0

    and-int/2addr v3, v0

    or-int/2addr v3, v7

    not-int v3, v3

    const v7, 0x627e01ee

    xor-int v9, v7, v3

    and-int/2addr v3, v7

    or-int/2addr v3, v9

    mul-int/lit16 v3, v3, 0x18e

    not-int v3, v3

    const v7, 0x3c374125

    sub-int/2addr v7, v3

    not-int v0, v0

    const v3, 0x4741b1ab

    xor-int v9, v3, v0

    and-int/2addr v0, v3

    or-int/2addr v0, v9

    not-int v0, v0

    const v3, 0x627e01ee

    or-int/2addr v0, v3

    mul-int/lit16 v0, v0, 0x18e

    not-int v0, v0

    sub-int/2addr v7, v0

    const/4 v4, 0x1

    sub-int/2addr v7, v4

    if-le v1, v7, :cond_4c

    :try_start_a1
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    const/16 v0, 0x51

    const/16 v17, 0x0

    div-int/lit8 v0, v0, 0x0

    goto :goto_62

    :catchall_4a
    move-exception v0

    move-object/from16 v1, v66

    const/16 v18, 0x3

    goto/16 :goto_73

    .line 47
    :cond_4c
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_4a

    :goto_62
    move/from16 v9, v42

    move-object/from16 v1, v66

    const/4 v2, 0x7

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/16 v11, 0x1a

    const/16 v17, 0x0

    const/16 v18, 0x3

    const/16 v47, 0x1

    goto/16 :goto_78

    :catchall_4b
    move-exception v0

    move-object/from16 v2, v64

    move-object/from16 v8, v67

    goto/16 :goto_61

    :catchall_4c
    move-exception v0

    move-object/from16 v2, v64

    move-object/from16 v8, v67

    const/16 v57, 0x2e

    .line 48
    :try_start_a2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4d

    throw v1

    :catch_14
    move-exception v0

    goto :goto_63

    :cond_4d
    throw v0
    :try_end_a2
    .catch Ljava/lang/Exception; {:try_start_a2 .. :try_end_a2} :catch_14
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_42

    :goto_63
    :try_start_a3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v7, v3, v43

    int-to-byte v7, v7

    aget-byte v9, v3, v39

    int-to-byte v9, v9

    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    and-int/lit16 v10, v10, 0x38d

    int-to-short v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v29, 0x7

    aget-byte v7, v3, v29
    :try_end_a3
    .catchall {:try_start_a3 .. :try_end_a3} :catchall_51

    int-to-byte v7, v7

    const/16 v18, 0x3

    :try_start_a4
    aget-byte v9, v3, v18

    int-to-byte v9, v9

    const/16 v10, 0x356

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a4
    .catchall {:try_start_a4 .. :try_end_a4} :catchall_50

    const/4 v9, 0x2

    :try_start_a5
    new-array v7, v9, [Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v0, v7, v4

    const/16 v17, 0x0

    aput-object v1, v7, v17

    aget-byte v0, v3, v40

    int-to-byte v0, v0

    const/16 v11, 0x1a

    aget-byte v1, v3, v11

    int-to-byte v1, v1

    const/16 v10, 0x356

    invoke-static {v0, v1, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_a5
    .catchall {:try_start_a5 .. :try_end_a5} :catchall_4e

    move-object/from16 v1, v66

    :try_start_a6
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a6
    .catchall {:try_start_a6 .. :try_end_a6} :catchall_4d

    :catchall_4d
    move-exception v0

    goto :goto_64

    :catchall_4e
    move-exception v0

    move-object/from16 v1, v66

    :goto_64
    :try_start_a7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4e

    throw v3

    :catchall_4f
    move-exception v0

    goto/16 :goto_34

    :cond_4e
    throw v0

    :catchall_50
    move-exception v0

    move-object/from16 v1, v66

    goto/16 :goto_34

    :catchall_51
    move-exception v0

    move-object/from16 v1, v66

    :goto_65
    const/16 v18, 0x3

    goto/16 :goto_34

    :catchall_52
    move-exception v0

    move-object/from16 v2, v64

    move-object/from16 v1, v66

    move-object/from16 v8, v67

    goto/16 :goto_51

    :catchall_53
    move-exception v0

    move-object/from16 v2, v64

    move-object/from16 v1, v66

    move-object/from16 v8, v67

    const/16 v18, 0x3

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4f

    throw v3

    :cond_4f
    throw v0

    :catchall_54
    move-exception v0

    move-object v5, v2

    :goto_66
    move-object/from16 v2, v64

    move-object/from16 v1, v66

    goto/16 :goto_51

    :catchall_55
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    goto :goto_66

    :catchall_56
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    goto/16 :goto_50

    :catchall_57
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object/from16 v2, v64

    const/16 v18, 0x3

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_50

    throw v3

    :cond_50
    throw v0

    :catchall_58
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object/from16 v2, v64

    const/16 v18, 0x3

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_51

    throw v3

    :cond_51
    throw v0

    :catchall_59
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move/from16 v57, v15

    move-object/from16 v2, v64

    goto :goto_65

    :catchall_5a
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    :goto_67
    const/16 v18, 0x3

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    :goto_68
    const/16 v57, 0x2e

    move-object v8, v6

    move-object/from16 v6, v19

    goto/16 :goto_34

    :catchall_5b
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    :goto_69
    const/16 v18, 0x3

    :goto_6a
    const/16 v28, 0xc

    :goto_6b
    const/16 v34, 0x3b8

    const/16 v57, 0x2e

    move-object v8, v6

    move-object/from16 v6, v19

    goto :goto_6c

    :catchall_5c
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    goto :goto_69

    :catchall_5d
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    const/16 v18, 0x3

    goto :goto_6b

    :catchall_5e
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    move/from16 v18, v14

    goto :goto_6a

    .line 49
    :goto_6c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_52

    throw v3

    :cond_52
    throw v0

    :catchall_5f
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    goto :goto_67

    :catchall_60
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    const/16 v18, 0x3

    :goto_6d
    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    goto :goto_68

    :catchall_61
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    const/16 v18, 0x3

    :goto_6e
    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    move-object v8, v6

    move-object/from16 v6, v19

    goto :goto_6f

    :catchall_62
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move/from16 v18, v4

    move-object v2, v8

    move/from16 v42, v9

    goto :goto_6e

    :goto_6f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_53

    throw v3

    :cond_53
    throw v0

    :catchall_63
    move-exception v0

    move-object v5, v2

    move-object/from16 v58, v3

    move-object v2, v8

    move/from16 v42, v9

    goto :goto_6d

    :catchall_64
    move-exception v0

    goto/16 :goto_31

    :catchall_65
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    goto/16 :goto_32

    :catchall_66
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_54

    throw v3

    :cond_54
    throw v0

    :catchall_67
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    goto :goto_70

    :catchall_68
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    move/from16 v57, v51

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    :goto_70
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_55

    throw v3

    :cond_55
    throw v0

    :catchall_69
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_56

    throw v3

    :cond_56
    throw v0

    :catchall_6a
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move/from16 v42, v9

    move-object/from16 v59, v14

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_57

    throw v3

    :cond_57
    throw v0
    :try_end_a7
    .catchall {:try_start_a7 .. :try_end_a7} :catchall_4f

    :catchall_6b
    move-exception v0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v6

    move-object/from16 v6, v28

    move-object/from16 v58, v3

    move-object/from16 v59, v14

    move/from16 v42, v45

    goto/16 :goto_32

    :goto_71
    :try_start_a8
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a8
    .catchall {:try_start_a8 .. :try_end_a8} :catchall_6c

    goto :goto_72

    :catchall_6c
    move-exception v0

    :try_start_a9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_72
    throw v3

    :catchall_6d
    move-exception v0

    goto/16 :goto_73

    :catchall_6e
    move-exception v0

    move-object/from16 v58, v3

    move-object v8, v6

    move/from16 v38, v9

    move-object/from16 v59, v14

    move/from16 v42, v45

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    goto/16 :goto_1a

    :catchall_6f
    move-exception v0

    move-object/from16 v58, v3

    move-object v8, v6

    move-object/from16 v59, v14

    move/from16 v42, v45

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    move-object v6, v5

    move-object v5, v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_58

    throw v2

    :cond_58
    throw v0

    :catchall_70
    move-exception v0

    move-object/from16 v58, v3

    move-object v8, v6

    move-object/from16 v59, v14

    move/from16 v42, v45

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    move-object v6, v5

    move-object v5, v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_59

    throw v2

    :cond_59
    throw v0
    :try_end_a9
    .catchall {:try_start_a9 .. :try_end_a9} :catchall_6d

    :catchall_71
    move-exception v0

    move-object/from16 v58, v3

    move/from16 v42, v4

    move/from16 v20, v7

    move-object/from16 v44, v8

    move/from16 v47, v9

    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v59, v14

    move-object/from16 v21, v15

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    move-object v8, v6

    goto/16 :goto_1b

    .line 50
    :goto_73
    :try_start_aa
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    mul-int/lit8 v3, v42, -0x45

    neg-int v3, v3

    neg-int v3, v3

    const/16 v7, 0x47

    and-int v9, v7, v3

    or-int/2addr v3, v7

    add-int/2addr v9, v3

    const/4 v3, -0x2

    xor-int v7, v3, v42

    and-int v3, v3, v42

    or-int/2addr v3, v7

    not-int v3, v3

    xor-int v7, v42, v2

    and-int v10, v42, v2

    or-int/2addr v7, v10

    not-int v7, v7

    xor-int v10, v3, v7

    and-int/2addr v3, v7

    or-int/2addr v3, v10

    mul-int/lit16 v3, v3, -0x8c

    neg-int v3, v3

    neg-int v3, v3

    and-int v7, v9, v3

    or-int/2addr v3, v9

    add-int/2addr v7, v3

    xor-int/lit8 v3, v42, 0x1

    and-int/lit8 v9, v42, 0x1

    or-int/2addr v3, v9

    xor-int v9, v3, v2

    and-int/2addr v3, v2

    or-int/2addr v3, v9

    not-int v3, v3

    mul-int/lit8 v3, v3, 0x46

    neg-int v3, v3

    neg-int v3, v3

    not-int v3, v3

    sub-int/2addr v7, v3

    const/4 v4, 0x1

    sub-int/2addr v7, v4

    const/4 v3, -0x2

    xor-int v9, v3, v42

    and-int v3, v3, v42

    or-int/2addr v3, v9

    not-int v3, v3

    move/from16 v9, v42

    not-int v10, v9

    xor-int/lit8 v12, v10, 0x1

    and-int/2addr v10, v4

    or-int/2addr v10, v12

    not-int v10, v10

    or-int/2addr v3, v10

    xor-int/lit8 v10, v2, 0x1

    and-int/2addr v2, v4

    or-int/2addr v2, v10

    not-int v2, v2

    xor-int v10, v3, v2

    and-int/2addr v2, v3

    or-int/2addr v2, v10

    mul-int/lit8 v2, v2, 0x46

    neg-int v2, v2

    neg-int v2, v2

    and-int v3, v7, v2

    or-int/2addr v2, v7

    add-int/2addr v3, v2

    const/4 v2, 0x7

    :goto_74
    if-ge v3, v2, :cond_5b

    aget-boolean v7, v21, v3
    :try_end_aa
    .catch Ljava/lang/Exception; {:try_start_aa .. :try_end_aa} :catch_15

    if-eqz v7, :cond_5a

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/16 v33, 0x0

    :try_start_ab
    sput-object v33, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    sput-object v33, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;
    :try_end_ab
    .catch Ljava/lang/Exception; {:try_start_ab .. :try_end_ab} :catch_15

    const/4 v4, 0x1

    const/16 v17, 0x0

    :goto_75
    const/4 v3, 0x2

    const/16 v11, 0x1a

    goto/16 :goto_78

    :cond_5a
    add-int/lit8 v3, v3, 0x1

    goto :goto_74

    :cond_5b
    sget v2, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    and-int/lit8 v3, v2, 0x39

    or-int/lit8 v2, v2, 0x39

    add-int/2addr v3, v2

    rem-int/lit16 v2, v3, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v32, 0x2

    rem-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_5c

    :try_start_ac
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v3, 0x74

    aget-byte v3, v2, v3

    int-to-byte v3, v3

    const/16 v5, 0x5c

    aget-byte v5, v2, v5

    int-to-byte v5, v5

    const/16 v6, 0x3f9

    aget-byte v2, v2, v6

    :goto_76
    int-to-short v2, v2

    invoke-static {v3, v5, v2}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    goto :goto_77

    :cond_5c
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v3, v2, v16

    int-to-byte v3, v3

    aget-byte v5, v2, v39

    int-to-byte v5, v5

    const/16 v6, 0x97

    aget-byte v2, v2, v6
    :try_end_ac
    .catch Ljava/lang/Exception; {:try_start_ac .. :try_end_ac} :catch_15

    goto :goto_76

    :goto_77
    :try_start_ad
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/16 v17, 0x0

    aput-object v2, v3, v17

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v2, v0, v40

    int-to-byte v2, v2

    const/16 v11, 0x1a

    aget-byte v0, v0, v11

    int-to-byte v0, v0

    const/16 v10, 0x356

    invoke-static {v2, v0, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_ad
    .catchall {:try_start_ad .. :try_end_ad} :catchall_72

    :catchall_72
    move-exception v0

    :try_start_ae
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5d

    throw v1

    :cond_5d
    throw v0

    :cond_5e
    move-object/from16 v58, v3

    move/from16 v20, v7

    move-object/from16 v44, v8

    move/from16 v47, v9

    move-object/from16 v55, v10

    move-object/from16 v52, v12

    move-object/from16 v59, v14

    move-object/from16 v21, v15

    const/16 v28, 0xc

    const/16 v34, 0x3b8

    const/16 v38, 0x5

    const/16 v57, 0x2e

    move v9, v4

    move-object v8, v6

    move/from16 v4, v19

    move-object v6, v5

    move-object v5, v2

    const/4 v2, 0x7

    goto/16 :goto_75

    :goto_78
    add-int/lit8 v0, v9, 0x1

    move/from16 v19, v4

    move-object v2, v5

    move-object v5, v6

    move-object v6, v8

    move/from16 v7, v20

    move-object/from16 v15, v21

    move-object/from16 v8, v44

    move/from16 v9, v47

    move-object/from16 v12, v52

    move-object/from16 v10, v55

    move-object/from16 v3, v58

    move-object/from16 v14, v59

    const/16 v26, 0x6

    move v4, v0

    goto/16 :goto_15

    :cond_5f
    move v9, v4

    move-object/from16 v21, v15

    aget-boolean v0, v21, v9
    :try_end_ae
    .catch Ljava/lang/Exception; {:try_start_ae .. :try_end_ae} :catch_15

    const/16 v33, 0x0

    :try_start_af
    throw v33
    :try_end_af
    .catch Ljava/lang/Exception; {:try_start_af .. :try_end_af} :catch_15
    .catchall {:try_start_af .. :try_end_af} :catchall_73

    :catchall_73
    move-exception v0

    throw v0

    :cond_60
    :goto_79
    return-void

    :catchall_74
    move-exception v0

    :try_start_b0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_61

    throw v1

    :cond_61
    throw v0

    :catchall_75
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_62

    throw v1

    :cond_62
    throw v0

    :catchall_76
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_63

    throw v1

    :cond_63
    throw v0
    :try_end_b0
    .catch Ljava/lang/Exception; {:try_start_b0 .. :try_end_b0} :catch_15

    :catch_15
    move-exception v0

    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    return-void

    :catchall_77
    move-exception v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_64

    throw v1

    :cond_64
    throw v0

    :array_0
    .array-data 1
        0x26t
        -0x63t
        -0x67t
        -0x6ft
        0x4ct
        -0x9t
        -0x5t
        0x43t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static AFAdRevenueData(II)V
    .locals 0

    .line 1
    sget p0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 p0, p0, 0x80

    .line 6
    .line 7
    sput p0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 8
    .line 9
    return-void
.end method

.method public static getMonetizationNetwork(I)I
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    .line 14
    .line 15
    xor-int/lit8 v2, v1, 0x3f

    .line 16
    .line 17
    and-int/lit8 v1, v1, 0x3f

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    shl-int/2addr v1, v3

    .line 21
    add-int/2addr v2, v1

    .line 22
    rem-int/lit16 v2, v2, 0x80

    .line 23
    .line 24
    sput v2, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 25
    .line 26
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 35
    .line 36
    const/16 v2, 0x1ff

    .line 37
    .line 38
    aget-byte v2, v1, v2

    .line 39
    .line 40
    int-to-byte v2, v2

    .line 41
    const/16 v4, 0x6b

    .line 42
    .line 43
    aget-byte v4, v1, v4

    .line 44
    .line 45
    int-to-byte v4, v4

    .line 46
    const/16 v5, 0x247

    .line 47
    .line 48
    invoke-static {v2, v4, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ljava/lang/ClassLoader;

    .line 55
    .line 56
    invoke-static {v2, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/16 v3, 0x48

    .line 61
    .line 62
    aget-byte v3, v1, v3

    .line 63
    .line 64
    int-to-byte v3, v3

    .line 65
    const/4 v4, 0x4

    .line 66
    aget-byte v4, v1, v4

    .line 67
    .line 68
    int-to-byte v4, v4

    .line 69
    const/4 v5, 0x7

    .line 70
    aget-byte v1, v1, v5

    .line 71
    .line 72
    int-to-short v1, v1

    .line 73
    invoke-static {v3, v4, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    return p0

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    throw v0

    .line 106
    :cond_0
    throw p0

    .line 107
    :cond_1
    const/4 p0, 0x0

    .line 108
    throw p0
.end method

.method public static getRevenue(Ljava/lang/Object;)I
    .locals 6

    .line 123
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    or-int/lit8 v2, v0, 0x27

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    xor-int/lit8 v0, v0, 0x27

    sub-int/2addr v2, v0

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v2, 0x1ff

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    const/16 v4, 0x6b

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    const/16 v5, 0x247

    invoke-static {v2, v4, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;

    check-cast v4, Ljava/lang/ClassLoader;

    invoke-static {v2, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xc

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0x55

    aget-byte v0, v0, v4

    int-to-byte v0, v0

    const/16 v4, 0x227

    invoke-static {v3, v0, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    move-result-object v0

    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v0, v0, 0x67

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p0
.end method

.method public static getRevenue(ICI)Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x3f

    .line 4
    .line 5
    or-int/lit8 v0, v0, 0x3f

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    rem-int/lit16 v0, v1, 0x80

    .line 9
    .line 10
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    rem-int/2addr v1, v2

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->i:Ljava/lang/Object;

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x2b

    .line 19
    .line 20
    rem-int/lit16 v0, v0, 0x80

    .line 21
    .line 22
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    aput-object p2, v0, v2

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 p2, 0x1

    .line 38
    aput-object p1, v0, p2

    .line 39
    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 p1, 0x0

    .line 45
    aput-object p0, v0, p1

    .line 46
    .line 47
    sget-object p0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 48
    .line 49
    const/16 p1, 0x1ff

    .line 50
    .line 51
    aget-byte p1, p0, p1

    .line 52
    .line 53
    int-to-byte p1, p1

    .line 54
    const/16 v2, 0x6b

    .line 55
    .line 56
    aget-byte v2, p0, v2

    .line 57
    .line 58
    int-to-byte v2, v2

    .line 59
    const/16 v3, 0x247

    .line 60
    .line 61
    invoke-static {p1, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/ClassLoader;

    .line 68
    .line 69
    invoke-static {p1, p2, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/16 p2, 0xe

    .line 74
    .line 75
    aget-byte p2, p0, p2

    .line 76
    .line 77
    int-to-byte v2, p2

    .line 78
    const/4 v3, 0x4

    .line 79
    aget-byte p0, p0, v3

    .line 80
    .line 81
    int-to-byte p0, p0

    .line 82
    int-to-short p2, p2

    .line 83
    invoke-static {v2, p0, p2}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(SSI)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    filled-new-array {p2, v2, p2}, [Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p1, p0, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    sget p1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 104
    .line 105
    add-int/lit8 p1, p1, 0x1b

    .line 106
    .line 107
    rem-int/lit16 p1, p1, 0x80

    .line 108
    .line 109
    sput p1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 110
    .line 111
    return-object p0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_0

    .line 118
    .line 119
    throw p1

    .line 120
    :cond_0
    throw p0

    .line 121
    :cond_1
    const/4 p0, 0x0

    .line 122
    throw p0
.end method

.method public static init$0()V
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 2
    .line 3
    or-int/lit8 v1, v0, 0x71

    .line 4
    .line 5
    shl-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    xor-int/lit8 v0, v0, 0x71

    .line 8
    .line 9
    sub-int/2addr v1, v0

    .line 10
    rem-int/lit16 v1, v1, 0x80

    .line 11
    .line 12
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 13
    .line 14
    const/16 v0, 0x4aa

    .line 15
    .line 16
    new-array v1, v0, [B

    .line 17
    .line 18
    const-string v2, "\u000f\u00d7sN\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd<\u000e\u00f2\u0012\u00fb\u0004\u00fd\u0013\u00be9\u0011\u00f2\u0019\u00ed\u0004\r\u00fc\u00cc\u00191\u00f2\u0019\u00ed\u0004\r\u00fc\u00f6\u0011\u00ff\u0000\r\u00f2\u00ed$\u00f4\u0005\t\u000e\u0008\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008\u001e\u00d33\u00f5\u00f4\n\u000b\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\u0008\u00de\u0017\r\u00f6\u00ff\u0006\u0015\u0000\u0003\u00f6\u000c\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\u000c\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\u0008\u0000\u00e2(\u000c\u0001\u0012\u00d2!\u0005\u0008\u0000\u00e2(\u000c8\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\u0008\u000c\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\u0008\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\u0008\u0000\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00f4\n\u0017\u00ed\u0008\t\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00ee\t\u00ed\u000b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u0015\u0000\u0003\u00f6\u000c\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000c\u0006\u0007\u00f5\u00ee\u0006\u00f0\u000b5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u00063\u00d8\u0004\u0001\u00042\u00ce\u00073\u00d4\u00030\u00d0\u00056\u00ff\u00cf\u0001\u0012\u00e1\u0016\u0011\u00ff\t\u0000\u00f4\u0005\u00fa\u0018\u00ee\u00d0C\u00fa\u0012\u00bd*\u0000\u00fd\u0001\u0012\u00df\u0014\u0016\u00f7\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008(\u00c9D\u00e4\u00f4\n\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008\u001e\u00d33\u00f5\u00f4\n\u000b\u0003\u0008\u00fe&\u00f1\u0016\u0014\u00f2\u000c\n\u00f3\u00e2 \u0016\u00f0\u00fb\u0001\n\u00f6\u00ff\u0006\u00f5\u0012\u00e1\u0016\u00ff\u0006\u00ee\"\u0001\u0010\u00ee\u0007\u00ef\u000b\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d5\u0001\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\t\u00f8\u00f8\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u0006\u00f5\u0006\u00e3$\u0016\u0001\u0012\u00d0$\u0014\u00ff\u0000\u000c\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00dc(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0012\u00dd\u001a\u0016\u00ff\u00d4,\t\u0001\n\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00d8,\t\u0001\n\u0001\u0012\u00e2\u0019\u0014\u00ee\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0018,\u0006\u0007\u00f5\u00ff\u0004\r\u00fc\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fe\u00f2\u0012\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f4\u0016\u00f7\u00e7 \r\u0004\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\u000c\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\u000c\t\u0002\u0001\u0012\u00d2/\u0001\u0006\u0002\u0002\u00fa\u000c\t\u00e3(\u00fa\u00f8\u00ee\u000b\u00eb\u000b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008\u001e\u00d3:\u00ee\u00f4\n\u00dcL5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c69\u0003\u0000\u0004\u00d3\u0006\u0004\u0003\u0005\u00fd\u0003\u0007\u00fe\u00060\u0002\u0004\u00ce\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u0001\u0012\u00dc\u001b\u0002\u0008\u00fb\u0016\u00f8\t\u0002\u00e3\u001a\u0012\u0006\u00fb\u0006\u00fc\u0001\u0012\u00d25\u0000\u0003\u00f6\u000c\u00f8\u0019\u00d3-\u00ff\u00c8\u0001\u0002\t\u000f/\u00f8\u0004"

    .line 19
    .line 20
    const-string v3, "ISO-8859-1"

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 31
    .line 32
    const/16 v0, 0xf6

    .line 33
    .line 34
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    .line 35
    .line 36
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 37
    .line 38
    and-int/lit8 v1, v0, 0x2d

    .line 39
    .line 40
    or-int/lit8 v0, v0, 0x2d

    .line 41
    .line 42
    add-int/2addr v1, v0

    .line 43
    rem-int/lit16 v0, v1, 0x80

    .line 44
    .line 45
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 46
    .line 47
    rem-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    const/16 v0, 0x15

    .line 52
    .line 53
    div-int/2addr v0, v3

    .line 54
    :cond_0
    return-void
.end method
