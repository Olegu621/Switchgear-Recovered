.class public final Lio/sentry/android/core/s;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:J

.field public b:Z

.field public c:J

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJZLjava/io/File;Ljava/util/HashMap;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lio/sentry/android/core/s;->a:J

    .line 19
    iput-object p6, p0, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 20
    iput-wide p3, p0, Lio/sentry/android/core/s;->c:J

    .line 21
    iput-object p7, p0, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 22
    iput-boolean p5, p0, Lio/sentry/android/core/s;->b:Z

    return-void
.end method

.method public constructor <init>(Lki3;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Lkb1;->k(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-wide p3, p0, Lio/sentry/android/core/s;->a:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/s;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/sentry/android/core/s;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lki3;

    .line 11
    .line 12
    iget-object v1, p0, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v2, p0, Lio/sentry/android/core/s;->a:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, Lio/sentry/android/core/s;->c:J

    .line 27
    .line 28
    :cond_0
    iget-wide v0, p0, Lio/sentry/android/core/s;->c:J

    .line 29
    .line 30
    return-wide v0
.end method

.method public b(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lki3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lio/sentry/android/core/s;->c:J

    .line 24
    .line 25
    return-void
.end method
