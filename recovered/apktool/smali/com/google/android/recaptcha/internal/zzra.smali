.class public final Lcom/google/android/recaptcha/internal/zzra;
.super Lcom/google/android/recaptcha/internal/zzsk;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zztt;


# static fields
.field private static final zzd:Lcom/google/android/recaptcha/internal/zzra;

.field private static volatile zze:Lcom/google/android/recaptcha/internal/zzua;


# instance fields
.field private zzf:I

.field private zzg:Z

.field private zzh:Lcom/google/android/recaptcha/internal/zzrk;

.field private zzi:Z

.field private zzj:Lcom/google/android/recaptcha/internal/zzrm;

.field private zzk:Lcom/google/android/recaptcha/internal/zzsu;

.field private zzl:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzra;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzra;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/recaptcha/internal/zzra;

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
    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzra;->zzl:B

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzud;->zze()Lcom/google/android/recaptcha/internal/zzud;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzra;->zzk:Lcom/google/android/recaptcha/internal/zzsu;

    .line 12
    .line 13
    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzra;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zzra;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_8

    .line 4
    .line 5
    const/4 p3, 0x2

    .line 6
    if-eq p1, p3, :cond_7

    .line 7
    .line 8
    const/4 p3, 0x3

    .line 9
    if-eq p1, p3, :cond_6

    .line 10
    .line 11
    const/4 p3, 0x4

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eq p1, p3, :cond_5

    .line 14
    .line 15
    const/4 p3, 0x5

    .line 16
    if-eq p1, p3, :cond_4

    .line 17
    .line 18
    const/4 p3, 0x6

    .line 19
    if-eq p1, p3, :cond_1

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x1

    .line 26
    :goto_0
    iput-byte p1, p0, Lcom/google/android/recaptcha/internal/zzra;->zzl:B

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    sget-object p0, Lcom/google/android/recaptcha/internal/zzra;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 30
    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    const-class p1, Lcom/google/android/recaptcha/internal/zzra;

    .line 34
    .line 35
    monitor-enter p1

    .line 36
    :try_start_0
    sget-object p0, Lcom/google/android/recaptcha/internal/zzra;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 37
    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    new-instance p0, Lcom/google/android/recaptcha/internal/zzsi;

    .line 41
    .line 42
    sget-object p2, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 43
    .line 44
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzsi;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 45
    .line 46
    .line 47
    sput-object p0, Lcom/google/android/recaptcha/internal/zzra;->zze:Lcom/google/android/recaptcha/internal/zzua;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    monitor-exit p1

    .line 54
    return-object p0

    .line 55
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw p0

    .line 57
    :cond_3
    return-object p0

    .line 58
    :cond_4
    sget-object p0, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_5
    new-instance p0, Lcom/google/android/recaptcha/internal/zzqz;

    .line 62
    .line 63
    invoke-direct {p0, v0}, Lcom/google/android/recaptcha/internal/zzqz;-><init>(Lcom/google/android/recaptcha/internal/zzrr;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_6
    new-instance p0, Lcom/google/android/recaptcha/internal/zzra;

    .line 68
    .line 69
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzra;-><init>()V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_7
    const-string v0, "zzf"

    .line 74
    .line 75
    const-string v1, "zzg"

    .line 76
    .line 77
    const-string v2, "zzh"

    .line 78
    .line 79
    const-string v3, "zzi"

    .line 80
    .line 81
    const-string v4, "zzj"

    .line 82
    .line 83
    const-string v5, "zzk"

    .line 84
    .line 85
    const-class v6, Lcom/google/android/recaptcha/internal/zzrq;

    .line 86
    .line 87
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object p1, Lcom/google/android/recaptcha/internal/zzra;->zzd:Lcom/google/android/recaptcha/internal/zzra;

    .line 92
    .line 93
    new-instance p2, Lcom/google/android/recaptcha/internal/zzue;

    .line 94
    .line 95
    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u03e7\u041b"

    .line 96
    .line 97
    invoke-direct {p2, p1, p3, p0}, Lcom/google/android/recaptcha/internal/zzue;-><init>(Lcom/google/android/recaptcha/internal/zzts;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_8
    iget-byte p0, p0, Lcom/google/android/recaptcha/internal/zzra;->zzl:B

    .line 102
    .line 103
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method
