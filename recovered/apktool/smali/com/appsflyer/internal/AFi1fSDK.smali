.class public Lcom/appsflyer/internal/AFi1fSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field private static afDebugLog:J

.field private static afErrorLog:I

.field private static afInfoLog:J

.field private static afLogForce:[B

.field private static afRDLog:I

.field private static afVerboseLog:I

.field private static d:Ljava/lang/Object;

.field private static e:Ljava/lang/Object;

.field private static force:J

.field private static i:[B

.field public static final registerClient:Ljava/util/Map;

.field private static unregisterClient:[B

.field private static v:I

.field public static final w:Ljava/util/Map;


# direct methods
.method private static $$c(IIS)Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$12:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x23

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFi1fSDK;->$13:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    mul-int/lit8 p0, p0, 0x57

    .line 15
    .line 16
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x6

    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x3d

    .line 21
    .line 22
    new-array v2, p0, [B

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x29

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    rsub-int/lit8 v0, p0, 0x31

    .line 30
    .line 31
    sget-object v2, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x21

    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x4

    .line 36
    .line 37
    new-array v0, v0, [B

    .line 38
    .line 39
    rsub-int/lit8 p0, p0, 0x30

    .line 40
    .line 41
    move-object v4, v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    move-object v2, v0

    .line 45
    move-object v0, v4

    .line 46
    :goto_0
    move p1, p0

    .line 47
    move-object v3, v2

    .line 48
    move v2, v1

    .line 49
    move-object v1, v0

    .line 50
    move v0, p2

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    move-object v2, v0

    .line 53
    move-object v0, v4

    .line 54
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    int-to-byte v3, p1

    .line 57
    aput-byte v3, v2, v1

    .line 58
    .line 59
    if-ne v1, p0, :cond_4

    .line 60
    .line 61
    new-instance p0, Ljava/lang/String;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-direct {p0, v2, p1}, Ljava/lang/String;-><init>([BI)V

    .line 65
    .line 66
    .line 67
    sget p1, Lcom/appsflyer/internal/AFi1fSDK;->$13:I

    .line 68
    .line 69
    add-int/lit8 p1, p1, 0x73

    .line 70
    .line 71
    rem-int/lit16 p2, p1, 0x80

    .line 72
    .line 73
    sput p2, Lcom/appsflyer/internal/AFi1fSDK;->$12:I

    .line 74
    .line 75
    rem-int/lit8 p1, p1, 0x2

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    const/4 p0, 0x0

    .line 81
    throw p0

    .line 82
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 83
    .line 84
    aget-byte v3, v0, p2

    .line 85
    .line 86
    move v4, p1

    .line 87
    move p1, p0

    .line 88
    move p0, v4

    .line 89
    move-object v4, v0

    .line 90
    move v0, p2

    .line 91
    move p2, v3

    .line 92
    move-object v3, v2

    .line 93
    move v2, v1

    .line 94
    move-object v1, v4

    .line 95
    :goto_2
    neg-int p2, p2

    .line 96
    add-int/2addr p0, p2

    .line 97
    move p2, p1

    .line 98
    move p1, p0

    .line 99
    move p0, p2

    .line 100
    move p2, v0

    .line 101
    move-object v0, v1

    .line 102
    move v1, v2

    .line 103
    move-object v2, v3

    .line 104
    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 73

    const-class v1, Lcom/appsflyer/internal/AFi1fSDK;

    const-class v2, Ljava/lang/Throwable;

    const-class v3, Ljava/lang/Class;

    const-class v4, [B

    const/4 v5, 0x0

    .line 1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 2
    invoke-static {}, Lcom/appsflyer/internal/AFi1fSDK;->init$0()V

    const/16 v0, 0x1a

    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v7, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v8, 0x1c4

    aget-byte v9, v7, v8

    int-to-byte v9, v9

    const/16 v10, 0x110

    aget-byte v11, v7, v10

    int-to-byte v11, v11

    const/16 v12, 0x10

    aget-byte v13, v7, v12

    int-to-short v13, v13

    invoke-static {v9, v11, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v11, 0x196

    aget-byte v13, v7, v11

    int-to-byte v13, v13

    const/16 v14, 0xcd

    aget-byte v14, v7, v14

    int-to-byte v14, v14

    const/16 v15, 0x26

    aget-byte v15, v7, v15

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v9, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    const/4 v13, 0x0

    invoke-virtual {v9, v13, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6e

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v9, v14

    not-int v14, v9

    const v15, 0x3fc6c761

    or-int/2addr v14, v15

    not-int v14, v14

    const v16, 0x290014

    or-int v14, v14, v16

    mul-int/lit8 v14, v14, 0x62

    const v16, 0x2c45cf96

    add-int v14, v14, v16

    move/from16 v16, v5

    not-int v5, v9

    const v17, 0x28ebc135

    xor-int v18, v17, v5

    and-int v5, v17, v5

    or-int v5, v18, v5

    not-int v5, v5

    or-int/2addr v5, v15

    const v15, -0x28ebc136

    xor-int v17, v15, v9

    and-int/2addr v15, v9

    or-int v15, v17, v15

    not-int v15, v15

    xor-int v17, v5, v15

    and-int/2addr v5, v15

    or-int v5, v17, v5

    mul-int/lit8 v5, v5, -0x31

    or-int v15, v14, v5

    move/from16 v17, v8

    const/4 v8, 0x1

    shl-int/2addr v15, v8

    xor-int/2addr v5, v14

    sub-int/2addr v15, v5

    const v5, 0x3fc6c761

    xor-int v14, v5, v9

    and-int/2addr v5, v9

    or-int/2addr v5, v14

    not-int v5, v5

    const v9, 0x28c2c121

    xor-int v14, v5, v9

    and-int/2addr v5, v9

    or-int/2addr v5, v14

    mul-int/lit8 v5, v5, 0x31

    neg-int v5, v5

    neg-int v5, v5

    not-int v5, v5

    sub-int/2addr v15, v5

    sub-int/2addr v15, v8

    const v5, -0x6963b83c

    not-int v9, v0

    or-int/2addr v5, v9

    not-int v9, v5

    const v14, -0x40a98d77

    xor-int v18, v14, v9

    and-int/2addr v9, v14

    or-int v9, v18, v9

    move/from16 v18, v12

    mul-int/lit16 v12, v9, 0x207

    move/from16 v19, v10

    move/from16 v20, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    long-to-int v10, v10

    const v11, 0x26649

    mul-int/2addr v9, v11

    mul-int/lit16 v11, v15, -0x12d

    add-int/2addr v11, v9

    not-int v9, v12

    move/from16 v21, v14

    not-int v14, v10

    xor-int v22, v9, v14

    and-int/2addr v14, v9

    or-int v14, v22, v14

    xor-int v22, v14, v15

    and-int/2addr v14, v15

    or-int v14, v22, v14

    not-int v14, v14

    or-int v22, v12, v15

    move/from16 v23, v8

    or-int v8, v22, v10

    not-int v8, v8

    xor-int v22, v14, v8

    and-int/2addr v8, v14

    or-int v8, v22, v8

    mul-int/lit16 v8, v8, -0x12e

    neg-int v8, v8

    neg-int v8, v8

    not-int v8, v8

    sub-int/2addr v11, v8

    add-int/lit8 v11, v11, -0x1

    xor-int v8, v9, v15

    and-int/2addr v9, v15

    or-int/2addr v8, v9

    xor-int v9, v8, v10

    and-int/2addr v8, v10

    or-int/2addr v8, v9

    not-int v8, v8

    mul-int/lit16 v8, v8, -0x25c

    neg-int v8, v8

    neg-int v8, v8

    and-int v9, v11, v8

    or-int/2addr v8, v11

    add-int/2addr v9, v8

    not-int v8, v15

    xor-int v11, v8, v12

    and-int/2addr v8, v12

    or-int/2addr v8, v11

    not-int v8, v8

    or-int/2addr v10, v15

    not-int v10, v10

    xor-int v11, v8, v10

    and-int/2addr v8, v10

    or-int/2addr v8, v11

    mul-int/lit16 v8, v8, 0x12e

    xor-int v10, v9, v8

    and-int/2addr v8, v9

    shl-int/lit8 v8, v8, 0x1

    add-int/2addr v10, v8

    xor-int v8, v5, v21

    and-int v5, v5, v21

    or-int/2addr v5, v8

    not-int v5, v5

    const v8, -0x880545

    xor-int v9, v8, v0

    and-int/2addr v8, v0

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v5, v8

    and-int/2addr v5, v8

    or-int/2addr v5, v9

    mul-int/lit16 v8, v5, -0x207

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v9, v11

    const v11, -0x14e83

    mul-int/2addr v5, v11

    mul-int/lit16 v11, v10, -0xa3

    not-int v11, v11

    sub-int/2addr v5, v11

    add-int/lit8 v5, v5, -0x1

    not-int v11, v9

    xor-int v12, v11, v10

    and-int/2addr v11, v10

    or-int/2addr v11, v12

    not-int v11, v11

    xor-int v12, v8, v11

    and-int/2addr v11, v8

    or-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x148

    or-int v12, v5, v11

    shl-int/lit8 v12, v12, 0x1

    xor-int/2addr v5, v11

    sub-int/2addr v12, v5

    xor-int v5, v8, v9

    and-int v11, v8, v9

    or-int/2addr v5, v11

    mul-int/lit16 v5, v5, 0xa4

    add-int/2addr v5, v12

    not-int v11, v8

    not-int v12, v10

    xor-int v14, v11, v12

    and-int/2addr v11, v12

    or-int/2addr v11, v14

    not-int v11, v11

    xor-int v14, v12, v9

    and-int/2addr v12, v9

    or-int/2addr v12, v14

    not-int v12, v12

    xor-int v14, v11, v12

    and-int/2addr v11, v12

    or-int/2addr v11, v14

    not-int v9, v9

    xor-int v12, v9, v8

    and-int/2addr v8, v9

    or-int/2addr v8, v12

    xor-int v9, v8, v10

    and-int/2addr v8, v10

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v11, v8

    and-int/2addr v8, v11

    or-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0xa4

    not-int v8, v8

    sub-int/2addr v5, v8

    add-int/lit8 v5, v5, -0x1

    xor-int v8, v21, v0

    and-int v0, v21, v0

    or-int/2addr v0, v8

    not-int v0, v0

    const v8, 0x6963b83b

    xor-int v9, v8, v0

    and-int/2addr v0, v8

    or-int/2addr v0, v9

    mul-int/lit16 v0, v0, 0x207

    add-int/2addr v0, v5

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide v8, -0x1a2db5c47cac7b16L    # -3.03578070973379E182

    sput-wide v8, Lcom/appsflyer/internal/AFi1fSDK;->afDebugLog:J

    const v0, -0x7cac7b16

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->afRDLog:I

    const/4 v5, 0x3

    sput v5, Lcom/appsflyer/internal/AFi1fSDK;->afVerboseLog:I

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->afLogForce:[B

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->registerClient:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->w:Ljava/util/Map;

    const/16 v8, 0x1b

    :try_start_1
    aget-byte v0, v7, v8

    int-to-byte v0, v0

    const/16 v9, 0x52

    aget-byte v10, v7, v9

    int-to-byte v10, v10

    const/16 v11, 0x120

    aget-byte v11, v7, v11

    int-to-short v11, v11

    invoke-static {v0, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    const/16 v11, 0xf0

    if-nez v0, :cond_1

    aget-byte v0, v7, v11

    int-to-byte v0, v0

    aget-byte v12, v7, v9

    int-to-byte v12, v12

    const/16 v14, 0x456

    aget-byte v14, v7, v14

    int-to-short v14, v14

    invoke-static {v0, v12, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_19

    goto :goto_0

    :cond_1
    move-object v0, v13

    :goto_0
    const/16 v12, 0x120

    const/16 v14, 0x3b9

    const/16 v15, 0x28

    const/16 v21, 0x1ab

    .line 4
    :try_start_2
    aget-byte v12, v7, v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    int-to-byte v12, v12

    move/from16 v22, v8

    :try_start_3
    aget-byte v8, v7, v19
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    int-to-byte v8, v8

    move/from16 v24, v9

    :try_start_4
    aget-byte v9, v7, v15

    int-to-short v9, v9

    invoke-static {v12, v8, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x235

    aget-byte v9, v7, v9

    int-to-byte v9, v9

    aget-byte v7, v7, v24

    int-to-byte v7, v7

    const/16 v12, 0x5c

    invoke-static {v9, v7, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    if-eqz v7, :cond_2

    :catch_0
    move/from16 v27, v11

    goto :goto_3

    :catch_1
    :goto_1
    move/from16 v24, v9

    goto :goto_2

    :catch_2
    move/from16 v22, v8

    goto :goto_1

    :catch_3
    :goto_2
    move-object v7, v13

    :cond_2
    :try_start_5
    sget-object v8, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v9, v8, v17

    int-to-byte v9, v9

    aget-byte v12, v8, v19
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    int-to-byte v12, v12

    xor-int/lit8 v25, v12, 0x2d

    and-int/lit8 v26, v12, 0x2d

    move/from16 v27, v11

    or-int v11, v25, v26

    int-to-short v11, v11

    :try_start_6
    invoke-static {v9, v12, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v11, v8, v14

    int-to-byte v11, v11

    aget-byte v8, v8, v21

    int-to-byte v8, v8

    const/16 v12, 0x82

    invoke-static {v11, v8, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v13, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :goto_3
    const/16 v8, 0x2f1

    if-eqz v7, :cond_3

    .line 5
    :try_start_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    sget-object v11, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v12, v11, v8

    int-to-byte v12, v12

    aget-byte v11, v11, v21
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    int-to-byte v11, v11

    move/from16 v25, v8

    const/16 v8, 0x96

    :try_start_8
    invoke-static {v12, v11, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v7, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_5

    :catch_5
    :goto_4
    move-object v8, v13

    goto :goto_5

    :catch_6
    :cond_3
    move/from16 v25, v8

    goto :goto_4

    :goto_5
    if-eqz v7, :cond_4

    :try_start_9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    const/16 v26, 0xab

    :try_start_a
    aget-byte v9, v12, v26

    int-to-byte v9, v9

    aget-byte v12, v12, v21
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    int-to-byte v12, v12

    move/from16 v28, v14

    const/16 v14, 0xa0

    :try_start_b
    invoke-static {v9, v12, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v7, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    goto :goto_7

    :catch_7
    move/from16 v28, v14

    :catch_8
    :goto_6
    move-object v9, v13

    goto :goto_7

    :catch_9
    :cond_4
    move/from16 v28, v14

    const/16 v26, 0xab

    goto :goto_6

    :goto_7
    if-eqz v7, :cond_5

    :try_start_c
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v14, v12, v25

    int-to-byte v14, v14

    aget-byte v12, v12, v21
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    int-to-byte v12, v12

    move/from16 v29, v15

    const/16 v15, 0xae

    :try_start_d
    invoke-static {v14, v12, v15}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v7, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    goto :goto_9

    :catch_a
    :goto_8
    move-object v7, v13

    goto :goto_9

    :catch_b
    :cond_5
    move/from16 v29, v15

    goto :goto_8

    :goto_9
    const/16 v11, 0xc2

    const/16 v12, 0x49

    const-class v15, Ljava/lang/String;

    const/16 v30, 0x5b

    if-eqz v8, :cond_6

    move/from16 v32, v5

    :goto_a
    const/16 v33, 0x165

    goto :goto_b

    :cond_6
    if-nez v0, :cond_7

    move/from16 v32, v5

    move-object v8, v13

    goto :goto_a

    :cond_7
    :try_start_e
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v31, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    move/from16 v32, v5

    aget-byte v5, v31, v25

    int-to-byte v5, v5

    const/16 v33, 0x165

    aget-byte v14, v31, v33

    int-to-byte v14, v14

    const/16 v13, 0xb8

    invoke-static {v5, v14, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_19

    :try_start_f
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v5, v31, v30

    int-to-byte v5, v5

    invoke-static {v5, v12, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6d

    :goto_b
    const/16 v5, 0x37a

    if-eqz v7, :cond_8

    move/from16 v31, v5

    goto :goto_c

    :cond_8
    :try_start_10
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v7, v0, v5

    int-to-byte v7, v7

    const/16 v13, 0xcd

    invoke-static {v7, v12, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_19

    :try_start_11
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const/16 v13, 0xb0

    aget-byte v13, v0, v13

    int-to-byte v13, v13

    const/16 v14, 0xda

    invoke-static {v13, v12, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    aget-byte v14, v0, v25

    int-to-byte v14, v14

    move/from16 v31, v5

    aget-byte v5, v0, v21

    int-to-byte v5, v5

    const/16 v11, 0xe9

    invoke-static {v14, v5, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v13, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6c

    sget v7, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    or-int/lit8 v11, v7, 0x1b

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v7, v7, 0x1b

    sub-int/2addr v11, v7

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    :try_start_12
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v0, v0, v30

    int-to-byte v0, v0

    const/16 v7, 0xc2

    invoke-static {v0, v12, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6b

    :goto_c
    const/4 v5, 0x2

    if-nez v9, :cond_a

    if-eqz v8, :cond_a

    :try_start_13
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v9, 0x2ce

    aget-byte v9, v0, v9

    int-to-byte v9, v9

    aget-byte v11, v0, v24

    int-to-byte v11, v11

    xor-int/lit16 v13, v11, 0xb1

    and-int/lit16 v14, v11, 0xb1

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v9, v11, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_19

    :try_start_14
    new-array v11, v5, [Ljava/lang/Object;

    aput-object v9, v11, v23

    aput-object v8, v11, v16

    aget-byte v9, v0, v30

    int-to-byte v9, v9

    const/16 v13, 0xc2

    invoke-static {v9, v12, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v0, v0, v30

    int-to-byte v0, v0

    invoke-static {v0, v12, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v15}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    goto :goto_d

    :catchall_0
    move-exception v0

    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_9

    throw v1

    :cond_9
    throw v0

    :cond_a
    :goto_d
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v11, v0, v30

    int-to-byte v11, v11

    const/16 v13, 0xc2

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const/4 v13, 0x7

    invoke-static {v11, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ljava/lang/Object;

    const/16 v34, 0x0

    aput-object v34, v11, v16

    aput-object v9, v11, v23

    aput-object v8, v11, v5

    aput-object v7, v11, v32

    const/4 v14, 0x4

    aput-object v9, v11, v14

    const/4 v9, 0x5

    aput-object v8, v11, v9

    const/4 v8, 0x6

    aput-object v7, v11, v8

    new-array v7, v13, [Z

    fill-array-data v7, :array_1

    move/from16 v35, v14

    new-array v14, v13, [Z

    fill-array-data v14, :array_2

    move/from16 v36, v8

    new-array v8, v13, [Z

    aput-boolean v16, v8, v16

    aput-boolean v16, v8, v23

    aput-boolean v23, v8, v5

    aput-boolean v23, v8, v32

    aput-boolean v16, v8, v35

    aput-boolean v23, v8, v9

    aput-boolean v23, v8, v36
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_19

    const/16 v37, 0x325

    const/16 v38, 0x3c2

    :try_start_16
    aget-byte v9, v0, v38
    :try_end_16
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_16} :catch_d
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_19

    int-to-byte v9, v9

    move/from16 v40, v5

    :try_start_17
    aget-byte v5, v0, v19

    int-to-byte v5, v5

    xor-int/lit16 v12, v5, 0xbc

    and-int/lit16 v13, v5, 0xbc

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v9, v5, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v9, v0, v37

    int-to-byte v9, v9

    const/16 v12, 0xc1

    aget-byte v0, v0, v12

    int-to-byte v0, v0

    const/16 v12, 0x113

    invoke-static {v9, v0, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_17
    .catch Ljava/lang/ClassNotFoundException; {:try_start_17 .. :try_end_17} :catch_c
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_19

    const/16 v5, 0x22

    if-lt v0, v5, :cond_b

    move/from16 v5, v23

    goto :goto_e

    :cond_b
    move/from16 v5, v16

    :goto_e
    const/16 v9, 0x1d

    if-ne v0, v9, :cond_c

    goto :goto_f

    :cond_c
    const/16 v9, 0x1a

    if-lt v0, v9, :cond_d

    move/from16 v9, v23

    goto :goto_10

    :cond_d
    :goto_f
    move/from16 v9, v16

    :goto_10
    :try_start_18
    aput-boolean v9, v8, v16
    :try_end_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_18 .. :try_end_18} :catch_e
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_19

    const/16 v9, 0x15

    if-lt v0, v9, :cond_e

    sget v12, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    add-int/lit8 v12, v12, 0x7b

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    move/from16 v12, v23

    goto :goto_11

    :cond_e
    move/from16 v12, v16

    :goto_11
    :try_start_19
    aput-boolean v12, v8, v23

    if-lt v0, v9, :cond_f

    move/from16 v0, v23

    goto :goto_12

    :cond_f
    move/from16 v0, v16

    :goto_12
    aput-boolean v0, v8, v35
    :try_end_19
    .catch Ljava/lang/ClassNotFoundException; {:try_start_19 .. :try_end_19} :catch_e
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_19

    goto :goto_14

    :catch_c
    :goto_13
    move/from16 v5, v16

    goto :goto_14

    :catch_d
    move/from16 v40, v5

    goto :goto_13

    :catch_e
    :goto_14
    move/from16 v9, v16

    move v12, v9

    :goto_15
    if-nez v9, :cond_5a

    const/16 v0, 0x9

    if-ge v12, v0, :cond_5a

    :try_start_1a
    aget-boolean v0, v8, v12
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_19

    if-eqz v0, :cond_59

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/16 v42, -0x2

    const/16 v43, -0x1

    const/16 v44, 0x1fa

    :try_start_1b
    aget-boolean v45, v7, v12

    aget-object v0, v11, v12

    aget-boolean v46, v14, v12
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_69

    const/16 v47, 0xf

    const/16 v48, 0x20f

    if-eqz v45, :cond_14

    if-eqz v0, :cond_11

    .line 6
    :try_start_1c
    sget-object v49, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v13, v49, v30
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    int-to-byte v13, v13

    move/from16 v50, v5

    move-object/from16 v51, v7

    const/16 v5, 0xc2

    const/16 v7, 0x49

    :try_start_1d
    invoke-static {v13, v7, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v7, v49, v16

    int-to-byte v7, v7

    aget-byte v13, v49, v24
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    int-to-byte v13, v13

    move-object/from16 v49, v8

    const/16 v8, 0x119

    :try_start_1e
    invoke-static {v7, v13, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    if-eqz v5, :cond_12

    goto/16 :goto_1a

    :catchall_1
    move-exception v0

    goto :goto_17

    :catchall_2
    move-exception v0

    :goto_16
    move-object/from16 v49, v8

    goto :goto_17

    :catchall_3
    move-exception v0

    move/from16 v50, v5

    move-object/from16 v51, v7

    goto :goto_16

    :goto_17
    :try_start_1f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_10

    throw v5

    :catchall_4
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object/from16 v62, v4

    :goto_18
    move/from16 v52, v9

    :goto_19
    move-object/from16 v54, v10

    move-object/from16 v46, v11

    move/from16 v69, v12

    move-object/from16 v57, v14

    move/from16 v5, v20

    const/16 v39, 0x5

    const/16 v41, 0x15

    move-object v10, v3

    goto/16 :goto_70

    :cond_10
    throw v0

    :cond_11
    move/from16 v50, v5

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    :cond_12
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v41, 0x15

    aget-byte v8, v7, v41

    neg-int v8, v8

    int-to-byte v8, v8

    aget-byte v13, v7, v27

    int-to-byte v13, v13

    move-object/from16 v45, v7

    const/16 v7, 0x120

    invoke-static {v8, v13, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v0, v45, v48

    int-to-byte v0, v0

    aget-byte v7, v45, v47

    int-to-byte v7, v7

    const/16 v8, 0x124

    invoke-static {v0, v7, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    :try_start_20
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v5, v45, v44

    int-to-byte v5, v5

    const/16 v7, 0x49

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_21
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_13

    throw v5

    :cond_13
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    :cond_14
    move/from16 v50, v5

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    :goto_1a
    if-eqz v45, :cond_29

    :try_start_22
    new-instance v7, Ljava/util/Random;

    invoke-direct {v7}, Ljava/util/Random;-><init>()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_13

    .line 7
    sget v8, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    or-int/lit8 v13, v8, 0x25

    shl-int/lit8 v13, v13, 0x1

    xor-int/lit8 v8, v8, 0x25

    sub-int/2addr v13, v8

    rem-int/lit16 v13, v13, 0x80

    sput v13, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 8
    :try_start_23
    sget-object v8, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v13, 0xb0

    aget-byte v13, v8, v13

    int-to-byte v13, v13

    const/16 v5, 0xda

    move-object/from16 v52, v8

    const/16 v8, 0x49

    invoke-static {v13, v8, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v8, 0x141

    aget-byte v8, v52, v8

    int-to-byte v8, v8

    aget-byte v13, v52, v24
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_12

    int-to-byte v13, v13

    move/from16 v52, v9

    const/16 v9, 0x136

    :try_start_24
    invoke-static {v8, v13, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v5, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_11

    const-wide/32 v53, -0x52c407dc

    xor-long v8, v8, v53

    :try_start_25
    invoke-virtual {v7, v8, v9}, Ljava/util/Random;->setSeed(J)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_10

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    :goto_1b
    if-nez v5, :cond_27

    .line 9
    sget v53, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    and-int/lit8 v54, v53, 0x6f

    or-int/lit8 v53, v53, 0x6f

    move-object/from16 v55, v5

    add-int v5, v54, v53

    move-object/from16 v53, v8

    rem-int/lit16 v8, v5, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_15

    const/16 v5, 0x4b

    :try_start_26
    div-int/lit8 v5, v5, 0x0
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_6

    if-nez v53, :cond_16

    goto :goto_1c

    :catchall_6
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object/from16 v62, v4

    goto/16 :goto_19

    :cond_15
    if-nez v53, :cond_16

    :goto_1c
    move/from16 v5, v36

    goto :goto_1d

    :cond_16
    if-nez v9, :cond_17

    const/4 v5, 0x5

    goto :goto_1d

    :cond_17
    if-nez v13, :cond_18

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move/from16 v5, v35

    goto :goto_1d

    :cond_18
    move/from16 v5, v32

    .line 10
    :goto_1d
    :try_start_27
    new-instance v8, Ljava/lang/StringBuilder;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_10

    move-object/from16 v56, v9

    move-object/from16 v54, v10

    :try_start_28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v9, v9

    mul-int/lit16 v10, v5, 0x198

    const/16 v57, -0x32d

    xor-int v58, v57, v10

    and-int v10, v57, v10

    shl-int/lit8 v10, v10, 0x1

    add-int v58, v58, v10

    not-int v10, v5

    xor-int/lit8 v57, v10, 0x1

    and-int/lit8 v59, v10, 0x1

    move/from16 v60, v10

    or-int v10, v57, v59

    not-int v10, v10

    xor-int/lit8 v57, v9, 0x1

    and-int/lit8 v59, v9, 0x1

    move/from16 v61, v10

    or-int v10, v57, v59

    not-int v10, v10

    xor-int v57, v61, v10

    and-int v59, v61, v10

    move/from16 v61, v10

    or-int v10, v57, v59

    mul-int/lit16 v10, v10, -0x32e

    and-int v57, v58, v10

    or-int v10, v58, v10

    add-int v57, v57, v10

    not-int v10, v9

    xor-int v58, v60, v10

    and-int v10, v60, v10

    or-int v10, v58, v10

    not-int v10, v10

    xor-int v58, v42, v5

    and-int v59, v42, v5

    move/from16 v60, v9

    or-int v9, v58, v59

    move/from16 v58, v10

    not-int v10, v9

    xor-int v59, v58, v10

    and-int v10, v58, v10

    or-int v10, v59, v10

    xor-int v58, v10, v61

    and-int v10, v10, v61

    or-int v10, v58, v10

    mul-int/lit16 v10, v10, 0x197

    add-int v10, v10, v57

    not-int v9, v9

    xor-int v57, v42, v60

    and-int v58, v42, v60

    move/from16 v59, v9

    or-int v9, v57, v58

    not-int v9, v9

    or-int v9, v59, v9

    xor-int v57, v5, v60

    and-int v58, v5, v60

    move/from16 v59, v9

    or-int v9, v57, v58

    not-int v9, v9

    xor-int v57, v59, v9

    and-int v9, v59, v9

    or-int v9, v57, v9

    mul-int/lit16 v9, v9, 0x197

    neg-int v9, v9

    neg-int v9, v9

    not-int v9, v9

    sub-int/2addr v10, v9

    add-int/lit8 v10, v10, -0x1

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v9, 0x2e

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move/from16 v9, v16

    :goto_1e
    if-ge v9, v5, :cond_1b

    if-eqz v46, :cond_1a

    const/16 v10, 0x1a

    invoke-virtual {v7, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    invoke-virtual {v7}, Ljava/util/Random;->nextBoolean()Z

    move-result v57
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_8

    if-eqz v57, :cond_19

    move-object/from16 v58, v13

    move-object/from16 v57, v14

    :try_start_29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    mul-int/lit16 v14, v10, 0x173

    add-int/lit16 v14, v14, 0x5e33

    move/from16 v59, v5

    not-int v5, v13

    const/16 v60, -0x42

    xor-int v61, v60, v5

    and-int v62, v60, v5

    move/from16 v63, v5

    or-int v5, v61, v62

    not-int v5, v5

    move/from16 v61, v5

    not-int v5, v10

    xor-int v62, v5, v13

    and-int/2addr v5, v13

    or-int v5, v62, v5

    not-int v5, v5

    xor-int v62, v61, v5

    and-int v5, v61, v5

    or-int v5, v62, v5

    mul-int/lit16 v5, v5, -0x172

    neg-int v5, v5

    neg-int v5, v5

    xor-int v61, v14, v5

    and-int/2addr v5, v14

    shl-int/lit8 v5, v5, 0x1

    add-int v61, v61, v5

    not-int v5, v10

    xor-int v14, v5, v63

    and-int v5, v5, v63

    or-int/2addr v5, v14

    not-int v5, v5

    xor-int v14, v60, v13

    and-int v13, v60, v13

    or-int/2addr v13, v14

    not-int v13, v13

    xor-int v14, v5, v13

    and-int/2addr v5, v13

    or-int/2addr v5, v14

    xor-int/lit8 v13, v10, 0x41

    and-int/lit8 v10, v10, 0x41

    or-int/2addr v10, v13

    not-int v13, v10

    or-int/2addr v5, v13

    mul-int/lit16 v5, v5, -0x172

    neg-int v5, v5

    neg-int v5, v5

    and-int v13, v61, v5

    or-int v5, v61, v5

    add-int/2addr v13, v5

    not-int v5, v10

    mul-int/lit16 v5, v5, 0x172

    neg-int v5, v5

    neg-int v5, v5

    and-int v10, v13, v5

    or-int/2addr v5, v13

    :goto_1f
    add-int/2addr v10, v5

    goto :goto_24

    :catchall_7
    move-exception v0

    :goto_20
    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    :goto_21
    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    :goto_22
    const/16 v39, 0x5

    :goto_23
    const/16 v41, 0x15

    goto/16 :goto_70

    :cond_19
    move/from16 v59, v5

    move-object/from16 v58, v13

    move-object/from16 v57, v14

    neg-int v5, v10

    neg-int v5, v5

    and-int/lit8 v10, v5, 0x60

    or-int/lit8 v5, v5, 0x60

    goto :goto_1f

    :goto_24
    int-to-char v5, v10

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v62, v7

    goto :goto_26

    :catchall_8
    move-exception v0

    :goto_25
    move-object/from16 v57, v14

    goto :goto_20

    :cond_1a
    move/from16 v59, v5

    move-object/from16 v58, v13

    move-object/from16 v57, v14

    const/16 v5, 0xc

    invoke-virtual {v7, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v10, v13

    mul-int/lit8 v13, v5, 0x2e

    const v14, 0x5c000

    add-int/2addr v13, v14

    not-int v14, v10

    const/16 v60, -0x2001

    xor-int v61, v60, v14

    and-int v14, v60, v14

    or-int v14, v61, v14

    not-int v14, v14

    xor-int v61, v5, v14

    and-int/2addr v14, v5

    or-int v14, v61, v14

    mul-int/lit8 v14, v14, -0x5a

    neg-int v14, v14

    neg-int v14, v14

    and-int v61, v13, v14

    or-int/2addr v13, v14

    add-int v61, v61, v13

    or-int v13, v60, v10

    not-int v13, v13

    xor-int/lit16 v14, v5, 0x2000

    move-object/from16 v62, v7

    and-int/lit16 v7, v5, 0x2000

    or-int/2addr v7, v14

    not-int v7, v7

    xor-int v14, v13, v7

    and-int/2addr v7, v13

    or-int/2addr v7, v14

    mul-int/lit8 v7, v7, -0x2d

    add-int v7, v7, v61

    not-int v13, v5

    xor-int v14, v13, v10

    and-int/2addr v13, v10

    or-int/2addr v13, v14

    not-int v13, v13

    xor-int v14, v60, v13

    and-int v13, v60, v13

    or-int/2addr v13, v14

    not-int v10, v10

    xor-int v14, v10, v5

    and-int/2addr v5, v10

    or-int/2addr v5, v14

    not-int v5, v5

    or-int/2addr v5, v13

    mul-int/lit8 v5, v5, 0x2d

    neg-int v5, v5

    neg-int v5, v5

    or-int v10, v7, v5

    shl-int/lit8 v10, v10, 0x1

    xor-int/2addr v5, v7

    sub-int/2addr v10, v5

    int-to-char v5, v10

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_26
    and-int/lit8 v5, v9, -0x47

    or-int/lit8 v7, v9, -0x47

    add-int/2addr v5, v7

    and-int/lit8 v7, v5, 0x48

    or-int/lit8 v5, v5, 0x48

    add-int v9, v7, v5

    move-object/from16 v14, v57

    move-object/from16 v13, v58

    move/from16 v5, v59

    move-object/from16 v7, v62

    goto/16 :goto_1e

    :cond_1b
    move-object/from16 v62, v7

    move-object/from16 v58, v13

    move-object/from16 v57, v14

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_7

    if-nez v53, :cond_1d

    move/from16 v7, v40

    :try_start_2a
    new-array v8, v7, [Ljava/lang/Object;

    aput-object v5, v8, v23

    aput-object v0, v8, v16

    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v7, v5, v30

    int-to-byte v7, v7

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v7, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v5, v5, v30

    int-to-byte v5, v5

    invoke-static {v5, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v15}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_9

    move-object v8, v5

    move-object/from16 v5, v55

    :goto_27
    move-object/from16 v9, v56

    :goto_28
    move-object/from16 v13, v58

    goto/16 :goto_29

    :catchall_9
    move-exception v0

    :try_start_2b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_1c

    throw v5

    :cond_1c
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_7

    :cond_1d
    if-nez v56, :cond_1f

    const/4 v7, 0x2

    :try_start_2c
    new-array v8, v7, [Ljava/lang/Object;

    aput-object v5, v8, v23

    aput-object v0, v8, v16

    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v7, v5, v30

    int-to-byte v7, v7

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v7, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v5, v5, v30

    int-to-byte v5, v5

    invoke-static {v5, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v15}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_a

    move-object v9, v5

    move-object/from16 v8, v53

    move-object/from16 v5, v55

    goto :goto_28

    :catchall_a
    move-exception v0

    :try_start_2d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_1e

    throw v5

    :cond_1e
    throw v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_7

    :cond_1f
    if-nez v58, :cond_22

    .line 11
    sget v7, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    xor-int/lit8 v8, v7, 0xb

    and-int/lit8 v9, v7, 0xb

    shl-int/lit8 v9, v9, 0x1

    add-int/2addr v8, v9

    rem-int/lit16 v9, v8, 0x80

    sput v9, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    const/4 v9, 0x2

    rem-int/2addr v8, v9

    if-nez v8, :cond_21

    add-int/lit8 v7, v7, 0x55

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 12
    :try_start_2e
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v5, v7, v23

    aput-object v0, v7, v16

    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v8, v5, v30

    int-to-byte v8, v8

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v8, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v5, v5, v30

    int-to-byte v5, v5

    invoke-static {v5, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v15}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_b

    move-object v13, v5

    move-object/from16 v8, v53

    move-object/from16 v5, v55

    move-object/from16 v9, v56

    goto/16 :goto_29

    :catchall_b
    move-exception v0

    :try_start_2f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_20

    throw v5

    :cond_20
    throw v0

    :cond_21
    const/16 v34, 0x0

    .line 13
    throw v34
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_7

    :cond_22
    const/4 v7, 0x2

    .line 14
    :try_start_30
    new-array v8, v7, [Ljava/lang/Object;

    aput-object v5, v8, v23

    aput-object v0, v8, v16

    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v7, v5, v30

    int-to-byte v7, v7

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v7, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v30

    int-to-byte v10, v10

    invoke-static {v10, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9, v15}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_f

    :try_start_31
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v8

    aget-byte v9, v5, v38

    int-to-byte v9, v9

    const/16 v10, 0x146

    const/16 v13, 0x49

    invoke-static {v9, v13, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v14, v5, v30

    int-to-byte v14, v14

    const/16 v10, 0xc2

    invoke-static {v14, v13, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_d

    :try_start_32
    aget-byte v9, v5, v38

    int-to-byte v9, v9

    const/16 v10, 0x146

    const/16 v13, 0x49

    invoke-static {v9, v13, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v41, 0x15

    aget-byte v10, v5, v41

    neg-int v10, v10

    int-to-byte v10, v10

    aget-byte v5, v5, v24

    int-to-byte v5, v5

    const/16 v13, 0x15d

    invoke-static {v10, v5, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-virtual {v9, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_c

    move-object v5, v7

    move-object/from16 v8, v53

    goto/16 :goto_27

    :goto_29
    move-object/from16 v10, v54

    move-object/from16 v14, v57

    move-object/from16 v7, v62

    const/16 v40, 0x2

    goto/16 :goto_1b

    :catchall_c
    move-exception v0

    :try_start_33
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_23

    throw v5

    :catch_f
    move-exception v0

    goto :goto_2a

    :cond_23
    throw v0

    :catchall_d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_24

    throw v5

    :cond_24
    throw v0
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_33} :catch_f
    .catchall {:try_start_33 .. :try_end_33} :catchall_7

    :goto_2a
    :try_start_34
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v41, 0x15

    aget-byte v9, v8, v41

    neg-int v9, v9

    int-to-byte v9, v9

    aget-byte v10, v8, v27

    int-to-byte v10, v10

    const/16 v13, 0x161

    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v7, v8, v48

    int-to-byte v7, v7

    aget-byte v9, v8, v47

    int-to-byte v9, v9

    const/16 v10, 0x124

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_7

    const/4 v7, 0x2

    :try_start_35
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v0, v9, v23

    aput-object v5, v9, v16

    aget-byte v0, v8, v44

    int-to-byte v0, v0

    const/16 v7, 0x49

    const/16 v8, 0x124

    invoke-static {v0, v7, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v15, v2}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_e

    :catchall_e
    move-exception v0

    :try_start_36
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_25

    throw v5

    :cond_25
    throw v0

    :catchall_f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_26

    throw v5

    :cond_26
    throw v0

    :catchall_10
    move-exception v0

    :goto_2b
    move-object/from16 v54, v10

    goto/16 :goto_25

    :cond_27
    move-object/from16 v55, v5

    move-object/from16 v53, v8

    move-object/from16 v56, v9

    move-object/from16 v58, v13

    :goto_2c
    move-object/from16 v54, v10

    move-object/from16 v57, v14

    goto :goto_2f

    :catchall_11
    move-exception v0

    :goto_2d
    move-object/from16 v54, v10

    move-object/from16 v57, v14

    goto :goto_2e

    :catchall_12
    move-exception v0

    move/from16 v52, v9

    goto :goto_2d

    :goto_2e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_28

    throw v5

    :cond_28
    throw v0

    :catchall_13
    move-exception v0

    move/from16 v52, v9

    goto :goto_2b

    :cond_29
    move/from16 v52, v9

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    goto :goto_2c

    :goto_2f
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v5, 0x21

    aget-byte v5, v0, v5

    int-to-byte v5, v5

    aget-byte v7, v0, v33
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_7

    int-to-byte v7, v7

    move/from16 v8, v33

    :try_start_37
    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_68

    .line 15
    sget v7, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    add-int/lit8 v7, v7, 0x2f

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 16
    :try_start_38
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v7

    aget-byte v8, v0, v25

    int-to-byte v8, v8

    aget-byte v9, v0, v21

    int-to-byte v9, v9

    const/16 v10, 0x195

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_67

    :try_start_39
    aget-byte v8, v0, v30

    int-to-byte v8, v8

    const/16 v9, 0x19f

    const/16 v13, 0x49

    invoke-static {v8, v13, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v37

    int-to-byte v9, v9

    aget-byte v10, v0, v21

    int-to-byte v10, v10

    const/16 v13, 0x1aa

    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v7, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_66

    :try_start_3a
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte v9, v0, v48

    int-to-byte v9, v9

    const/16 v10, 0x21

    aget-byte v10, v0, v10

    int-to-byte v10, v10

    xor-int/lit16 v13, v10, 0x1b0

    and-int/lit16 v14, v10, 0x1b0

    or-int/2addr v13, v14

    int-to-short v13, v13

    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_64

    const/4 v9, 0x5

    :try_start_3b
    invoke-virtual {v7, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_65

    :try_start_3c
    new-instance v8, Ljava/util/zip/ZipFile;

    invoke-direct {v8, v7}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_64

    const/16 v7, 0x19d1

    :try_start_3d
    new-array v7, v7, [B

    move/from16 v9, v23

    invoke-virtual {v5, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_5c

    :try_start_3e
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v9, 0x11b

    aget-byte v9, v0, v9

    int-to-byte v9, v9

    const/16 v10, 0x1b0

    const/16 v13, 0x49

    invoke-static {v9, v13, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v44

    int-to-byte v10, v10

    const/16 v14, 0x1ca

    invoke-static {v10, v13, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_61

    :try_start_3f
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v9, v0, v17

    const/16 v23, 0x1

    add-int/lit8 v9, v9, -0x1

    int-to-byte v9, v9

    const/16 v10, 0x1dc

    const/16 v13, 0x49

    invoke-static {v9, v13, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v44

    int-to-byte v10, v10

    invoke-static {v10, v13, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_60

    :try_start_40
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v9

    aget-byte v10, v0, v17

    const/16 v23, 0x1

    add-int/lit8 v10, v10, -0x1

    int-to-byte v10, v10

    const/16 v13, 0x49

    const/16 v14, 0x1dc

    invoke-static {v10, v13, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v13, v0, v16

    xor-int/lit8 v13, v13, -0x1

    rsub-int/lit8 v13, v13, -0x2

    int-to-byte v13, v13

    sget v14, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    move-object/from16 v59, v7

    xor-int/lit16 v7, v14, 0x182

    and-int/lit16 v14, v14, 0x182

    or-int/2addr v7, v14

    int-to-short v7, v7

    const/16 v14, 0x51

    invoke-static {v13, v14, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v10, v7, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v5, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_5f

    :try_start_41
    aget-byte v7, v0, v17

    xor-int/lit8 v7, v7, -0x1

    rsub-int/lit8 v7, v7, -0x2

    int-to-byte v7, v7

    const/16 v13, 0x49

    const/16 v14, 0x1dc

    invoke-static {v7, v13, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_5d

    const/16 v41, 0x15

    :try_start_42
    aget-byte v9, v0, v41
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_5e

    neg-int v9, v9

    int-to-byte v9, v9

    :try_start_43
    aget-byte v0, v0, v24

    int-to-byte v0, v0

    const/16 v13, 0x15d

    invoke-static {v9, v0, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v7, v0, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_5d

    const/16 v0, 0x11

    const/16 v5, 0x19af

    move v7, v5

    move v5, v0

    move v0, v7

    move-object/from16 v10, v54

    move-object/from16 v7, v59

    const/4 v9, 0x0

    .line 17
    :goto_30
    :try_start_44
    array-length v13, v7
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_5c

    const-wide/16 v59, 0x1

    move/from16 v14, v16

    :goto_31
    if-ge v14, v13, :cond_2a

    move-object/from16 v46, v11

    :try_start_45
    aget-byte v11, v7, v14

    move/from16 v61, v13

    move/from16 v62, v14

    int-to-long v13, v11

    shl-long v63, v59, v36

    add-long v13, v13, v63

    shl-long v63, v59, v18

    add-long v13, v13, v63

    sub-long v59, v13, v59

    add-int/lit8 v14, v62, 0x1

    move-object/from16 v11, v46

    move/from16 v13, v61

    goto :goto_31

    :catchall_14
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    :goto_32
    move/from16 v69, v12

    move/from16 v5, v20

    :goto_33
    const/16 v33, 0x165

    const/16 v39, 0x5

    :goto_34
    const/16 v41, 0x15

    :goto_35
    move-object v2, v0

    goto/16 :goto_6e

    :cond_2a
    move-object/from16 v46, v11

    xor-int/lit16 v11, v5, 0x91

    and-int/lit16 v13, v5, 0x91

    const/16 v23, 0x1

    shl-int/lit8 v13, v13, 0x1

    add-int/2addr v11, v13

    or-int/lit16 v13, v5, 0xd8f

    shl-int/lit8 v13, v13, 0x1

    xor-int/lit16 v14, v5, 0xd8f

    sub-int/2addr v13, v14

    .line 18
    aget-byte v13, v7, v13

    add-int/lit8 v13, v13, -0x59

    int-to-byte v13, v13

    aput-byte v13, v7, v11

    array-length v11, v7
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_14

    neg-int v13, v5

    and-int v14, v11, v13

    or-int/2addr v11, v13

    add-int/2addr v14, v11

    move/from16 v11, v32

    :try_start_46
    new-array v13, v11, [Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_5b

    :try_start_47
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v40, 0x2

    aput-object v11, v13, v40

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v23, 0x1

    aput-object v11, v13, v23

    aput-object v7, v13, v16

    sget-object v7, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v11, 0xc9

    aget-byte v11, v7, v11

    int-to-byte v11, v11

    sget v14, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    move/from16 v61, v5

    xor-int/lit16 v5, v14, 0x18a

    move/from16 v62, v5

    and-int/lit16 v5, v14, 0x18a

    or-int v5, v62, v5

    int-to-short v5, v5

    move-object/from16 v62, v7

    const/16 v7, 0x49

    invoke-static {v11, v7, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v7, v7}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_5a

    :try_start_48
    sget-object v11, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_59

    if-nez v11, :cond_2c

    .line 19
    sget v11, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    xor-int/lit8 v13, v11, 0x79

    and-int/lit8 v11, v11, 0x79

    const/16 v23, 0x1

    shl-int/lit8 v11, v11, 0x1

    add-int/2addr v13, v11

    rem-int/lit16 v13, v13, 0x80

    sput v13, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 20
    :try_start_49
    sput-wide v59, Lcom/appsflyer/internal/AFi1fSDK;->force:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v11
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_19

    shr-int/lit8 v11, v11, 0x10

    move/from16 v69, v12

    :try_start_4a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    long-to-int v12, v12

    mul-int/lit16 v13, v11, 0xc1

    const v59, -0x45e666d8

    add-int v13, v13, v59

    move-object/from16 v63, v5

    not-int v5, v12

    move/from16 v59, v5

    not-int v5, v11

    const v60, -0x67d2c4d8

    xor-int v64, v5, v60

    and-int v65, v5, v60

    move/from16 v66, v5

    or-int v5, v64, v65

    not-int v5, v5

    xor-int v64, v59, v5

    and-int v5, v59, v5

    or-int v5, v64, v5

    mul-int/lit16 v5, v5, -0xc0

    and-int v64, v13, v5

    or-int/2addr v5, v13

    add-int v64, v64, v5

    const v5, 0x67d2c4d7

    xor-int v13, v66, v5

    and-int v5, v66, v5

    or-int/2addr v5, v13

    not-int v5, v5

    not-int v13, v12

    const v65, 0x67d2c4d7

    or-int v13, v65, v13

    not-int v13, v13

    xor-int v67, v5, v13

    and-int/2addr v5, v13

    or-int v5, v67, v5

    mul-int/lit16 v5, v5, -0x180

    xor-int v13, v64, v5

    and-int v5, v64, v5

    const/16 v23, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v13, v5

    or-int v5, v66, v65

    xor-int v64, v5, v12

    and-int/2addr v5, v12

    or-int v5, v64, v5

    not-int v5, v5

    const v64, 0x67d2c4d7

    xor-int v65, v64, v59

    and-int v59, v64, v59

    or-int v59, v65, v59

    xor-int v64, v59, v11

    and-int v59, v59, v11

    move/from16 v65, v5

    or-int v5, v64, v59

    not-int v5, v5

    xor-int v59, v65, v5

    and-int v5, v65, v5

    or-int v5, v59, v5

    or-int v11, v11, v60

    xor-int v59, v11, v12

    and-int/2addr v11, v12

    or-int v11, v59, v11

    not-int v11, v11

    xor-int v12, v5, v11

    and-int/2addr v5, v11

    or-int/2addr v5, v12

    mul-int/lit16 v5, v5, 0xc0

    add-int/2addr v5, v13

    sget-wide v11, Lcom/appsflyer/internal/AFi1fSDK;->force:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v59

    const/16 v13, 0x30

    shr-long v59, v59, v13

    const-wide v64, -0x8b5e08a42b6402dL    # -4.211602810252767E266

    add-long v59, v59, v64

    xor-long v11, v11, v59

    long-to-int v11, v11

    sget-wide v12, Lcom/appsflyer/internal/AFi1fSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v59

    const/16 v64, 0x30

    shr-long v59, v59, v64

    const-wide v64, -0x8b5e08a42b6402cL

    sub-long v64, v64, v59

    xor-long v12, v12, v64

    long-to-int v12, v12

    new-array v12, v12, [I

    sget-wide v59, Lcom/appsflyer/internal/AFi1fSDK;->force:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v64

    const/16 v13, 0x20

    shr-long v64, v64, v13

    const-wide v66, -0x8b5e08a42b6402aL

    add-long v64, v64, v66

    move v13, v11

    move-object/from16 v66, v12

    xor-long v11, v59, v64

    long-to-int v11, v11

    sget-wide v59, Lcom/appsflyer/internal/AFi1fSDK;->afDebugLog:J

    const-string v12, ""

    invoke-static {v12}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v12

    neg-int v12, v12

    neg-int v12, v12

    not-int v12, v12

    rsub-int/lit8 v12, v12, 0x1f

    int-to-byte v12, v12

    move/from16 v64, v11

    ushr-long v11, v59, v12

    long-to-int v11, v11

    xor-int/2addr v11, v5

    aput v11, v66, v64

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v11

    const-wide/16 v59, 0x0

    cmp-long v11, v11, v59

    move/from16 v59, v11

    sget-wide v11, Lcom/appsflyer/internal/AFi1fSDK;->afDebugLog:J

    long-to-int v11, v11

    not-int v12, v5

    and-int/2addr v12, v11

    not-int v11, v11

    and-int/2addr v5, v11

    or-int/2addr v5, v12

    aput v5, v66, v59

    sget v5, Lcom/appsflyer/internal/AFi1fSDK;->afRDLog:I

    sget-object v11, Lcom/appsflyer/internal/AFi1fSDK;->afLogForce:[B

    sget v12, Lcom/appsflyer/internal/AFi1fSDK;->afVerboseLog:I
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_18

    move/from16 v59, v5

    move-object/from16 v65, v7

    move/from16 v5, v36

    :try_start_4b
    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_16

    const/16 v39, 0x5

    :try_start_4c
    aput-object v12, v7, v39

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v7, v35

    const/16 v32, 0x3

    aput-object v11, v7, v32

    invoke-static/range {v59 .. v59}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v40, 0x2

    aput-object v11, v7, v40

    const/16 v23, 0x1

    aput-object v66, v7, v23

    aput-object v63, v7, v16

    const/16 v11, 0x25b

    aget-byte v11, v62, v11

    int-to-byte v11, v11

    aget-byte v12, v62, v24

    int-to-byte v12, v12

    const/16 v13, 0x215

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v12, v62, v44

    int-to-byte v12, v12

    const/16 v13, 0x1ca

    const/16 v5, 0x49

    invoke-static {v12, v5, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v63

    const-class v64, [I

    const-class v66, [B

    move-object/from16 v67, v65

    move-object/from16 v68, v65

    filled-new-array/range {v63 .. v68}, [Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v12, v65

    invoke-virtual {v11, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_15

    move-object/from16 v59, v8

    move-object/from16 v60, v9

    move-object/from16 v63, v10

    const/16 v32, 0x3

    goto/16 :goto_3b

    :catchall_15
    move-exception v0

    goto :goto_36

    :catchall_16
    move-exception v0

    const/16 v39, 0x5

    :goto_36
    :try_start_4d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_2b

    throw v5

    :catchall_17
    move-exception v0

    :goto_37
    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    :goto_38
    move/from16 v5, v20

    const/16 v32, 0x3

    :goto_39
    const/16 v33, 0x165

    goto/16 :goto_34

    :cond_2b
    throw v0

    :catchall_18
    move-exception v0

    :goto_3a
    const/16 v39, 0x5

    goto :goto_37

    :catchall_19
    move-exception v0

    move/from16 v69, v12

    goto :goto_3a

    :cond_2c
    move-object/from16 v63, v5

    move/from16 v69, v12

    const/16 v39, 0x5

    move-object v12, v7

    sput-wide v59, Lcom/appsflyer/internal/AFi1fSDK;->afInfoLog:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v5
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_17

    shr-int/lit8 v5, v5, 0x8

    move-object v13, v8

    :try_start_4e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    mul-int/lit16 v8, v5, -0x177

    const v59, -0x2441387

    xor-int v60, v8, v59

    and-int v8, v8, v59

    const/16 v23, 0x1

    shl-int/lit8 v8, v8, 0x1

    add-int v60, v60, v8

    not-int v8, v5

    const v59, -0x33e38272    # -4.1023032E7f

    xor-int v64, v8, v59

    and-int v8, v8, v59

    or-int v8, v64, v8

    not-int v8, v8

    xor-int v59, v7, v8

    and-int/2addr v8, v7

    or-int v8, v59, v8

    const v59, 0x33e38271

    xor-int v64, v5, v59

    and-int v65, v5, v59

    move/from16 v66, v8

    or-int v8, v64, v65

    not-int v8, v8

    xor-int v64, v66, v8

    and-int v65, v66, v8

    move/from16 v66, v8

    or-int v8, v64, v65

    mul-int/lit16 v8, v8, 0x178

    or-int v64, v60, v8

    const/16 v23, 0x1

    shl-int/lit8 v64, v64, 0x1

    xor-int v8, v60, v8

    sub-int v64, v64, v8

    not-int v8, v7

    xor-int v60, v8, v5

    and-int/2addr v8, v5

    or-int v8, v60, v8

    not-int v8, v8

    xor-int v60, v8, v66

    and-int v8, v8, v66

    or-int v8, v60, v8

    mul-int/lit16 v8, v8, -0x178

    xor-int v60, v64, v8

    and-int v8, v64, v8

    const/16 v23, 0x1

    shl-int/lit8 v8, v8, 0x1

    add-int v60, v60, v8

    not-int v5, v5

    or-int/2addr v5, v7

    not-int v5, v5

    or-int v5, v5, v59

    mul-int/lit16 v5, v5, 0x178

    neg-int v5, v5

    neg-int v5, v5

    and-int v7, v60, v5

    or-int v5, v60, v5

    add-int/2addr v7, v5

    sget-wide v59, Lcom/appsflyer/internal/AFi1fSDK;->afInfoLog:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v64

    const/16 v5, 0x30

    shr-long v64, v64, v5

    const-wide v66, 0x7bfa1e10482ebe49L    # 1.5907663402348496E289

    sub-long v66, v66, v64

    move v5, v7

    xor-long v7, v59, v66

    long-to-int v7, v7

    const-string v8, ""

    move/from16 v59, v5

    const/16 v5, 0x30

    invoke-static {v8, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v5
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_58

    const/16 v32, 0x3

    rsub-int/lit8 v5, v5, 0x3

    move/from16 v8, v35

    move/from16 v35, v5

    :try_start_4f
    new-array v5, v8, [Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v35

    aput-object v35, v5, v32

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v40, 0x2

    aput-object v7, v5, v40

    invoke-static/range {v59 .. v59}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v23, 0x1

    aput-object v7, v5, v23

    aput-object v63, v5, v16

    aget-byte v7, v62, v22

    int-to-byte v7, v7

    aget-byte v8, v62, v24
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_57

    int-to-byte v8, v8

    move-object/from16 v59, v13

    const/16 v13, 0x233

    :try_start_50
    invoke-static {v7, v8, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;

    check-cast v8, Ljava/lang/ClassLoader;

    const/4 v13, 0x1

    invoke-static {v7, v13, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v62, v26

    int-to-byte v8, v8

    const/16 v13, 0x141

    aget-byte v13, v62, v13

    int-to-byte v13, v13

    move-object/from16 v60, v9

    const/16 v9, 0x253

    invoke-static {v8, v13, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    aget-byte v9, v62, v44

    int-to-byte v9, v9

    const/16 v13, 0x1ca

    move-object/from16 v63, v10

    const/16 v10, 0x49

    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    sget-object v10, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    filled-new-array {v9, v12, v12, v10}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v11, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_56

    :goto_3b
    :try_start_51
    aget-byte v7, v62, v44

    int-to-byte v7, v7

    const/16 v8, 0x1ca

    const/16 v13, 0x49

    invoke-static {v7, v13, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v9, v62, v20

    int-to-byte v9, v9

    const/16 v10, 0x467

    aget-byte v10, v62, v10

    move v13, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v10, -0x1cf

    const/16 v64, -0x1d1

    or-int v65, v64, v9

    const/16 v23, 0x1

    shl-int/lit8 v65, v65, 0x1

    xor-int v9, v64, v9

    sub-int v65, v65, v9

    not-int v9, v10

    not-int v10, v8

    xor-int v64, v9, v10

    and-int v66, v9, v10

    or-int v11, v64, v66

    not-int v11, v11

    xor-int/lit8 v64, v10, -0x1

    or-int v10, v64, v10

    not-int v10, v10

    xor-int v64, v11, v10

    and-int/2addr v10, v11

    or-int v10, v64, v10

    mul-int/lit16 v10, v10, 0x1d0

    add-int v10, v10, v65

    xor-int v11, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v11

    mul-int/lit16 v8, v8, -0x1d0

    neg-int v8, v8

    neg-int v8, v8

    and-int v11, v10, v8

    or-int/2addr v8, v10

    add-int/2addr v11, v8

    xor-int/lit8 v8, v9, -0x1

    or-int/2addr v8, v9

    not-int v8, v8

    mul-int/lit16 v8, v8, 0x1d0

    and-int v9, v11, v8

    or-int/2addr v8, v11

    add-int/2addr v9, v8

    int-to-byte v8, v9

    const/16 v9, 0x261

    invoke-static {v13, v8, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_1a

    if-eqz v45, :cond_3c

    :try_start_52
    sget-object v7, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_34

    if-nez v7, :cond_2d

    move-object/from16 v8, v53

    goto :goto_3c

    :cond_2d
    move-object/from16 v8, v56

    :goto_3c
    if-nez v7, :cond_2f

    .line 21
    sget v7, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    xor-int/lit8 v9, v7, 0x2d

    and-int/lit8 v7, v7, 0x2d

    const/16 v23, 0x1

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v9, v7

    rem-int/lit16 v7, v9, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    const/16 v40, 0x2

    rem-int/lit8 v9, v9, 0x2

    if-eqz v9, :cond_2e

    const/16 v7, 0x3d

    :try_start_53
    div-int/lit8 v7, v7, 0x0
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_1a

    goto :goto_3e

    :catchall_1a
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    :goto_3d
    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    goto/16 :goto_39

    :cond_2e
    :goto_3e
    move-object/from16 v7, v58

    goto :goto_3f

    :cond_2f
    move-object/from16 v7, v55

    .line 22
    :goto_3f
    :try_start_54
    aget-byte v9, v62, v44

    int-to-byte v9, v9

    const/16 v11, 0x1ca

    const/16 v13, 0x49

    invoke-static {v9, v13, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v62, v20

    int-to-byte v10, v10

    const/16 v13, 0x51

    const/16 v11, 0x264

    invoke-static {v10, v13, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v4, v12, v12}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    aget-byte v10, v62, v38

    int-to-byte v10, v10

    const/16 v11, 0x146

    const/16 v13, 0x49

    invoke-static {v10, v13, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_34

    :try_start_55
    aget-byte v11, v62, v30
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_55 .. :try_end_55} :catch_12
    .catchall {:try_start_55 .. :try_end_55} :catchall_2b

    int-to-byte v11, v11

    move-object/from16 v64, v2

    const/16 v2, 0xc2

    :try_start_56
    invoke-static {v11, v13, v2}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_56 .. :try_end_56} :catch_11
    .catchall {:try_start_56 .. :try_end_56} :catchall_2a

    if-eqz v50, :cond_31

    :try_start_57
    aget-byte v11, v62, v30
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_1d

    int-to-byte v11, v11

    move-object/from16 v65, v1

    const/16 v1, 0x49

    const/16 v13, 0xc2

    :try_start_58
    invoke-static {v11, v1, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v11, v62, v25

    int-to-byte v11, v11

    const/16 v13, 0x467

    aget-byte v13, v62, v13
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_1c

    xor-int/lit8 v13, v13, -0x1

    rsub-int/lit8 v13, v13, -0x2

    int-to-byte v13, v13

    move-object/from16 v66, v3

    const/16 v3, 0x267

    :try_start_59
    invoke-static {v11, v13, v3}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v1, v3, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_1b

    goto :goto_42

    :catchall_1b
    move-exception v0

    goto :goto_41

    :catchall_1c
    move-exception v0

    :goto_40
    move-object/from16 v66, v3

    goto :goto_41

    :catchall_1d
    move-exception v0

    move-object/from16 v65, v1

    goto :goto_40

    :goto_41
    :try_start_5a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_30

    throw v1

    :catchall_1e
    move-exception v0

    move-object/from16 v1, v64

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    goto/16 :goto_4d

    :catch_10
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    goto/16 :goto_4b

    :cond_30
    throw v0
    :try_end_5a
    .catch Ljava/lang/Exception; {:try_start_5a .. :try_end_5a} :catch_10
    .catchall {:try_start_5a .. :try_end_5a} :catchall_1e

    :cond_31
    move-object/from16 v65, v1

    move-object/from16 v66, v3

    .line 23
    :goto_42
    sget v1, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    and-int/lit8 v3, v1, 0x79

    or-int/lit8 v1, v1, 0x79

    add-int/2addr v3, v1

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    const/16 v1, 0x400

    .line 24
    :try_start_5b
    new-array v3, v1, [B

    const/16 v41, 0x15

    aget-byte v11, v62, v41

    neg-int v11, v11

    int-to-byte v11, v11

    or-int/lit16 v13, v14, 0x205

    int-to-short v13, v13

    const/16 v14, 0x56

    invoke-static {v11, v14, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v4, v12, v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_26

    :goto_43
    if-lez v0, :cond_32

    :try_start_5c
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v3, v6, v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v9, v5, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v13

    move/from16 v14, v43

    if-eq v13, v14, :cond_32

    filled-new-array {v3, v6, v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v2, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_1e

    neg-int v12, v13

    not-int v12, v12

    sub-int/2addr v0, v12

    const/16 v23, 0x1

    add-int/lit8 v0, v0, -0x1

    const/16 v43, -0x1

    goto :goto_43

    :cond_32
    :try_start_5d
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v41, 0x15

    aget-byte v1, v0, v41

    neg-int v1, v1

    int-to-byte v1, v1

    aget-byte v3, v0, v21

    int-to-byte v3, v3

    sget v5, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    xor-int/lit16 v9, v5, 0x209

    and-int/lit16 v5, v5, 0x209

    or-int/2addr v5, v9

    int-to-short v5, v5

    invoke-static {v1, v3, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v10, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-byte v3, v0, v17

    int-to-byte v3, v3

    const/16 v5, 0x27d

    const/16 v13, 0x49

    invoke-static {v3, v13, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v0, v20

    int-to-byte v5, v5

    const/16 v9, 0x467

    aget-byte v9, v0, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit16 v12, v9, -0x1bd

    neg-int v12, v12

    neg-int v12, v12

    const/16 v13, 0x1bd

    or-int v14, v13, v12

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v12, v13

    sub-int/2addr v14, v12

    not-int v12, v9

    not-int v13, v12

    move/from16 v62, v13

    not-int v13, v11

    xor-int v68, v12, v13

    and-int/2addr v13, v12

    or-int v13, v68, v13

    not-int v13, v13

    or-int v13, v62, v13

    mul-int/lit16 v13, v13, 0x1be

    neg-int v13, v13

    neg-int v13, v13

    and-int v62, v14, v13

    or-int/2addr v13, v14

    add-int v62, v62, v13

    not-int v9, v9

    const/16 v43, -0x1

    xor-int v13, v43, v11

    or-int/2addr v11, v13

    not-int v11, v11

    xor-int v13, v9, v11

    and-int/2addr v9, v11

    or-int/2addr v9, v13

    mul-int/lit16 v9, v9, 0x1be

    or-int v11, v62, v9

    const/16 v23, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int v9, v62, v9

    sub-int/2addr v11, v9

    not-int v9, v12

    mul-int/lit16 v9, v9, 0x1be

    and-int v12, v11, v9

    or-int/2addr v9, v11

    add-int/2addr v12, v9

    int-to-byte v9, v12

    const/16 v11, 0x292

    invoke-static {v5, v9, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    invoke-virtual {v3, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v41, 0x15

    aget-byte v1, v0, v41

    neg-int v1, v1

    int-to-byte v1, v1

    aget-byte v3, v0, v24

    int-to-byte v3, v3

    const/16 v13, 0x15d

    invoke-static {v1, v3, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v28

    int-to-byte v1, v1

    aget-byte v2, v0, v29

    int-to-byte v2, v2

    const/16 v3, 0x295

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v0, v37

    int-to-byte v2, v2

    const/16 v3, 0x46c

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v5, 0x2a9

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v15, v15, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_26

    :try_start_5e
    aget-byte v2, v0, v30

    int-to-byte v2, v2

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v2, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v26

    int-to-byte v3, v3

    aget-byte v5, v0, v21

    int-to-byte v5, v5

    const/16 v9, 0x2af

    invoke-static {v3, v5, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v2, v3, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_29

    :try_start_5f
    aget-byte v3, v0, v30

    int-to-byte v3, v3

    const/16 v5, 0x49

    const/16 v13, 0xc2

    invoke-static {v3, v5, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v0, v26

    int-to-byte v5, v5

    aget-byte v10, v0, v21

    int-to-byte v10, v10

    invoke-static {v5, v10, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    invoke-virtual {v3, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_27

    :try_start_60
    filled-new-array {v2, v3, v6}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v11, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_26

    :try_start_61
    aget-byte v2, v0, v30

    int-to-byte v2, v2

    const/16 v9, 0x49

    const/16 v13, 0xc2

    invoke-static {v2, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x89

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    aget-byte v5, v0, v29

    int-to-byte v5, v5

    const/16 v9, 0x2bd

    invoke-static {v3, v5, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v2, v3, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_25

    .line 25
    sget v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    and-int/lit8 v3, v2, 0x45

    or-int/lit8 v2, v2, 0x45

    add-int/2addr v3, v2

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 26
    :try_start_62
    aget-byte v2, v0, v30

    int-to-byte v2, v2

    const/16 v5, 0x49

    const/16 v13, 0xc2

    invoke-static {v2, v5, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x89

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    aget-byte v5, v0, v29

    int-to-byte v5, v5

    invoke-static {v3, v5, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v2, v3, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_24

    .line 27
    sget v2, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    add-int/lit8 v2, v2, 0x13

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 28
    :try_start_63
    sget-object v2, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_23

    if-nez v2, :cond_34

    :try_start_64
    aget-byte v2, v0, v31

    int-to-byte v2, v2

    aget-byte v0, v0, v21

    int-to-byte v0, v0

    const/16 v3, 0x2c2

    invoke-static {v2, v0, v3}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_22

    move-object/from16 v2, v66

    const/4 v11, 0x0

    :try_start_65
    invoke-virtual {v2, v0, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_21

    move-object/from16 v3, v65

    :try_start_66
    invoke-virtual {v0, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_20

    :try_start_67
    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;

    goto :goto_47

    :catchall_1f
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    :goto_44
    move-object/from16 v62, v4

    :goto_45
    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    goto/16 :goto_39

    :catchall_20
    move-exception v0

    goto :goto_46

    :catchall_21
    move-exception v0

    move-object/from16 v3, v65

    goto :goto_46

    :catchall_22
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    :goto_46
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_33

    throw v1

    :cond_33
    throw v0

    :cond_34
    move-object/from16 v3, v65

    move-object/from16 v2, v66

    :goto_47
    move-object v10, v2

    move-object/from16 v70, v3

    move-object/from16 v62, v4

    goto/16 :goto_59

    :catchall_23
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    move-object v10, v2

    goto :goto_44

    :catchall_24
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_35

    throw v1

    :cond_35
    throw v0

    :catchall_25
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_36

    throw v1

    :cond_36
    throw v0
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_1f

    :catchall_26
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    :goto_48
    move-object/from16 v1, v64

    goto/16 :goto_4d

    :catchall_27
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    :try_start_68
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_37

    throw v1

    :catchall_28
    move-exception v0

    goto :goto_48

    :cond_37
    throw v0

    :catchall_29
    move-exception v0

    move-object/from16 v3, v65

    move-object/from16 v2, v66

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_38

    throw v1

    :cond_38
    throw v0

    :catchall_2a
    move-exception v0

    :goto_49
    move-object v2, v3

    move-object v3, v1

    goto :goto_48

    :catch_11
    move-exception v0

    :goto_4a
    move-object v2, v3

    move-object v3, v1

    goto :goto_4b

    :catchall_2b
    move-exception v0

    move-object/from16 v64, v2

    goto :goto_49

    :catch_12
    move-exception v0

    move-object/from16 v64, v2

    goto :goto_4a

    :goto_4b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v41, 0x15

    aget-byte v9, v5, v41

    neg-int v9, v9

    int-to-byte v9, v9

    aget-byte v10, v5, v27

    int-to-byte v10, v10

    sget v11, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    or-int/lit16 v11, v11, 0x201

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v9, v5, v48

    int-to-byte v9, v9

    aget-byte v10, v5, v47

    int-to-byte v10, v10

    const/16 v11, 0x124

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_28

    const/4 v9, 0x2

    :try_start_69
    new-array v10, v9, [Ljava/lang/Object;

    const/16 v23, 0x1

    aput-object v0, v10, v23

    aput-object v1, v10, v16

    aget-byte v0, v5, v44

    int-to-byte v0, v0

    const/16 v11, 0x124

    const/16 v13, 0x49

    invoke-static {v0, v13, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_2d

    move-object/from16 v1, v64

    :try_start_6a
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_2c

    :catchall_2c
    move-exception v0

    goto :goto_4c

    :catchall_2d
    move-exception v0

    move-object/from16 v1, v64

    :goto_4c
    :try_start_6b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_39

    throw v5

    :catchall_2e
    move-exception v0

    goto :goto_4d

    :cond_39
    throw v0
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_2e

    :goto_4d
    :try_start_6c
    sget-object v5, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v9, v5, v30
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_32

    int-to-byte v9, v9

    const/16 v10, 0x49

    const/16 v13, 0xc2

    :try_start_6d
    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_33

    :try_start_6e
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v10, 0x89

    aget-byte v10, v5, v10

    int-to-byte v10, v10

    aget-byte v11, v5, v29

    int-to-byte v11, v11

    const/16 v12, 0x2bd

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_32

    :try_start_6f
    aget-byte v8, v5, v30
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_31

    int-to-byte v8, v8

    const/16 v9, 0x49

    const/16 v13, 0xc2

    :try_start_70
    invoke-static {v8, v9, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x89

    aget-byte v9, v5, v9

    int-to-byte v9, v9

    aget-byte v5, v5, v29

    int-to-byte v5, v5

    invoke-static {v9, v5, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    invoke-virtual {v8, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_30

    :try_start_71
    throw v0

    :catchall_2f
    move-exception v0

    :goto_4e
    move-object v10, v2

    move-object/from16 v65, v3

    goto/16 :goto_3d

    :catchall_30
    move-exception v0

    goto :goto_4f

    :catchall_31
    move-exception v0

    const/16 v13, 0xc2

    :goto_4f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3a

    throw v5

    :cond_3a
    throw v0

    :catchall_32
    move-exception v0

    const/16 v13, 0xc2

    goto :goto_50

    :catchall_33
    move-exception v0

    :goto_50
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3b

    throw v5

    :cond_3b
    throw v0

    :catchall_34
    move-exception v0

    move-object v13, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v13

    const/16 v13, 0xc2

    goto :goto_4e

    :cond_3c
    move-object v13, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v13

    const/16 v13, 0xc2

    const/16 v0, 0xc9

    .line 29
    aget-byte v0, v62, v0

    int-to-byte v0, v0

    const/16 v7, 0x2cf

    const/16 v9, 0x49

    invoke-static {v0, v9, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    aget-byte v7, v62, v44

    int-to-byte v7, v7

    const/16 v11, 0x1ca

    invoke-static {v7, v9, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    aget-byte v8, v62, v30

    int-to-byte v8, v8

    aget-byte v9, v62, v21

    int-to-byte v9, v9

    const/16 v10, 0x2ea

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v0, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aget-byte v8, v62, v17

    int-to-byte v8, v8

    xor-int/lit16 v9, v14, 0x285

    and-int/lit16 v10, v14, 0x285

    or-int/2addr v9, v10

    int-to-short v9, v9

    const/16 v10, 0x49

    invoke-static {v8, v10, v9}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v62, v37

    int-to-byte v9, v9

    aget-byte v10, v62, v21

    int-to-byte v10, v10

    const/16 v11, 0x30a

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    aget-byte v9, v62, v20

    int-to-byte v9, v9

    const/16 v10, 0x51

    const/16 v11, 0x264

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_2f

    :try_start_72
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v9, 0x11b

    aget-byte v9, v62, v9

    int-to-byte v9, v9

    const/16 v10, 0x1b0

    const/16 v11, 0x49

    invoke-static {v9, v11, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v62, v44

    int-to-byte v10, v10

    const/16 v13, 0x1ca

    invoke-static {v10, v11, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_55

    .line 30
    sget v9, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    xor-int/lit8 v10, v9, 0x3d

    and-int/lit8 v9, v9, 0x3d

    const/16 v23, 0x1

    shl-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v9

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 31
    :try_start_73
    aget-byte v9, v62, v31

    int-to-byte v9, v9

    aget-byte v10, v62, v21

    int-to-byte v10, v10

    const/16 v13, 0x2c2

    invoke-static {v9, v10, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_54

    const/16 v13, 0x26

    :try_start_74
    aget-byte v13, v62, v13

    int-to-byte v13, v13

    const/16 v11, 0x310

    const/16 v10, 0x49

    invoke-static {v13, v10, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_2f

    const/16 v41, 0x15

    :try_start_75
    aget-byte v11, v62, v41
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_53

    neg-int v11, v11

    int-to-byte v11, v11

    or-int/lit16 v14, v14, 0x205

    int-to-short v14, v14

    move-object/from16 v64, v1

    const/16 v1, 0x56

    :try_start_76
    invoke-static {v11, v1, v14}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v4, v12, v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    aget-byte v12, v62, v25

    int-to-byte v12, v12

    const/16 v14, 0x467

    aget-byte v14, v62, v14

    int-to-byte v14, v14

    const/16 v1, 0x32c

    invoke-static {v12, v14, v1}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v10, v1, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/16 v10, 0x141

    aget-byte v10, v62, v10

    int-to-byte v10, v10

    const/16 v12, 0x336

    const/16 v14, 0x49

    invoke-static {v10, v14, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_1f

    const/16 v41, 0x15

    :try_start_77
    aget-byte v12, v62, v41
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_52

    neg-int v12, v12

    int-to-byte v12, v12

    :try_start_78
    aget-byte v14, v62, v24
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_1f

    int-to-byte v14, v14

    move-object/from16 v62, v4

    const/16 v4, 0x15d

    :try_start_79
    invoke-static {v12, v14, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    const/4 v4, 0x0

    invoke-virtual {v10, v12, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    const/16 v4, 0x400

    new-array v4, v4, [B

    move/from16 v12, v16

    :goto_51
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    move-object/from16 v66, v7

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_51

    if-lez v7, :cond_3e

    .line 32
    sget v68, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    move-object/from16 v70, v3

    add-int/lit8 v3, v68, 0x1f

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    move-object/from16 v68, v2

    int-to-long v2, v12

    move-wide/from16 v71, v2

    const/4 v2, 0x0

    .line 33
    :try_start_7a
    invoke-virtual {v8, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_35

    cmp-long v2, v71, v2

    if-gez v2, :cond_3d

    .line 34
    sget v2, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    add-int/lit8 v2, v2, 0x37

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 35
    :try_start_7b
    filled-new-array {v4, v6, v14}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v11, v13, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_35

    neg-int v2, v7

    neg-int v2, v2

    or-int v3, v12, v2

    const/16 v23, 0x1

    shl-int/lit8 v3, v3, 0x1

    xor-int/2addr v2, v12

    sub-int v12, v3, v2

    move-object/from16 v7, v66

    move-object/from16 v2, v68

    move-object/from16 v3, v70

    goto :goto_51

    :catchall_35
    move-exception v0

    move-object v2, v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    move-object/from16 v10, v68

    :goto_52
    move-object/from16 v65, v70

    :goto_53
    const/16 v33, 0x165

    :goto_54
    const/16 v41, 0x15

    goto/16 :goto_6e

    :cond_3d
    :goto_55
    const/4 v11, 0x0

    goto :goto_56

    :cond_3e
    move-object/from16 v68, v2

    move-object/from16 v70, v3

    goto :goto_55

    :goto_56
    :try_start_7c
    invoke-virtual {v1, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_4f

    :try_start_7d
    invoke-virtual {v10, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7d
    .catch Ljava/lang/Exception; {:try_start_7d .. :try_end_7d} :catch_13
    .catchall {:try_start_7d .. :try_end_7d} :catchall_35

    :catch_13
    :try_start_7e
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v2, 0x23

    aget-byte v2, v1, v2

    int-to-byte v2, v2

    aget-byte v3, v1, v29

    int-to-byte v3, v3

    const/16 v4, 0x346

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v44

    int-to-byte v3, v3

    const/16 v4, 0x369

    const/16 v13, 0x49

    invoke-static {v3, v13, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v1, v28

    int-to-byte v5, v5

    const/16 v7, 0x37b

    invoke-static {v5, v13, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v3, v5}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_4f

    :try_start_7f
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v1, v44

    int-to-byte v3, v3

    const/16 v13, 0x49

    invoke-static {v3, v13, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v4, v1, v20

    int-to-byte v4, v4

    const/16 v5, 0x38f

    const/16 v7, 0x56

    invoke-static {v4, v7, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    filled-new-array/range {v62 .. v62}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_50

    :try_start_80
    filled-new-array {v0, v9}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_4f

    const/16 v2, 0xd

    :try_start_81
    aget-byte v2, v1, v2

    int-to-byte v2, v2

    aget-byte v3, v1, v29

    int-to-byte v3, v3

    const/16 v4, 0x392

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v16

    int-to-byte v3, v3

    const/16 v4, 0x45d

    aget-byte v4, v1, v4

    int-to-byte v4, v4

    const/16 v5, 0x3b1

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v13, 0x1

    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aget-byte v5, v1, v38

    int-to-byte v5, v5

    const/16 v7, 0x3b8

    const/16 v8, 0x4d

    invoke-static {v5, v8, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v7, 0x145

    aget-byte v7, v1, v7

    int-to-byte v7, v7

    const/16 v10, 0x3cf

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v8, Ljava/util/ArrayList;

    check-cast v7, Ljava/util/List;

    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_81 .. :try_end_81} :catch_18
    .catchall {:try_start_81 .. :try_end_81} :catchall_49

    const/16 v10, 0xb0

    :try_start_82
    aget-byte v10, v1, v10

    int-to-byte v10, v10

    aget-byte v1, v1, v21

    int-to-byte v1, v1

    or-int/lit16 v11, v1, 0x3a1

    int-to-short v11, v11

    invoke-static {v10, v1, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_48

    move-object/from16 v10, v68

    const/4 v11, 0x0

    :try_start_83
    invoke-virtual {v10, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_47

    :try_start_84
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v1, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_84
    .catch Ljava/lang/Exception; {:try_start_84 .. :try_end_84} :catch_14
    .catchall {:try_start_84 .. :try_end_84} :catchall_46

    move/from16 v11, v16

    :goto_57
    if-ge v11, v7, :cond_3f

    :try_start_85
    invoke-static {v3, v11}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v1, v11, v12}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_85} :catch_14
    .catchall {:try_start_85 .. :try_end_85} :catchall_36

    add-int/lit8 v11, v11, 0x1

    goto :goto_57

    :catchall_36
    move-exception v0

    move-object v2, v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    goto/16 :goto_52

    :catch_14
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    :goto_58
    move-object/from16 v65, v70

    const/16 v33, 0x165

    goto/16 :goto_66

    :cond_3f
    :try_start_86
    invoke-virtual {v5, v2, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_86
    .catch Ljava/lang/Exception; {:try_start_86 .. :try_end_86} :catch_14
    .catchall {:try_start_86 .. :try_end_86} :catchall_46

    :try_start_87
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_46

    if-nez v1, :cond_40

    :try_start_88
    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;
    :try_end_88
    .catchall {:try_start_88 .. :try_end_88} :catchall_36

    :cond_40
    move-object v1, v0

    :goto_59
    if-eqz v45, :cond_43

    .line 36
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    xor-int/lit8 v2, v0, 0x37

    and-int/lit8 v0, v0, 0x37

    const/16 v23, 0x1

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 37
    :try_start_89
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v2, v0, v28

    int-to-byte v2, v2

    aget-byte v3, v0, v29

    int-to-byte v3, v3

    const/16 v4, 0x295

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v16

    const/16 v23, 0x1

    add-int/lit8 v3, v3, -0x1

    int-to-byte v3, v3

    const/16 v4, 0x46c

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    sget v5, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    xor-int/lit16 v7, v5, 0x38a

    and-int/lit16 v5, v5, 0x38a

    or-int/2addr v5, v7

    int-to-short v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    aget-byte v4, v0, v28

    int-to-byte v4, v4

    const/16 v5, 0x37b

    const/16 v13, 0x49

    invoke-static {v4, v13, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v15, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_89
    .catchall {:try_start_89 .. :try_end_89} :catchall_3a

    :try_start_8a
    aget-byte v4, v0, v31

    int-to-byte v4, v4

    aget-byte v5, v0, v21

    int-to-byte v5, v5

    const/16 v7, 0x2c2

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    invoke-virtual {v10, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_8a
    .catchall {:try_start_8a .. :try_end_8a} :catchall_39

    move-object/from16 v5, v70

    :try_start_8b
    invoke-virtual {v4, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_38

    move-object/from16 v7, v63

    :try_start_8c
    filled-new-array {v7, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_37

    if-eqz v3, :cond_41

    .line 38
    sget v4, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    and-int/lit8 v7, v4, 0x75

    or-int/lit8 v4, v4, 0x75

    add-int/2addr v7, v4

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    const/16 v41, 0x15

    .line 39
    :try_start_8d
    aget-byte v4, v0, v41

    neg-int v4, v4

    int-to-byte v4, v4

    aget-byte v0, v0, v24

    int-to-byte v0, v0

    const/16 v13, 0x15d

    invoke-static {v4, v0, v13}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-virtual {v2, v0, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5b

    :catchall_37
    move-exception v0

    :goto_5a
    move-object v2, v0

    move-object/from16 v65, v5

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    goto/16 :goto_53

    :cond_41
    :goto_5b
    move-object v0, v3

    move/from16 v4, v19

    goto/16 :goto_5d

    :catchall_38
    move-exception v0

    goto :goto_5c

    :catchall_39
    move-exception v0

    move-object/from16 v5, v70

    :goto_5c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_42

    throw v1

    :cond_42
    throw v0
    :try_end_8d
    .catchall {:try_start_8d .. :try_end_8d} :catchall_37

    :catchall_3a
    move-exception v0

    move-object/from16 v5, v70

    goto :goto_5a

    :cond_43
    move-object/from16 v7, v63

    move-object/from16 v5, v70

    :try_start_8e
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v2, v0, v28

    int-to-byte v2, v2

    const/16 v3, 0x37b

    const/16 v13, 0x49

    invoke-static {v2, v13, v3}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v16

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v4, v8

    mul-int/lit16 v8, v3, -0x10f

    const/16 v9, -0x111

    and-int v11, v9, v8

    or-int/2addr v8, v9

    add-int/2addr v11, v8

    not-int v8, v3

    not-int v9, v4

    xor-int v12, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v12

    not-int v8, v8

    const/16 v43, -0x1

    xor-int v9, v43, v3

    or-int/2addr v9, v3

    xor-int v12, v9, v4

    and-int/2addr v9, v4

    or-int/2addr v9, v12

    not-int v9, v9

    xor-int v12, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v12

    mul-int/lit16 v8, v8, -0x110

    add-int/2addr v8, v11

    not-int v9, v3

    not-int v11, v4

    xor-int v12, v9, v11

    and-int/2addr v9, v11

    or-int/2addr v9, v12

    mul-int/lit16 v9, v9, -0x110

    or-int v11, v8, v9

    const/16 v23, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/2addr v8, v9

    sub-int/2addr v11, v8

    const/16 v43, -0x1

    xor-int v8, v43, v4

    or-int/2addr v4, v8

    not-int v4, v4

    xor-int v8, v3, v4

    and-int/2addr v3, v4

    or-int/2addr v3, v8

    move/from16 v4, v19

    mul-int/2addr v3, v4

    and-int v8, v11, v3

    or-int/2addr v3, v11

    add-int/2addr v8, v3

    int-to-byte v3, v8

    const/16 v8, 0x46c

    aget-byte v0, v0, v8

    int-to-byte v0, v0

    sget v8, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    or-int/lit16 v8, v8, 0x38a

    int-to-short v8, v8

    invoke-static {v3, v0, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v15}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_8e
    .catchall {:try_start_8e .. :try_end_8e} :catchall_44

    const/4 v13, 0x1

    :try_start_8f
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_8f .. :try_end_8f} :catch_15
    .catchall {:try_start_8f .. :try_end_8f} :catchall_37

    goto :goto_5d

    :catch_15
    move-exception v0

    :try_start_90
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_90
    .catch Ljava/lang/ClassNotFoundException; {:try_start_90 .. :try_end_90} :catch_16
    .catchall {:try_start_90 .. :try_end_90} :catchall_37

    :catch_16
    const/4 v0, 0x0

    :goto_5d
    if-eqz v0, :cond_48

    .line 40
    sget v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    or-int/lit8 v3, v2, 0x45

    const/16 v23, 0x1

    shl-int/lit8 v3, v3, 0x1

    xor-int/lit8 v2, v2, 0x45

    sub-int/2addr v3, v2

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 41
    :try_start_91
    move-object v9, v0

    check-cast v9, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v2, v0, v22

    int-to-byte v2, v2

    aget-byte v3, v0, v24

    int-to-byte v3, v3

    const/16 v7, 0x402

    invoke-static {v2, v3, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/Object;

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v7}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v7, v45, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    filled-new-array {v1, v7}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    const/16 v1, 0xda1

    new-array v7, v1, [B

    const/16 v1, 0x21

    aget-byte v1, v0, v1
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_44

    int-to-byte v1, v1

    const/16 v33, 0x165

    :try_start_92
    aget-byte v3, v0, v33

    int-to-byte v3, v3

    const/16 v8, 0x422

    invoke-static {v1, v3, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_43

    move-object/from16 v13, v59

    :try_start_93
    invoke-virtual {v13, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_42

    :try_start_94
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0x11b

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v8, 0x1b0

    const/16 v11, 0x49

    invoke-static {v3, v11, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v8, v0, v44

    int-to-byte v8, v8

    const/16 v12, 0x1ca

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_41

    :try_start_95
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    aget-byte v3, v0, v17
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_40

    move-object/from16 v65, v5

    :try_start_96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    long-to-int v4, v4

    mul-int/lit16 v5, v3, 0x209

    not-int v5, v5

    rsub-int v5, v5, 0x206

    not-int v8, v3

    not-int v12, v4

    xor-int v14, v8, v12

    and-int/2addr v8, v12

    or-int/2addr v8, v14

    not-int v8, v8

    xor-int v14, v3, v4

    and-int v59, v3, v4

    or-int v14, v14, v59

    not-int v14, v14

    xor-int v59, v8, v14

    and-int/2addr v8, v14

    or-int v8, v59, v8

    mul-int/lit16 v8, v8, 0x208

    neg-int v8, v8

    neg-int v8, v8

    or-int v14, v5, v8

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v5, v8

    sub-int/2addr v14, v5

    not-int v3, v3

    not-int v5, v4

    xor-int v8, v3, v5

    and-int/2addr v5, v3

    or-int/2addr v5, v8

    not-int v5, v5

    mul-int/lit16 v5, v5, -0x410

    or-int v8, v14, v5

    const/16 v23, 0x1

    shl-int/lit8 v8, v8, 0x1

    xor-int/2addr v5, v14

    sub-int/2addr v8, v5

    not-int v5, v12

    xor-int/lit8 v12, v3, -0x1

    or-int/2addr v3, v12

    not-int v3, v3

    xor-int v12, v5, v3

    and-int/2addr v3, v5

    or-int/2addr v3, v12

    const/16 v43, -0x1

    xor-int v5, v43, v4

    or-int/2addr v4, v5

    not-int v4, v4

    xor-int v5, v3, v4

    and-int/2addr v3, v4

    or-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x208

    or-int v4, v8, v3

    const/16 v23, 0x1

    shl-int/lit8 v4, v4, 0x1

    xor-int/2addr v3, v8

    sub-int/2addr v4, v3

    int-to-byte v3, v4

    const/16 v4, 0x1dc

    const/16 v5, 0x49

    invoke-static {v3, v5, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v8, v0, v44

    int-to-byte v8, v8

    const/16 v11, 0x1ca

    invoke-static {v8, v5, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_3f

    :try_start_97
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v5, v0, v17

    const/16 v23, 0x1

    add-int/lit8 v5, v5, -0x1

    int-to-byte v5, v5

    const/16 v11, 0x49

    invoke-static {v5, v11, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v0, v16

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit16 v12, v8, 0x1a5

    neg-int v12, v12

    neg-int v12, v12

    const/16 v14, 0x1a3

    and-int v59, v14, v12

    or-int/2addr v12, v14

    add-int v59, v59, v12

    xor-int v12, v8, v11

    and-int v14, v8, v11

    or-int/2addr v12, v14

    not-int v12, v12

    mul-int/lit16 v12, v12, 0x1a4

    add-int v12, v12, v59

    mul-int/lit16 v14, v8, -0x1a4

    not-int v14, v14

    sub-int/2addr v12, v14

    const/16 v23, 0x1

    add-int/lit8 v12, v12, -0x1

    not-int v14, v8

    not-int v14, v14

    not-int v11, v11

    xor-int v59, v11, v8

    and-int/2addr v8, v11

    or-int v8, v59, v8

    not-int v8, v8

    or-int/2addr v8, v14

    mul-int/lit16 v8, v8, 0x1a4

    neg-int v8, v8

    neg-int v8, v8

    not-int v8, v8

    sub-int/2addr v12, v8

    const/16 v23, 0x1

    add-int/lit8 v12, v12, -0x1

    int-to-byte v8, v12

    sget v11, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    xor-int/lit16 v12, v11, 0x182

    and-int/lit16 v11, v11, 0x182

    or-int/2addr v11, v12

    int-to-short v11, v11

    const/16 v12, 0x51

    invoke-static {v8, v12, v11}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    filled-new-array/range {v62 .. v62}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v5, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_3e

    .line 42
    sget v3, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    add-int/lit8 v3, v3, 0x35

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 43
    :try_start_98
    aget-byte v3, v0, v17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11
    :try_end_98
    .catchall {:try_start_98 .. :try_end_98} :catchall_3d

    long-to-int v5, v11

    mul-int/lit16 v8, v3, 0x197

    neg-int v8, v8

    neg-int v8, v8

    const/16 v11, 0x195

    and-int v12, v11, v8

    or-int/2addr v8, v11

    add-int/2addr v12, v8

    not-int v8, v3

    xor-int v11, v8, v5

    and-int/2addr v8, v5

    or-int/2addr v8, v11

    not-int v8, v8

    not-int v11, v5

    xor-int/lit8 v14, v11, -0x1

    or-int/2addr v14, v11

    xor-int v59, v14, v3

    and-int/2addr v14, v3

    or-int v14, v59, v14

    not-int v14, v14

    or-int/2addr v8, v14

    mul-int/lit16 v8, v8, -0x196

    add-int/2addr v8, v12

    not-int v12, v3

    xor-int v14, v12, v11

    and-int/2addr v12, v11

    or-int/2addr v12, v14

    xor-int/lit8 v14, v12, -0x1

    or-int/2addr v12, v14

    not-int v12, v12

    mul-int/lit16 v12, v12, -0x196

    neg-int v12, v12

    neg-int v12, v12

    or-int v14, v8, v12

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v8, v12

    sub-int/2addr v14, v8

    not-int v5, v5

    or-int/2addr v3, v11

    not-int v3, v3

    or-int/2addr v3, v5

    move/from16 v5, v20

    mul-int/2addr v3, v5

    or-int v8, v14, v3

    shl-int/lit8 v8, v8, 0x1

    xor-int/2addr v3, v14

    sub-int/2addr v8, v3

    int-to-byte v3, v8

    const/16 v11, 0x49

    :try_start_99
    invoke-static {v3, v11, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v41, 0x15

    aget-byte v4, v0, v41

    neg-int v4, v4

    int-to-byte v4, v4

    aget-byte v0, v0, v24

    int-to-byte v0, v0

    const/16 v8, 0x15d

    invoke-static {v4, v0, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-virtual {v3, v0, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_99
    .catchall {:try_start_99 .. :try_end_99} :catchall_3c

    :try_start_9a
    invoke-static/range {v61 .. v61}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0xd7e

    move/from16 v20, v5

    move-object v3, v10

    move-object v8, v13

    move-object/from16 v11, v46

    move-object/from16 v4, v62

    move/from16 v12, v69

    const/16 v19, 0x110

    const/16 v35, 0x4

    const/16 v36, 0x6

    const/16 v43, -0x1

    move v5, v0

    move v0, v1

    move-object v10, v2

    move-object/from16 v2, v64

    move-object/from16 v1, v65

    goto/16 :goto_30

    :catchall_3b
    move-exception v0

    :goto_5e
    move-object v2, v0

    move-object/from16 v1, v64

    goto/16 :goto_54

    :catchall_3c
    move-exception v0

    goto :goto_5f

    :catchall_3d
    move-exception v0

    move/from16 v5, v20

    :goto_5f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_44

    throw v1

    :cond_44
    throw v0

    :catchall_3e
    move-exception v0

    move/from16 v5, v20

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0

    :catchall_3f
    move-exception v0

    :goto_60
    move/from16 v5, v20

    goto :goto_61

    :catchall_40
    move-exception v0

    move-object/from16 v65, v5

    goto :goto_60

    :goto_61
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_46

    throw v1

    :cond_46
    throw v0

    :catchall_41
    move-exception v0

    move-object/from16 v65, v5

    move/from16 v5, v20

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_47

    throw v1

    :cond_47
    throw v0

    :catchall_42
    move-exception v0

    move-object/from16 v65, v5

    move/from16 v5, v20

    goto :goto_5e

    :catchall_43
    move-exception v0

    move-object/from16 v65, v5

    move/from16 v5, v20

    move-object/from16 v13, v59

    goto :goto_5e

    :catchall_44
    move-exception v0

    move-object/from16 v65, v5

    move/from16 v5, v20

    move-object/from16 v13, v59

    :goto_62
    const/16 v33, 0x165

    goto :goto_5e

    :cond_48
    move-object/from16 v65, v5

    move/from16 v5, v20

    move-object/from16 v13, v59

    const/16 v33, 0x165

    const-class v0, Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v2}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v9, v60

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v2, v45, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_3b

    :try_start_9b
    invoke-virtual {v13}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9b
    .catchall {:try_start_9b .. :try_end_9b} :catchall_45

    .line 44
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    move-object/from16 v1, v64

    move/from16 v3, v69

    const/4 v2, 0x7

    const/4 v7, 0x2

    const/4 v9, 0x1

    const/16 v13, 0x49

    const/16 v23, 0x1

    const/16 v34, 0x0

    const/16 v41, 0x15

    goto/16 :goto_74

    :catchall_45
    move-exception v0

    move-object/from16 v1, v64

    goto/16 :goto_23

    :catchall_46
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    :goto_63
    move-object/from16 v65, v70

    goto :goto_62

    :catchall_47
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    :goto_64
    move-object/from16 v65, v70

    const/16 v33, 0x165

    goto :goto_65

    :catchall_48
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v10, v68

    goto :goto_64

    .line 45
    :goto_65
    :try_start_9c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_49

    throw v1

    :catch_17
    move-exception v0

    goto :goto_66

    :cond_49
    throw v0
    :try_end_9c
    .catch Ljava/lang/Exception; {:try_start_9c .. :try_end_9c} :catch_17
    .catchall {:try_start_9c .. :try_end_9c} :catchall_3b

    :catchall_49
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v10, v68

    goto :goto_63

    :catch_18
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v10, v68

    goto/16 :goto_58

    :goto_66
    :try_start_9d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_4e

    const/16 v41, 0x15

    :try_start_9e
    aget-byte v3, v2, v41

    neg-int v3, v3

    int-to-byte v3, v3

    aget-byte v4, v2, v27

    int-to-byte v4, v4

    xor-int/lit16 v7, v4, 0x3d2

    and-int/lit16 v8, v4, 0x3d2

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {v3, v4, v7}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v3, v2, v48

    int-to-byte v3, v3

    aget-byte v4, v2, v47

    int-to-byte v4, v4

    const/16 v8, 0x124

    invoke-static {v3, v4, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_4d

    const/4 v7, 0x2

    :try_start_9f
    new-array v3, v7, [Ljava/lang/Object;

    const/16 v23, 0x1

    aput-object v0, v3, v23

    aput-object v1, v3, v16

    aget-byte v0, v2, v44

    int-to-byte v0, v0

    const/16 v8, 0x124

    const/16 v9, 0x49

    invoke-static {v0, v9, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_4b

    move-object/from16 v1, v64

    :try_start_a0
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_4a

    :catchall_4a
    move-exception v0

    goto :goto_67

    :catchall_4b
    move-exception v0

    move-object/from16 v1, v64

    :goto_67
    :try_start_a1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4a

    throw v2

    :catchall_4c
    move-exception v0

    goto/16 :goto_35

    :cond_4a
    throw v0

    :catchall_4d
    move-exception v0

    move-object/from16 v1, v64

    goto/16 :goto_35

    :catchall_4e
    move-exception v0

    move-object/from16 v1, v64

    goto/16 :goto_34

    :catchall_4f
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    move-object/from16 v10, v68

    move-object/from16 v65, v70

    goto/16 :goto_39

    :catchall_50
    move-exception v0

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    move-object/from16 v10, v68

    move-object/from16 v65, v70

    const/16 v33, 0x165

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4b

    throw v2

    :cond_4b
    throw v0

    :catchall_51
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    goto/16 :goto_45

    :catchall_52
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    move-object/from16 v1, v64

    :goto_68
    const/16 v33, 0x165

    goto/16 :goto_35

    :catchall_53
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    goto :goto_68

    :catchall_54
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    const/16 v33, 0x165

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4c

    throw v2

    :cond_4c
    throw v0

    :catchall_55
    move-exception v0

    move-object v10, v2

    move-object/from16 v65, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    const/16 v33, 0x165

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :cond_4d
    throw v0

    :catchall_56
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    move-object/from16 v13, v59

    :goto_69
    const/16 v33, 0x165

    const/16 v41, 0x15

    goto :goto_6a

    :catchall_57
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move/from16 v5, v20

    goto :goto_69

    .line 46
    :goto_6a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v0

    :catchall_58
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    goto/16 :goto_38

    :catchall_59
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v32, 0x3

    goto/16 :goto_33

    :catchall_5a
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v32, 0x3

    :goto_6b
    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    goto :goto_6c

    :catchall_5b
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move/from16 v32, v11

    move/from16 v69, v12

    move/from16 v5, v20

    goto :goto_6b

    :goto_6c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4f

    throw v2

    :cond_4f
    throw v0

    :catchall_5c
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    goto/16 :goto_32

    :catchall_5d
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    goto :goto_6d

    :catchall_5e
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    :goto_6d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_50

    throw v2

    :cond_50
    throw v0

    :catchall_5f
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_51

    throw v2

    :cond_51
    throw v0

    :catchall_60
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_52

    throw v2

    :cond_52
    throw v0

    :catchall_61
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object v13, v8

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_53

    throw v2

    :cond_53
    throw v0
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_4c

    :goto_6e
    :try_start_a2
    invoke-virtual {v13}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a2
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_62

    goto :goto_6f

    :catchall_62
    move-exception v0

    :try_start_a3
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6f
    throw v2

    :catchall_63
    move-exception v0

    goto/16 :goto_70

    :catchall_64
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    goto/16 :goto_22

    :catchall_65
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move/from16 v39, v9

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    goto/16 :goto_23

    :catchall_66
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_54

    throw v2

    :cond_54
    throw v0

    :catchall_67
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move-object/from16 v46, v11

    move/from16 v69, v12

    move/from16 v5, v20

    const/16 v33, 0x165

    const/16 v39, 0x5

    const/16 v41, 0x15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_55

    throw v2

    :cond_55
    throw v0
    :try_end_a3
    .catchall {:try_start_a3 .. :try_end_a3} :catchall_63

    :catchall_68
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v62, v4

    move/from16 v33, v8

    goto/16 :goto_21

    :catchall_69
    move-exception v0

    move-object/from16 v65, v1

    move-object v1, v2

    move-object/from16 v62, v4

    move/from16 v50, v5

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    goto/16 :goto_18

    .line 47
    :goto_70
    :try_start_a4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2
    :try_end_a4
    .catch Ljava/lang/Exception; {:try_start_a4 .. :try_end_a4} :catch_19

    long-to-int v2, v2

    move/from16 v3, v69

    mul-int/lit16 v12, v3, -0x2a3

    const/16 v4, 0x2a5

    or-int v7, v4, v12

    const/16 v23, 0x1

    shl-int/lit8 v7, v7, 0x1

    xor-int/2addr v4, v12

    sub-int/2addr v7, v4

    xor-int/lit8 v4, v2, 0x1

    and-int/lit8 v8, v2, 0x1

    or-int/2addr v4, v8

    not-int v8, v3

    xor-int v9, v4, v8

    and-int/2addr v4, v8

    or-int/2addr v4, v9

    mul-int/lit16 v4, v4, -0x2a4

    add-int/2addr v4, v7

    xor-int/lit8 v7, v8, 0x1

    const/16 v23, 0x1

    and-int/lit8 v8, v8, 0x1

    or-int/2addr v7, v8

    not-int v7, v7

    not-int v8, v2

    xor-int/lit8 v9, v8, 0x1

    and-int/lit8 v8, v8, 0x1

    or-int/2addr v8, v9

    not-int v8, v8

    or-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x2a4

    or-int v8, v4, v7

    shl-int/lit8 v8, v8, 0x1

    xor-int/2addr v4, v7

    sub-int/2addr v8, v4

    not-int v4, v3

    xor-int v7, v42, v4

    and-int v9, v42, v4

    or-int/2addr v7, v9

    not-int v7, v7

    not-int v9, v2

    xor-int v11, v4, v9

    and-int/2addr v4, v9

    or-int/2addr v4, v11

    not-int v4, v4

    xor-int v9, v7, v4

    and-int/2addr v4, v7

    or-int/2addr v4, v9

    xor-int/lit8 v7, v3, 0x1

    and-int/lit8 v9, v3, 0x1

    or-int/2addr v7, v9

    xor-int v9, v7, v2

    and-int/2addr v2, v7

    or-int/2addr v2, v9

    not-int v2, v2

    xor-int v7, v4, v2

    and-int/2addr v2, v4

    or-int/2addr v2, v7

    mul-int/lit16 v2, v2, 0x2a4

    xor-int v4, v8, v2

    and-int/2addr v2, v8

    const/16 v23, 0x1

    shl-int/lit8 v2, v2, 0x1

    add-int/2addr v4, v2

    const/4 v2, 0x7

    :goto_71
    if-ge v4, v2, :cond_57

    sget v7, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    or-int/lit8 v8, v7, 0x1f

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit8 v7, v7, 0x1f

    sub-int/2addr v8, v7

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    :try_start_a5
    aget-boolean v7, v49, v4

    if-eqz v7, :cond_56

    const/16 v34, 0x0

    sput-object v34, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    sput-object v34, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;
    :try_end_a5
    .catch Ljava/lang/Exception; {:try_start_a5 .. :try_end_a5} :catch_19

    const/4 v7, 0x2

    const/16 v23, 0x1

    :goto_72
    const/16 v13, 0x49

    goto/16 :goto_73

    :cond_56
    const/16 v34, 0x0

    or-int/lit8 v7, v4, 0x2b

    const/16 v23, 0x1

    shl-int/lit8 v7, v7, 0x1

    xor-int/lit8 v4, v4, 0x2b

    sub-int/2addr v7, v4

    xor-int/lit8 v4, v7, -0x2a

    and-int/lit8 v7, v7, -0x2a

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v4, v7

    const/16 v23, 0x1

    goto :goto_71

    :cond_57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :try_start_a6
    sget-object v2, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    aget-byte v3, v2, v17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    long-to-int v4, v4

    mul-int/lit16 v5, v3, -0x29b

    add-int/lit16 v5, v5, 0x537

    not-int v6, v3

    const/16 v43, -0x1

    xor-int v7, v43, v4

    or-int/2addr v7, v4

    not-int v7, v7

    xor-int v8, v6, v7

    and-int/2addr v6, v7

    or-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x29c

    xor-int v7, v5, v6

    and-int/2addr v5, v6

    const/16 v23, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v7, v5

    not-int v3, v3

    xor-int v5, v3, v4

    and-int/2addr v3, v4

    or-int/2addr v3, v5

    not-int v3, v3

    const/16 v43, -0x1

    xor-int v4, v43, v3

    or-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x538

    not-int v3, v3

    sub-int/2addr v7, v3

    add-int/lit16 v7, v7, -0x29d

    int-to-byte v3, v7

    aget-byte v4, v2, v27

    int-to-byte v4, v4

    const/16 v5, 0x452

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3
    :try_end_a6
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_a6} :catch_19

    const/4 v7, 0x2

    :try_start_a7
    new-array v4, v7, [Ljava/lang/Object;

    const/16 v23, 0x1

    aput-object v0, v4, v23

    aput-object v3, v4, v16

    aget-byte v0, v2, v44

    int-to-byte v0, v0

    const/16 v8, 0x124

    const/16 v13, 0x49

    invoke-static {v0, v13, v8}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v15, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a7
    .catchall {:try_start_a7 .. :try_end_a7} :catchall_6a

    :catchall_6a
    move-exception v0

    :try_start_a8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_58

    throw v1

    :cond_58
    throw v0
    :try_end_a8
    .catch Ljava/lang/Exception; {:try_start_a8 .. :try_end_a8} :catch_19

    :cond_59
    move-object/from16 v65, v1

    move-object v1, v2

    move-object/from16 v62, v4

    move/from16 v50, v5

    move-object/from16 v51, v7

    move-object/from16 v49, v8

    move/from16 v52, v9

    move-object/from16 v54, v10

    move-object/from16 v46, v11

    move-object/from16 v57, v14

    move/from16 v5, v20

    move/from16 v7, v40

    const/4 v2, 0x7

    const/16 v34, 0x0

    const/16 v39, 0x5

    const/16 v41, 0x15

    move-object v10, v3

    move v3, v12

    goto/16 :goto_72

    :goto_73
    move/from16 v9, v52

    :goto_74
    add-int/lit8 v12, v3, 0x1

    move-object v2, v1

    move/from16 v20, v5

    move/from16 v40, v7

    move-object v3, v10

    move-object/from16 v11, v46

    move-object/from16 v8, v49

    move/from16 v5, v50

    move-object/from16 v7, v51

    move-object/from16 v10, v54

    move-object/from16 v14, v57

    move-object/from16 v4, v62

    move-object/from16 v1, v65

    const/16 v19, 0x110

    const/16 v35, 0x4

    const/16 v36, 0x6

    goto/16 :goto_15

    :cond_5a
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    add-int/lit8 v0, v0, 0x7d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    return-void

    :catchall_6b
    move-exception v0

    :try_start_a9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5b

    throw v1

    :cond_5b
    throw v0

    :catchall_6c
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5c

    throw v1

    :cond_5c
    throw v0

    :catchall_6d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5d

    throw v1

    :cond_5d
    throw v0
    :try_end_a9
    .catch Ljava/lang/Exception; {:try_start_a9 .. :try_end_a9} :catch_19

    :catch_19
    move-exception v0

    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    return-void

    :catchall_6e
    move-exception v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5e

    throw v1

    :cond_5e
    throw v0

    :array_0
    .array-data 1
        0x26t
        0x60t
        0x6at
        -0x76t
        0x54t
        -0x58t
        -0x1at
        -0x77t
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

.method public static getCurrencyIso4217Code(I)I
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    div-int/lit8 v2, v2, 0x0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    .line 21
    .line 22
    :goto_0
    xor-int/lit8 v2, v0, 0x55

    .line 23
    .line 24
    and-int/lit8 v0, v0, 0x55

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    shl-int/2addr v0, v3

    .line 28
    add-int/2addr v2, v0

    .line 29
    rem-int/lit16 v2, v2, 0x80

    .line 30
    .line 31
    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 32
    .line 33
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 42
    .line 43
    const/16 v2, 0x1b

    .line 44
    .line 45
    aget-byte v2, v0, v2

    .line 46
    .line 47
    int-to-byte v2, v2

    .line 48
    const/16 v4, 0x52

    .line 49
    .line 50
    aget-byte v4, v0, v4

    .line 51
    .line 52
    int-to-byte v4, v4

    .line 53
    const/16 v5, 0x233

    .line 54
    .line 55
    invoke-static {v2, v4, v5}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v4, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/lang/ClassLoader;

    .line 62
    .line 63
    invoke-static {v2, v3, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/16 v3, 0x2ce

    .line 68
    .line 69
    aget-byte v3, v0, v3

    .line 70
    .line 71
    int-to-byte v3, v3

    .line 72
    const/16 v4, 0x1ab

    .line 73
    .line 74
    aget-byte v0, v0, v4

    .line 75
    .line 76
    int-to-byte v0, v0

    .line 77
    const/16 v4, 0x48f

    .line 78
    .line 79
    invoke-static {v3, v0, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x29

    .line 106
    .line 107
    rem-int/lit16 v0, v0, 0x80

    .line 108
    .line 109
    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 110
    .line 111
    return p0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    throw v0

    .line 120
    :cond_1
    throw p0
.end method

.method public static getCurrencyIso4217Code(Ljava/lang/Object;)I
    .locals 5

    .line 121
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    and-int/lit8 v1, v0, 0x3f

    or-int/lit8 v0, v0, 0x3f

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    const/16 v2, 0x2e

    div-int/lit8 v2, v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    :goto_0
    add-int/lit8 v0, v0, 0x33

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    const/16 v2, 0x1b

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    const/16 v3, 0x52

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0x233

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x1c4

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0x1ab

    aget-byte v0, v0, v4

    int-to-byte v0, v0

    sget v4, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    or-int/lit16 v4, v4, 0x40a

    int-to-short v4, v4

    invoke-static {v3, v0, v4}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

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

    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    add-int/lit8 v0, v0, 0x9

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p0
.end method

.method public static getMediationNetwork(CII)Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/internal/AFi1fSDK;->d:Ljava/lang/Object;

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x69

    .line 6
    .line 7
    or-int/lit8 v0, v0, 0x69

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    rem-int/lit16 v2, v2, 0x80

    .line 11
    .line 12
    sput v2, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 13
    .line 14
    and-int/lit8 v0, v2, 0x4f

    .line 15
    .line 16
    or-int/lit8 v2, v2, 0x4f

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 v2, 0x2

    .line 31
    aput-object p2, v0, v2

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

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
    sget-object p0, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 48
    .line 49
    const/16 p1, 0x1b

    .line 50
    .line 51
    aget-byte p1, p0, p1

    .line 52
    .line 53
    int-to-byte p1, p1

    .line 54
    const/16 v2, 0x52

    .line 55
    .line 56
    aget-byte v2, p0, v2

    .line 57
    .line 58
    int-to-byte v2, v2

    .line 59
    const/16 v3, 0x233

    .line 60
    .line 61
    invoke-static {p1, v2, v3}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object v2, Lcom/appsflyer/internal/AFi1fSDK;->e:Ljava/lang/Object;

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
    const/16 p2, 0x1fa

    .line 74
    .line 75
    aget-byte p2, p0, p2

    .line 76
    .line 77
    int-to-byte p2, p2

    .line 78
    const/16 v2, 0x1ab

    .line 79
    .line 80
    aget-byte p0, p0, v2

    .line 81
    .line 82
    int-to-byte p0, p0

    .line 83
    const/16 v2, 0x468

    .line 84
    .line 85
    invoke-static {p2, p0, v2}, Lcom/appsflyer/internal/AFi1fSDK;->$$c(IIS)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    filled-new-array {p2, v2, v2}, [Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p0, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    return-object p0

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_0

    .line 112
    .line 113
    throw p1

    .line 114
    :cond_0
    throw p0
.end method

.method private static getRevenue(II)V
    .locals 0

    .line 1
    sget p0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x31

    .line 4
    .line 5
    rem-int/lit16 p1, p0, 0x80

    .line 6
    .line 7
    sput p1, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 8
    .line 9
    rem-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    throw p0
.end method

.method public static init$0()V
    .locals 5

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1fSDK;->$11:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0xb

    .line 4
    .line 5
    or-int/lit8 v0, v0, 0xb

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    rem-int/lit16 v0, v1, 0x80

    .line 9
    .line 10
    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$10:I

    .line 11
    .line 12
    rem-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    const-string v0, "ISO-8859-1"

    .line 15
    .line 16
    const-string v2, ")\u009f5\u00bb\u00f3\n\u00f2\u0003\u0006\u00056\u00c7\u00f5\u0011\u00f1\u0008\u00ff\u0006\u00f0E\u00eb\u00d4\u0003\u00fd\u00fd\u00f6\u00f7\u0010\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00dd8\u00cf\u000f\u000f\u00f9\u00f8\u0000\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00de\u00ef\u000b\u00f3\r\u00f5\u00fb%\u00ec\u00f6\r\u0004\u00fd\u00ee\u0003\u0000\r\u00f7\u00fa3\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\u00f3\n\u00f2\u0003\u0006\u00056\u00cd\u00f1\u0000B\u00ed\u00d1\u0000)\u00db\u00fd\r\u0001\u00f5\u00f9\u0002\u00f1+\u00db\u0005\u00f5\u000b\u0008\u00f5+\u00d1\u0000\u0004\u0003\u0006\u0002\u00ed\u000b\u00fa\u0001\u0002\u00f1.\u00dd\u00fd\u0007\u00f2/\u00db\u00f7\u0002\u00f11\u00d4\u000b\u00ff\"\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\u0002\u00f11\u00e2\u00fe\u00fb\u0003!\u00db\u00f7\u00cb\u0003\u00ed\u00132\u00cb\u0003\u00ed\u00132\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\t\u00eb\u00153\u00c5\u00faA\u00ba\u0007\u00fd\u000c\u00fb\u00f7\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00db\u00da\u0006\u00ff\u000f\u00f8\u0002\u00f1$\u00de\u0003\u00ff\u000b\u00f3\u00fe\u00fb\u00f4\u000b\u00ff\u0006\u00fc\u0002\u00fe\u00fb\u0003\u00f3\n\u00f2\u0003\u0006\u00056\u00bf\u00fcE\u00ec\u00cd\u000c\u00fd\u0008@\u00ce\u0011\u00f3\u00ff\n\u00fa\u0001\u000f\u00f9\u00ec\u0016\u00fb\u00fa\u0002\u00f3\u0017\u00e5\t\u00f5\u000f\u0015\u00fa\u0016\u00f8\t\u00eb\u00153\u00c5\u00faA\u00e5\u00fa\n\u00cd\u0015\u00fe\u00f5\u00fc\u000b\u00fa\u0001\u00ee\u0003\u0000\r\u00f7\u00fa \u00eb\u00fc\u0008\u0018\u00e4\u00fd\u0000\u0003\u00f6\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007\u0016\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00f7\u00fd\u00fc\u000e\u0015\u00fd\u0013\u00f8\u00ce\u00ee\u0000\u000e\u00f1\u0001D\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00fd\u00fa\u0004\u0000\u00ff\u0003\u0002\u00f9\u00d6+\u00d01\u00d4\u00fb-\u0002\u00d46\u0002\u00f1\"\u00ed\u00f2\u0004\u00fa\u0003\u000f\u00fe\t\u00eb\u00153\u00c0\t\u00f1F\u00d9\u0003\u0006\u0002\u00f1$\u00ef\u00ed\u000c\t\u00eb\u00153\u00c5\u00faA\u00ec\u00cd\u000f\u0000\u0001\u00f3\r\u0001\u001b\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\t\u00eb\u00153\u00c5\u00faA\u00e5\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\t\u00eb\u00153\u00c5\u00faA\u00ea\u00e3\u00ed\u0013\u0018\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\r\u0004\u00fd\u001e\u00d1\t\u0000\u00f3\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e80\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3D\u00c5\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5>\u00ed\u00fb\u00db:\u00bf\u001f\u000f\u00f9\u00f4\u0002?\u00cd\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3D\u00c5\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5>\u00ed\u00fb\u00dd8\u00cf\u000f\u000f\u00f9\u00f8\u0000\u00fb\u0005\u00dd\u0012\u00ed\u00ef\u0011\u00f7\u00f9\u0010!\u00e3\u00ed\u0013\u0008\u0002\u00f9\r\u0004\u00fd\u000e\u00f1\"\u00ed\u0004\u00fd\u0015\u00e1\u0002\u00f3\u0015\u00fc\u0014\u00f8\u0005\t\u00f5\u000f\u0002\u00f1.\u0002\t\u00eb\u00153\u00c5\u00faA\u00e8\u00dd\u00fd\u0007!\u00df\u00f2\u0010\u00f1\t\u00f9\u00fc\u0005\u00fd\u00fa\u000b\u000b\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ea\u00df\u00ed2\u00dd\u00fd\u0007\u00fd\u000e\u00fd \u00df\u00ed\u0002\u00f13\u00df\u00ef\u0004\u0003\u00f7\u0001\u000f\u0015\u00ef\u00ed\u000c\u00ff\u00f9\u0007\u00f1\u000f\u0002\u00f11\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\t\u00eb\u00153\u00b9\u0001\u000b\u00fd>\u00b4\u0011\u00f9B\u00d4\u00f1\u00f9\'\u00db\u00fe\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0002\u00f1&\u00e9\u00ed\u0004/\u00d7\u00fa\u0002\u00f9\t\u00eb\u00153\u00b9\u0001\u000b\u00fd>\u00b4\u0011\u00f9B\u00d4\u00f1\u00f9+\u00d7\u00fa\u0002\u00f9\u0002\u00f1!\u00ea\u00ef\u0015\t\u00eb\u00153\u00c5\u00faA\u00ec\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8*\u00da\u0001\u0004\u00fb\u0001!\u00df\u0002\r\u0004\u00f4\u0005-\u00c9\u0005\u000f$\u00cf\u0000\u0011\u00e8\t\u00eb\u00153\u00c5\u00faA\u00eb\u00d7\u00fd\u00fc\u000e\u0004\u00ff\u00f6\u0007\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00e5\u00db!\u00e8\u00f8\u00fe\u00fd\u00f95\u00df\u00ed5\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\t\u00eb\u00153\u00c0\u0005\u00faA\u00ec\u00c9\u0005\u000f#\u00cd\u000f\u0000\u0001\u00f3\t\u00eb\u00153\u00c2\u000b\u00f3\u00079\u00eb\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\u0005\u0011\u00f1\u0003\u00f5\u00f6\r\u00fe=\u00bb\u00fa\u0006\u00ff\u000f\u00f8?\u00ec\u00e1\u00ee\u000e!\u00df\u00ed5\u00d7\u000b\u00ee\u0000\'\u00dd\u000e\u00fd\u00ff\u00f3\u000f\u00ed\u000c\u001c\u00e3\u00f6\u00ff\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f95\u00db\u00f7\r\u0002\u00ef\u0005\u00fd\t\u0004\u00f2\r\u00ed\u000b\u00f3\u0011\u0019\u00e3\u0007\u00f0\u0011\u00ef\u00f9)\u00ef\u00ed\u000c#\u00d9\u0007\u00f8\u0008\u00f7\u00fa\u0001\u0002\u00f11\u00d4\u0002\u00fd\u0001\u0001\t\u00f7\u00fa \u00db\t\u000b\u0015\u00f8\u0018\u00f8\u00fd\u000e\u00fd!\u00d7\u000b\u00ee\u0000\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00ee\u00fb\u00dd8\u00cb\u0013\u000f\u00f9\'\u00ad\u00ce\u00ee\u0000\u000e\u00f1\u0001D\u00cc\u00f4\u0002>\u00ce\u00f1\u0000\u00fd\r\u00fa\u00f3\u0014\u00f3C\u00c6\u00fb\u00fa\u000f\u00f3\u0004\r\u00f5=\u00cb3\u00cf\u0000/\u00fa\u0005\u00d2\u0001)\u00ff\u0008\u00fe\u00fb\u00d24\u00ce7\u0015\u00f9\u0017\u00f8\u00ba\u00ffO\u00ba\u0005\u00f5\u0000\n\u0001\u00fe\u00f8\u00f8S\u00b4\u0007\u00ff\u00f2K\u0002\u00f1\'\u00e8\u0001\u00fb\u0008\u00ed\u000b\u00fa\u0001 \u00e9\u00f1\u00fd\u0008\u00fd\u0007\u0002\u00f11\u00ce\u0003\u0000\r\u00f7\u000b\u00ea0\u00d6\u0004;\u0002\u0001\u00fa\u00f4\u00d4\u000b\u00ff\u0002\u00f1\"\u00ed\u00ef\u0011\u00f7\u00f9\u0010"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/16 v4, 0x49d

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-array v1, v4, [B

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 33
    .line 34
    const/16 v0, 0x45

    .line 35
    .line 36
    :goto_0
    sput v0, Lcom/appsflyer/internal/AFi1fSDK;->$$b:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-array v1, v4, [B

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    sput-object v1, Lcom/appsflyer/internal/AFi1fSDK;->$$a:[B

    .line 49
    .line 50
    const/16 v0, 0x70

    .line 51
    .line 52
    goto :goto_0
.end method
