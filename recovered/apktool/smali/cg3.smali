.class public final synthetic Lcg3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lte3;
.implements Lvb0;


# static fields
.field public static final synthetic U:Lcg3;

.field public static final synthetic V:Lcg3;

.field public static final synthetic W:Lcg3;

.field public static final synthetic X:Lcg3;

.field public static final synthetic b:Lcg3;

.field public static final synthetic c:Lcg3;

.field public static final synthetic d:Lcg3;

.field public static final synthetic e:Lcg3;

.field public static final synthetic f:Lcg3;

.field public static final synthetic i:Lcg3;

.field public static final synthetic v:Lcg3;

.field public static final synthetic w:Lcg3;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcg3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcg3;->b:Lcg3;

    .line 8
    .line 9
    new-instance v0, Lcg3;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcg3;->c:Lcg3;

    .line 16
    .line 17
    new-instance v0, Lcg3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcg3;->d:Lcg3;

    .line 24
    .line 25
    new-instance v0, Lcg3;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcg3;->e:Lcg3;

    .line 32
    .line 33
    new-instance v0, Lcg3;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcg3;->f:Lcg3;

    .line 40
    .line 41
    new-instance v0, Lcg3;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcg3;->i:Lcg3;

    .line 48
    .line 49
    new-instance v0, Lcg3;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcg3;->v:Lcg3;

    .line 56
    .line 57
    new-instance v0, Lcg3;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcg3;->w:Lcg3;

    .line 64
    .line 65
    new-instance v0, Lcg3;

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lcg3;->U:Lcg3;

    .line 73
    .line 74
    new-instance v0, Lcg3;

    .line 75
    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lcg3;->V:Lcg3;

    .line 82
    .line 83
    new-instance v0, Lcg3;

    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcg3;->W:Lcg3;

    .line 91
    .line 92
    new-instance v0, Lcg3;

    .line 93
    .line 94
    const/16 v1, 0xb

    .line 95
    .line 96
    invoke-direct {v0, v1}, Lcg3;-><init>(I)V

    .line 97
    .line 98
    .line 99
    sput-object v0, Lcg3;->X:Lcg3;

    .line 100
    .line 101
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcg3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a([BII)Z
    .locals 8

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-lt p1, p2, :cond_1

    .line 12
    .line 13
    :goto_1
    move v2, v0

    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_1
    :goto_2
    if-lt p1, p2, :cond_2

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_2
    add-int/lit8 v1, p1, 0x1

    .line 20
    .line 21
    aget-byte v2, p0, p1

    .line 22
    .line 23
    if-gez v2, :cond_c

    .line 24
    .line 25
    const/16 v3, -0x20

    .line 26
    .line 27
    const/16 v4, -0x41

    .line 28
    .line 29
    const/4 v5, -0x1

    .line 30
    if-ge v2, v3, :cond_5

    .line 31
    .line 32
    if-lt v1, p2, :cond_3

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_3
    const/16 v3, -0x3e

    .line 36
    .line 37
    if-lt v2, v3, :cond_4

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    aget-byte v1, p0, v1

    .line 42
    .line 43
    if-le v1, v4, :cond_1

    .line 44
    .line 45
    :cond_4
    :goto_3
    move v2, v5

    .line 46
    goto :goto_4

    .line 47
    :cond_5
    const/16 v6, -0x10

    .line 48
    .line 49
    if-ge v2, v6, :cond_9

    .line 50
    .line 51
    add-int/lit8 v6, p2, -0x1

    .line 52
    .line 53
    if-lt v1, v6, :cond_6

    .line 54
    .line 55
    invoke-static {p0, v1, p2}, Lzq3;->c([BII)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    goto :goto_4

    .line 60
    :cond_6
    add-int/lit8 v6, p1, 0x2

    .line 61
    .line 62
    aget-byte v1, p0, v1

    .line 63
    .line 64
    if-gt v1, v4, :cond_4

    .line 65
    .line 66
    const/16 v7, -0x60

    .line 67
    .line 68
    if-ne v2, v3, :cond_7

    .line 69
    .line 70
    if-lt v1, v7, :cond_4

    .line 71
    .line 72
    :cond_7
    const/16 v3, -0x13

    .line 73
    .line 74
    if-ne v2, v3, :cond_8

    .line 75
    .line 76
    if-ge v1, v7, :cond_4

    .line 77
    .line 78
    :cond_8
    add-int/lit8 p1, p1, 0x3

    .line 79
    .line 80
    aget-byte v1, p0, v6

    .line 81
    .line 82
    if-le v1, v4, :cond_1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_9
    add-int/lit8 v3, p2, -0x2

    .line 86
    .line 87
    if-lt v1, v3, :cond_a

    .line 88
    .line 89
    invoke-static {p0, v1, p2}, Lzq3;->c([BII)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    goto :goto_4

    .line 94
    :cond_a
    add-int/lit8 v3, p1, 0x2

    .line 95
    .line 96
    aget-byte v1, p0, v1

    .line 97
    .line 98
    if-gt v1, v4, :cond_4

    .line 99
    .line 100
    shl-int/lit8 v2, v2, 0x1c

    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x70

    .line 103
    .line 104
    add-int/2addr v1, v2

    .line 105
    shr-int/lit8 v1, v1, 0x1e

    .line 106
    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    add-int/lit8 v1, p1, 0x3

    .line 110
    .line 111
    aget-byte v2, p0, v3

    .line 112
    .line 113
    if-gt v2, v4, :cond_4

    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x4

    .line 116
    .line 117
    aget-byte v1, p0, v1

    .line 118
    .line 119
    if-le v1, v4, :cond_1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :goto_4
    if-nez v2, :cond_b

    .line 123
    .line 124
    const/4 p0, 0x1

    .line 125
    return p0

    .line 126
    :cond_b
    return v0

    .line 127
    :cond_c
    move p1, v1

    .line 128
    goto :goto_2
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/String;Ltb0;)Lub0;
    .locals 3

    .line 1
    iget p0, p0, Lcg3;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lub0;

    .line 9
    .line 10
    invoke-direct {p0}, Lub0;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p3, p1, p2}, Ltb0;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, p0, Lub0;->a:I

    .line 18
    .line 19
    invoke-interface {p3, p1, p2, v1}, Ltb0;->a(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lub0;->b:I

    .line 24
    .line 25
    iget p2, p0, Lub0;->a:I

    .line 26
    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    move v0, p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    if-lt p2, p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v1

    .line 38
    :goto_0
    iput v0, p0, Lub0;->c:I

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    new-instance p0, Lub0;

    .line 42
    .line 43
    invoke-direct {p0}, Lub0;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {p3, p1, p2}, Ltb0;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iput v2, p0, Lub0;->a:I

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iput v0, p0, Lub0;->c:I

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-interface {p3, p1, p2, v1}, Ltb0;->a(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p0, Lub0;->b:I

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iput v1, p0, Lub0;->c:I

    .line 66
    .line 67
    :cond_3
    :goto_1
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lcg3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqc;->zza()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    new-instance v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zza()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqo;->zza()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_3
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zzb()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_4
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zzc()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_5
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zzi()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_6
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoy;->zzam()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    long-to-int p0, v0

    .line 89
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_7
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzra;->zza()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_8
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zzc()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_9
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zzb()Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_a
    sget-object p0, Lvg3;->a:Ljava/util/List;

    .line 128
    .line 129
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzrj;->zza()Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
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
