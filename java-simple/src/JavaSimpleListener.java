// Generated from JavaSimple.g4 by ANTLR 4.4

	import symboltable.*;
	import java.util.HashMap;
	import java.util.Map;
	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaSimpleParser}.
 */
public interface JavaSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull JavaSimpleParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull JavaSimpleParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#rtn_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRtn_stmt(@NotNull JavaSimpleParser.Rtn_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#rtn_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRtn_stmt(@NotNull JavaSimpleParser.Rtn_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#builtin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_stmt(@NotNull JavaSimpleParser.Builtin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#builtin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_stmt(@NotNull JavaSimpleParser.Builtin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull JavaSimpleParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull JavaSimpleParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(@NotNull JavaSimpleParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(@NotNull JavaSimpleParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull JavaSimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull JavaSimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull JavaSimpleParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull JavaSimpleParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(@NotNull JavaSimpleParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(@NotNull JavaSimpleParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(@NotNull JavaSimpleParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(@NotNull JavaSimpleParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(@NotNull JavaSimpleParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(@NotNull JavaSimpleParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stmt(@NotNull JavaSimpleParser.Func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stmt(@NotNull JavaSimpleParser.Func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaSimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaSimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull JavaSimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull JavaSimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(@NotNull JavaSimpleParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(@NotNull JavaSimpleParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull JavaSimpleParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull JavaSimpleParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull JavaSimpleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull JavaSimpleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull JavaSimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull JavaSimpleParser.AssignContext ctx);
}