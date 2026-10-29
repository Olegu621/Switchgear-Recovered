.class public final Lcom/google/android/recaptcha/internal/zzrk;
.super Lcom/google/android/recaptcha/internal/zzsk;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zztt;


# static fields
.field private static final zzd:Lcom/google/android/recaptcha/internal/zzrk;

.field private static volatile zze:Lcom/google/android/recaptcha/internal/zzua;


# instance fields
.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:I

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzrk;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzrk;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zzd:Lcom/google/android/recaptcha/internal/zzrk;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/recaptcha/internal/zzrk;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsk;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzrk;->zzo:B

    .line 6
    .line 7
    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzrk;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zzd:Lcom/google/android/recaptcha/internal/zzrk;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, -0x1

    .line 4
    .line 5
    if-eqz v1, :cond_8

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq v1, v2, :cond_7

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-eq v1, v2, :cond_6

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eq v1, v2, :cond_5

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    if-eq v1, v2, :cond_4

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x1

    .line 28
    :goto_0
    iput-byte v1, v0, Lcom/google/android/recaptcha/internal/zzrk;->zzo:B

    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-class v1, Lcom/google/android/recaptcha/internal/zzrk;

    .line 36
    .line 37
    monitor-enter v1

    .line 38
    :try_start_0
    sget-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Lcom/google/android/recaptcha/internal/zzsi;

    .line 43
    .line 44
    sget-object v2, Lcom/google/android/recaptcha/internal/zzrk;->zzd:Lcom/google/android/recaptcha/internal/zzrk;

    .line 45
    .line 46
    invoke-direct {v0, v2}, Lcom/google/android/recaptcha/internal/zzsi;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    :goto_1
    monitor-exit v1

    .line 55
    return-object v0

    .line 56
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw v0

    .line 58
    :cond_3
    return-object v0

    .line 59
    :cond_4
    sget-object v0, Lcom/google/android/recaptcha/internal/zzrk;->zzd:Lcom/google/android/recaptcha/internal/zzrk;

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_5
    new-instance v0, Lcom/google/android/recaptcha/internal/zzrb;

    .line 63
    .line 64
    invoke-direct {v0, v3}, Lcom/google/android/recaptcha/internal/zzrb;-><init>(Lcom/google/android/recaptcha/internal/zzrr;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_6
    new-instance v0, Lcom/google/android/recaptcha/internal/zzrk;

    .line 69
    .line 70
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzrk;-><init>()V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_7
    const-string v2, "zzf"

    .line 75
    .line 76
    const-string v3, "zzg"

    .line 77
    .line 78
    sget-object v4, Lcom/google/android/recaptcha/internal/zzre;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 79
    .line 80
    const-string v5, "zzh"

    .line 81
    .line 82
    sget-object v6, Lcom/google/android/recaptcha/internal/zzrd;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 83
    .line 84
    const-string v7, "zzi"

    .line 85
    .line 86
    sget-object v8, Lcom/google/android/recaptcha/internal/zzrh;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 87
    .line 88
    const-string v9, "zzj"

    .line 89
    .line 90
    sget-object v10, Lcom/google/android/recaptcha/internal/zzri;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 91
    .line 92
    const-string v11, "zzk"

    .line 93
    .line 94
    sget-object v12, Lcom/google/android/recaptcha/internal/zzrg;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 95
    .line 96
    const-string v13, "zzl"

    .line 97
    .line 98
    sget-object v14, Lcom/google/android/recaptcha/internal/zzrf;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 99
    .line 100
    const-string v15, "zzm"

    .line 101
    .line 102
    sget-object v16, Lcom/google/android/recaptcha/internal/zzrc;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 103
    .line 104
    const-string v17, "zzn"

    .line 105
    .line 106
    sget-object v18, Lcom/google/android/recaptcha/internal/zzrj;->zza:Lcom/google/android/recaptcha/internal/zzsr;

    .line 107
    .line 108
    filled-new-array/range {v2 .. v18}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v1, Lcom/google/android/recaptcha/internal/zzrk;->zzd:Lcom/google/android/recaptcha/internal/zzrk;

    .line 113
    .line 114
    new-instance v2, Lcom/google/android/recaptcha/internal/zzue;

    .line 115
    .line 116
    const-string v3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005\u0007\u180c\u0006\u0008\u180c\u0007"

    .line 117
    .line 118
    invoke-direct {v2, v1, v3, v0}, Lcom/google/android/recaptcha/internal/zzue;-><init>(Lcom/google/android/recaptcha/internal/zzts;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_8
    iget-byte v0, v0, Lcom/google/android/recaptcha/internal/zzrk;->zzo:B

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0
.end method
