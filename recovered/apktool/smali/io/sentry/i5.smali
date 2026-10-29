.class public final Lio/sentry/i5;
.super Lio/sentry/t4;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/time/Instant;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/n;->f()Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lio/sentry/i5;->a:Ljava/time/Instant;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()J
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/i5;->a:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/appsflyer/internal/n;->b(Ljava/time/Instant;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/32 v2, 0x3b9aca00

    .line 8
    .line 9
    .line 10
    mul-long/2addr v0, v2

    .line 11
    iget-object p0, p0, Lio/sentry/i5;->a:Ljava/time/Instant;

    .line 12
    .line 13
    invoke-static {p0}, Lcom/appsflyer/internal/n;->a(Ljava/time/Instant;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    int-to-long v2, p0

    .line 18
    add-long/2addr v0, v2

    .line 19
    return-wide v0
.end method
