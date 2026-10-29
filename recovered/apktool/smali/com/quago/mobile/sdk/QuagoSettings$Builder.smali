.class public Lcom/quago/mobile/sdk/QuagoSettings$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/quago/mobile/sdk/QuagoSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field protected settings:Lcom/quago/mobile/sdk/QuagoSettings;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Lcom/quago/mobile/sdk/QuagoSettings;-><init>(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "flavor can\'t be null!"

    .line 24
    .line 25
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    const-string p0, "appToken can\'t be null or empty!"

    .line 30
    .line 31
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public build()Lcom/quago/mobile/sdk/QuagoSettings;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    return-object p0
.end method

.method public disableInitSegment()Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->disableInitSegment:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public disableTouchSegment()Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->disableTouchSegment:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public enableManualKeysDispatcher()Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->enableManualKeysDispatcher:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public enableManualTouchDispatcher()Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->enableManualMotionDispatcher:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public overrideLogger(Lcom/quago/mobile/sdk/utils/IQuagoLog;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->loggerCallback:Lcom/quago/mobile/sdk/utils/IQuagoLog;

    .line 4
    .line 5
    return-object p0
.end method

.method public setDefaultAdditionId(Ljava/lang/String;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 10
    .line 11
    iput-object p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->defaultAdditionalId:Ljava/lang/String;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public setForceActivateAllSensors()Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->forceActivateAllSensors:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public setJsonCallback(Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "setJsonCallback"

    .line 9
    .line 10
    const-string v2, "callback is null - ignoring"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v2, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 17
    .line 18
    iput-object p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->callback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;

    .line 19
    .line 20
    return-object p0
.end method

.method public setLogLevel(Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "setLogLevel"

    .line 9
    .line 10
    const-string v2, "logLevel is null - ignoring"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v2, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 17
    .line 18
    iput-object p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->logLevel:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 19
    .line 20
    return-object p0
.end method

.method public setMaxSegments(I)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->maxSegments:I

    .line 4
    .line 5
    return-object p0
.end method

.method public setQueryMaxCount(Lcom/quago/mobile/sdk/QuagoSettings$QuagoQueryMaxCount;I)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-ltz p2, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/quago/mobile/sdk/QuagoSettings;->maxCountMap:Ljava/util/Map;

    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-object p0
.end method

.method public setSampleRate(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;J)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/quago/mobile/sdk/QuagoSettings;->sampleRateMap:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    invoke-virtual {v1, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p2

    .line 14
    long-to-int p2, p2

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public setSegmentQueryFullRange(Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/quago/mobile/sdk/QuagoSettings;->segmentQueryFullRangeMap:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setTokenCallback(Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings;->LOG:Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "setTokenCallback"

    .line 9
    .line 10
    const-string v2, "callback is null - ignoring"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v2, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 17
    .line 18
    iput-object p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->tokenCallback:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 19
    .line 20
    return-object p0
.end method

.method public setTouchSegmentDurationMillis(J)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput-wide p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->touchSegmentDurationMillis:J

    .line 4
    .line 5
    return-object p0
.end method

.method public setTrackingInterval(J)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput-wide p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionIntervalMillis:J

    .line 4
    .line 5
    return-object p0
.end method

.method public setTrackingMaxDuration(J)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput-wide p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMaxDurationMillis:J

    .line 4
    .line 5
    return-object p0
.end method

.method public setTrackingMotionAmount(I)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->autoMotionAmount:I

    .line 4
    .line 5
    return-object p0
.end method

.method public setWrapperInfo(ILjava/lang/String;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->settings:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 2
    .line 3
    iput p1, v0, Lcom/quago/mobile/sdk/QuagoSettings;->wrapper:I

    .line 4
    .line 5
    iput-object p2, v0, Lcom/quago/mobile/sdk/QuagoSettings;->wrapperVersion:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method
