.class public Lcom/supercell/titan/NetworkInfo;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/NetworkInfo$NetworkInfoInitializer;
    }
.end annotation


# static fields
.field public static final TRANSPORT_CELLULAR:I

.field public static final TRANSPORT_NONE:I

.field public static final TRANSPORT_OTHER:I

.field public static final TRANSPORT_UNKNOWN:I

.field public static final TRANSPORT_VPN:I

.field public static final TRANSPORT_WIFI:I


# instance fields
.field public a:Lzm1;

.field public volatile b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/NetworkInfo;

    const v1, 0xf

    const v0, 0x3

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_CELLULAR:I

    const v0, 0x1

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_NONE:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_OTHER:I

    const v0, 0x0

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_UNKNOWN:I

    const v0, 0x5

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_VPN:I

    const v0, 0x4

    sput v0, Lcom/supercell/titan/NetworkInfo;->TRANSPORT_WIFI:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/supercell/titan/NetworkInfo;->b:I

    .line 6
    .line 7
    return-void
.end method

.method public static getNetworkTransportType()I
    .locals 1

    .line 1
    sget-object v0, Lan1;->a:Lcom/supercell/titan/NetworkInfo;

    .line 2
    .line 3
    iget v0, v0, Lcom/supercell/titan/NetworkInfo;->b:I

    .line 4
    .line 5
    return v0
.end method

.method public static getNetworkType(Landroid/content/Context;)I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0xe1

    const-string v1, "android.hardware.telephony.data"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const v0, 0xe2

    const-string v0, "phone"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataNetworkType()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_0
    const v0, 0xe3

    const-string v0, "connectivity"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_1
    const/4 p0, 0x0

    .line 56
    return p0
.end method

.method public static getSimCountryIso(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0xe4

    const-string v0, "phone"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const p0, 0xe5

    const-string p0, ""

    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public init(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lzm1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lzm1;-><init>(Lcom/supercell/titan/NetworkInfo;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/supercell/titan/NetworkInfo;->a:Lzm1;

    .line 7
    .line 8
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x10

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 21
    .line 22
    .line 23
    const v1, 0xe6

    const-string v1, "connectivity"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object p0, p0, Lcom/supercell/titan/NetworkInfo;->a:Lzm1;

    .line 36
    .line 37
    invoke-virtual {p1, v0, p0}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
