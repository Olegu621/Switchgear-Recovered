.class public final Lcom/appsflyer/internal/AFc1eSDK;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public AFAdRevenueData:Lcom/appsflyer/internal/AFb1rSDK;

.field public areAllFieldsValid:Z

.field public component1:Lcom/appsflyer/AppsFlyerConsent;

.field public component2:Z

.field public component3:Lcom/appsflyer/internal/AFh1rSDK;

.field public component4:Lcom/appsflyer/internal/AFd1aSDK;

.field public copydefault:Lcom/appsflyer/internal/AFb1gSDK;

.field public getCurrencyIso4217Code:Ljava/lang/String;

.field public getMediationNetwork:Ljava/lang/String;

.field public getMonetizationNetwork:Ljava/lang/String;

.field public getRevenue:Lcom/appsflyer/internal/AFb1tSDK;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final AFAdRevenueData()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->component2:Z

    .line 2
    .line 3
    return p0
.end method

.method public final declared-synchronized getMediationNetwork(Lcom/appsflyer/internal/AFd1aSDK;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1eSDK;->component4:Lcom/appsflyer/internal/AFd1aSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final getMediationNetwork()Z
    .locals 0

    .line 9
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->areAllFieldsValid:Z

    return p0
.end method
