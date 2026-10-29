.class public final Lxhpgvfjuz/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lxhpgvfjuz/aD;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lxhpgvfjuz/t;

    const v1, 0x69be

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    sget-object v0, Lxhpgvfjuz/t;->a:Lxhpgvfjuz/aD;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lxhpgvfjuz/t;->a(Lxhpgvfjuz/aD;)V

    const/4 v0, 0x0

    sput-object v0, Lxhpgvfjuz/t;->a:Lxhpgvfjuz/aD;

    :cond_0
    return-void
.end method

.method public static native a(Landroid/content/Context;Lxhpgvfjuz/aD;)V
.end method

.method public static native a(Lxhpgvfjuz/aD;)V
.end method

.method public static b(Landroid/content/Context;Lxhpgvfjuz/aD;)V
    .locals 0

    invoke-static {}, Lxhpgvfjuz/t;->a()V

    sput-object p1, Lxhpgvfjuz/t;->a:Lxhpgvfjuz/aD;

    invoke-static {p0, p1}, Lxhpgvfjuz/t;->a(Landroid/content/Context;Lxhpgvfjuz/aD;)V

    return-void
.end method
