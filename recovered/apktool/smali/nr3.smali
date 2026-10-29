.class public final Lnr3;
.super Leo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzk:Lnr3;


# instance fields
.field private zza:I

.field private zze:I

.field private zzf:Lor3;

.field private zzg:I

.field private zzh:Lcn3;

.field private zzi:Lam3;

.field private zzj:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnr3;

    .line 2
    .line 3
    invoke-direct {v0}, Lnr3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnr3;->zzk:Lnr3;

    .line 7
    .line 8
    const-class v1, Lnr3;

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
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lnr3;->zzj:B

    .line 6
    .line 7
    sget-object v0, Lcn3;->b:Lan3;

    .line 8
    .line 9
    iput-object v0, p0, Lnr3;->zzh:Lcn3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 6

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
    iput-byte p1, p0, Lnr3;->zzj:B

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Lnr3;->zzk:Lnr3;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Lfm3;

    .line 30
    .line 31
    sget-object p1, Lnr3;->zzk:Lnr3;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p0, Lnr3;

    .line 38
    .line 39
    invoke-direct {p0}, Lnr3;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    const-string v4, "zzi"

    .line 44
    .line 45
    const-string v5, "zzf"

    .line 46
    .line 47
    const-string v0, "zza"

    .line 48
    .line 49
    const-string v1, "zze"

    .line 50
    .line 51
    const-string v2, "zzg"

    .line 52
    .line 53
    const-string v3, "zzh"

    .line 54
    .line 55
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, Lnr3;->zzk:Lnr3;

    .line 60
    .line 61
    new-instance p2, Laq3;

    .line 62
    .line 63
    const-string v0, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0002\u0003\u100a\u0003\u0004\u1409\u0004\u0005\u1009\u0001"

    .line 64
    .line 65
    invoke-direct {p2, p1, v0, p0}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p2

    .line 69
    :cond_5
    iget-byte p0, p0, Lnr3;->zzj:B

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
