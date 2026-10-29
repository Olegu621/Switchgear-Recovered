.class public final Lio/sentry/android/core/t1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Z

.field public final i:J


# direct methods
.method public constructor <init>(J)V
    .locals 13

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    .line 19
    invoke-direct/range {v0 .. v12}, Lio/sentry/android/core/t1;-><init>(JJJJZZJ)V

    return-void
.end method

.method public constructor <init>(JJJJZZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lio/sentry/android/core/t1;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lio/sentry/android/core/t1;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Lio/sentry/android/core/t1;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, Lio/sentry/android/core/t1;->d:J

    .line 11
    .line 12
    iput-boolean p9, p0, Lio/sentry/android/core/t1;->e:Z

    .line 13
    .line 14
    iput-boolean p10, p0, Lio/sentry/android/core/t1;->f:Z

    .line 15
    .line 16
    iput-wide p11, p0, Lio/sentry/android/core/t1;->i:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lio/sentry/android/core/t1;

    .line 2
    .line 3
    iget-wide v0, p0, Lio/sentry/android/core/t1;->b:J

    .line 4
    .line 5
    iget-wide p0, p1, Lio/sentry/android/core/t1;->b:J

    .line 6
    .line 7
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compare(JJ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
