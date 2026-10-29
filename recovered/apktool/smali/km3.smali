.class public final Lkm3;
.super Leo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzn:Lkm3;


# instance fields
.field private zza:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:Lcn3;

.field private zzj:I

.field private zzk:Lnm3;

.field private zzl:Lfl3;

.field private zzm:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkm3;

    .line 2
    .line 3
    invoke-direct {v0}, Lkm3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkm3;->zzn:Lkm3;

    .line 7
    .line 8
    const-class v1, Lkm3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Leo3;->f(Ljava/lang/Class;Leo3;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Leo3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lkm3;->zze:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput-byte v0, p0, Lkm3;->zzm:B

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lkm3;->zzg:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, Lcn3;->b:Lan3;

    .line 15
    .line 16
    iput-object v0, p0, Lkm3;->zzi:Lcn3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 9

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_4

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    :goto_0
    iput-byte p1, p0, Lkm3;->zzm:B

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Lkm3;->zzn:Lkm3;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Lfm3;

    .line 30
    .line 31
    sget-object p1, Lkm3;->zzn:Lkm3;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p0, Lkm3;

    .line 38
    .line 39
    invoke-direct {p0}, Lkm3;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    const-string v7, "zzk"

    .line 44
    .line 45
    const-string v8, "zzl"

    .line 46
    .line 47
    const-string v0, "zzf"

    .line 48
    .line 49
    const-string v1, "zze"

    .line 50
    .line 51
    const-string v2, "zza"

    .line 52
    .line 53
    const-string v3, "zzg"

    .line 54
    .line 55
    const-string v4, "zzh"

    .line 56
    .line 57
    const-string v5, "zzi"

    .line 58
    .line 59
    const-string v6, "zzj"

    .line 60
    .line 61
    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, Lkm3;->zzn:Lkm3;

    .line 66
    .line 67
    new-instance p2, Laq3;

    .line 68
    .line 69
    const-string v0, "\u0001\u0008\u0001\u0001\u0002\u000c\u0008\u0000\u0000\u0001\u0002\u1008\u0000\u0003\u1004\u0001\u00057\u0000\u00067\u0000\u0007\u100a\u0002\u0008\u1004\u0003\t\u1009\u0004\u000c\u1409\u0005"

    .line 70
    .line 71
    invoke-direct {p2, p1, v0, p0}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_5
    iget-byte p0, p0, Lkm3;->zzm:B

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
