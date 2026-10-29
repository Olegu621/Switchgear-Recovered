.class public final Lvc1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final e:Le;


# instance fields
.field public final a:Lm10;

.field public final b:Lm10;

.field public final c:Lm10;

.field public final d:Lm10;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvc1;->e:Le;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lm10;Lm10;Lm10;Lm10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvc1;->a:Lm10;

    .line 5
    .line 6
    iput-object p3, p0, Lvc1;->b:Lm10;

    .line 7
    .line 8
    iput-object p4, p0, Lvc1;->c:Lm10;

    .line 9
    .line 10
    iput-object p2, p0, Lvc1;->d:Lm10;

    .line 11
    .line 12
    return-void
.end method
