.class public abstract Lio/sentry/w;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lio/sentry/c1;

.field public final b:Lio/sentry/ILogger;

.field public final c:J

.field public final d:Lio/sentry/g7;


# direct methods
.method public constructor <init>(Lio/sentry/c1;Lio/sentry/ILogger;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/w;->a:Lio/sentry/c1;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    .line 7
    .line 8
    iput-wide p3, p0, Lio/sentry/w;->c:J

    .line 9
    .line 10
    new-instance p1, Lio/sentry/h;

    .line 11
    .line 12
    invoke-direct {p1, p5}, Lio/sentry/h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Lio/sentry/g7;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lio/sentry/g7;-><init>(Lio/sentry/h;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lio/sentry/w;->d:Lio/sentry/g7;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Z
.end method

.method public abstract b(Ljava/io/File;Lio/sentry/i0;)V
.end method
