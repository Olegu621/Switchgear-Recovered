.class public final Lcom/quago/mobile/sdk/x0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:I

.field public final i:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/w0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/quago/mobile/sdk/w0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/quago/mobile/sdk/x0;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p1, Lcom/quago/mobile/sdk/w0;->e:F

    .line 9
    .line 10
    iput v0, p0, Lcom/quago/mobile/sdk/x0;->e:F

    .line 11
    .line 12
    iget-wide v0, p1, Lcom/quago/mobile/sdk/w0;->d:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/quago/mobile/sdk/x0;->d:J

    .line 15
    .line 16
    iget v0, p1, Lcom/quago/mobile/sdk/w0;->g:I

    .line 17
    .line 18
    iput v0, p0, Lcom/quago/mobile/sdk/x0;->h:I

    .line 19
    .line 20
    iget-wide v0, p1, Lcom/quago/mobile/sdk/w0;->c:J

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/quago/mobile/sdk/x0;->c:J

    .line 23
    .line 24
    iget-wide v0, p1, Lcom/quago/mobile/sdk/w0;->b:J

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/quago/mobile/sdk/x0;->b:J

    .line 27
    .line 28
    iget v0, p1, Lcom/quago/mobile/sdk/w0;->f:F

    .line 29
    .line 30
    const/high16 v1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    sub-float v2, v1, v0

    .line 33
    .line 34
    iput v2, p0, Lcom/quago/mobile/sdk/x0;->f:F

    .line 35
    .line 36
    add-float/2addr v0, v1

    .line 37
    iput v0, p0, Lcom/quago/mobile/sdk/x0;->g:F

    .line 38
    .line 39
    iget-object p1, p1, Lcom/quago/mobile/sdk/w0;->h:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/quago/mobile/sdk/x0;->i:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 42
    .line 43
    return-void
.end method
